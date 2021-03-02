public class Turtle{
   private double x;      //the x-coordinate of the turtle
   private double y;      //the y-coordinate of the turtle
   private double angle;  //the angle of the turtle, in radians
   private boolean pen;   //whether the pen is down
   public Turtle(double x, double y, double angle, boolean pen){
      /*Constructor, initialize new Turtles
      */
      //your code goes here
   this.x = x;
   this.y = y;;
   this.angle = angle;
   this.pen = pen;
   }

   public Turtle(){
      /*Default constructor. Initialize a new Turtle at (0, 0),
      pointing with an angle of 0 radians, with the pen down
      */
      //your code here
      this.x = 0;
      this.y = 0;
      this.angle = 0;
      this.pen = true;
   }
   public String toString(){
      /*Return a String representation of this Turtle
      Input:
         this: a Turtle object
      Output:
         return: a String representing this Turtle
      Side Effects: none
      Ex.
      Turtle t = new Turtle(1.0, 2.0, 3.0, true);
      t.toString() -> (x = 1.0, y = 2.0, θ = 3.0)
      */
      //your code goes here
      return "(x = " + this.x + ", y = " + this.y + ", ϴ = " + this.angle + ")";
   }
   public void penDown(){
      /*Put the pen down on the paper, i.e. draw lines
      Input:
         this: a Turtle object
      Output: none
      Side Effects: this Turtle's pen is now down
      Ex.
      Turtle t = new Turtle()
      t.penDown() -> t's pen is down
      */
      //your code here
      this.pen = true;
   }

   public void penUp(){
      /*Pull the pen up off the paper, i.e. don't draw lines
      Input:
         this:a Turtle object
      Output: none
      Side Effects: this Turtle's pen is now up
      Ex.
      Turtle t = new Turtle()
      t.penUp() -> t's pen is up
      */
      //your code goes here
      this.pen = false;
   }
   public void turn(double turnAmount){
      /*Turn the turtle by turnAmount
      Input:
         this: a Turtle object
         double turnAmount: the amount to turn left (in radians)
      Output: none
      Side Effects: this Turtle turns left by turnAmount
      Ex.
      Turtle t = new Turtle()
      t.turn(1.0)
      t.toString() -> (x = 0.0, y = 0.0, θ = 1.0)
      */
      //your code goes here
      this.angle += turnAmount;
   }
   public void step(double length){
      /*Step the turtle forward by length
      Input:
         this: a Turtle  object
         double length: the distance to step the turtle forward
      Output:
         StdDraw: draw a line from the turtle's old position to
                  its new position if the pen is down
      Side Effects: this Turtle takes a step forward of length
      Ex.
      Turtle t = new Turtle()
      t.penDown()
      t.toString() -> (x = 0.0, y = 0.0, θ = 0.0)
      t.step(0.5) -> draws a line from (0, 0) to (0.5, 0)
      t.toString() -> (x = 0.5, y = 0.0, θ = 0.0)
      t.turn(Math.PI/2)
      t.penUp()
      t.step(0.5) -> moves to (0.5, 0.5), but doesn't draw line
      t.toString() -> (x = 0.5, y = 0.5, θ = 1.5707963267948966)
      */
      
         double saveX = this.x;
         double saveY = this.y;
         this.x += Math.cos(angle) * length;
         this.y += Math.sin(angle) * length;
         if (this.pen){
            StdDraw.line(saveX, saveY, this.x, this.y);
         }
      
    }
    public void teleport(double x, double y){
      /*Teleport this Turtle to a new location. Don't
      draw a line regardless of pen up/down
      Input:
         this: a Turtle object
         double x: the new x-coordinate
         double y: the new y-coordinate
      Output: none
      Side Effects: this Turtle is now at (x, y)
      Ex.
      Turtle t = new Turtle()
      t.teleport(10.0, 20.0) -> the turtle is now at (10, 20)
      */
      this.x = x;
      this.y = y;
   }




}