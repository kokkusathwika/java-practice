
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int eng=sc. nextInt();
    int sci=sc. nextInt();
    int mat=sc. nextInt();
    int soc=sc. nextInt();
    int java=sc. nextInt();
    int sum=eng+sci+mat+soc+java;
    if (sum>=450){
        System.out.println("your Grade is A");
    }
    else if (sum <450 && sum>400){
        System.out.println("your Grade is B");
    }
    else if (sum <400 && sum>350){
        System.out.println("your Grade is C");
    }
    else if (sum <350 && sum>300){
        System.out.println("your Grade is D");
    }
    else if (sum <300 && sum>250){
        System.out.println("your Grade is E");
    }

}
}
