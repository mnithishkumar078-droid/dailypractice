/*Palindrome of a number*/
import java.util.*;
public class palinrome {
    public static void main(String[] args) {
		System.out.println("Enter the number is :");
		Scanner o=new Scanner (System.in);
        int n=o.nextInt();
		int org=n;
		int res=0,rem;
		while(n>0){
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
         System.out.println("revse number:"+res);

		if(org==res){
			System.out.println(" the given number is palinrome :");
		}else{
			System.out.println("the given number is not palinrome :");

		}
		o.close();
    }
    
}
