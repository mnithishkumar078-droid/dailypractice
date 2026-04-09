import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the number is :");
        Scanner o=new Scanner (System.in);
        int n=o.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }if(c==2){
            System.out.println("The given number is prime"+n);
        }else{
            System.out.println("the Given number is not prime "+n);
        }
        o.close();
    }
}
