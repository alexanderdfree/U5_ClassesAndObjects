public class Complex{
   double re; //the real part
   double im; //the imaginary part
  
   public Complex(double re, double im){
      this.re = re;
      this.im = im;
  }
public String toString(){
      /*Return a String representation of this Complex
      Input:
         this: a Complex number
      Output:
         return: a String representing this Complex
      Side Effects: none
      Ex.
      Complex c1 = new Complex(1.0, 2.0)
      c1.toString() -> "1.0 + 2.0i"
      Complex c2 = new Complex(1.0, -2.0)
      c2.toString() -> "1.0 - 2.0i"
      */
      //your code goes here
      //double real = this.re;
      String marker;
      double newIm = Math.abs(this.im);
      if (this.im < 0){
         marker = "-";
      }
      else{
         marker = "+";
      }
      return this.re + " " + marker + " " + newIm + "i";
   }
public boolean equals(Complex that){
      /*Check if this equals that
      Input:
         this: a Complex number
         that: another Complex number
      Output:
         return: true if this is equivalent to that, i.e. if
                 both their real and imaginary parts are equal
      Side Effects: none
      Ex.
      Complex c1 = new Complex(1.0, 2.0);
      Complex c2 = new Complex(1.0, 2.0);
      Complex c3 = new Complex(2.0, 1.0);
      c1 == c2 -> false
      c1.equals(c2) -> true
      c2.equals(c1) -> true
      c1.equals(c3) -> false
      c3.equals(c1) -> false
      */
      //your code goes here
   if (this.re == that.re && this.im == that.im) return true;
   else return false;
   }
   public Complex clone(){
      /*Returns a cloned copy of this Complex
      Input:
         this: a Complex number
      Output:
         return: a new Complex that is a copy of this
      Side Effects: none
      Ex.
      Complex c1 = new Complex(1.0, 2.0)
      Complex c2 = c1.clone()
      c2.toString() -> "1.0 + 2.0i"
      c2.re = -3.0
      c1.toString() -> "1.0 + 2.0i"
      c2.toString() -> "-3.0 + 2.0i"
      */
      //your code goes here
   double real = this.re;
   double image = this.im;
   return new Complex(real, image);
   }

}
