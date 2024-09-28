package februar2022;

public interface Color {
	void loadAttributesFromStream(BufferedReader reader) throws IOException, IllegalArgumentException;
    void saveAttributesToStream(BufferedWriter writer) throws IOException;
    void invert();
}
