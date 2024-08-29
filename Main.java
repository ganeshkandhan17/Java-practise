import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double b2=b*b;
        double temp=b2-4*a*c;
        double result=(-b + Math.sqrt(temp))/(2*a);
        double result1=(-b - Math.sqrt(temp))/(2*a);
        System.out.println(String.format("%.2f",result));
        System.out.print(String.format("%.2f",result1));
    }
}