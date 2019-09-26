import java.util.Scanner;

public class FundCalk {
	
	public static void main(String[] args) {
		
		int x = 0;
		//EarthPref(hiF);
		EarthPref eF = new EarthPref();
		System.out.println(eF);
	}
	
}

class EarthPref {
	//private int hiF;
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
			int hiF = 0;
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
		//return;
		
	}
	
}