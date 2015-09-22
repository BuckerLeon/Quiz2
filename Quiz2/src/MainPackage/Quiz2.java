package MainPackage;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args){
		double p = 0;  //p is the total cost of tuition cost
		double nm = 0; //nm is the repayment schedule is mounth
		
		Scanner user_input = new Scanner(System.in);
		
		//a is the principle number of tuition cost
		System.out.println("Please input the initial tuition cost:");
		double a = user_input.nextDouble();
		
		//b is the percentage increase for tuition
		System.out.println("Please input the percentage increases for tuition:");
		double b = user_input.nextDouble();
		
		//c is the repayment APR
		System.out.println("Please input the repayment APR:");
		double c = user_input.nextDouble();
		
		//d is the  repayment schedule
		System.out.println("Please input the repayment schedule(in years):");
		double d = user_input.nextDouble();
		
		//FV
		//for(int i = 0; i<d; i++){
		//	p = p + (a * Math.pow((1 + b / 100), i));	
		//}
		
		//monthly payment	
		//nm = d * 12;
		//double mp = p * (c / 100) * (Math.pow((1 + (c / 100)), nm) / (Math.pow((1 + (c / 100)), nm) - 1));
				
		System.out.printf("Your FV will be %.2f dollars.", Quiz2.FV(a, b, d, p));
		System.out.printf("Your monthly payment is %.2f dollars.", Quiz2.MP(d, FV(a, b, d, p), c, nm));
	}
	
	public static double FV(double a, double b, double d, double p){
		for(int i = 0; i<d; i++){
			p = p + (a * Math.pow((1 + b / 100), i));	
		}
		return p;			
	}
	
	public static double MP(double d, double p, double c, double nm){
		nm = d * 12;
		double mp = p * (c / 100) * (Math.pow((1 + (c / 100)), nm) / (Math.pow((1 + (c / 100)), nm) - 1));
		return mp;
	}
}
