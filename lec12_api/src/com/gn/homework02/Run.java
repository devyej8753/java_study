package com.gn.homework02;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		List<String> list = new ArrayList<String>();
		list.add("서울특별시 금천구 구로디지털2로 95");
		list.add("서울특별시 서대문구 연희로 248");
		list.add("울산광역시 남구 돋질로 233");
		list.add("경상북도 구미시 송정대로 55");
		for(String str : list) {
			System.out.println(p.takeState(str));
		}
		
		
		
		
		
	}
}
