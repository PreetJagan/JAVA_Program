public class StarPattern {

    public static void main(String[] args) {

        // To print triangle star Pattern
        for (int i=0 ; i<8 ; i++){

            for (int j=0 ; j<=i; j++){

                System.out.print("*");
            }
        System.out.println();

        }

        System.out.println("_______________________________");
        // To print reverse triangle pattern

        for (int i=0; i<=8; i++){

            for (int j=8; j>=i ; j--){

                System.out.print("*");

            }

            System.out.println();

        }

        System.out.println("____________________________");

        // To print pyramid pattern

        for (int i =1 ; i<5; i++){

            for (int j=10 ; j>=i; j--){

                System.out.print("");{

            for (int k =1 ; k<=i;k++){

                System.out.print(" *");
            }

            System.out.println();
                }

            }

        }


    }


}
