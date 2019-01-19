package FirstPackage;

public class TwoDimArrays {

	public static void main(String[] args) {
		
		// method 1
		
	/*	int[][] intarr=new int[3][2]; // 3 rows and 2 columns
		
		intarr[0][0] = 10;// row1, col1
		
		intarr[0][1] = 20;// row1, col2
		
		intarr[1][0] = 30;// row2, col1
		
		intarr[1][1] = 40;// row2, col2

		intarr[2][0] = 50;// row3, col1
		
		intarr[2][1] = 60;// row3, col2 */
		
		// method 2
		
		int[][] intarr = { {10,20,30,40},
							 {50,60,70,80},
							 {90,100,110,120},
							 {130,140,150,160}
						};

	
		// iterate through and print all values- use nested for loop
		
		int colunum = intarr[0].length; // column numbers
		int rownum = intarr.length;
		
		System.out.println("Rownum is: "+rownum+" colum number is: "+colunum);
		
		for (int i=0; i<intarr.length; i++) {
			
			for (int j=0; j<colunum; j++) {
				System.out.print(intarr[i][j]+",");
			}
			System.out.println();
		}
			

	}

}
