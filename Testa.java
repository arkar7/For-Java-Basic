import java.util.Scanner;

public class Testa {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int userValue1= 0;
            int userValue2= 0;

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter integer value 1:");
            userValue1  = input.nextInt();
            Scanner input2 = new Scanner(System.in);
            System.out.print("Please enter integer value 2:");
            userValue2 = input.nextInt();
            System.out.println("addition operator value: "+(userValue1+userValue2));
            System.out.println("subtration operator value: "+(userValue1-userValue2));
            System.out.println("multiply operator value: "+(userValue1*userValue2));
            System.out.println("devide operator value: "+(userValue1/userValue2));
            System.out.println("percentage operator value: "+(userValue1%userValue2));

        }
    }

