import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

  /** Instance Variables */
  private int[][] catLifespans;
  
  /** Constructor */
  public SceneTwo(int[][] catLifespans) {
    this.catLifespans = catLifespans;
  }

  /**
   * Top-level drawScene method which will draw the whole animation
   */
  public void drawScene() {
    drawText("Average Cat Lifespans: ", 80, 40);
    pause(2);

    drawCatStats();
  }

  public void drawCatStats() {
    for (int row = 0; row < catLifespans.length; row++) {
      int average = getAverageLifespan(row);
      clear("white");

      if (row == 0) {
        drawText("Indoor Cat Lifespan: " + average + " Years", 50, 200);
      } 
      else if (row == 1) {
        drawText("Outdoor Cat Lifespan: " + average + " Years", 50, 200);
      } 
      else {
        drawText("Mixed Lifestyle Cat Lifespan: " + average + " Years", 50, 200);
      }
      pause(2);
    }
  }

  // other methods...
  public int getAverageLifespan(int row) {
    int total = 0;
    for (int col = 0; col < catLifespans[row].length; col++) {
      total += catLifespans[row][col];
    }

    return total / catLifespans[row].length;
  }
}
