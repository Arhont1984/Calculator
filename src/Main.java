import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Calculator calc = Calculator.instance.get();
        Scanner scanner = new Scanner(System.in);

        //int a = calc.plus.apply(1, 2);
        //int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b);
        // На ноль делить нельзя, b = 1-1 = 0; Поэтому программа будет выдавать ошибку.
        // Надо или менять условия, что бы в принципе небыло ситуаций когда b становится равно 0, при условии использования деления на b.
        // Или попробовать такой вариант решения:
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!");
        }
        finally {
            System.out.println("Введите два новых значения для пересчёта переменной b");
            System.out.println("Введите сначала *Уменьшаемое* значение:");
            a = scanner.nextInt();
            System.out.println("Теперь введите *Вычитаемое* значение:");
            b = scanner.nextInt();
            int c = calc.devide.apply(a, b);
            System.out.println("Результат: ");
            calc.println.accept(c);
        }
    }
}
