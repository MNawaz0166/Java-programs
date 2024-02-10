import java.util.Scanner;
public class printnumber {
    public static void pNumber(int n,int s) {
        if(s==n+1){
            return;
        }
        System.out.println(s);
        pNumber(n,s+1);
    }
    public static int returnfictorial(int n) {
        if(n==1||n==0)
        {
            return 1;
        }
        int fic=n*returnfictorial(n-1);
        return fic;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number : ");
        n=sc.nextInt();
        int start=1;
        pNumber(n,start);
        int fictorial=returnfictorial(n);
        System.out.println("the fictorial of the number is : "+fictorial);
    }
}
