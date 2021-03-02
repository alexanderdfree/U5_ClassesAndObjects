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
   public static void drawPolygon(int n, double length){
      /*Use a Turtle to draw a regular n-sided polygon
      Input:
         int n: the number of sides of the polygon
         double length: the length of each side of the polygon
      Output:
         StdDraw: draws a regular n-sided polygon
      Ex.
      TurtleShapes.drawPolygon(5, 1.0) -> draws a pentagon
      */ 
      Turtle t = new Turtle();
      double newAngle = (Math.PI*2/n);
      for (int i = 0; i < n; i++){
         t.step(length);
         t.turn(newAngle);
      } 
   }
   public static void drawSpiral(double angle, double alpha, double length, int n){
      /*Draw a spiral using a Turtle
      Inputs:
         double angle: how much the turtle should turn each step
         double alpha: how much the step length should be
                       multiplied each step
         double length: how far the turtle should step initially
         int n: how many total steps the turtle should take
      Output:
         StdDraw: draws a spiral
      Ex.
      TurtleShapes.drawSpiral(Math.PI/2, 0.95, 1.0, 100) -> draws a square spiral decay
      */
   Turtle t = new Turtle();
   double newStep = length;
   for (int i = 0; i < n; i++){
      t.step(newStep);
      newStep*=alpha;
      t.turn(angle);
   
   }
   }
   public static void alexShape(){
      StdDraw.setScale(-10, 10);
      TurtleShapes.drawSpiral(Math.PI/3, 0.9, 10, 100);
   
   }


}