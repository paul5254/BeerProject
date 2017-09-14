package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

	public List<String> getBrands(String color) {
		List<String> list = new ArrayList<String>();
		if (color.equals("dark")) {
			list.add("beer 01");
			list.add("beer 02");
			list.add("beer 03");
		} else {
			list.add("beer 100");
			list.add("beer 200");
		}
		return list;
	}
}
