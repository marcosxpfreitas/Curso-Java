package com.chat.client;

import com.chat.message.MessageListener;
import com.chat.server.MessageHandler;

public class ClientMessageListener implements MessageListener {

	@Override
	public void receive(MessageHandler origin, String message) {
		System.out.println(message);
	}
}
