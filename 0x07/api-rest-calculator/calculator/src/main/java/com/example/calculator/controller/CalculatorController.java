package com.example.calculator.controller;

import com.example.calculator.model.Calculator;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    
    private final Calculator calculator = new Calculator();
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Bem vindo à CALCULATOR API REST.";
    }
    
    @GetMapping("/addNumbers")
    public Double addNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        return calculator.sum(n1, n2);
    }
    
    @GetMapping("/subNumbers")
    public Double subNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        return calculator.sub(n1, n2);
    }
    
    @GetMapping("/divideNumbers")
    public Double divideNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        return calculator.divide(n1, n2);
    }
    
    @GetMapping("/factorial")
    public Integer factorial(@RequestParam(name = "factorial") Integer factorial) {
        return calculator.factorial(factorial);
    }
    
    @GetMapping("/calculeDayBetweenDate")
    public Integer calculeDayBetweenDate(@RequestParam("localDate1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,
                                         @RequestParam("localDate2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {
        return calculator.calculeDayBetweenDate(localDate1, localDate2);
    }
    
    @GetMapping("/integerToBinary")
    public Integer integerToBinary(@RequestParam(name = "number1") Integer n1) {
        return calculator.integerToBinary(n1);
    }
    
    @GetMapping("/integerToHexadecimal")
    public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {
        return calculator.integerToHexadecimal(n1);
    }
}
