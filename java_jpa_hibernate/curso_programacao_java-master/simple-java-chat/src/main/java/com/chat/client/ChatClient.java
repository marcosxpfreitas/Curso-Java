package com.chat.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.chat.message.LogHelper;
import com.chat.server.MessageHandler;

public class ChatClient implements Runnable {

	private Boolean running;
	private Socket socket;
	private int serverPort;
	private String serverHost;
	private MessageHandler messageHandler;

	public ChatClient(String serverHost, int serverPort) {
		this.serverHost = serverHost;
		this.serverPort = serverPort;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe seu username: ");
		String username = scanner.nextLine();

		try {
			this.socket = new Socket(serverHost, serverPort);
			this.running = Boolean.TRUE;

			LogHelper.log("Client started {0}", socket.getLocalSocketAddress());

			this.messageHandler = new MessageHandler(socket, new ClientMessageListener());
			new Thread(messageHandler).start();
			System.out.println("Digite a mensagem e aperte enter para enviar");
			while (this.running) {
				String nextLine = scanner.nextLine();
				messageHandler.send(username + " diz:" + nextLine);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			scanner.close();
		}
	}

	public void stop() throws IOException {
		this.running = Boolean.FALSE;
		this.socket.close();
		this.messageHandler.stop();
	}

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		ChatClient client = new ChatClient("10.2.1.51", 8080);
		new Thread(client).start();
	}
}
