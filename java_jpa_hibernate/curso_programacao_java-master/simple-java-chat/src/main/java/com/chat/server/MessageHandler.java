package com.chat.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import com.chat.message.MessageListener;

public class MessageHandler implements Runnable {

	private Socket socket;
	private boolean running;
	private MessageListener messageListener;

	public MessageHandler(Socket socket, MessageListener messageListener) {
		this.socket = socket;
		this.messageListener = messageListener;
	}

	@Override
	public void run() {
		try {
			byte buffer[] = new byte[1024];
			InputStream inputStream = socket.getInputStream();

			this.running = Boolean.TRUE;
			while (this.running) {
				int read = inputStream.read(buffer);
				if (read > -1) {
					String message = new String(buffer, 0, read);
					messageListener.receive(this, message);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void stop() throws IOException {
		this.running = Boolean.FALSE;
		this.socket.close();
	}

	public void send(String message) throws IOException {
		socket.getOutputStream().write(message.getBytes());
	}

	public Socket getSocket() {
		return socket;
	}
}
