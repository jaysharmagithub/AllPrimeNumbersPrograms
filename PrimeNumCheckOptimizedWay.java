import java.util.*;

public class PrimeNumCheckerOptimizedWay { 
 
  //function definiton
  public static boolean isPrimeNum(int num){
    if(num<2) return false;
    for(int i=2; i <= Math.sqrt(num); i++) {
      if(num%i == 0) return false;
        
    }
    return true;
  }
  public static void main(String[] args){
  if( isPrimeNum(11) )
            System.out.println(" Prime Number"); 
        else
            System.out.println(" not a Prime Number"); 
       
 }
}
