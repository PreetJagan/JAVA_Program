public class pattern {

    public static void main(String[] args) {

        for (int i=0; i<6; i++){

            for (int j=0; j<=i; j++){

                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("__________________");

        for (int i=1 ; i<7;i++){

            for (int j=6; j>i; j--){

                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("_____________________");

        for (int i=1; i<=5; i++){

            for (int j=5; j>i; j--){

                System.out.print("  ");
            }

            for (int k=0;k<= (2*i)-1; k++ ){

                System.out.print(" * ");
            }
        System.out.println(" ");
        }
    }



}
