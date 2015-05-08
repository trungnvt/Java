/**
 * 
 */
package fsoft.trungchoi.javastudy;

import java.util.List;

/**
 * @author TrungNVT
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> listFibonaci = Fibonacci.createFibonaci(10);
        System.out.println(listFibonaci.toString());
        for(int i : listFibonaci){
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
