import java.util.Date;
import java.util.Scanner;

// An exploration of basic input and output.
class BasicIO {

  // Reads and processes string input.
  public static void main(String[] args) {

    Scanner stdin = new Scanner(System.in);

    // get first input
    System.out.print("Enter your name: ");
    String name = stdin.nextLine();

    // get second input
    System.out.print("Enter your age: ");
    int age = stdin.nextInt();

    // get third input
    System.out.print("Enter your height: ");
    int height = stdin.nextInt();

    // display output on console
    System.out.println("your name is " + name);
    System.out.println("your age is " + age);
    System.out.println("your age to day is " + age * 365);
    System.out.printf("%tY년 %<tm월 %<te일 현재 %s(%d)의 키는 %d cm 입니다", new Date(), name, age, height);

  } // method main

} // class BasicIO
