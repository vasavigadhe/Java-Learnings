package javaPackage;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int count = 0;
				for(int i=0; i<=3; i++) {
					int j=1;
					while(j<=4) {
						for(int k=0; k<= 1; k++) {
							System.out.println("Value of i is: "+i+"Value of j is: "+j+"Value of k is "+k);
							count++;
						}
						j++;
					}
				}
				System.out.println(count);
				
			}
		
	}
