package exceptions;

//use RuntimeException and they are not checked
public class DuplicateException extends RuntimeException{

    public DuplicateException(){
        super("Duplicates are not allowed!");
    }

    public DuplicateException(String message){
        super(message);
    }
}
