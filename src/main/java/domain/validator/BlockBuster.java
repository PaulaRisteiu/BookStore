package domain.validator;

public class BlockBuster extends RuntimeException{
    public BlockBuster(String message) {
        super(message);
    }

    public BlockBuster(String message, Throwable cause) {
        super(message, cause);
    }

    public BlockBuster(Throwable cause) {
        super(cause);
    }
}
