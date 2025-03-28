package com.cal.NumberController;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cal.NumberService.NumberService;

@RestController
@RequestMapping("/numbers")
public class NumberController {

    private final NumberService numberService;

    public NumberController(NumberService numberService) {
        this.numberService = numberService;
    }

    @GetMapping("/even")
    public Map<String, List<Integer>> getEvenNumbers() {
        return Map.of("numbers", numberService.getEvenNumbers(0));
    }

    @GetMapping("/fibonacci")
    public Map<String, List<Integer>> getFibonacciNumbers() {
        return Map.of("numbers", numberService.getFibonacciNumbers(0));
    }

    @GetMapping("/prime")
    public Map<String, List<Integer>> getPrimeNumbers() {
        return Map.of("numbers", numberService.getPrimeNumbers(0));
    }

    @GetMapping("/random")
    public Map<String, List<Integer>> getRandomNumbers() {
        return Map.of("numbers", numberService.getRandomNumbers(0));
    }
    
    
    @PostMapping("/even")
    public Map<String, List<Integer>> postEvenNumbers(@RequestBody Map<String, Integer> requestBody) {
        int count = requestBody.get("count");
        return Map.of("numbers", numberService.getEvenNumbers(count));
    }


    @PostMapping("/fibonacci")
    public Map<String, List<Integer>> postFibonacciNumbers(@RequestBody Map<String, Integer> requestBody) {
        int max = requestBody.get("max");
        return Map.of("numbers", numberService.getFibonacciNumbers(max));
    }


    @PostMapping("/prime")
    public Map<String, List<Integer>> postPrimeNumbers(@RequestBody Map<String, Integer> requestBody) {
        int count = requestBody.get("count");
        return Map.of("numbers", numberService.getPrimeNumbers(count));
    }

    @PostMapping("/random")
    public Map<String, List<Integer>> postRandomNumbers(@RequestBody Map<String, Integer> requestBody) {
        int count = requestBody.get("count");
        return Map.of("numbers", numberService.getRandomNumbers(count));
    }

    }


