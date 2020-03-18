package com.practiceProgram;

import java.util.Scanner;

public class OrderFood {

	OrderFood(){
		System.out.println("Item 1 = Juice \nItem 2 = Starter \nItem 3 = dinner \nItem 4 = Lunch Meals \n");
	}
	void foodOrdering(int itemNo) {
		float GST;
		float totalPrice;
		String item;
		
		switch(itemNo) {
		case 1:
			item="Juice";
			int juicePrice=50;
			GST=(juicePrice*18)/100;
			totalPrice=GST+juicePrice;	
			System.out.println("\nItem"+"\t\t"+"Juice Price"+"\t\t"+"GST 18%"+"\t\t"+"Total Price");
			System.out.println(item+"\t\t\t"+juicePrice+"\t\t"+GST+"\t\t"+totalPrice+"\n");
			break;
			
		case 2:
			item="Starter";
			int starterPrice=100;
			GST=(starterPrice*18)/100;
			totalPrice=GST+starterPrice;	
			System.out.println("\nItem"+"\t\t"+"Starter Price"+"\t\t"+"GST 18%"+"\t\t"+"Total Price");
			System.out.println(item+"\t\t\t"+starterPrice+"\t\t"+GST+"\t\t"+totalPrice+"\n");
			break;
			
		case 3:
			item="Dinner";
			int dinnerPrice=120;
			GST=(dinnerPrice*18)/100;
			totalPrice=GST+dinnerPrice;	
			System.out.println("\nItem"+"\t\t"+"Dinner Price"+"\t\t"+"GST 18%"+"\t\t"+"Total Price");
			System.out.println(item+"\t\t\t"+dinnerPrice+"\t\t"+GST+"\t\t"+totalPrice+"\n");
			break;
			
		case 4:
			item="Lunch Meals";
			int lunchPrice=150;
			GST=(lunchPrice*18)/100;
			totalPrice=GST+lunchPrice;	
			System.out.println("\nItem"+"\t\t"+"Lunch Price"+"\t\t"+"GST 18%"+"\t\t"+"Total Price");
			System.out.println(item+"\t\t"+lunchPrice+"\t\t"+GST+"\t\t"+totalPrice+"\n");
			break;
			
			default: 
				System.out.println("\nInvalid Input");
		}
		
		}
	public static void main(String[] args) {

		OrderFood obj=new OrderFood();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Required Item No : ");
		int no=sc.nextInt();
		
		obj.foodOrdering(no);
		
		}
	}
	