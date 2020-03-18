package com.practiceProgram;

import java.util.Scanner;

public class VehicleWeightCalculator {
	
	void weightCalculator(int weight) {
		float GST=18;
		float totalPrice;
		int price = 0;
		
		if(weight>=100 && weight<=399){
			price=500;}
		
		else if(weight>=400 && weight<=499) {
			price=1000;}
		
		else if(weight>=500 && weight<=699) {
			price=1500;}
		
		else if(weight>=700 && weight<=999) {
			price=2000;}
		
		else if(weight>1000) {
			price=2500;}
		
		else 
			System.out.println("Invalid Input");
		

		GST=(price*GST)/100;
		totalPrice=GST+price;	
		System.out.println("\nWeight"+"\t\t"+" Price"+"\t\t"+"GST 18%"+"\t\t"+"Total Price");
		System.out.println(weight+"\t\t  "+price+"\t\t"+GST+"\t\t"+totalPrice+"\n");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleWeightCalculator obj=new VehicleWeightCalculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Vehicle Weight: ");
		int weight=sc.nextInt();
		obj.weightCalculator(weight);

	}


}
