package com.chat.message;

import com.chat.server.MessageHandler;

public interface MessageListener {

	public void receive(MessageHandler origin, String message);
}
