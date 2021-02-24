public class Polar{
   private double r;      //the radius
   private double theta;  //the angle
   
   public Polar(double r, double theta){
      /*Constructor. Initialize new Polar objects
      Input:
        double r: the distance from the origin
        double theta: the angle from the horizontal
      Output:
         this: a Polar object representing the point (r, theta)
      Ex.
      Polar p = new Polar(1.0, Math.PI/2);
      */
      //your code goes here
      this.r = r;
      this.theta = theta;
   }
   public double getR(){
      /*Accessor. Return the radius of this Polar coordinate
      Input:
         this: a Polar coordinate
      Output:
         return: the radius of this Polar coordinate
      Side Effects: none
      Ex.
      Polar p = new Polar(1.0, Math.PI/2)
      p.getR() -> 1.0
      */
      //your code goes here
      return this.r;
   }
   public double getTheta(){
      /*Accessor. Return the theta of this Polar coordinate
      Input:
         this: a Polar coordinate
      Output:
         return: the angle of this Polar coordinate
      Side Effects: none
      Ex.
      Polar p = new Polar(1.0, Math.PI/2)
      p.getTheta() -> 1.5707963267948966
      */
      //your code goes here
      return this.theta;
   }
   public String toString(){
      /*Return a String representing this Polar coordinate
      Input:
         this: a Polar coordinate
      Output:
         return: a String representing this Polar coordinate
      Side Effects: none
      Ex.
      Polar p = new Polar(1.0, Math.PI/2)
      p.toString() -> (r = 1.0, θ = 1.5707963267948966)
      */
      //your code goes here
      return "(r = " + this.r + ", " + (char)952 + " = " + this.theta + ")";
   }
   public boolean equals(Polar that){
      /*Check if this equals that
      Input:
         this: a Polar coordinate
         that: another Polar coordinate
      Output:
         return: whether this equals that
      Side Effects: none
      Ex.
      Polar p1 = new Polar(1.0, Math.PI)
      Polar p2 = new Polar(1.0, Math.PI)
      Polar p3 = new Polar(1.0, 3*Math.PI)
      p1 == p2 -> false
      p1.equals(p2) -> true
      p2.equals(p1) -> true
      p1.equals(p3) -> false
      */
      //your code goes here
      if (this.r == that.r && this.theta == that.theta) return true;
      return false;
   }
   public Polar clone(){
      /*Make a cloned copy of this Polar coordinate
      Input:
         this: a Polar coordinate
      Output:
         return: a cloned copy of this
      Side Effects: none
      Ex.
      Polar p1 = new Polar(1.0, Math.PI)
      Polar p2 = p1.clone()
      p1 == p2 -> false
      p1.equals(p2) -> true
      */
      //your code goes here
      return new Polar(this.r, this.theta);
   }
   public Cartesian toCartesian(){
      /*Convert from polar coordinates to Cartesian coordinates
      Input:
         this: a Polar coordinate
      Output:
         return: the same point in Cartesian coordinates
      Side Effects: none
      Ex.
      Polar p = new Polar(1.0, Math.PI/4)
      Cartesian c = p.toCartesian()
      c.toString() -> (x = 0.7071067811865, y = 0.7071067811865)
      */
      //your code goes here
      return new Cartesian(this.r * Math.cos(this.theta), this.r * Math.sin(this.theta));
   }
   public void draw(double radius){
      /*Draw this Polar as a point on StdDraw
      Input:
         this: a Polar coordinate
         double radius: the radius of the circle to draw
      Output:
         StdDraw: draw a circle with radius at the coordinates 
                  of this
      Side Effects: none
      Ex.
      Polar p = new Polar(1.0, Math.PI/2)
      p.draw(0.01) -> draws a circle w/ radius = 0.01 at (0, 1)
      */
      //your code goes here
      //Cartesian Cartesian1 = this.toCartesian();
      //StdDraw.filledCircle(this.toCartesian().x, this.toCartesian().y, radius);
      StdDraw.filledCircle(this.r * Math.cos(this.theta), this.r * Math.sin(this.theta), radius);
   }








}
