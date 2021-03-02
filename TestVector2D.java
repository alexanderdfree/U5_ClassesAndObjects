public class TestVector2D{
   public static void testConstructor(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing Constructor:             ");
   
      Vector2D c = new Vector2D(1.0, 2.0);
      Testing.testEquals("Test 1.1", c.x, 1.0);
      Testing.testEquals("Test 1.2", c.y, 2.0);
      
      StdOut.println("---------------------------------");
   }

   public static void testToString(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing toString():              ");
      
      Vector2D c;
   
      c = new Vector2D(1.0, 2.0);
      Testing.testEquals("Test 2.1", c.toString(), "(1.0, 2.0)");
      
      c = new Vector2D(-1.0, 2.0);
      Testing.testEquals("Test 2.2", c.toString(), "(-1.0, 2.0)");
      
      c = new Vector2D(1.0, -2.0);
      Testing.testEquals("Test 2.3", c.toString(), "(1.0, -2.0)");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testEquals(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing equals():                ");
      
      Vector2D c1;
      Vector2D c2;
      Vector2D c3;
      
      c1 = new Vector2D(1.0, 2.0);
      c2 = new Vector2D(1.0, 2.0);
      c3 = new Vector2D(2.0, 1.0);
      
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
      
      Vector2D c1;
      Vector2D c2;
      
      c1 = new Vector2D(2.0, -3.0);
      c2 = c1.clone();
      Testing.testEquals("Test 4.1", c1.toString(), "(2.0, 3.0)");
      Testing.testEquals("Test 4.2", c2.toString(), "(2.0, -3.0)");
      Testing.testEquals("Test 4.3", c1 == c2, false);
      Testing.testEquals("Test 4.4", c1.x == c2.x, true);
      Testing.testEquals("Test 4.5", c1.y == c2.y, true);
      Testing.testEquals("Test 4.6", c1.equals(c2), true);
      
      StdOut.println("---------------------------------");
   }
   
   public static void testAdd(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing add():                   ");
      
      Vector2D c1;
      Vector2D c2;
      Vector2D c3;
      Vector2D c4;
      
      c1 = new Vector2D(1.0, 2.0);
      c2 = new Vector2D(2.0, -1.0);
      c3 = c1.add(c2);
      c4 = c2.add(c1);
      
      Testing.testEquals("Test 5.1", c1.toString(), "(1.0 + 2.0)");
      Testing.testEquals("Test 5.2", c2.toString(), "(2.0 - 1.0)");
      Testing.testEquals("Test 5.3", c3.toString(), "(3.0 + 1.0)");
      Testing.testEquals("Test 5.4", c4.toString(), "(3.0 + 1.0)");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testScalarTimes(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing times(scalar):           ");
      
      Vector2D c1;
      Vector2D c2;
      
      c1 = new Vector2D(1.0, -2.0);
      c2 = c1.multiply(4.0);
      Testing.testEquals("Test 6.1", c2.toString(), "(4.0 - 8.0)");
      Testing.testEquals("Test 6.2", c1.toString(), "(1.0 - 2.0)");
      
      c1 = new Vector2D(1.0, -2.0);
      c2 = c1.multiply(-2.5);
      Testing.testEquals("Test 6.3", c2.toString(), "(2.5 + 5.0)");
      Testing.testEquals("Test 6.4", c1.toString(), "(1.0 - 2.0)");
      
      StdOut.println("---------------------------------");
   }
  /* 
   public static void testComplexTimes(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing times(Complex):          ");
      
      Vector2D c1;
      Vector2D c2;
      Vector2D c3;
      
      c1 = new Complex(1.0, 2.0);
      c2 = new Complex(2.0, -1.0);
      c3 = c1.times(c2);
      
      Testing.testEquals("Test 7.1", c3.toString(), "4.0 + 3.0i");
      Testing.testEquals("Test 7.2", c1.toString(), "1.0 + 2.0i");
      Testing.testEquals("Test 7.3", c2.toString(), "2.0 - 1.0i");
      
      StdOut.println("---------------------------------");
   }*/
   
   public static void testAbs(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing abs():                   ");
      
      Vector2D c1;
      
      c1 = new Vector2D(3.0, 4.0);
      Testing.testEquals("Test 8.1", c1.abs(), 5.0);
      
      c1 = new Vector2D(-5.0, 12.0);
      Testing.testEquals("Test 8.2", c1.abs(), 13.0);
      
      c1 = new Vector2D(7.0, 24.0);
      Testing.testEquals("Test 8.3", c1.abs(), 25.0);
      
      c1 = new Vector2D(-20.0, -21.0);
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
      //testComplexTimes();
      testAbs();
   }
}