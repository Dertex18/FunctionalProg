package app;

public class Main {

    public static void main(String[] args) {
        MathOperatotion expample1 = new MathOperatotion() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int result = expample1.operate(10, 5);
        System.out.println(result);

        StringManipultaion upperCase = text -> text.toUpperCase();
        String resultString = upperCase.manipulate("hello world");
        System.out.println(resultString);

    }
}
