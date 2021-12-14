import java.util.*;

public class MovieNameSort implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails arg0, MovieDetails arg1) {
		String name1=arg0.getMovieName();
		String name2=arg1.getMovieName();
		return name1.compareToIgnoreCase(name2);
	}
	
}
