import java.util.*;
/*Count digits in a number*/
public class count {
    public static void main(String[] args) {
		System.out.print("Enter the number is:");
		Scanner o=new Scanner (System.in);
		int n=o.nextInt();
		int count=0;
		while(n!=0){
			count++;
			n=n/10;
		
		}
        System.out.println("the counted number is"+count);
		o.close();
    }
    
}
