import java.util.*;
import java.util.Scanner.*;
public class choiceNum{
    public static void main(String[]args)
    {
        int temp=0;
        final int MAXIMUM=10;
        temp=MAXIMUM;
        Scanner sc=new Scanner(System.in);
        do{
                System.out.println("enter the number between 1 t0 100");
                   int n=sc.nextInt();
                 if(n>temp)
                 {
                      System.out.println("too high try again");
                 }
                else if(n<temp)
               {
                   System.out.println("too low try again");
              }
            else{
                System.out.println("Yes you guess the correct number");
            }
        }while(temp>0);

    }
}
