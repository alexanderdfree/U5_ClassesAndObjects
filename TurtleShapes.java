public class TurtleShapes{
   public static void drawSquare(){
      /*Draw a 1 x 1 square using a Turtle
      Input: none
      Output:
         StdDraw: Draws a 1 x 1 square
      Ex.
      TurtleShapes.drawSquare() -> draws a square
      */
      Turtle t = new Turtle(); //make a Turtle for drawing
      t.step(1.0);
      t.turn(Math.PI/2);
      t.step(1.0);
      t.turn(Math.PI/2);
      t.step(1.0);
      t.turn(Math.PI/2);
      t.step(1.0);
   }

}