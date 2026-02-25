import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create any 2D arrays & variables to be passed as parameters to constructor

 ImageFilter[][] images = {
      // row 0 --> foods/drinks
      { new ImageFilter("IMG_8184.jpeg"), new ImageFilter("IMG_8764.jpeg"), new ImageFilter("IMG_4822.jpeg"), null },
      // row 1 --> cat
      { new ImageFilter("IMG_3173.jpeg"), new ImageFilter("IMG_3495.jpeg"), new ImageFilter("IMG_2879.jpeg") },
      // row 2 --> travel
      { new ImageFilter("IMG_6540.jpeg"), new ImageFilter("IMG_4524.jpeg"), new ImageFilter("IMG_8777.jpeg") },
    };

 int[][] catLifespans = {
  // Indoor Cats
  {15, 18},
  // Outdoor Cats
  {7, 10},
  // Mixed Lifestyle Cats
  {12, 14}
};

    
// Instantiate Scene subclass objects
SceneOne scene1 = new SceneOne(images);
SceneTwo scene2 = new SceneTwo(catLifespans);
   
// Call drawScene methods in each subclass
scene1.drawScene();
scene2.drawScene();
   
// Play scenes in Theater, in order of arguments
Theater.playScenes(scene1, scene2);
   
  }
}


