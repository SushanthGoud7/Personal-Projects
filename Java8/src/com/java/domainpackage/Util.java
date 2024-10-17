package com.java.domainpackage;

import java.lang.reflect.Field;

public class Util {

	public static void print(Object object) {
		Class<?> obj = object.getClass();
		Field[] fields = obj.getDeclaredFields();
		System.out.println("Any" + obj.getSimpleName());
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				Object value = field.get(object);
				System.out.println(field.getName() + ":" + value);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

	}

}
