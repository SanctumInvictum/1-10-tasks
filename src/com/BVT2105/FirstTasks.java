package com.BVT2105;

public class FirstTasks {
    public static void main(String[] args) {
    System.out.println(remainder(1,3));
    System.out.println(triArea(3,4));
    System.out.println(animals(2,3, 5));
    System.out.println(profitableGamble(0.2, 50, 9));
    System.out.println(operation(0,0, 1));
    System.out.println(ctoa('/'));
    System.out.println(addUpTo(10));
    System.out.println(nextEdge(15968,20987));
    System.out.println(sumOfCubes(new int[]{1,5,9}));
    System.out.println(abcmath(1,2,3));
    }
    // №1: Этот метод возвращает остаток от деления числа
    public static int remainder(int a, int b) {
        return a % b;
    }
    // №2: Эта функция принимает основание и высоту треугольника и возращает его площадь
    public static double triArea(double a, double b) {
        return a*b/2;
    }
    // №3: Эта функция возвращает общее кол-во ног всех животных фермера, если он разводит 3 их вида:
    // куриц, коров и свиней, имеющих 2, 4 и 4 ноги
    public static int animals(int a, int b, int c) {
        int chickens = 2 * a;
        int cows = 4*b;
        int pigs = 4*c;
        return chickens + cows + pigs;
    }
    // №4: Эта функция принимает три аргумента и возвращает истину, если prob*prize > pay; Иначе ложь
    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }
    // №5: Эта функция принимает 3 числа и возвращает сообщение о том, что нужно сделать с a и b
    // чтобы получить N, если это невозможно - возвращает None
    public static String operation(int N, int a, int b) {
        String result = "";
        if(a + b == N) {
            result += "added";
            if(a - b == N) result += " or subtracted";
            if(a * b == N) result += " or multiplied";
            if(b != 0) if(a / b == N) result += " or divided";
        }
        else if(a - b == N) {
            result += "subtracted";
            if(a * b == N) result += " or multiplied";
            if(b != 0) if(a / b == N) result += " or divided";
        }
        else if(a * b == N) {
            result += "multiplied";
            if(b != 0) if(a / b == N) result += " or divided";
        }
        else if(b == 0) result += "None";
        else if(a / b == N)  result += "divided";
        return result;
    }
    // №6: Эта функция возвращает ASCII переданного символа
    public static int ctoa(char x) {
        return x;
    }
    // №7: Эта функция берет последнее число из последовательного списка чисел и возвращает сумму
    // всех чисел до него
    public static int addUpTo(int x) {
        int sum = 0;
        for(int i = x; i > 0; i--) sum +=i;
        return sum;
    }
    // №8: Эта функция находит максимальное значение третьего ребра треугольника, длины сторон - целые числа
    public static String nextEdge(int a, int b) {
        if(a <= 0 || b <= 0) return "такого треугольника не существует";
        else return "" + (a+b-1);
    }
    // №9: Эта функция принимает массив чисел и возвращает сумму его кубов
    public static int sumOfCubes(int[] array) {
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            int a = array[i];
            result += a*a*a;
        }
        return result;
    }
    // №10: Эта функция для данных a, b, c: суммирует a b раз и проверяет: делится ли результат на c
    public static boolean abcmath(int a, int b, int c) {
        for(int i = 0; i <= b; i++) a++;
        if(c == 0) return false;
        else if(a % c == 0) return true;
        else return false;
    }
}