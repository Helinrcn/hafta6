package odevvv1;
import java.util.Scanner;


public class odev5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");
 
        int num = reader.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
		
	
		
		
		
		

	}

}
