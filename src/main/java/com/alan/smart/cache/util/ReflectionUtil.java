package com.alan.smart.cache.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ReflectionUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    public static Object newInstance(Class<?> cls) {
	Object instance = null;
	try {
	    instance = cls.newInstance();
	} catch (Exception e) {
	    LOGGER.error("new instance failure", e);
	    throw new RuntimeException(e);
	}
	return instance;
    }

    public static Object invokeMethod(Object obj, Method method, Object... args) {
	Object result = null;
	try {
	    method.setAccessible(true);
	    result = method.invoke(obj, args);
	} catch (Exception e) {
	    LOGGER.error("invoke method failure", e);
	    throw new RuntimeException(e);
	}
	return result;
    }

    public static void setField(Object obj, Field field, Object value) {
	try {
	    field.setAccessible(true);
	    field.set(obj, value);
	} catch (Exception e) {
	    LOGGER.error("set field failure", e);
	    throw new RuntimeException(e);
	}
    }
}
