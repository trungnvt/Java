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
        System.out.println();
        System.out.println("7 is prime number: " + PrimeNumber.isPrimeNumber(7));

        System.out.println("prime number in list fibonacci: " + PrimeNumber.getPrimeNumberFromListNumber(listFibonaci));
    }

}
