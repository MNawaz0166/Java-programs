import java.util.Scanner;;
public class fibonacciSeries {
    public static void fibonacciSequence(int fterm,int sterm,int range) {
        if(range==0)
        {
            return;
        }
        System.out.println(fterm);
        int prevSum=fterm+sterm;
        fterm=sterm;
        sterm=prevSum;
        fibonacciSequence(fterm, sterm, range-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstTerm=0;
        int secondTerm=1;
        int range;
        System.out.println("enter a range number for fibonacci series : ");
        range=sc.nextInt();
        // for(int i=1;i<=range;i++)
        // {
        //     System.out.println(firstTerm);
        //     int prevSum=firstTerm+secondTerm;
        //     firstTerm=secondTerm;
        //     secondTerm=prevSum;
        // }
        // System.out.println(firstTerm);
        // System.out.println(secondTerm);
        // fibonacciSequence(firstTerm, secondTerm, range-2);
        fibonacciSequence(firstTerm, secondTerm, range);

        
    }
}
