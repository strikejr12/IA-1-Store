package com.lumindevs.util;

public class Utils {
	
	public static void log(String msg) {
		if (msg == null) return;
		if (msg.isEmpty()) return;
		System.out.println(msg);
	}

}
