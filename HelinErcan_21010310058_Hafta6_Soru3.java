package odevvv1;

import java.util.Scanner;

public class odev3 {
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan=new Scanner(System.in);
			System.out.print("sayı gir");
			int sayı=scan.nextInt();
			int sonuc=1;
			int i=1;
			while(i<=sayı) {
				sonuc=sonuc*i;
				i++;
				
			}
			
			System.out.println(sonuc);
	}

}
