import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt(); 
    input.close();

    
    // 1. Make an if - else statement that checks if the age (int age) is 18 or above. If it is then print out "You are beautiful!". If not then print "You are so cute!". 
    if(age >= 18)
    {
      System.out.println("You are beautiful!");
    }
    else
    {
      System.out.println("You are so cute!");
    }


  }
  
}