package com.abstractfactory.service.impl;

import com.abstractfactory.service.AnimalService;

public class BearServiceImpl implements AnimalService{

	@Override
	public void getType() {
		// TODO Auto-generated method stub
		System.out.println("Duck");
	}

	@Override
	public void makeSoound() {
		// TODO Auto-generated method stub
		System.out.println("kui kui");
	}

}
