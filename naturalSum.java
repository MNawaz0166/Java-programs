import java.util.Scanner;
public class naturalSum {
    public static void printSum(int i,int num,int sum) {
        if(i==num){
           sum=sum+i;
           System.out.println("the sum of numbers is : "+sum);
           return;
        }
        sum=sum+i;
        printSum(i+1, num, sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,counter=1,sum=0;
        System.out.println("please enter a range number : ");
        num=sc.nextInt();
        printSum(counter, num, sum);
    }
}
