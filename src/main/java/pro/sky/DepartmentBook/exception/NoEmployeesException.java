package pro.sky.DepartmentBook.exception;

public class NoEmployeesException extends RuntimeException{
    public NoEmployeesException() {
        super();
    }

    public NoEmployeesException(String message) {
        super(message);
    }

    public NoEmployeesException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoEmployeesException(Throwable cause) {
        super(cause);
    }

    protected NoEmployeesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
