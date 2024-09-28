package februar2022;

import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		try {
			Picture bwPicture = new Picture(false);
	        bwPicture.loadPicture("CrnoBelaSlika.txt");
	        bwPicture.savePicture("SlikaUBoji.txt");
	        bwPicture.invertPicture();
	        bwPicture.savePicture("InvertovanaCrnoBela.txt");
	        
	        Picture colorPicture = new Picture(true);
	        colorPicture.loadPicture("SlikaUBoji.txt");
	        colorPicture.invertPicture();
	        colorPicture.savePicture("InvertovanaUBoji.txt");
		} catch (IOException | IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}	
	}
}
