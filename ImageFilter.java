import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  /** Instance Variables */
 
  /** Constructor */
  public ImageFilter(String fileName) {
    super(fileName);
  }

  // Add filter methods here...
 
  public void makeNegative() {
    Pixel[][] pixels = this.getImagePixels();
    for (int row = 0; row < pixels.length; row++){
      for(int col = 0; col < pixels[0].length; col++) {
        Pixel pixel = pixels[row][col];
        pixel.setRed(255 - pixel.getRed());
        pixel.setGreen(255 - pixel.getGreen());
        pixel.setBlue(255 - pixel.getBlue());


       
      }
    }
  }
   
 public void applySepia() {
    Pixel[][] pixels = this.getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {

        Pixel pixel = pixels[row][col];

        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();

        int newRed = (int)(0.393 * red + 0.769 * green + 0.189 * blue);
        int newGreen = (int)(0.349 * red + 0.686 * green + 0.168 * blue);
        int newBlue = (int)(0.272 * red + 0.534 * green + 0.131 * blue);

        if (newRed > 255) newRed = 255;
        if (newRed < 0) newRed = 0;

        if (newGreen > 255) newGreen = 255;
        if (newGreen < 0) newGreen = 0;

        if (newBlue > 255) newBlue = 255;
        if (newBlue < 0) newBlue = 0;

        pixel.setRed(newRed);
        pixel.setGreen(newGreen);
        pixel.setBlue(newBlue);
      }
    }
 }
 
     public void colorize() {
    Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {

        Pixel pixel = pixels[row][col];

        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();

        int average = (red + green + blue) / 3;

        if (average < 85) {
          pixel.setRed(255);
          pixel.setGreen(0);
          pixel.setBlue(0);
        }
        else if (average < 170) {
          pixel.setRed(0);
          pixel.setGreen(255);
          pixel.setBlue(0);
        }
        else {
          pixel.setRed(0);
          pixel.setGreen(0);
          pixel.setBlue(255);
        }
      }
    }
     }

         public void sharpen() {
  Pixel[][] pixels = getImagePixels();

  for (int row = 1; row < pixels.length - 1; row++) {
    for (int col = 1; col < pixels[0].length - 1; col++) {

      Pixel current = pixels[row][col];
      Pixel neighbor = pixels[row - 1][col - 1];

      int redDiff = current.getRed() - neighbor.getRed();
      int greenDiff = current.getGreen() - neighbor.getGreen();
      int blueDiff = current.getBlue() - neighbor.getBlue();
     
int averageDiff = (redDiff + greenDiff + blueDiff) / 3;

      int newRed = current.getRed() + averageDiff;
      int newGreen = current.getGreen() + averageDiff;
      int newBlue = current.getBlue() + averageDiff;

      if (newRed > 255) newRed = 255;
      if (newGreen > 255) newGreen = 255;
      if (newBlue > 255) newBlue = 255;

      current.setRed(newRed);
      current.setGreen(newGreen);
      current.setBlue(newBlue);
    }
  }
}

 
}

