package exception;

public class EcDef extends RuntimeException{
    static final long serialVersionUID = -112232446578L;
    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}
