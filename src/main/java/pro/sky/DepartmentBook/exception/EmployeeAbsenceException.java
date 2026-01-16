package pro.sky.DepartmentBook.exception;

public class EmployeeAbsenceException extends RuntimeException{
    public EmployeeAbsenceException() {
        super();
    }

    public EmployeeAbsenceException(String message) {
        super(message);
    }

    public EmployeeAbsenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeAbsenceException(Throwable cause) {
        super(cause);
    }

    protected EmployeeAbsenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
