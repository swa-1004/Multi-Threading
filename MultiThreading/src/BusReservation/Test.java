package BusReservation;

public class Test {

	public static void main(String[] args) {
		
		TicketCounter ticketCounter =new TicketCounter();
		
		TicketBookingThread t1 =new TicketBookingThread(ticketCounter,"swathi",2);
		TicketBookingThread t2 =new TicketBookingThread(ticketCounter,"varshii",2);
		
		t1.start();
		t2.start();
		
	}

}

