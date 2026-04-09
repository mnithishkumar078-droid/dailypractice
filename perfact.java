import java.util.*;
public class perfact {
    public static void main(String[] args) {
        System.out.println("Enter the number is :");
        Scanner o=new Scanner (System.in);
        int n=o.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;

            }
        }if(sum==n){
          System.out.println(sum+"it is a perfect number ");
        }else{
            System.out.println("The given number is not perfact");
        }
        o.close();
    }
}
