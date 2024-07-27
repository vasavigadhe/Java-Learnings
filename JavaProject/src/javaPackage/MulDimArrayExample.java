package javaPackage;

public class MulDimArrayExample {

	public static void main(String[] args) {
		int[][] arr1 = new int[2][2];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[1][1] = 8;
		arr1[1][0] = 4;
		//{{1,2},{8,4}}
		for (int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				//System.out.println(arr1[i][j]);
			}
		}
		//Three dimensional Array 
		int[][][] arr = {{{0,1},{1,2}},{{7,0},{5,6}}};
		// 000, 001, 010, 011, 100, 101, 110,111
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println(arr[i][j][k]);
				}
				
			}
		}
	}

}
