import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListConcept
{

    public static void main(String[] args) {

//        We can add different types of objects into the ArrayList

        ArrayList ar = new ArrayList();

        ar.add("HELLO");
        ar.add("HI");
        ar.add(123);

        System.out.println(ar.size());

        // to get 1 index value
        System.out.println(ar.get(1));

        // to print all the value

        for(int i=0;i<=2;i++){

            System.out.println(ar.get(i));

            ArrayList <Integer> sa=   new ArrayList<>();

            sa.add(123);
            sa.add(121);

            System.out.println(sa.get(1));

        }


    }
}
