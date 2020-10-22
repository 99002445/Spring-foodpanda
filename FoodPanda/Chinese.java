package com.lts.autowiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component

public class Chinese implements Menu {

	@Override
	public List<String> itemsAvailable() {
		// TODO Auto-generated method stub
		return Arrays.asList("Noodles","Pasta");
	}
	

}
