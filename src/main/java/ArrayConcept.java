import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayConcept {

    public static void main(String[] args) {
        // Disadvantage Size is Fixed to overcome this we use ArrayList
        //it stores similar data object to overcome we use object Array
        int i []= new int[5];

        i[0]=10;
        i[1]=12;
        i[2]=11;
        i[3]=44;
        i[4]=74;
//        i[5]=20;

        System.out.println(i.length);
        System.out.println(i[2]);

        for (int j=0; j<i.length; j++){

            System.out.println(i[j]);



        }



    }

}
