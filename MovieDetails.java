
public class MovieDetails {
	
	private String movieName;
	private String leadActor;
	private String genre;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public MovieDetails(String movieName, String leadActor, String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor=" + leadActor + ", genre=" + genre + "]";
	}
	
		
}
