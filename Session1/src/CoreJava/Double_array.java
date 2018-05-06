package CoreJava;

public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String flights [][]=new String [4][4];
		
		//First Row
		flights[0][0]="Dallas";
		flights[0][1]="NYC";
		flights[0][2]="Miami";
		flights[0][3]="Chicago";
		
		//Second Row
		flights [1][0]="New Mexico";
		flights [1][1]="San Diego";
		flights [1][2]="DC";
		flights [1][3]="Newark";
		
		//Third Row
		flights [2][0]="New Orleans";
		flights [2][1]="Baston Rouge";
		flights [2][2]="Kansas";
		flights [2][3]="Toronto";
		
		//Fourth Row
		flights [3][0]="Denver";
		flights [3][1]="Honolulu";
		flights [3][2]="Harrisburg";
		flights [3][3]="Houston";
		
     //System.out.println(flights[3][1]);
     
     int rows = flights.length;
		int cols=flights[0].length;
		
		for (int rownum=0;rownum<rows; rownum++){
		for(int colnum=0;colnum<cols;colnum++) {
				
		System.out.println(flights[rownum][colnum]);
				
			}
		}
		
		
	}

}
