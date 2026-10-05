public class WrapperDemo {
    public static void main(String[] args) {

        // Primitive values
        int a = 10;
        float b = 25.5f;
        double c = 45.75;
        char d = 'A';
        boolean e = true;
        String str = "Java";

        // Autoboxing
        Integer intObj = a;
        Float floatObj = b;
        Double doubleObj = c;
        Character charObj = d;
        Boolean boolObj = e;

        // String is already an object
        String stringObj = str;

        System.out.println("Wrapper Class Values:");
        System.out.println("Integer   : " + intObj);
        System.out.println("Float     : " + floatObj);
        System.out.println("Double    : " + doubleObj);
        System.out.println("Character : " + charObj);
        System.out.println("Boolean   : " + boolObj);
        System.out.println("String    : " + stringObj);

        // Unboxing
        int x = intObj;
        float y = floatObj;
        double z = doubleObj;
        char ch = charObj;
        boolean flag = boolObj;

        System.out.println("\nAfter Unboxing:");
        System.out.println("int     : " + x);
        System.out.println("float   : " + y);
        System.out.println("double  : " + z);
        System.out.println("char    : " + ch);
        System.out.println("boolean : " + flag);
    }
}