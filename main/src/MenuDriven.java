// this is an example of menu driven program in java
import java.util.*;
public class MenuDriven
{
    public static void main(String [] args){
        int a,b,result,ch;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("menu selection");
        System.out.println("Press 1. For Addition");
        System.out.println("Press 2. For Substraction");
        System.out.println("Press 3. For Multiplication");
        System.out.println("Press 4. For Division");
        System.out.print("Please enter your choice: ");
        ch =sc.nextInt();
        
        if(ch==1){
            System.out.print("Please enter your 1st value: ");
            a =sc.nextInt();
            System.out.print("Please enter your 2nd value: ");
            b =sc.nextInt();
            result = a+b;
            System.out.println("The sum is: "+result);
        }
        else if(ch==2){
            System.out.print("Please enter your 1st value: ");
            a =sc.nextInt();
            System.out.print("Please enter your 2nd value: ");
            b =sc.nextInt();
            result = a-b;
            System.out.println("The substraction is: "+result);
        }
        else if(ch==3){
            System.out.print("Please enter your 1st value: ");
            a =sc.nextInt();
            System.out.print("Please enter your 2nd value: ");
            b =sc.nextInt();
            result = a*b;
            System.out.println("The multiplication is: "+result);
        }
        else if(ch==4){
            System.out.print("Please enter your 1st value: ");
            a =sc.nextInt();
            System.out.print("Please enter your 2nd value: ");
            b =sc.nextInt();
            result = a/b;
            System.out.println("The division is: "+result);
        }
        else{
            System.out.println("Wrong input");
        }
        sc.close();
    }
}
