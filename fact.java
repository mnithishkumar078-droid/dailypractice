/*Factorial of a number*/
import java.util.*;
public class fact {
	public static void main(String args[]){
		System.out.print("Enter the number is :");
		Scanner o=new Scanner (System.in);
		int n=o.nextInt();
        int s=1;
		for(int i=1;i<=n;i++){
			s=s*i;
			System.out.print(s+" " );
		}
		
	}
    
}
