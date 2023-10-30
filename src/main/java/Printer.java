/*
Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
Если b равен нулю, программа должна вывести сообщение о невозможности выполнения операции и вернуть результат равный нулю.
После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
Если аргументы не переданы через командную строку, используйте значения по умолчанию.
 */


//мой не раб
//class Expr {
//    public static double expr(int a, int b) {
//
//
//        if (b != 0) {
//       double   r = a / (b * 1.0);
//            Expr.printSum(a, b);
//
//            return (r);
//        } else {
//            System.out.println("Невозможно выполнить деление на ноль.");
//
//
//            return 0;
//        }
//    }
//
//    public static void printSum(int a, int b) {
//       int sum = a + b;
//        System.out.println(sum);
//
//    }
//
//}
//
//public class Printer {
//    public static void main(String[] args) {
//        int a;
//        int b;
//
//        if (args.length == 0) {
//            a = 12;
//            b = 5; // Значения по умолчанию, если аргументы не предоставлены
//        } else {
//            a = Integer.parseInt(args[0]);
//            b = Integer.parseInt(args[1]);
//        }
//
//        double result = Expr.expr(a, b);
//        System.out.println(result);
////   float re = Expr.expr(a, b);
////        System.out.println(re);
//    }
//}


//###############################
//Эталон
class Expr {

    public static double expr(int a, int b) {
        double result = 0.0; // Initialize the result
        if (b != 0) {
            result = (double) a / b; // Perform the division and store the result
        }
        printSum(a, b);
        return result; // Return the result
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}

public class Printer {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 3; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expr.expr(a, b);
        System.out.println(result);
    }
}
