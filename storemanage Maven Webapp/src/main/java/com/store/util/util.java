package com.store.util;

import org.springframework.stereotype.Component;

@Component
public class util {
 public static boolean isNull(String str){
	 if (str != null && !str.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	 
 }
}
