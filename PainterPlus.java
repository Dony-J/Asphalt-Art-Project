import org.code.neighborhood.*;

public class PainterPlus extends Painter {    

  //This makes it so the painter is able to turn right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  //This makes it so the painter is able to pick up all the paint in one function
  public void takeAllPaint(){
    while (isOnBucket()){
      takePaint();
    }
  }

  //This makes it so the painter is able to just keep moving untill it cant anymore in one function
  public void moveFast(){
    while (canMove()){
      move();
    }
  }

  //This makes the painter able to keep moving and painting untill the painter is out of paint
  public void paintToEmpty(String color){
    while (hasPaint()){
      paint(color);
      move();
    }
  }

  //This makes the painter paint in a circular shape almost like a donut
  public void paintDonut(String color){
    while (hasPaint()){
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }

  // Turns the Painter to around 180 degrees
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

 }