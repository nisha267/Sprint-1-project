package movie.movieticketmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import movie.movieticketmanagement.entity.Movie;
import movie.movieticketmanagement.repository.Movierepository;

@SpringBootApplication
public class MovieticketmanagementApplication implements CommandLineRunner {
	@Autowired
	private Movierepository movierepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieticketmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Movie m1 = Movie.builder().name("Avengers").genre("Action").showtime("11.30am").price(200.00).seats(102)
				.review("Blockbuster").build();
		Movie m2 = Movie.builder().name("KGF 1").genre("Action").showtime("10.30am").price(250.00).seats(102)
				.review("Blockbuster").build();
		Movie m3 = Movie.builder().name("KGF 2").genre("Action,drama").showtime("09.30am").price(300.00).seats(150)
				.review("Blockbuster").build();
		movierepository.save(m1);
		movierepository.save(m2);
		movierepository.save(m3);
		System.out.println("-----All saved-----");

	}

}
