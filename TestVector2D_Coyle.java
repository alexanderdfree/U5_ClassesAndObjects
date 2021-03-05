public class TestVector2D_Coyle{
   public static void testGetX(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing getX():             ");
      
      Vector2D vec1 = new Vector2D(0.0, 1.0);
      Testing.testEquals("Test 1.1", vec1.getX(), 0.0);
      
      Vector2D vec2 = new Vector2D(-1.0, 2.0);
      Testing.testEquals("Test 1.2", vec2.getX(), -1.0);
      
      //make sure they haven't modified each other or something
      Testing.testEquals("Test 1.3", vec1.getX(), 0.0);
      Testing.testEquals("Test 1.4", vec2.getX(), -1.0);
      
      StdOut.println("---------------------------------");
   }
   
   public static void testGetY(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing getY():             ");
   
      Vector2D vec1 = new Vector2D(0.0, 1.0);
      Testing.testEquals("Test 2.1", vec1.getY(), 1.0);
      
      Vector2D vec2 = new Vector2D(-1.0, 2.0);
      Testing.testEquals("Test 2.2", vec2.getY(), 2.0);
      
      //make sure they haven't modified each other or something
      Testing.testEquals("Test 2.3", vec1.getY(), 1.0);
      Testing.testEquals("Test 2.4", vec2.getY(), 2.0);
      
      StdOut.println("---------------------------------");
   }
   
   public static void testSetX(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing setX():             ");
   
      Vector2D vec1 = new Vector2D(0.0, 1.0);
      Vector2D vec2 = new Vector2D(-1.0, 2.0);
      Testing.testEquals("Test 3.1", vec1.getX(), 0.0);
      Testing.testEquals("Test 3.2", vec2.getX(), -1.0);
      
      //modify one
      vec1.setX(2.0);
      Testing.testEquals("Test 3.3", vec1.getX(), 2.0);
      Testing.testEquals("Test 3.4", vec2.getX(), -1.0);
      
      //modify the other
      vec2.setX(3.0);
      Testing.testEquals("Test 3.5", vec1.getX(), 2.0);
      Testing.testEquals("Test 3.6", vec2.getX(), 3.0);
      
      StdOut.println("---------------------------------");
   }
   
   public static void testSetY(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing setY():             ");
   
      Vector2D vec1 = new Vector2D(0.0, 1.0);
      Vector2D vec2 = new Vector2D(-1.0, 2.0);
      Testing.testEquals("Test 4.1", vec1.getY(), 1.0);
      Testing.testEquals("Test 4.2", vec2.getY(), 2.0);
      
      //modify one
      vec1.setY(-2.0);
      Testing.testEquals("Test 4.3", vec1.getY(), -2.0);
      Testing.testEquals("Test 4.4", vec2.getY(), 2.0);
      
      //modify the other
      vec2.setY(3.0);
      Testing.testEquals("Test 4.5", vec1.getY(), -2.0);
      Testing.testEquals("Test 4.6", vec2.getY(), 3.0);
      
      StdOut.println("---------------------------------");
   }
   
   public static void testToString(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing toString():             ");
   
      Vector2D vec = new Vector2D(0.0, 1.0);
      Testing.testEquals("Test 5.1", vec.toString(), "(0.0, 1.0)");
      Testing.testEquals("Test 5.2", vec.getX(), 0.0);
      Testing.testEquals("Test 5.3", vec.getY(), 1.0);
      
      vec = new Vector2D(-1.0, 2.0);
      Testing.testEquals("Test 5.4", vec.toString(), "(-1.0, 2.0)");
      Testing.testEquals("Test 5.5", vec.getX(), -1.0);
      Testing.testEquals("Test 5.6", vec.getY(), 2.0);
      
      StdOut.println("---------------------------------");
  }
  
  public static void testEquals(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing equals():             ");
      
      Vector2D vec1 = new Vector2D(1.0, 2.0);
      Vector2D vec2 = new Vector2D(1.0, 2.0);
      
      Testing.testEquals("Test 6.1", vec1 ==  vec2, false);
      Testing.testEquals("Test 6.2", vec1.equals(vec2), true);
      Testing.testEquals("Test 6.3", vec2.equals(vec1), true);
      Testing.testEquals("Test 6.4", vec1.toString(), "(1.0, 2.0)");
      Testing.testEquals("Test 6.5", vec2.toString(), "(1.0, 2.0)");
      
      vec2.setX(2.0);
      vec2.setY(1.0);
      Testing.testEquals("Test 6.6", vec1 ==  vec2, false);
      Testing.testEquals("Test 6.7", vec1.equals(vec2), false);
      Testing.testEquals("Test 6.8", vec2.equals(vec1), false);
      Testing.testEquals("Test 6.9", vec1.toString(), "(1.0, 2.0)");
      Testing.testEquals("Test 6.10", vec2.toString(), "(2.0, 1.0)");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testClone(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing clone():             ");
      
      Vector2D vec1;
      Vector2D vec2;
      
      vec1 = new Vector2D(1.0, 2.0);
      vec2 = vec1.clone();
      Testing.testEquals("Test 7.1", vec1.equals(vec2), true);
      Testing.testEquals("Test 7.2", vec2.equals(vec1), true);
      Testing.testEquals("Test 7.3", vec1.toString(), "(1.0, 2.0)");
      Testing.testEquals("Test 7.4", vec2.toString(), "(1.0, 2.0)");
      Testing.testEquals("Test 7.5", vec1 == vec2, false);
      
      StdOut.println("---------------------------------");
   }
   
   public static void testAbs(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing abs():             ");
      
      Vector2D vec;
      
      vec = new Vector2D(3.0, 4.0);
      Testing.testEquals("Test 8.1", vec.abs(), 5.0);
      Testing.testEquals("Test 8.2", vec.toString(), "(3.0, 4.0)");
      
      vec = new Vector2D(-3.0, 4.0);
      Testing.testEquals("Test 8.3", vec.abs(), 5.0);
      Testing.testEquals("Test 8.4", vec.toString(), "(-3.0, 4.0)");
      
      vec = new Vector2D(3.0, -4.0);
      Testing.testEquals("Test 8.5", vec.abs(), 5.0);
      Testing.testEquals("Test 8.6", vec.toString(), "(3.0, -4.0)");
      
      vec = new Vector2D(-3.0, -4.0);
      Testing.testEquals("Test 8.7", vec.abs(), 5.0);
      Testing.testEquals("Test 8.8", vec.toString(), "(-3.0, -4.0)");
      
      vec = new Vector2D(3.0, 0.0);
      Testing.testEquals("Test 8.9", vec.abs(), 3.0);
      Testing.testEquals("Test 8.10", vec.toString(), "(3.0, 0.0)");
      
      vec = new Vector2D(0.0, 4.0);
      Testing.testEquals("Test 8.11", vec.abs(), 4.0);
      Testing.testEquals("Test 8.12", vec.toString(), "(0.0, 4.0)");
      
      vec = new Vector2D(0.0, 0.0);
      Testing.testEquals("Test 8.13", vec.abs(), 0.0);
      Testing.testEquals("Test 8.14", vec.toString(), "(0.0, 0.0)");
      
      
      StdOut.println("---------------------------------");
   }
   
   public static void testAdd(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing add():             ");
      
      Vector2D vec1;
      Vector2D vec2;
      
      vec1 = new Vector2D(1.0, -1.0);
      vec2 = new Vector2D(-2.0, 2.0);
      Testing.testEquals("Test 9.1", vec1.add(vec2).toString(), "(-1.0, 1.0)");
      Testing.testEquals("Test 9.2", vec1.toString(), "(1.0, -1.0)");
      Testing.testEquals("Test 9.3", vec2.toString(), "(-2.0, 2.0)");
      Testing.testEquals("Test 9.4", vec2.add(vec1).toString(), "(-1.0, 1.0)");
      Testing.testEquals("Test 9.5", vec1.toString(), "(1.0, -1.0)");
      Testing.testEquals("Test 9.6", vec2.toString(), "(-2.0, 2.0)");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testSubtract(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing subtract():             ");
      
      Vector2D vec1;
      Vector2D vec2;
      
      vec1 = new Vector2D(1.0, -1.0);
      vec2 = new Vector2D(-2.0, 2.0);
      Testing.testEquals("Test 10.1", vec1.subtract(vec2).toString(), "(3.0, -3.0)");
      Testing.testEquals("Test 10.2", vec1.toString(), "(1.0, -1.0)");
      Testing.testEquals("Test 10.3", vec2.toString(), "(-2.0, 2.0)");
      Testing.testEquals("Test 10.4", vec2.subtract(vec1).toString(), "(-3.0, 3.0)");
      Testing.testEquals("Test 10.5", vec1.toString(), "(1.0, -1.0)");
      Testing.testEquals("Test 10.6", vec2.toString(), "(-2.0, 2.0)");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testMultiply(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing multiply():             ");
      
      Vector2D vec = new Vector2D(-1.0, 2.0);
      
      Testing.testEquals("Test 11.1", vec.multiply(2.0).toString(), "(-2.0, 4.0)");
      Testing.testEquals("Test 11.2", vec.toString(), "(-1.0, 2.0)");
      
      Testing.testEquals("Test 11.3", vec.multiply(-3.0).toString(), "(3.0, -6.0)");
      Testing.testEquals("Test 11.4", vec.toString(), "(-1.0, 2.0)");
      
      StdOut.println("---------------------------------");
   }
   
   public static void testDivide(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing divide():             ");
      
      Vector2D vec = new Vector2D(-1.0, 2.0);
      
      Testing.testEquals("Test 12.1", vec.divide(2.0).toString(), "(-0.5, 1.0)");
      Testing.testEquals("Test 12.2", vec.toString(), "(-1.0, 2.0)");
      
      Testing.testEquals("Test 12.3", vec.divide(-0.5).toString(), "(2.0, -4.0)");
      Testing.testEquals("Test 12.4", vec.toString(), "(-1.0, 2.0)");
      
      StdOut.println("---------------------------------");  
   }
   
   public static void testUnit(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing unit():             ");
      
      Vector2D vec;
      
      vec = new Vector2D(3.0, 4.0);
      Testing.testEquals("Test 13.1", vec.unit().toString(), "(0.6, 0.8)");
      Testing.testEquals("Test 13.2", vec.toString(), "(3.0, 4.0)");
      
      vec = new Vector2D(-6.0, 8.0);
      Testing.testEquals("Test 13.3", vec.unit().toString(), "(-0.6, 0.8)");
      Testing.testEquals("Test 13.4", vec.toString(), "(-6.0, 8.0)");
      
      vec = new Vector2D(9.0, -12.0);
      Testing.testEquals("Test 13.5", vec.unit().toString(), "(0.6, -0.8)");
      Testing.testEquals("Test 13.6", vec.toString(), "(9.0, -12.0)");
      
      vec = new Vector2D(-12.0, -16.0);
      Testing.testEquals("Test 13.7", vec.unit().toString(), "(-0.6, -0.8)");
      Testing.testEquals("Test 13.8", vec.toString(), "(-12.0, -16.0)");
      
      StdOut.println("---------------------------------");
      
   }
   
   public static void testDot(){
      StdOut.println("---------------------------------");
      StdOut.println("Testing dot():             ");
      
      Vector2D vec1;
      Vector2D vec2;
      
      vec1 = new Vector2D(1.0, 2.0);
      vec2 = new Vector2D(-3.0, 4.0);
      Testing.testEquals("Test 14.1", vec1.dot(vec2), 5.0);
      Testing.testEquals("Test 14.2", vec1.toString(), "(1.0, 2.0)");
      Testing.testEquals("Test 14.3", vec2.toString(), "(-3.0, 4.0)");
      Testing.testEquals("Test 14.4", vec2.dot(vec1), 5.0);
      
      StdOut.println("---------------------------------");
      
   }
      
   
   public static void main(String[] args){
      testGetX();
      testGetY();
      testSetX();
      testSetY();
      testToString();
      testEquals();
      testClone();
      testAbs();
      testAdd();
      testSubtract();
      testMultiply();
      testDivide();
      testUnit();
      testDot();
   }
}