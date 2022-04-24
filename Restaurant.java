
public class Restaurant {
	private String name;
	private int NbOfdishis;
	
	public Restaurant(String name, int nbOfdishis) {
		
		this.name = name;
		NbOfdishis = nbOfdishis;
	}

	public String getName() {
		return name;
	}
	public int getNbOfdishis() {
		return NbOfdishis;
	}
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", NbOfdishis=" + NbOfdishis + "]";
	}
	
}
