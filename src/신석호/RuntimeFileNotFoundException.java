package 신석호;

public class RuntimeFileNotFoundException extends RuntimeException{
    public RuntimeFileNotFoundException(String message) {
        super(message);
    }

    public RuntimeFileNotFoundException(Throwable cause) {
        super(cause);
    }
}
