package com;

public class FizzBuzz {

    private static String fizzBuzz(int n) {
        String result = "";
        for(int i = 1; i <= n; i++) {
            if(i%15 == 0) {
                result += "FizzBuzz";
            }
            else if(i%3 == 0) {
                result += "Fizz";
            }
            else if(i%5 == 0) {
                result += "Buzz";
            }
            else {
                result += i;
            }

            if(i < n) {
                result += ", ";
            }
        }
        return result;
    }
    
    private static boolean assertEquals(String expected, String actual) {
        return expected.equals(actual);
    }

    private static void testFizzBuzz() {
        if(!assertEquals(fizzBuzz(1), "1")) {
            System.err.println("Test failed: fizzBuzz(1) should be 1");
            return;
        }
        if(!assertEquals(fizzBuzz(2), "1, 2")) {
            System.err.println("Test failed: fizzBuzz(2) should be 1, 2");
            return;
        }
        if(!assertEquals(fizzBuzz(3), "1, 2, Fizz")) {
            System.err.println("Test failed: fizzBuzz(3) should be 1, 2, Fizz");
            return;
        }
        if(!assertEquals(fizzBuzz(5), "1, 2, Fizz, 4, Buzz")) {
            System.err.println("Test failed: fizzBuzz(5) should be 1, 2, Fizz, 4, Buzz");
            return;
        }
        if(!assertEquals(fizzBuzz(15), "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz")) {
            System.err.println("Test failed: fizzBuzz(15)");
            System.err.println("should be 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz");
            System.err.println("but was " + fizzBuzz(15));
            return;
        }
        System.out.println("All tests passed");
    }
    
    public static void main(String[] args) {
        testFizzBuzz();
    }
}