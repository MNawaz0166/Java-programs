import java.util.Scanner;
public class nthPower {
    public static int calcPower(int num,int pow){
         if(pow==0){
             return 1;
         }
        int power=num*calcPower(num, pow-1);
        return power;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,pow;
        System.out.println("enter a number : ");
        num=sc.nextInt();
        System.out.println("enter the power of the number : ");
        pow=sc.nextInt();
        int ans=calcPower(num,pow);
        System.out.println("the power the given number is : "+ans);

    }
}
