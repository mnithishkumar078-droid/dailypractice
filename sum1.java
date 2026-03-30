/*Sum of first N numbers*/
import java.util.*;
public class sum1 {
    public static void main(String[] args) {
        System.out.println("Enter the number is :");
		Scanner o=new Scanner (System.in);
		int n=o.nextInt();
        int s=0;
		for(int i=1;i<=n;i++){
			s=s+i;
		}
		System.out.println("The sum of the number is :"+s);
        o.close();
    }
}
