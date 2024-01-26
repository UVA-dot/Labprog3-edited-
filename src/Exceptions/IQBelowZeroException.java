package Exceptions;
public class IQBelowZeroException extends RuntimeException{
    public IQBelowZeroException(String message){
        super(message);
    }
}