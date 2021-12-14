import java.util.*;

public class GenreSort implements Comparator<MovieDetails>{

	@Override
	public int compare(MovieDetails o1, MovieDetails o2) {
		String genre1 = o1.getGenre();
		String genre2 = o2.getGenre();
		return genre1.compareTo(genre2);
	}
	
}
