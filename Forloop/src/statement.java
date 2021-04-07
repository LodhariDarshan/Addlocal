import java.util.Scanner;
public class statement {

	public static void main(String[] args) {
	
		
     Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of row:");
	int x = sc.nextInt();
		int i,s,j;
		
		for ( i=1; i<=x; i++)
			
		{
			for ( s=1; s<=x; s++)
			{	
				if (i==3 || s==3)
					System.out.print("*");
				else 
					System.out.print("o");
			}
			System.out.println();
		}
		
	}
}
 