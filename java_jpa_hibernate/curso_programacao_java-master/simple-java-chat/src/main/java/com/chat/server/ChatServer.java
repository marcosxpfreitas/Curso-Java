package com.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chat.message.LogHelper;

public class ChatServer implements Runnable {

	private int port;
	private boolean running;
	private ServerSocket serverSocket;
	private List<MessageHandler> handlers;

	public ChatServer(int port) {
		this.port = port;
		this.handlers = new ArrayList<>();
	}

	@Override
	public void run() {
		try {
			this.serverSocket = new ServerSocket(this.port);
			this.running = Boolean.TRUE;
			LogHelper.log("Servidor iniciado e esperando conexoes na porta {0}", String.valueOf(port));

			while (running) {
				Socket socket = serverSocket.accept();
				MessageHandler messageHandler = new MessageHandler(socket, new ServerMessageListener(this));
				new Thread(messageHandler).start();
				handlers.add(messageHandler);

				LogHelper.log("Nova conexao com o cliente {0}", socket.getRemoteSocketAddress());
			}
		} catch (IOException e) {
			LogHelper.log("Servidor finaliado");

			if (running)
				throw new RuntimeException(e);
		}
	}

	public void stop() throws IOException {
		this.running = Boolean.FALSE;
		this.serverSocket.close();

		for (MessageHandler messageHandler : handlers) {
			messageHandler.stop();
		}
	}

	public static void main(String[] args) throws IOException {
		ChatServer server = new ChatServer(8080);
		new Thread(server).start();

		Scanner scanner = new Scanner(System.in);
		while (!"stop".equals(scanner.nextLine()));

		scanner.close();
		server.stop();
	}

	public void broadcast(MessageHandler origin, String message) {
		try {
			for (MessageHandler messageHandler : handlers) {
				if (!messageHandler.equals(origin)) {
					LogHelper.log("Sending {0} to {1}", message, messageHandler.getSocket().getRemoteSocketAddress());
					messageHandler.send(message);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
