package com.abstractfactory.factory;

import com.abstractfactory.service.ColorService;
import com.abstractfactory.service.impl.BrownServiceImpl;
import com.abstractfactory.service.impl.WhiteServiceImpl;

public class ColorFactory  implements AbstractFactory<ColorService> {

	@Override
	public ColorService create(String type) {
		if(type.equalsIgnoreCase("white")) {
			return new WhiteServiceImpl();
		}else if(type.equalsIgnoreCase("brown")) {
			return new BrownServiceImpl();
		}
		return null;
	}

}
