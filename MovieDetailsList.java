import java.util.*;

public class MovieDetailsList {
	
		List<MovieDetails> movies = new ArrayList<MovieDetails>();
		private String movieName;
		private String leadActor;
		private String genre;
		private Scanner sc = new Scanner(System.in);
		
		public void addMovie() {
			System.out.println("Enter movie name:");
			this.movieName = sc.nextLine();
			System.out.println("Enter lead actor:");
			this.leadActor = sc.nextLine();
			System.out.println("Enter genre:");
			this.genre = sc.nextLine();
			
			movies.add(new MovieDetails(movieName, leadActor, genre));
			System.out.println("Movie Added");
		}
		
		public void removeMovie() {
			System.out.println("Enter movie name to be removed:");
			this.movieName = sc.nextLine();
			
			for(MovieDetails movie: movies) {
				
				if(movie.getMovieName().equalsIgnoreCase(movieName)) {
					movies.remove(movie);
					System.out.println("Movie Removed");
					break;
				}
			
				else
					System.out.println("Movie not found");
			}
		}
		
		public void removeAll() {
			
			movies.removeAll(movies);
			System.out.println("All Movies Removed");
		}
		
		public void searchByName() {
			
			System.out.println("Search by movie name:");
			this.movieName = sc.nextLine();
			int c=0;
			for(MovieDetails movie:movies) {
				if(movie.getMovieName().equalsIgnoreCase(movieName)) {
					System.out.println(movie);
					c++;
				}
					
				if(c==0)
					System.out.println("Movie not found");
			}
		}
		
		public void searchByGenre() {
			
			System.out.println("Search by genre:");
			this.genre = sc.nextLine();
			int c=0;
			for(MovieDetails movie:movies) {
				if(movie.getGenre().equalsIgnoreCase(genre)) {
					System.out.println(movie);
					c++;
				}
					
				if(c==0)
					System.out.println("Genre not found");
			}
		}
		
		public void movieSort(String choice) {
			
			if(movies.size()==0)
				System.out.println("\n\t NO MOVIES TO SORT \t\n");
			else {
				if(choice.equalsIgnoreCase("name"))
					Collections.sort(movies, new MovieNameSort());
				else if(choice.equalsIgnoreCase("genre"))
					Collections.sort(movies, new GenreSort());
			}
			
			for(MovieDetails movie:movies)
				System.out.println(movie);
		}
		
		public void movieDisplay() {
			
			if(movies.size()!=0) {
				for(MovieDetails movie : movies) {
					System.out.println(movie.toString());
				}
			}
			
			else
				System.out.println("NO MOVIES AVAILABLE :(");
		}
		
}
