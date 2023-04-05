package IMportantQuestions;

//Programe to Reverse a Number
public class Reverse_Number {

    public static int ReverseNumber (int num){
        int reversedNumber = 0;
        while (num>0){
            reversedNumber = reversedNumber*10 + num%10;
            num =num/10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        int num = 123567;
        System.out.println("Reversevalue"+ReverseNumber(num));
    }

}