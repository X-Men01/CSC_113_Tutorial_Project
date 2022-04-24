
public class Kids extends Movie {

	public Kids(String name, double duration, double rating, int year, Category categotry) {
		super(name, duration, rating, year, categotry);

	}

	public Kids(Kids k) {
		super(k);

	}

	public double price() {
		return getDuration() * 0.4;
	}

	public double BreakTime() {
		return getDuration() / 2;
	}

}
