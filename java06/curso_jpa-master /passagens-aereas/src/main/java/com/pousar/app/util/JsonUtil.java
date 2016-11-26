package com.pousar.app.util;

import com.google.gson.Gson;

/**
 * Classe para conversao de objetos para json
 *
 */
public class JsonUtil {

	private static Gson gson = new Gson();

	public static String toJson(Object object) {
		return gson.toJson(object);
	}

	public static <T> T fromJson(String json, Class<T> classe) {
		return gson.fromJson(json, classe);
	}
}
