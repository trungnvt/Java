package fsoft.trungchoi.javastudy;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> createFibonaci(int count){
        List<Integer> fibonaciList = new ArrayList<Integer>();
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        fibonaciList.add(n1);
        fibonaciList.add(n2);
        while(count > 0){
            n3 = n1 + n2;
            fibonaciList.add(n3);
            n1 = n2;
            n2 = n3;
            count--;
        }
        return fibonaciList;
    };

}
