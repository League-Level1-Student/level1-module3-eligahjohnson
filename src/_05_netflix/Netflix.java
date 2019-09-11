package _05_netflix;

public class Netflix {
	public static void main(String[] args) {
	 Movie joe = new Movie("why saying no jobi is still not jobi " , 5 );
	 Movie Dave = new Movie ("I am sliding in my nike slides", 1);
	 Movie Bob = new Movie  (" How to get drip 101 ", 10);
	 Movie Greg = new Movie ( " Chick Magnet " , 10 );
	 Movie driptohard = new Movie (" Android are the best", 5);
	 
	String tom = joe.getTicketPrice();
	System.out.println( tom );
	
	
	
	NetflixQueue jake = new NetflixQueue ( );
	
	jake.addMovie(driptohard);
	jake.addMovie(Greg);
	jake.addMovie(Bob);
	jake.addMovie(Dave);
	jake.addMovie(joe);
	
	jake.printMovies();
	}

}
