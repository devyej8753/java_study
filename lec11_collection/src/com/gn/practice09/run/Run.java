package com.gn.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.practice09.model.vo.Information;

public class Run {
	public static void main(String[] args) {
		Map<String,Information> information = new HashMap<String,Information>();
		information.put("john", new Information("123-456-7890",3800000));
		information.put("Emma", new Information("987-654-3210",2300000));
		information.put("Tom", new Information("555-123-4567",4600000));
		System.out.println("변경전 : "+information);
		
		//information.put("john", new Information("123-456-7890",4100000));
		information.get("john").setSalary(4100000); // 이렇게도 사용가능
		System.out.println("변경후 : "+information);
		
		// (1) Emma가 전화번호를 바꿧어요. -> Emma정보 출력
		// (2) Emma정보 출력 -> getter
		// 111-1111-1111 으로 변경
		System.out.println("===== Emma의 정보 ======");
		information.get("Emma").setPhone("111-1111-1111");
		System.out.println("전화번호 : "+ information.get("Emma").getPhone());
		System.out.println("월급 : "+information.get("Emma").getSalary());
		
		
		
		
		
		
		
		
	}

}
