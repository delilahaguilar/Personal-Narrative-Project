import org.code.theater.*;
import org.code.media.*;

public class SceneOne extends Scene {

  /** Instance Variables */
    private ImageFilter[][] images;

  /** Constructor */
  public SceneOne(ImageFilter[][] images) {
    this.images = images;
  }
 
  /**
   * Top-level drawScene method 
   */
   public void drawScene() {
    drawFoodsImages();
    drawCatImages();
    drawTravelImages();
  }

  /**
   * Draws all images in row zero of images
   */
  public void drawFoodsImages() {
    for (ImageFilter img : images[0]) {
      clear("white");

      if (img != null) {
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
     
      img.makeNegative();
     
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
      }
    }
  }
 
  /**
   * Draws all images in first row of images
   */
  public void drawCatImages() {
    for (ImageFilter img : images[1]) {
      clear("white");

      if (img != null) {
        drawImage(img, 0, 0, 400, 400, 0);
        pause(1);
       
        img.applySepia();
       
        drawImage(img, 0, 0, 400, 400, 0);
        pause(1);
      }
     
    }
  }
 
  /**
   * Draws all images in second row of images
   */
  public void drawTravelImages() {
    for (ImageFilter img : images[2]) {
      clear("white");

      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
     
      img.colorize();
     
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
    }
  }
 
}
