
package performanstest;

import java.util.Stack;


public class PerformansTest {

    
    public static void main(String[] args) {
        int elemanSayisi = 100000;
        System.out.println("--- Test Basliyor ---");

        // Kendi yapımız
        MyStack customStack = new MyStack();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < elemanSayisi; i++) customStack.push(i);
        for (int i = 0; i < elemanSayisi; i++) customStack.pop();
        long e1 = System.currentTimeMillis();
        System.out.println("Benim Stack: " + (e1 - s1) + " ms");

        // Java'nın yapısı
        Stack<Integer> javaStack = new Stack<>();
        long s2 = System.currentTimeMillis();
        for (int i = 0; i < elemanSayisi; i++) javaStack.push(i);
        for (int i = 0; i < elemanSayisi; i++) javaStack.pop();
        long e2 = System.currentTimeMillis();
        System.out.println("Java Stack: " + (e2 - s2) + " ms");
    }
    
}
