package pro.sky.DepartmentBook.exception;

public class DepartmentAbsenceException extends RuntimeException{
    public DepartmentAbsenceException() {
        super();
    }

    public DepartmentAbsenceException(String message) {
        super(message);
    }

    public DepartmentAbsenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentAbsenceException(Throwable cause) {
        super(cause);
    }

    protected DepartmentAbsenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
