
package forloop;

import java.util.Scanner;

public class ForLoop {


    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);

        System.out.println("enter number");
        int input = s.nextInt();
        int count = 0;
        
        
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(input + " prime");
        } else {
            System.out.println("not prime");
        }

    }

}
