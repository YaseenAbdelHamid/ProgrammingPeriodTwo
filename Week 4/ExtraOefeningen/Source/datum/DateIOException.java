package datum;

public class DateIOException extends RuntimeException
{
    public DateIOException() {
    }

    public DateIOException(String message) {
        super(message);
    }

    public DateIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DateIOException(Throwable cause) {
        super(cause);
    }
}
