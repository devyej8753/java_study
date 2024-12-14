package com.gn.homework02;

import java.util.Objects;

import com.gn.practice06.model.vo.Food;
import com.gn.practice08.model.vo.Person;

public class Lottery implements Comparable<Lottery>{
	private String name;
	String phone;
	
	public Lottery() {}
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "[이름= " + name + ", 휴대폰 번호 =" + phone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,phone);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Lottery) {
			Lottery l = (Lottery)obj;
			if(l.name.equals(name)&& l.phone.equals(phone) ) {
				result = true;
			}
		}
		return result;
	}
	@Override
	public int compareTo(Lottery l) {
		String str = name;
		String obj = l.name;
		if(str.equals(obj)) {
			String Phone = phone;
			String objPhone = l.phone;
			return Phone.compareTo(objPhone);
		}
		return this.name.compareTo(obj);
	}
	
	
	
	
	
}
