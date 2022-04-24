
public class Adult extends Movie {
	private int age;

	public Adult(String name, double duration, double rating, int year, Category categotry, int age) {
		super(name, duration, rating, year, categotry);
		this.age = age;
	}

	public Adult(Adult a) {
		super(a);
		this.age = a.age;
	}

	public double price() {

		return super.getDuration() * 0.6;
	}

	@Override
	public String toString() {
		return  super.toString() + " 	 " + age;
	}

}
