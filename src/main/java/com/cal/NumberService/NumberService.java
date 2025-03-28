package com.cal.NumberService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service
public class NumberService {


    // Generate N Even Numbers
    public List<Integer> getEvenNumbers(int count) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 2; evenNumbers.size() < count; i += 2) {
            evenNumbers.add(i);
        }
        return evenNumbers;
    }

    // Generate Fibonacci Sequence up to M
    public List<Integer> getFibonacciNumbers(int max) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int a = 0, b = 1;
        while (b <= max) {
            fibonacciNumbers.add(b);
            int temp = a + b;
            a = b;
            b = temp;
        }
        return fibonacciNumbers;
    }

    // Generate First N Prime Numbers
    public List<Integer> getPrimeNumbers(int count) {
        List<Integer> primeNumbers = new ArrayList<>();
        int num = 2;
        while (primeNumbers.size() < count) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
            num++;
        }
        return primeNumbers;
    }

    // Generate N Random Numbers
    public List<Integer> getRandomNumbers(int count) {
        return new Random().ints(count, 1, 100).boxed().toList();
    }

    // Helper function to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
