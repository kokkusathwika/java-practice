import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("First number:"+a);
        int b = sc.nextInt();
        System.out.println("Second numbver:"+b);
        System.out.println("op: ");
        char c = sc.next().charAt(0);
        System.out.println(c);
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        float div=(float) a/b;

         if (c == '=') {
            System.out.println("The sum is equals to " + sum);
        }
         else if (c == '-') {
            System.out.println("The difference is equals to " + sub);
        }
         else if (c == '*') {
            System.out.println("The multiplication is equals to " + mul);
        }
         else if (c == '/') {
            System.out.println("The quotient is equals to " + div);
        }
         else {
            System.out.println("Invalid input");
        }

    }
}