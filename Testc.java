//package sampleprogram;
//import java.util.Scanner;
//    public class Testc {
//        public static void main(String args[]){
//            Scanner BinaryInput = new Scanner( System.in );
//            System.out.print("Enter the Binary Number - ");
//            String BinaryNumber =BinaryInput.nextLine();
//            System.out.println("Decimal Number- "+Integer.parseInt(BinaryNumber,2));
//        }
//    }

//package sampleprogram;
import java.util.Scanner;
class Testc
{
    public static void main(String args[])
    {
        Scanner binaryinput=new Scanner(System.in);
        System.out.println("Enter the binary number-");
        int n=binaryinput.nextInt();
        int decimalnumber=0,power=0;
        while(n!=0)
        {
            decimalnumber+=((n%10)*Math.pow(2,power));
            n=n/10;
            power++;
        }
        System.out.println(decimalnumber);
    }
}