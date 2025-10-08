import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bal=sc.nextInt();
        int with=sc.nextInt();
        int bal2=bal-with;
        if( with<=bal){
            System.out.println("Amount is debited");
            System.out.println(bal2);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    
}
