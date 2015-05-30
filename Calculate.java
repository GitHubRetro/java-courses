/**
     Класс для вычисления суммы двух чисел, числа берутся из входящего масива.
*/
public class Calculate {

    public static void main(String[] arg) {
       System.out.println("Calculate...");
       int first = Integer.valueOf(arg[0]);
       int second = Integer.valueOf(arg[1]);
       int summ = first + second;
       System.out.println("Sim "+summ);
    }
}