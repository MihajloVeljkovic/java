package februar2022;

import java.io.*;

public class RGBColor implements Color {
    private int red;
    private int green;
    private int blue;

    @Override
    public void loadAttributesFromStream(BufferedReader reader) throws IOException, IllegalArgumentException {
        try {
            red = Integer.parseInt(reader.readLine());
            green = Integer.parseInt(reader.readLine());
            blue = Integer.parseInt(reader.readLine());

            if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
                throw new IllegalArgumentException("Invalid color attributes");
            }
        } catch (NumberFormatException e) {
            throw new IOException("Error parsing color attributes", e);
        }
    }

    @Override
    public void saveAttributesToStream(BufferedWriter writer) throws IOException {
        writer.write(Integer.toString(red));
        writer.newLine();
        writer.write(Integer.toString(green));
        writer.newLine();
        writer.write(Integer.toString(blue));
        writer.newLine();
    }

    @Override
    public void invert() {
        red = 255 - red;
        green = 255 - green;
        blue = 255 - blue;
    }
}

