package com.practiceProgram;

import java.util.Scanner;

public class FoodOrder1 {
	
	FoodOrder1(){
		System.out.println("Item No 1 = Juice \nItem No 2 = Starter \nItem No 3 = dinner \nItem No 4 = Lunch Meals \n");
	}

	void orderFood(int itemNo) {
		float GST=18;
		float totalPrice;
		int price = 0;
		String item="";
		
		if(itemNo==1){
			item="Juice";
			price=50;
			}
		else if(itemNo==2) {
			item="Starter";
			price=100;}
		else if(itemNo==3) {
			item="Dinner";
			price=120;}
		else if(itemNo==4) {
			item="Lunch";
			price=150;}
		else 
			System.out.println("Invalid Input");
		

		GST=(price*GST)/100;
		totalPrice=GST+price;	
		System.out.println("\nItem"+"\t\t"+item+" Price"+"\t\t"+"GST 18%"+"\t\t"+"Total Price");
		System.out.println(item+"\t\t\t"+price+"\t\t"+GST+"\t\t"+totalPrice+"\n");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder1 fo=new FoodOrder1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the item No: ");
		int itemNo=sc.nextInt();
		fo.orderFood(itemNo);

	}

}
