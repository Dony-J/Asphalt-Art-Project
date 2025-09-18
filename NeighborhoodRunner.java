import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
    //This Painter creates the background in the color Green
    BackgroundPainter b = new BackgroundPainter();
      b.setPaint(1000);
      b.paintBackground("green");

    //This Painter creates the mouth of the creeper face
    MouthPainter m = new MouthPainter();
     m.paintCreeperMouth("black");

    //This Painter creates the eyes of the creeper face
    EyesPainter e = new EyesPainter();
     e.paintCreeperEyes("black");
  }
}