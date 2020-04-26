import java.util.Scanner;

public class PrintNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so so NT ban muon in ra:");
        int number = scanner.nextInt();
        int count =0;
        int i=0;
        while (i>=0){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
            i++;
            if(count==number){
                break;
            }
        }

    }
    public static boolean isPrime(int number){
        boolean check =true;
        if(number<2){
            check=false;
        }
        else {
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    check=false;
                    break;
                }
            }
        }
        return check;
    }
}
