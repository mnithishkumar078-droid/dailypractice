import java.util.*;
/*Multiplication table of a number*/
public class table {
    public static void main(String[] args) {
		System.out.print("Enter the number is:");
		Scanner o=new Scanner (System.in);
		int n=o.nextInt();
		for(int i=1;i<=n;i++)
			System.out.println(i+"*"+n+"="+i*n);
		o.close();
        
    }
    
}
