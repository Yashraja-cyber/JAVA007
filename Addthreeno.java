import java.util.Scanner;

public class Addthreeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<3;i++){
            int j=sc.nextInt();
            sum=sum+j;
        }
        System.out.println(sum);
    }
    
}
