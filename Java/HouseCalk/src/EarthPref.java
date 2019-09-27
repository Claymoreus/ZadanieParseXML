import java.util.Scanner;

class EarthPrefMod {
	
	int hiF;
	String houseName;
	String numberTer;
	int grWater;
	int grFrozen;
	int grGostReg;
}	
public class EarthPref {
	//private String numberTer;
	public static void main (String[] args) {	
	//public EarthPref() {	
		Scanner scan = new Scanner(System.in);

		EarthPrefMod territoryNum001 = new EarthPrefMod();
		System.out.println("Enter name of house (project name):");
		territoryNum001.houseName = scan.next();
		territoryNum001.numberTer = territoryNum001.houseName + "001";
		System.out.println("Number of territory is :" + territoryNum001.numberTer);
		
		try { 
			System.out.println("Enter in cm water level on territory (ignore '-')");
			territoryNum001.grWater = scan.nextInt();
			System.out.println("Enter in cm frozen level on territory (ignore '-')");
			territoryNum001.grFrozen = scan.nextInt();
			System.out.println("Enter in cm parametr for fundament on region in the GOST/SP/ISO doc (ignore '-')");
			territoryNum001.grGostReg = scan.nextInt();
			scan.close();
			territoryNum001.hiF = 0;
			if (territoryNum001.hiF < territoryNum001.grWater) {
				territoryNum001.hiF = territoryNum001.grWater;
			} if (territoryNum001.hiF < territoryNum001.grFrozen) {
				territoryNum001.hiF = territoryNum001.grFrozen;
			} if (territoryNum001.hiF < territoryNum001.grGostReg) {
				territoryNum001.hiF = territoryNum001.grGostReg;
			} else if (territoryNum001.hiF == 0) {
			System.out.println("Uncorrect!");
			}
		}	catch (Exception e) {
			System.out.println("Uncorrect type of data");
		}
		System.out.println("Min heigth of fundament - " + territoryNum001.numberTer + " is: " + territoryNum001.hiF);
		//return;
		
	}
}
