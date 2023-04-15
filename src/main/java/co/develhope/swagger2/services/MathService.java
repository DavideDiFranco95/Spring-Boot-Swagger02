package co.develhope.swagger2.services;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public int getDivision(Integer value,Integer value2){
        return value / value2;
    }

    public int getMultiplication(Integer value,Integer value2){

        return value * value2;
    }

    public int getSquare(Integer value){

        return value * value;
    }
}
