package JAVA_BASICS._1_T0_25;

public class LAB_6_String_3 {
    public static void main(String[] args) {
        String a = new String("Manjula");
        String b = new String("Manjula");
        String c = new String("manjula");

        System.out.println(a.equals(b));
        System.out.println(a==b);

        System.out.println(a.equals(c));
        System.out.println(a==c);



    }
}
