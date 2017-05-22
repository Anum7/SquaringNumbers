
public class Lab8 {

	public static void main(String[] args) {
		writeSquares(9);
		System.out.println();
		writeSquares(1);
		System.out.println();
		writeSquares(8);
		System.out.println();
		writeSquares(4);

	}
	public static void writeSquares(int n){
		if(n==1){
			System.out.print(n);
		}
		else if(n%2!=0){
				System.out.print(n*n+ ", ");
				writeSquares(n-1);
			}else{
				writeSquares(n-1);	
			System.out.print(", "+n*n);
			
			}
		}
	}

