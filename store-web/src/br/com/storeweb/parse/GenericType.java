package br.com.storeweb.parse;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class GenericType implements ParameterizedType {

	private Class<?> entity;

	public GenericType() {

	}

	@Override
	public Type[] getActualTypeArguments() {
		return new Type [] {entity};
	}

	@Override
	public Type getOwnerType() {
		return List.class;
	}

	@Override
	public Type getRawType() {
		return null;
	}
	
}
