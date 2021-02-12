public class Student{
   double GPA;
   int age;
   String favoriteSubject;
   String name;
   String favoriteColor;
   String language;
   String hometown;
   boolean atThacher;
   
   public Student(double g, int a, String s, String c, String n, String l, String h){
      GPA = g;
      age = a;
      favoriteSubject = s;
      favoriteColor = c;
      name = n;
      language = l;
      hometown = h;
   }
   
   public void setAge(int newAge){
      age = newAge;
   }
   public void changeGrade(double newGPA){
      GPA = newGPA;
   }
   public void rename(String newName){
      name = newName;
   }
   
   public void moveToThacher(){
      atThacher = true;
   }
   public void leaveThacher(){
      atThacher = false;
   }
   
   public void wash(){
      clean = true;
   }
}