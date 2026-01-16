package pro.sky.DepartmentBook.exception;

public class NoDepartmentsException extends RuntimeException{
    public NoDepartmentsException() {
        super();
    }

    public NoDepartmentsException(String message) {
        super(message);
    }

    public NoDepartmentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoDepartmentsException(Throwable cause) {
        super(cause);
    }

    protected NoDepartmentsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
