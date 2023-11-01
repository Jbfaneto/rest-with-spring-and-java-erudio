package com.jbfaneto.restwithspringandjava.services;

import com.jbfaneto.restwithspringandjava.exceptions.UnsuportedMathOperationException;
import org.springframework.stereotype.Service;

import static com.jbfaneto.restwithspringandjava.util.ConvertToDouble.convertToDouble;
import static com.jbfaneto.restwithspringandjava.util.IsNumeric.isNumeric;

@Service
public class MathService {
    public Double sum(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        {
            return convertToDouble(numberOne) + convertToDouble(numberTwo);
        }
    }

    public Double sub(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        {
            return convertToDouble(numberOne) - convertToDouble(numberTwo);
        }
    }

    public Double mult(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        {
            return convertToDouble(numberOne) * convertToDouble(numberTwo);
        }
    }

    public Double div(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        if (convertToDouble(numberTwo) == 0) {
            throw new UnsuportedMathOperationException("It's not possible to divide by zero");
        }
        {
            return convertToDouble(numberOne) / convertToDouble(numberTwo);
        }
    }

    public Double mean(String numberOne, String numberTwo) throws UnsuportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        {
            return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
        }
    }

    public Double squareRoot(String number) throws UnsuportedMathOperationException {
        if (!isNumeric(number)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        {
            return Math.sqrt(convertToDouble(number));
        }
    }

}
