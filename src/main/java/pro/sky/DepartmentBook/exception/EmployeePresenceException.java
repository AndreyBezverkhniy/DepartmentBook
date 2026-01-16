package pro.sky.DepartmentBook.exception;

public class EmployeePresenceException extends RuntimeException {
    public EmployeePresenceException() {
        super();
    }

    public EmployeePresenceException(String message) {
        super(message);
    }

    public EmployeePresenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeePresenceException(Throwable cause) {
        super(cause);
    }

    protected EmployeePresenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
