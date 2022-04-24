import java.io.*;
import java.util.Arrays;

public class Theater implements MovieHistory {
	private String name, location;
	private int numberOfHalls;
	private Movie[] arrMovies;
	private int numberOfMovies, numberOfRestaurant;
	private Restaurant[] arrRestaurants;

	public Theater(String name, String location, int numberOfHalls, int size) {
		this.name = name;
		this.location = location;
		this.numberOfHalls = numberOfHalls;
		arrMovies = new Movie[size];
		numberOfMovies = 0;
		arrRestaurants = new Restaurant[10];
		numberOfRestaurant = 0;
	}

	public double AveragePriceAdults() {
		int count = 0;
		double sum = 0;

		for (int i = 0; i < numberOfMovies; i++)
			if (arrMovies[i] instanceof Adult) {
				sum += ((Adult) arrMovies[i]).price();
				count++;
			}

		if (count == 0)
			throw new ArithmeticException();
		return sum / count;
	}

	public boolean addMovie(Movie m) {
		if (isAddedBefore(m))
			return false;
		if (m instanceof Adult)
			arrMovies[numberOfMovies++] = new Adult((Adult) m);
		else
			arrMovies[numberOfMovies++] = new Kids((Kids) m);
		return true;

	}

	private boolean isAddedBefore(Movie m) {
		if (numberOfMovies == 0)
			return false;
		for (int i = 0; i < numberOfMovies; i++)
			if (arrMovies[i].getName().equalsIgnoreCase(m.getName()))
				return true;
		return false;
	}

	public boolean AddRestaurant(Restaurant r) {
		if (isAddedBefore(r) || numberOfRestaurant == arrRestaurants.length)
			return false;
		arrRestaurants[numberOfRestaurant++] = r;
		return true;

	}

	private boolean isAddedBefore(Restaurant r) {
		if (numberOfRestaurant == 0)
			return false;
		for (int i = 0; i < numberOfRestaurant; i++)
			if (arrRestaurants[i].getName().equalsIgnoreCase(r.getName()))
				return true;
		return false;
	}

	public int CountKidsMovie() {
		return CountKidsMovie(arrMovies, 0);
	}

	private int CountKidsMovie(Movie array[], int start) {
		if (start == array.length || array[start] == null)
			return 0;
		if (array[start] instanceof Kids)
			return 1 + CountKidsMovie(array, start + 1);
		return CountKidsMovie(array, start + 1);
	}

	public int Releaseyear(int Year) {
		int count = 0;
		for (int i = 0; i < numberOfMovies; i++)
			if (arrMovies[i].getYear() > Year)
				count++;
		return count;
	}

	public void saveToFile(String fileName, Movie m) throws IOException {
		File file = new File(fileName);
		FileOutputStream OutputStream = new FileOutputStream(file);
		ObjectOutputStream objOut = new ObjectOutputStream(OutputStream);
		try {
			for (int i = 0; i < numberOfMovies; i++)
				objOut.writeObject(arrMovies[i]);

		} catch (IOException e) {
			System.out.println("You have reached the end of the file");
		}
		OutputStream.close();

	}

	@Override
	public Adult[] loadFromFile(String fileName, Adult[] arrAdult) throws IOException {
		File file = new File(fileName);
		FileInputStream InputStream = new FileInputStream(file);
		ObjectInputStream objIn = new ObjectInputStream(InputStream);
		int count = 0;
		try {
			while (true) {
				Movie m = (Movie) objIn.readObject();
				if (m instanceof Adult)
					arrAdult[count++] = (Adult) m;
			}

		} catch (ClassNotFoundException e) {

		} catch (EOFException e) {

		}
		InputStream.close();
		return arrAdult;

	}

	public String toString() {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < numberOfMovies; i++)
			res.append(arrMovies[i].toString() + "\n\n");
		String s = "Movie		Duration 	Rating	Year	Category  Age\n	";

		return "Theater Name: " + name + ", Location: " + location + ", Number Of Halls: " + numberOfHalls + "\n" + s
				+ "\n" + res.toString();
	}
}
