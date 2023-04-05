package INheritance;

public class ChildClass extends Main_Class {

    public void subs(int c, int d){

        int e;

        e= c-d;

        System.out.println("value"+e);

    }

    public static void main(String[] args) {
        ChildClass d1 = new ChildClass();
        d1.Sum(12,45);
        d1.subs(12,12);
    }
}
