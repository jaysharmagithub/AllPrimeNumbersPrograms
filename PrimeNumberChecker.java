import java.util.*;

public class PrimeNumberChecker{
  public static boolean isPrimeNumber(int n) {
   if(n<2) return false;
   if(n>2) {
    for(int i=2; i<n; i++){
      if(n%i != 0 ) return true;
      break;
    }
    return false;  
   }
  }
  
  public static void main(String args[]){
   int primeNum = 5;
    if(isPrimeNumber(primeNum) System.out.println("prime number");
    else System.out.println("not a prime number");
  }
}
