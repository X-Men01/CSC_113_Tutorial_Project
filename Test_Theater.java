import java.io.IOException;
import java.util.Arrays;

public class Test_Theater {

	public static void main(String[] args) {
		Theater myTheater = new Theater("Vox", "Riyadh", 20, 100);

		Adult A1 = new Adult("Avengers: Endgame ", 181, 8.4, 2019, Category.Action, 13);
		Adult A2 = new Adult("Avengers: Infinity War  ", 149, 8.5, 2018, Category.Action, 13);
		Adult A3 = new Adult("Malcom X  ", 202, 7.7, 1992, Category.Biograhpy, 13);
		Adult A4 = new Adult("The Terminator ", 107, 8.1, 1983, Category.Sci_Fi, 18);
		Adult A5 = new Adult("Pulp Fiction ", 154, 8.9, 1994, Category.Drama, 18);

		Kids K1 = new Kids("The lion King ", 88, 8.5, 1994, Category.Drama);
		Kids K2 = new Kids("Toy Story  ", 81, 8.3, 1995, Category.Action);
		Kids K3 = new Kids("Monsters, Inc.  ", 92, 8.1, 2001, Category.Comedy);
		Kids K4 = new Kids("The INCRREDIBLES ", 115, 8.0, 1983, Category.Sci_Fi);
		Kids K5 = new Kids("Frozen ", 102, 7.5, 2013, Category.Fantasy);

		myTheater.addMovie(A1);
		myTheater.addMovie(K1);

		myTheater.addMovie(A2);
		myTheater.addMovie(K2);

		myTheater.addMovie(A3);
		myTheater.addMovie(K3);

		myTheater.addMovie(A4);
		myTheater.addMovie(K4);

		myTheater.addMovie(A5);
		myTheater.addMovie(K5);

		Restaurant T1 = new Restaurant("Burger King", 32);
		Restaurant T2 = new Restaurant("McDonald's", 64);
		Restaurant T3 = new Restaurant("Sup Way", 16);

		myTheater.AddRestaurant(T1);
		myTheater.AddRestaurant(T2);
		myTheater.AddRestaurant(T3);

		System.out.println("The AveragePriceAdults( ) " + myTheater.AveragePriceAdults());
		System.out.println("The CountKidsMovie () " + myTheater.CountKidsMovie());
		System.out.println("The Releaseyear(Year)  " + myTheater.Releaseyear(2000));

		System.out.println("The toSting()\n" + myTheater.toString()) ;
		Adult[] arr2 = null;
		try {
			myTheater.saveToFile("myFile2", K5);
			Adult[] arr = new Adult[10];
			arr2 = myTheater.loadFromFile("myFile2", arr);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something go wrong!!!!");
		}
		
		
		
		for (int i = 0; i < arr2.length; i++)
			if (arr2[i] != null)
				System.out.println(arr2[i].toString());

		// Arrays.toString(arr2);

	}

}
