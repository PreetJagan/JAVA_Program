
// with the help of static keyword we can call the static variable and static method
// to call static varible we have to use syso(""+varible name)
// to call static method we have to use classname.methodname

public class StaticKeyword {

  static   String name = "JAGAN";

    static int age = 125;

    public static void Text() {

        System.out.println("Hello" + name);
    }
        public static void Text1() {

            System.out.println("Hello" + age);

        }

    public static void main(String[] args) {
//
//        System.out.println(age);
//        System.out.println(name);
//
        StaticKeyword.Text1();
        StaticKeyword.Text();
//        StaticKeyword st = new StaticKeyword();
//
//        st.Text();
//        System.out.println(st.name);
//        st.Text1();

    }


}

