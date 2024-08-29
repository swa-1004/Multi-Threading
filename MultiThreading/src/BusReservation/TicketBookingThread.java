package BusReservation;

public class TicketBookingThread extends Thread
{
	
	private TicketCounter ticketcounter;
	private String passenger_name;
	private int noOfSeatsToBook;
	
	public TicketBookingThread(TicketCounter ticketcounter,String passenger_name,int noOfSeatsToBook)
	{
		this.ticketcounter=ticketcounter;
		this.passenger_name=passenger_name;
		this.noOfSeatsToBook=noOfSeatsToBook;
		
	}
	
	public void run()
	{
		ticketcounter.bookTickets(passenger_name, noOfSeatsToBook);
	}
	

}
