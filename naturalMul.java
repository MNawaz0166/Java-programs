import java.util.Scanner;
public class naturalMul {
    public static void naturalFictorial(int i,int num,int fic) {
        if(i==num){
            fic=fic*i;
            System.out.println("the fictorial of the given number is : "+fic);
            return;
        }

        fic=fic*i;
        naturalFictorial(i+1, num, fic);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,counter=1,fic=1;
        System.out.println("enter a range number to find fictorial : ");
        num=sc.nextInt();
        naturalFictorial(counter, num, fic);
    }
}
