package com.gn.homework03.controller;

import com.gn.homework03.model.vo.Method;

public class Run {

	public static void main(String[] args) {
		Method m = new Method();
		System.out.println(m.Porson("철수","167cm"));
		System.out.println(m.num(5,4));
		System.out.println(m.num(1,5));
		System.out.println(m.name("su","su"));
		System.out.println(m.name("na","me"));

	}

}
