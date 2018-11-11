import java.util.Scanner;

public class IO {
    Scanner wait = new Scanner(System.in);
    static void print(String toPrint){
        System.out.print(toPrint);
    }
    static void print(Integer toPrint){
        System.out.print(toPrint);
    }
    static void print(float toPrint){
        System.out.print(toPrint);
    }
    static void print(double toPrint){
        System.out.print(toPrint);
    }
    static void print(char toPrint){
        System.out.print(toPrint);
    }
    static int scan(int toWrite){
        Scanner wait = new Scanner(System.in);
        toWrite= wait.nextInt();
        return toWrite;
    }
    static float scan(float toWrite){
        Scanner wait = new Scanner(System.in);
        toWrite= wait.nextFloat();
        return toWrite;
    }
    static double scan(double toWrite){
        Scanner wait = new Scanner(System.in);
        toWrite= wait.nextDouble();
        return toWrite;
    }
    static String scan(String toWrite){
        Scanner wait = new Scanner(System.in);
        toWrite= wait.nextLine();
        return toWrite;
    }
}
