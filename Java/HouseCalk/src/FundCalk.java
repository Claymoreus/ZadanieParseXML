import java.util.Scanner;

public class FundCalk {
	public static int hiF;
	public static void main(String[] args) {
		EarthPref earthPref = new EarthPref();
		hiF = earthPref.hiF;
		System.out.println(earthPref.hiF);
		
	}
	
}

/*class EarthPref {
	private int hiF;
	public EarthPref() {
		
		Scanner scan = new Scanner(System.in);
		try { 
			System.out.println("Enter in cm water level on territory (ignore '-')");
			int grWater = scan.nextInt();
			System.out.println("Enter in cm frozen level on territory (ignore '-')");
			int grFrozen = scan.nextInt();
			System.out.println("Enter in cm parametr for fundament on region in the GOST/SP/ISO doc (ignore '-')");
			int grGostReg = scan.nextInt();
			scan.close();
			hiF = 0;
			if (hiF < grWater) {
				hiF = grWater;
			} if (hiF < grFrozen) {
				hiF = grFrozen;
			} if (hiF < grGostReg) {
				hiF = grGostReg;
			} else 
			System.out.println("Uncorrect!");
		}	catch (Exception e) {
			System.out.println("Uncorrect type of data");
		}
		return;
		
	}
	
}*/