public class substringtest {
    public static void main(String[] args) {
        

        String first = "hhdsnjksnkvnsklvns";
        int i = first.length();
        int k = i - 6;
        String second = first.substring(k,i);
        System.out.println(second);
    }
}
