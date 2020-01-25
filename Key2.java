import java.util.Scanner;
public class Key2{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     String name;
     int age;
     double make;
     System.out.println("Hello.What is your name?");
     name=sc.next();
     System.out.println("\n Hi,"+name+"! How old are you?");
    age=sc.nextInt();
       System.out.println("\nso, you're "+age+",en?");
      System.out.println("how much do you make,"+name);
     make=sc.nextDouble();
    System.out.println(make+"! I hope !");
  }
} 