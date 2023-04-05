package OOPSConcept;

public class ClassB {

    public static void main(String[] args) {
        ClassA print = new ClassA();

        print.setCarColor("Black");
        print.setCarName("maruti");
        System.out.println(print.getCarColor());
        System.out.println(print.getCarName());

    }

}
