
public class OvningFyraOchFem {
    public static void main(String[] args) {

        MyException ex = new MyException("Det blev fel pågrund av:", new NullPointerException());

        try {
            castException();
        } catch (MyException e) {
            System.err.println(ex);
            System.err.println(ex.getCause());
            //System.err.printf("%s %s%n", ex.getMessage(), ex.getCause());
        }
    }

    public static void castException() throws MyException {        
        throw new MyException();
    }

}

//kod från övning4, funkar inte när MyException är extendad till Exception.

// MyException ex = new MyException("Det blev fel pågrund av:", new
// NullPointerException());
//
// try {
// castException();
// } catch (MyException e) {
// System.err.printf("%s %s%n", ex.getMessage(), ex.getCause());
//
// }
// }
// public static void castException() {
// throw new MyException();
