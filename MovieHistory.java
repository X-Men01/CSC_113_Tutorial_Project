import java.io.IOException;

public interface MovieHistory {

	public void saveToFile(String fileName, Movie m) throws IOException;

	public Adult[] loadFromFile(String fileName, Adult[] arrAdult) throws IOException;
}
