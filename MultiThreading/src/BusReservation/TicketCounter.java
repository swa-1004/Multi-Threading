package BusReservation;

public class TicketCounter {
	
	private int available_seats=3;
	
	public synchronized void bookTickets(String pname,int numberOfSeats)
	{
		if(numberOfSeats<available_seats && numberOfSeats>0)
		{
			System.out.println("Hii "+pname+" ,"+numberOfSeats+" booked successfully");
			available_seats -=numberOfSeats;
			
		}
		else if(numberOfSeats<0)
		{
			System.out.println(pname+" Please enter the valid number of seats");
		}
		else
		{
			System.out.println("Hii "+pname+" ,"+"Sorry,seats not available");
		}
	}

}
