package app;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        MathOperatotion expample1 = new MathOperatotion() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int result = expample1.operate(10, 5);
        System.out.printf("Result is %d\n", result);

        StringManipultaion upperCase = text -> text.toUpperCase();
        String resultString = upperCase.manipulate("hello world");
        System.out.println("Upper Case: " + resultString);


        Function<String, Integer> uppercaseCounter = StringListProcessor::counterUppercase;
        String testText = "Hilel IT School! April 2026";
        int resultUppercaseCounter = uppercaseCounter.apply(testText);
        System.out.printf("Result of upperCase: %d", resultUppercaseCounter);

    }
}
