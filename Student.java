public class Student{
   double GPA;
   int age;
   String favoriteSubject;
   String name;
   String favoriteColor;
   String languageTaken;
   String hometown;
   boolean atThacher;
   
   public Student(double g, int a, String s, String c, String n, String l, String h, boolean t){
      GPA = g;
      age = a;
      favoriteSubject = s;
      favoriteColor = c;
      name = n;
      languageTaken = l;
      hometown = h;
      atThacher = t;
   }
   public void changeGrade(double newGPA){
      GPA = newGPA;
   }
   public void setAge(int newAge){
      age = newAge;
   }
   public void changeFavoriteSubject(String newSub){
      favoriteSubject = newSub;
   }
   public void rename(String newName){
      name = newName;
   }
   public void changeFavoriteColor(String newColor){
      favoriteColor = newColor;
   }
   public void takeLanguage(String newLang){
      languageTaken = newLang;
   }
   public void changeHometown(String newCity){
      hometown = newCity;
   }
   public void moveToThacher(){
      atThacher = true;
   }
   public void leaveThacher(){
      atThacher = false;
   }
   
}