package februar2022;

import java.io.*;

public class BWColor implements Color {
    private int value;

    @Override
    public void loadAttributesFromStream(BufferedReader reader) throws IOException, IllegalArgumentException {
        try {
            value = Integer.parseInt(reader.readLine());

            if (value != 0 && value != 1) {
                throw new IllegalArgumentException("Invalid color attributes");
            }
        } catch (NumberFormatException e) {
            throw new IOException("Error parsing color attributes", e);
        }
    }

    @Override
    public void saveAttributesToStream(BufferedWriter writer) throws IOException {
        writer.write(Integer.toString(value));
        writer.newLine();
    }

    @Override
    public void invert() {
        value = 1 - value;
    }
}
