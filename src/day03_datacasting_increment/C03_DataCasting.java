package day03_datacasting_increment;

public class C03_DataCasting {

	public static void main(String[] args) {
	
		byte sayi1 = 17;
		
		System.out.println("byte de�i�ken ile : " + sayi1);
		
		short sayi2 = sayi1;// sayi2 diye bir variable olu�turuldu ve de�er olarak sayi1 in de�eri atand�.
		// e�itli�in solu short sa�� ise byte short > byte oldu�u i�in bu atamay� java kabul eder.
		
		System.out.println("short de�i�ken ile : " + sayi2);
		
		int sayi3 = sayi2;
		System.out.println("int de�i�ken ile : " + sayi3);
				
		
		float sayi4 = sayi3;
		System.out.println("float de�i�ken ile : " + sayi4);
		
		double sayi5 = sayi2;
		System.out.println("double de�i�ken ile : " + sayi5);
		
		// buna auto widening denir..

	}

}
