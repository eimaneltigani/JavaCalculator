public class JavaCalculator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int square(int num1) {
        return num1 * num1;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(add(2,3));
        System.out.println(subtract(7,4));
        System.out.println(multiply(4,5));
        System.out.println(divide(37,2));
        System.out.println(square(5));
    }
}