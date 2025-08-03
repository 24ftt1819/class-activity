import java.util.Scanner;

public class Week3_2 {

    public static void main(String[] args) {
        int a; int b; int c; //ani declaration refer tpoic 5 
        a = 10;
        b = 7;
        c = a+b;
        System.out.println("c is "+ c);
        System.out.println("c is " + (c-5));
        c=c+2;
        System.out.println("c is " + c);

        double price=123.4567; //ani initialized 
        float index = 12.33f;

        char alpha='a';
        boolean isLoggedIn = true;

        final double GAJI=10000;
        // GAJI=5000;
        System.out.println(GAJI);

        short shortNumber=1;
        int intNumber= shortNumber;
        System.out.println(shortNumber);
        System.out.println(intNumber);

        double doubleNumber=123.4567;
        int intNumber1=(int)doubleNumber;
        System.out.println(intNumber1);

        // Scanner input = new Scanner(System.in);
        // System.out.print("enter your name: ");
        // String name= input.nextLine();
        // // String name = input.next();
        // System.out.println("Hi "+ name);
        // System.out.print("Enter the year of birth: ");
        // int yob = input.nextInt();
        // System.out.println(name + " was born in " + yob);
        // int age = 2025 - yob;
        // System.out.println(name + " will be " + age + " years old this year");

        double duitu=12345.789322;
        System.out.printf("%.2f%n",duitu); //12345.79
        System.out.printf("%.3f%n",duitu); //12345.789
        System.out.printf("%.0f%n",duitu); //12346

        //System.out.printf("%3$s %2$s %1$s", "kau","sudah","makan");
        System.out.printf("%3$s %2$S %1$s", "kau","sudah","makan");


    }
}