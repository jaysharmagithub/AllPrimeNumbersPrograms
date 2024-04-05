import java.util.*;

public class PrimeNumChecker1ofTheBestOptimized {
  public static boolean isPrimeNum(int num) {
    if(num<2) return false;
    if(num % 2 == 0 || num % 3 == 0 ) return false;
    if(num ==2 || num ==3) return true;
    for(int k=5; k*k<=num; k+=6) {
      if(num % k == 0 && num % (k+2) == 0) return false; 
    }
    return true;
  }
  
  public static void main(String[] args) {
    if(isPrimeNum(99991)) System.out.println("Prime");
    else System.out.println("Not a Prime");
  }
}
