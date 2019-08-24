package com.abstractfactory.factory;

import com.abstractfactory.service.AnimalService;
import com.abstractfactory.service.impl.BearServiceImpl;
import com.abstractfactory.service.impl.DogServiceImpl;

public class AnimalFactory implements AbstractFactory<AnimalService> {

	@Override
	public AnimalService create(String type) {
		if ("dog".equalsIgnoreCase(type)) {
			return new DogServiceImpl();
		} else if ("bear".equalsIgnoreCase(type)) {
			return new BearServiceImpl();
		}
		return null;
	}
}
