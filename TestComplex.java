public class TestComplex{
   public static void testConstructor(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing Constructor:             ");
   
      Complex c = new Complex(1.0, 2.0);
      Testing.testEquals("Test 1.1", c.re, 1.0);
      Testing.testEquals("Test 1.2", c.im, 2.0);
      
      StdOut.println("---------------------------------");
   }

   public static void testToString(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing toString():              ");
      
      Complex c;
   
      c = new Complex(1.0, 2.0);
      Testing.testEquals("Test 2.1", c.toString(), "1.0 + 2.0i");
      
      c = new Complex(-1.0, 2.0);
      Testing.testEquals("Test 2.2", c.toString(), "-1.0 + 2.0i");
      
      c = new Complex(1.0, -2.0);
      Testing.testEquals("Test 2.3", c.toString(), "1.0 - 2.0i");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testEquals(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing equals():                ");
      
      Complex c1;
      Complex c2;
      Complex c3;
      
      c1 = new Complex(1.0, 2.0);
      c2 = new Complex(1.0, 2.0);
      c3 = new Complex(2.0, 1.0);
      
      Testing.testEquals("Test 3.1", c1 == c2, false);
      Testing.testEquals("Test 3.2", c1.equals(c2), true);
      Testing.testEquals("Test 3.3", c2.equals(c1), true);
      Testing.testEquals("Test 3.4", c1.equals(c3), false);
      Testing.testEquals("Test 3.5", c3.equals(c1), false);
      
      StdOut.println("---------------------------------");
   }
   
   public static void testClone(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing clone():                 ");
      
      Complex c1;
      Complex c2;
      
      c1 = new Complex(2.0, -3.0);
      c2 = c1.clone();
      Testing.testEquals("Test 4.1", c1.toString(), "2.0 - 3.0i");
      Testing.testEquals("Test 4.2", c2.toString(), "2.0 - 3.0i");
      Testing.testEquals("Test 4.3", c1 == c2, false);
      Testing.testEquals("Test 4.4", c1.re == c2.re, true);
      Testing.testEquals("Test 4.5", c1.im == c2.im, true);
      Testing.testEquals("Test 4.6", c1.equals(c2), true);
      
      StdOut.println("---------------------------------");
   }
   
   public static void testAdd(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing add():                   ");
      
      Complex c1;
      Complex c2;
      Complex c3;
      Complex c4;
      
      c1 = new Complex(1.0, 2.0);
      c2 = new Complex(2.0, -1.0);
      c3 = c1.add(c2);
      c4 = c2.add(c1);
      
      Testing.testEquals("Test 5.1", c1.toString(), "1.0 + 2.0i");
      Testing.testEquals("Test 5.2", c2.toString(), "2.0 - 1.0i");
      Testing.testEquals("Test 5.3", c3.toString(), "3.0 + 1.0i");
      Testing.testEquals("Test 5.4", c4.toString(), "3.0 + 1.0i");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testScalarTimes(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing times(scalar):           ");
      
      Complex c1;
      Complex c2;
      
      c1 = new Complex(1.0, -2.0);
      c2 = c1.times(4.0);
      Testing.testEquals("Test 6.1", c2.toString(), "4.0 - 8.0i");
      Testing.testEquals("Test 6.2", c1.toString(), "1.0 - 2.0i");
      
      c1 = new Complex(1.0, -2.0);
      c2 = c1.times(-2.5);
      Testing.testEquals("Test 6.3", c2.toString(), "-2.5 + 5.0i");
      Testing.testEquals("Test 6.4", c1.toString(), "1.0 - 2.0i");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testComplexTimes(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing times(Complex):          ");
      
      Complex c1;
      Complex c2;
      Complex c3;
      
      c1 = new Complex(1.0, 2.0);
      c2 = new Complex(2.0, -1.0);
      c3 = c1.times(c2);
      
      Testing.testEquals("Test 7.1", c3.toString(), "4.0 + 3.0i");
      Testing.testEquals("Test 7.2", c1.toString(), "1.0 + 2.0i");
      Testing.testEquals("Test 7.3", c2.toString(), "2.0 - 1.0i");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testAbs(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing abs():                   ");
      
      Complex c1;
      
      c1 = new Complex(3.0, 4.0);
      Testing.testEquals("Test 8.1", c1.abs(), 5.0);
      
      c1 = new Complex(-5.0, 12.0);
      Testing.testEquals("Test 8.2", c1.abs(), 13.0);
      
      c1 = new Complex(7.0, 24.0);
      Testing.testEquals("Test 8.3", c1.abs(), 25.0);
      
      c1 = new Complex(-20.0, -21.0);
      Testing.testEquals("Test 8.4", c1.abs(), 29.0);
      
      StdOut.println("---------------------------------");
   }
   

   public static void main(String[] args){
      testConstructor();
      testToString();
      testEquals();
      testClone();
      testAdd();
      testScalarTimes();
      testComplexTimes();
      testAbs();
   }
}