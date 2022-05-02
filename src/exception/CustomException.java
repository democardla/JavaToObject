package exception;

import org.apache.poi.ss.formula.functions.IfFunc;

public class CustomException extends RuntimeException{
    static final long serialVersionUID = -9876543211111L;//异常的版本号：用来标识独一无二的异常

    public CustomException(String message) {
        super(message);
    }

    public CustomException() {
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String toString() {
        return "发生了CustomException，请再次检查操作是否符合规范";
    }//用来描述发生的异常和原因
}
