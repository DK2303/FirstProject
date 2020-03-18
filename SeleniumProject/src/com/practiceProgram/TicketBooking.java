package com.practiceProgram;

public class TicketBooking {
	
	void ticketBooking(int noOfPassenger, String passengerName, int ticketPrice,String coach) {
		if(noOfPassenger==1) {
			int GST=ticketPrice/18;
			float totalPrice=GST+ticketPrice;
			System.out.println("No Of Passenger"+"\t\t"+"  Passenger Name"+"\t\t"+"Coach"+"\t\t"+"Ticket Price"+"\t\t"+"GST 18%"+"\t\t"+"Total Ticket Price");
			System.out.println("\t"+noOfPassenger+"\t\t\t"+passengerName+"\t\t\t"+coach+"\t\t"+ticketPrice+"\t\t"+GST+"\t\t"+totalPrice+"\n");
		}
			else if(noOfPassenger>1) {
				int GST=ticketPrice*noOfPassenger/18;
				float totalPrice=GST+ticketPrice*noOfPassenger;
				System.out.println("No Of Passenger"+"\t\t"+"  Passenger Name"+"\t\t"+"Coach"+"\t\t"+"Ticket Price"+"\t\t"+"GST 18%"+"\t\t"+"Total Ticket Price");
				System.out.println("\t"+noOfPassenger+"\t\t\t"+passengerName+"\t\t\t"+coach+"\t\t"+ticketPrice+"\t\t"+GST+"\t\t"+totalPrice+"\n");

				}	
			
		}
	
	public static void main(String[] args) {
		
		TicketBooking obj=new TicketBooking();
		obj.ticketBooking(2, "Dinesh", 500, "sleeping");
		obj.ticketBooking(1, "Ram", 300, "Non-Sleeping");
	}
	}

