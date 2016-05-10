package com.detell.relative;

import java.util.Scanner;

public class RelativisticCalculator{

	static double c = 299792458;
	
	public static void main(String[] args){
	
		Primer();
	
	}
	
	private static void Primer(){
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please pick a formula." + "\n" + 
							"1. Relativistic velocity addition" + "\n" +
							"2. Time Dilation" + "\n" +
							"3. Length Contraction" + "\n" +
							"4. exit");
		FunctionSelector(input.nextInt());
		
	}
	
	private static int FunctionSelector(int i){
		
		switch (i) {
			case 1:  i=1;
					 RVACalculator();
					 Primer();
					 break;
			case 2:  i=2;
					 TDCalculator();
					 Primer();
					 break;
			case 3:  i=3;
					 LCCalculator();
					 Primer();
					 break;
			case 4:  i=4;
					 break;
			default: 
					 System.out.println("Not an option, jerk.");
					 Primer();
					 break;
		}
		
		return i;
	}
	
	private static void RVACalculator(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input velocity 1");
		double v1 = input.nextDouble();
		
		System.out.println("Please input velocity 2");
		double v2 = input.nextDouble();
		
		double vt = (v1+v2)/(1+(v1*v2)/(c*c));
		
		System.out.println("The relative velocity between these two velocities is: " + String.format("%.2f",vt) + "\n");
		
	}
	
	private static void TDCalculator(){
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please input time interval measured by the observer");
		double t = input.nextDouble();
		
		System.out.println("Please input velocity of the observed");
		double v = input.nextDouble();
		
		double tpr = t/(Math.sqrt(1-(v*v)/(c*c)));
		
		System.out.println("The time interval as measured by the observed is: " + String.format("%.2f",tpr) + "\n");
	
	}
	
	private static void LCCalculator(){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input length measured by the observer");
		double l = input.nextDouble();
		
		System.out.println("Please input velocity of the observed");
		double v = input.nextDouble();
		
		double lpr = l*(Math.sqrt(1-(v*v)/(c*c)));
		
		System.out.println("The length as measured by the observed is: " + String.format("%.2f",lpr) + "\n");
		
	}
}