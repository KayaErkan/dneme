package day24_lists_forEachLoops;

public class C04_ForEachLoop02 {

	public static void main(String[] args) {
		/*  Soru 1:
			Bir integer array olusturunuz ve bu array�deki tum sayilarin carpimini
			For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 */

		int arr [] = {2,4,5,7,8,1,23};
		int carpim=1;
		for (int each : arr) {
			
			carpim *= each;
		}
		System.out.println("Arrayin elemanlar�n�n carpimi : " + carpim);
		
		int count = 1;
		carpim = 1;
		// her ad�mda  carpim sonucunu g�rmek istesem
		
		for (int each : arr) {
			
			carpim *= each;
			System.out.println(count + ". ad�mdaki carpim : " + carpim);
			count++;
		}
		
	}

}
