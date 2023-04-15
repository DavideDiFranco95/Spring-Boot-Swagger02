package co.develhope.swagger2.controllers;

import co.develhope.swagger2.services.MathService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("")
    public String welcomeMathMsg(){

        return "Welcome to the Easy Math!";
    }
    @Autowired
    MathService service;
    @GetMapping("/division-info")
    @ApiOperation(value = "dividend / divisor = quotient")
    public float division(Integer value,Integer value2){

        return service.getDivision(value, value2);
    }

    @GetMapping("/multiplication")
    @ApiOperation(value = "multiplicand * multiplier = product")
    public int multiplication(Integer value,Integer value2){

        return service.getMultiplication(value, value2);
    }

    @GetMapping("/square")
    @ApiOperation(value = "value * itSelfValue = square")
    public int square(Integer value){

        return service.getSquare(value);
    }
}