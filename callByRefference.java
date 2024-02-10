import java.util.Scanner;
public class callByRefference {
    // public static void swaping(int a,int b) {
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println(a);
    //      System.out.println(a);

    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter the value of a : ");
        a=sc.nextInt();
        System.out.println("enter the value of b : ");
        b=sc.nextInt();
        System.out.println("before swaping the value of a is "+a);  
        System.out.println("before swaping the value of b is "+b);
        //swapping  in java is not possible
        // swaping(a,b);
        // a=a+b;
        // b=a-b;
        // a=a-b;

        System.out.println("after swaping the value of a is "+a);
        System.out.println("after swaping the value of a is "+a);

        
    }
}
