package com.abstractfactory.factory;

public interface AbstractFactory<T> {

	 T create(String type);
}
