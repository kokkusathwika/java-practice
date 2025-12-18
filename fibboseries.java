import java.util.Scanner;

public class fibboseries {

    public static int Series(int a){
        if (a==1){
            return 0;
        } else if (a==2){
            return 1;
        } else {
            return Series(a-1)+Series(a-2);
        }

    }
    public static void main(String[] args){
        System.out.println("Enter the number of sequences:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(Series(i)+" ");
        }
    }
}
