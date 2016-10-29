package com.chat.server;

import com.chat.message.LogHelper;
import com.chat.message.MessageListener;

public class ServerMessageListener implements MessageListener {

	private ChatServer server;

	public ServerMessageListener(ChatServer server) {
		this.server = server;
	}

	@Override
	public void receive(MessageHandler origin, String message) {
		LogHelper.log("Message received from {0}: {1}", origin.getSocket().getRemoteSocketAddress(), message);
		server.broadcast(origin, message);
	}
}
