package com.java.assignmentfive.two.myPack;

public class NumberOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s ;
		VariableStack vs = new VariableStack(5);
		FixedStack fs = new FixedStack(8);
		
		s = vs ;
		for (int i = 0; i < 12; i++) {
			s.push(i);
		}
		
		s = vs ;
		System.out.println("Values in dynamic Stack");
		for (int i = 0; i < 12; i++) {
			System.out.println(s.pop());
		}
		
		for (int i = 0; i < 4; i++) {
			s.push(i);
		}
		
		s = vs ;
		System.out.println("Values in dynamic Stack");
		for (int i = 0; i < 4; i++) {
			System.out.println(s.pop());
		}
		
		s = fs ;
		for (int i = 0; i < 8; i++) {
			s.push(i);
		}
		
		s = fs ;
		System.out.println("Values in fixed stack ");
		for (int i = 0; i < 8; i++) {
			System.out.println(s.pop());	
		}
		
		for (int i = 0; i < 12; i++) {
			s.push(i);
		}
		
		s = fs ;
		System.out.println("Values in fixed stack ");
		for (int i = 0; i < 12; i++) {
			System.out.println(s.pop());	
		}
	}

}
