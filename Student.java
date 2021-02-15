public class Student{
   double GPA;
   int age;
   int heightInch;
   int grade;
   String sport;
   boolean tired;

   
   public Student(double g, int a, int h, int r, String s, boolean t){
      GPA = g;
      age = a;
      heightInch = h;
      grade = r;
      sport = s;
      tired = t;
   }
   public void changeSportSeason(String newSport){
      sport = newSport;
   }
   public void ageYears(int years){
      age += years;
   }
   public void growAmount(int inches){
      heightInch += inches;
   }
   public void drinkCoffee(){
      tired = false;
      heightInch--;
   }
   public void sick(){
      GPA -= 0.5;
      tired = true;
   }
   public void sleep(){
      tired = false;
   }
   
}