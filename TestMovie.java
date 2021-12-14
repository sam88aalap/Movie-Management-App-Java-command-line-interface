import java.util.*;

public class TestMovie {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice;
		int c;
		MovieDetailsList movie = new MovieDetailsList();
		
		while(true) {
			
			System.out.println("\n__________________MOVIE MENU____________________________\n");
			System.out.println("\n 1. ADD MOVIE\n 2. DELETE MOVIE\n 3. DELETE ALL\n 4. SEARCH MOVIE BY NAME\n 5. SEARCH BY GENRE\n 6. SORT MOVIE\n 7. DISPLAY AVAILABLE MOVIES\n 8. EXIT MENU");
			System.out.println("\n ENTER YOUR CHOICE:");
			c = sc.nextInt();
			
			if(c==8)
				break;
			else {
				
              switch(c) {
				
				case 1:{
					movie.addMovie();
					break;
				}
				
				case 2:{
					movie.removeMovie();
					break;
				}
				
				case 3:{
					movie.removeAll();
					break;
				}
				
				case 4:{
					movie.searchByName();
					break;
				}
				
				case 5:{
					movie.searchByGenre();
					break;
				}
				
				case 6:{
					System.out.println("Sort by NAME or GENRE");
					choice=sc.next();
					movie.movieSort(choice);
					break;
				}
				
				case 7:{
					movie.movieDisplay();
					break;
				}
				
				default:{
					System.out.println("WRONG OPTION!!!");
					break;
				}
				
			}	
				
		}	
		}
		System.out.println("__________________THE END!!____________________________");
		sc.close();
	}
}
