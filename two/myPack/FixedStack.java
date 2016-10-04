package com.java.assignmentfive.two.myPack;

public class FixedStack implements Stack {
	
	public static int[] stack ;
	public static int stackUnderFlow ;

	public FixedStack(int i) {
		// TODO Auto-generated constructor stub
		stack = new int[i];
		stackUnderFlow = -1;
	}

	@Override
	public void push(int I) {
		// TODO Auto-generated method stub
		if (stackUnderFlow == stack.length-1) {
			System.out.println("Stack OverFlow");
		} else {
			stack[++stackUnderFlow] = I;
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (stackUnderFlow < 0) {
			System.out.println("Stack underFlow");
			return 0;
			
		} else {
			return stack[stackUnderFlow--];
		}
	}

}
