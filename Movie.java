import java.io.Serializable;

public abstract class Movie implements Serializable {
	private String name;
	private double duration, rating;
	private int year;
	private Category categotry;

	public Movie(String name, double duration, double rating, int year, Category categotry) {
		this.name = name;
		this.duration = duration;
		this.rating = rating;
		this.year = year;
		this.categotry = categotry;
	}

	public Movie(Movie m) {
		this.name = m.name;
		this.duration = m.duration;
		this.rating = m.rating;
		this.year = m.year;
		this.categotry = m.categotry;
	}

	public abstract double price();

	public String toString() {
		return name + "	" + duration + "	" + rating + "	" + year + "	" + categotry;
		// return "Name: " + name+" Duration: " + duration + ", Rating: " + rating + ",
		// Year: " + year + ", Categotry: " + categotry;
	}

	public double getDuration() {
		return duration;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public Category getCategotry() {
		return categotry;
	}

}
