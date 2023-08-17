import java.util.*;
class printTable{
	void table(int a){
		for(int i=1;i<=10;i++){
			System.out.printf("%d X %d = %d",a,i,a*i).println();
		}
	}
public static void main(String[] args){
	printTable printGivenTable = new printTable();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the digit which table you want to print :");
	int input = sc.nextInt();
	printGivenTable.table(input);
}
}
