public class Vector2D{   
   double x; //the x component
   double y; //the y component
  
   public Vector2D(double x, double y){
      this.x = y;
      this.y = y;
  }
public String toString(){
      /*Return a String representation of this vector
      Input:
         this: a vector
      Output:
         return: a String representing this vector
      Side Effects: none */
      return "(" + this.x + ", " + this.y + ")";
   }
public boolean equals(Vector2D that){
      /*Check if this equals that
      Input:
         this: a Vector2D
         that: another Vector 2D
      Output:
         return: true if this is equivalent to that, i.e. if
                 both x and y components are equal
      Side Effects: none */
   if (this.x == that.x && this.y == that.y) return true;
   else return false;
   }
   public Vector2D clone(){
      /*Returns a cloned copy of this Vector2D
      Input:
         this: a Vector
      Output:
         return: a new Vector2D that is a copy of this
      Side Effects: none */
   double x = this.x;
   double y = this.y;
   return new Vector2D(x, y);
   }
   }