
// Wrapper class is used for data conservation means to change the data type

public class Wrapper {

    public static void main(String[] args) {

        // String to integer
        String x = "141";

        System.out.println(x+120);

        int j = Integer.parseInt(x);

        System.out.println(j+120);

        // String to Double

        String k = "11.11";

        Double l = Double.parseDouble(k);
        System.out.println(l+11);

        // Integer to String

        int  m = 200;

        String d=String.valueOf(m);
        System.out.println(m+10);

    }



}
