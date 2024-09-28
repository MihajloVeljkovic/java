package februar2022;

import java.io.*;

public class Picture {
    private int width;
    private int height;
    private boolean isColor;
    private Color[][] pixels;

    public Picture(boolean isColor) {
        this.isColor = isColor;
    }

    public void loadPicture(String fileName) throws IOException, IllegalArgumentException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            width = Integer.parseInt(reader.readLine());
            height = Integer.parseInt(reader.readLine());

            pixels = new Color[width][height];

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    pixels[i][j] = isColor ? new RGBColor() : new BWColor();
                    pixels[i][j].loadAttributesFromStream(reader);
                }
            }
        } catch (NumberFormatException e) {
            throw new IOException("Error parsing picture attributes", e);
        }
    }

    public void savePicture(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(Integer.toString(width));
            writer.newLine();
            writer.write(Integer.toString(height));
            writer.newLine();

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    pixels[i][j].saveAttributesToStream(writer);
                }
            }
        }
    }

    public void invertPicture() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                pixels[i][j].invert();
            }
        }
    }
}

