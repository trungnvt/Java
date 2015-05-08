package fsoft.trungchoi.javastudy;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static boolean isPrimeNumber(int number){
        int m = number / 2;
        boolean flag = true;
        for(int i = 2; i < m; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    public static List<Integer> getPrimeNumberFromListNumber(List<Integer> listNumber){
        List<Integer> listPrimeNumber = new ArrayList<Integer>();
        for(int i : listNumber){
            if(isPrimeNumber(i)) listPrimeNumber.add(i);
        }
        return listPrimeNumber;
    }
}
