package com.jbfaneto.restwithspringandjava.controllers
;
import com.jbfaneto.restwithspringandjava.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.jbfaneto.restwithspringandjava.util.ConvertToDouble.convertToDouble;


@RestController
public class MathController {
    @Autowired
    private MathService service;

    private static final String template = "%s of %.2f and %.2f is %.2f";

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public String sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) {
        Double sum = service.sum(numberOne, numberTwo);
        return String.format(template, "sum", convertToDouble(numberOne), convertToDouble(numberTwo), sum);

    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public String sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) {

        Double numberOneDouble = convertToDouble(numberOne);
        Double numberTwoDouble = convertToDouble(numberTwo);
        Double sub = service.sub(numberOne, numberTwo);
        return String.format(template, "sub",numberOneDouble, numberTwoDouble, sub);
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public String mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo){
        Double numberOneDouble = convertToDouble(numberOne);
        Double numberTwoDouble = convertToDouble(numberTwo);
        Double mult = service.mult(numberOne, numberTwo);
        return String.format(template, "multiplication", numberOneDouble, numberTwoDouble, mult);
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public String div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo)  {
        Double numberOneDouble = convertToDouble(numberOne);
        Double numberTwoDouble = convertToDouble(numberTwo);
        Double div = service.div(numberOne, numberTwo);
        return String.format(template, "division", numberOneDouble, numberTwoDouble, div);
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public String mean(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo)  {
        Double numberOneDouble = convertToDouble(numberOne);
        Double numberTwoDouble = convertToDouble(numberTwo);
        Double mean = service.mean(numberOne, numberTwo);
        return String.format(template, "mean", numberOneDouble, numberTwoDouble, mean);
    }

    @RequestMapping(value = "/sqrt/{numberOne}", method= RequestMethod.GET)
    public String sqrt(
            @PathVariable(value = "numberOne") String numberOne) {
        Double numberOneDouble = convertToDouble(numberOne);
        Double sqrt = service.squareRoot(numberOne);
        return String.format("The square root of %.2f is %.2f", numberOneDouble, sqrt);
    }
}
