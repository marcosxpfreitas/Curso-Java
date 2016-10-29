package com.chat.message;

import java.text.MessageFormat;

public class LogHelper {

	public static void log(String pattern, Object... arguments) {
		System.out.println(MessageFormat.format(pattern, arguments));
	}
}
