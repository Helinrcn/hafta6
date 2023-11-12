package odevvv1;
import java.util.Scanner;

public class odev4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sayac=0;
		System.out.print("bir sayı girin");
		int sayı=scan.nextInt();
		while(sayı>0) {
			sayı=sayı/10;
			sayac++;
			
			}
		System.out.print("girilen sayı " + sayac + " basamaklıdır");
		
		
		

	}

}
