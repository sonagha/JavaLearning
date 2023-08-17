class table{
void Print1to10Table(){
	for(int i=1;i<=10;i++){
		for(int j=1;j<=10;j++) {
			if (j!=10){
			System.out.printf("%d x %d = %d \t", j,i,j*i);
			}else
			{
				System.out.printf("%d x %d = %d", j,i,j*i).println();
			}
			}
	}
	}
		public static void main(String[] args){
		table first10table = new table();
	first10table.Print1to10Table();	
	}
}