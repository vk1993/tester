package com.org.testing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8ArrayList {

	public static void main(String[] args) {
		List<Integer> randomNumber = Arrays.asList(8,9,0,10,5);

		
		for(int i = 0; i< randomNumber.size() ; i++){
			System.out.println(randomNumber.get(i));
		}
		
		System.out.println("2nd loop ");
		for(int i: randomNumber ){
			System.out.println(i);
		}
		System.out.println("3rd loop");
		randomNumber.forEach(i -> System.out.println(i));
		
	}

}
