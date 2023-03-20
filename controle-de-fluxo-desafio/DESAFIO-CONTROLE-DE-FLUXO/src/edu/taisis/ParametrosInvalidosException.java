package edu.taisis;

public class ParametrosInvalidosException extends Exception{

    @Override
    public String getMessage() {
        return "O Primeiro parâmetro e maior que o segundo parâmetro.";
    }
    
}
