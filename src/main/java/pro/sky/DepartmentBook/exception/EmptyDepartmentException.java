package pro.sky.DepartmentBook.exception;

public class EmptyDepartmentException extends RuntimeException{
    public EmptyDepartmentException() {
        super();
    }

    public EmptyDepartmentException(String message) {
        super(message);
    }

    public EmptyDepartmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyDepartmentException(Throwable cause) {
        super(cause);
    }

    protected EmptyDepartmentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
