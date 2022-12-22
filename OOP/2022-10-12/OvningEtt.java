public class OvningEtt {
    public static void main(String[] args) throws RuntimeException {

        try {
            throw new RuntimeException();
        } catch (RuntimeException ex) {
            System.err.println("Opps något gick fel " + ex.getStackTrace());
        }

    }
}
