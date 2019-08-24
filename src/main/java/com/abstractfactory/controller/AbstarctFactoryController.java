package com.abstractfactory.controller;

import com.abstractfactory.factory.AbstractFactory;
import com.abstractfactory.factory.ColorFactory;
import com.abstractfactory.factory.FactoryProvider;
import com.abstractfactory.service.AnimalService;
import com.abstractfactory.service.ColorService;

public class AbstarctFactoryController {

	/*
	 * @Autowired AbstractFactory<AnimalService> abstarctFactory;
	 
	@Autowired
	AnimalFactory animalFactory;
	*/	
	
	
	public void factoryService() {

		
		FactoryProvider fp = new FactoryProvider();
		AbstractFactory<AnimalService> animalFactory = fp.getFactory("animal");
		
		//Animal Service
		//DogService
		AnimalService animalService =  animalFactory.create("dog");
		animalService.makeSoound();
		animalService.getType();
		
		//BearServic
		animalService = (AnimalService) animalFactory.create("bear"); 
		animalService.getType();
		animalService.makeSoound();
		
		
		//Color Service
		AbstractFactory<ColorService> colorFactory = fp.getFactory("color");
		
		//WhiteColorService
		ColorService colorService = colorFactory.create("white");
		colorService.getColor();
		
		//BrownColorService
		colorService = colorFactory.create("brown");
		colorService.getColor();
	
	}
}

