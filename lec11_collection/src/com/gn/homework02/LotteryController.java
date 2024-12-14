package com.gn.homework02;

import java.util.*;


public class LotteryController {
	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		// 1. 전달 받은 l을 lottry HashSet에 추가
		// 2. 추가 결과를 boolean 값으로 반환
		boolean result = false;
		if(lottery.add(l)) {
			result = true;			
		}else {
		}
		return result;
		
		
			
		
	}
	public boolean deleteObject(Lottery l) {
		// 1. 전달 받은 l을 lottery에서 삭제
		boolean result = lottery.remove(l);
		// 2. 당첨자 목록 win중에 삭제된 추첨 대상자가 존재할 수 있음
		// 3. 삭제 결과인 boolean 값과 win 객체가 null이 아닐 때에만
		if(win != null && result) {
			// win에도 해당 추첨 대상자 삭제
			win.remove(l);
		}
		return result;
	}
	public Set<Lottery> searchObject() {
		return lottery;
	}
	
	
	
	public Set<Lottery> winObject(){
		return lottery;
	}
	public Set<Lottery> sortedWinObject(){
		return lottery;
	}
	public boolean searchWinnder(Lottery l) {
		return false;
	}
	
	
	
}
