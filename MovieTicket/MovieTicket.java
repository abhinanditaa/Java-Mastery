package MovieTicket;

import java.util.*;

public class MovieTicket {
    ArrayList<String> movies = new ArrayList<>();
    HashMap<String,String>BookingHistory = new HashMap<>();



    public MovieTicket() {
        movies.add("1. Kesari 2");
        movies.add("2. Oppenheimer");
        movies.add("3. Titanic");
        movies.add("4. Inception");
    }

    void ShowMovies(){
        System.out.println(movies);
    }

    void BookTicket(String name,String Movie){

        BookingHistory.put(name, Movie);

    }

    void ShowBookingHIstory(){
        System.out.println(BookingHistory);
    }



    public static void main(String[] args) {

        MovieTicket mt = new MovieTicket();
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Movie:");
        mt.ShowMovies();

        String MovieName = sc.nextLine();
        
        System.out.println("Enter Your Name:");
        String name = sc.next();

        mt.BookTicket(name,MovieName);
        System.out.println("Booking HIstory:");
        mt.ShowBookingHIstory();



    }
}
