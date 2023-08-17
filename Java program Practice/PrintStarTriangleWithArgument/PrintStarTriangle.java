import java.util.*;
class PrintTriangle {
	void starTriangle(int a){
		int noOfColumn = 0;
		for(int i=1; i<=a; i++){
			
			if(i==1){
			noOfColumn = i;
			}else{
				noOfColumn = noOfColumn+2;
		}
	}
		int middlePoint = (noOfColumn/2) + 1;
		int startPoint = middlePoint;
		int endPoint = middlePoint;
			for(int j=1;j<=a;j++){
				for(int k=1;k<=noOfColumn;k++){
					if(k>=startPoint && k <= endPoint){
						System.out.printf("*");
					}else{
						System.out.printf(" ");
					}
				}
				System.out.println();
				startPoint = startPoint - 1;
				endPoint = endPoint + 1;
			}
			}
			public static void main(String[] args){
				PrintTriangle PrintStarTriangle = new PrintTriangle();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the no of row for triangle");
				int input = sc.nextInt();
				PrintStarTriangle.starTriangle(input);
			}
		}
