public class Cartesian{
   private double x; //the x coordinate
   private double y; //the y coordinate
  
   public Cartesian(double x, double y){
      /*Constructor. Initialize new Cartesian objects
      Input:
         double x: the x coordinate
         double y: the y coordinate
      Output:
         this: a new Cartesian object
      Ex.
      Cartesian c = new Cartesian(1.0, 2.0)
      */
      this.x = x;
      this.y = y;
   }

   public double getY(){
      /*Accessor. Return the y coordinate of this Cartesian
      Input:
         this: a Cartesian object
      Output:
         return: the y coordinate of this Cartesian object
      Side Effects: none
      Ex.
      Cartesian c = new Cartesian(1.0, 2.0)
      c.getY() -> 2.0
      */
      //your code goes here
      return this.y;
   }
   public String toString(){
      /*Return a String representation of this Cartesian
      Input:
         this: a Cartesian object
      Output:
         return: a String representing this Cartesian object
      Side Effects: none
      Ex.
      Cartesian c = new Cartesian(1.0, 2.0)
      c.toString() -> (x = 1.0, y = 2.0)
      */
      //your code goes here
      return "(x = " + this.x + " y = " + this.y + ")";
   }
   public boolean equals(Cartesian that){
      /*Check whether this is equal to that
      Input:
         this: a Cartesian object
         that: another Cartesian object
      Output:
         return: whether this and that are equal
      Side Effects: none
      Ex.
      Cartesian c1 = new Cartesian(1.0, 2.0)
      Cartesian c2 = new Cartesian(1.0, 2.0)
      Cartesian c3 = new Cartesian(2.0, 1.0)
      c1 == c2 -> false
      c1.equals(c2) -> true
      c2.equals(c1) -> true
      c1.equals(c3) -> false
      */
      //your code goes here
      if (this.x == that.x && this.y == that.y) return true;
      return false;
   }
   public Cartesian clone(){
      /*Create a cloned copy of this Cartesian object
      Input:
         this: a Cartesian object
      Output:
         return: a cloned copy of this
      Ex.
      Cartesian c1 = new Cartesian(1.0, 2.0)
      Cartesian c2 = c1.clone()
      c1 == c2 -> false
      c1.equals(c2) -> true
      c2.equals(c1) -> true
      */
      //your code goes here
      return new Cartesian(this.x, this.y);
   }
   public Polar toPolar(){
      /*Convert from Cartesian coordinates to polar coordinates
      Input:
         this: a Cartesian coordinate
      Output:
         return: the equivalent point in polar coordinates
      Side Effects: none
      Ex.
      Cartesian c = new Cartesian(-1.0, 0.0)
      Polar p = c.toPolar()
      p.toString() -> (r = 1.0, θ = 3.141592653589)
      */
      //your code goes here
      return new Polar(Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)), Math.atan2(this.y, this.x));
      
   }




}