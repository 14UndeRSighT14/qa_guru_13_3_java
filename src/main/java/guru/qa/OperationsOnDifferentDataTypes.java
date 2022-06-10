package guru.qa;

import java.util.Arrays;

public class OperationsOnDifferentDataTypes {
    static byte minByte = -128;
    static byte maxByte = 127;

    static short minShort = -32768;
    static short maxShort = 32767;

    static int minInt = -2147483648;
    static int maxInt = 2147483647;

    static long minLong = Long.MIN_VALUE;
    static long maxLong = Long.MAX_VALUE;

    static byte randomByte1 = (byte) ((int) (Math.random() * 10) + 1);
    static byte randomByte2 = (byte) ((int) (Math.random() * (-10)) - 1);

    static short randomShort1 = (short) ((int) (Math.random() * 10) + 1);
    static short randomShort2 = (short) ((int) (Math.random() * (-10)) - 1);

    static int randomInt1 = (int) (Math.random() * 10) + 1;
    static int randomInt2 = (int) (Math.random() * (-10)) - 1;
    static long randomLong1 = (int) (Math.random() * 10) + 1;
    static long randomLong2 = (int) (Math.random() * (-10)) - 1;

    static double randomDouble1 = Math.random() * 10;
    static double randomDouble2 = Math.random() * (-10);

    static float randomFloat1 = (float) Math.random() * 10;
    static float randomFloat2 = (float) Math.random() * (-10);

    public static void main(String[] args) {

        sumOnDifferentDataTypes();
        diffOnDifferentDataTypes();
        otherOpOnDifferentDataTypes();
        operationsAboveString();
        logicalOperations();
        arrays();
    }

    static void sumOnDifferentDataTypes() {

        byte sumByte1 = (byte) (randomByte1 + randomByte2);
        byte sumByte2 = (byte) (maxByte + randomByte1);
        byte sumByte3 = (byte) (minByte + randomByte2);
        System.out.println("=========Сумма Byte:=========");
        System.out.println("1) Двух рандомных чисел: " + randomByte1 + " + (" + randomByte2 + ") = " + sumByte1);
        System.out.println("2) Для проверки переполнения в максимальную сторону: " + maxByte + " + " + randomByte1 + " = " + sumByte2);
        System.out.println("3) Для проверки переполнения в минимальную сторону: (" + minByte + ") + (" + randomByte2 + ") = " + sumByte3);

        short sumShort1 = (short) (randomShort1 + randomShort2);
        short sumShort2 = (short) (maxShort + randomShort1);
        short sumShort3 = (short) (minShort + randomShort2);
        System.out.println("=========Сумма Short:=========");
        System.out.println("1) Двух рандомных чисел: " + randomShort1 + " + (" + randomShort2 + ") = " + sumShort1);
        System.out.println("2) Для проверки переполнения в максимальную сторону: " + maxShort + " + " + randomShort1 + " = " + sumShort2);
        System.out.println("3) Для проверки переполнения в минимальную сторону: (" + minShort + ") + (" + randomShort2 + ") = " + sumShort3);

        int sumInt1 = randomInt1 + randomInt2;
        int sumInt2 = maxInt + randomInt1;
        int sumInt3 = minInt + randomInt2;
        System.out.println("=========Сумма Int:=========");
        System.out.println("1) Двух рандомных чисел: " + randomInt1 + " + (" + randomInt2 + ") = " + sumInt1);
        System.out.println("2) Для проверки переполнения в максимальную сторону: " + maxInt + " + " + randomInt1 + " = " + sumInt2);
        System.out.println("3) Для проверки переполнения в минимальную сторону: (" + minInt + ") + (" + randomInt2 + ") = " + sumInt3);

        long sumMixed1 = randomLong1 + randomLong2;
        long sumMixed2 = maxLong + randomLong1;
        long sumMixed3 = minLong + randomLong2;
        System.out.println("=========Сумма Long:=========");
        System.out.println("1) Двух рандомных чисел: " + randomLong1 + " + (" + randomLong2 + ") = " + sumMixed1);
        System.out.println("1) Для проверки переполнения в максимальную сторону: " + maxLong + " + " + randomLong1 + " = " + sumMixed2);
        System.out.println("2) Для проверки переполнения в минимальную сторону: (" + minLong + ") + (" + randomLong2 + ") = " + sumMixed3);

        double sumDouble = randomDouble1 + randomDouble2;
        System.out.println("=========Сумма Double:=========");
        System.out.println("Двух рандомных чисел: " + randomDouble1 + " + (" + randomDouble2 + ") = " + sumDouble);

        float sumFloat = randomFloat1 + randomFloat2;
        System.out.println("=========Сумма Float:=========");
        System.out.println("Двух рандомных чисел: " + randomFloat1 + " + (" + randomFloat2 + ") = " + sumFloat);
    }

    static void diffOnDifferentDataTypes() {

        byte diffByte1 = (byte) (randomByte1 - randomByte2);
        byte diffByte2 = (byte) (maxByte - randomByte2);
        byte diffByte3 = (byte) (minByte - randomByte1);
        System.out.println("=========Разность Byte:=========");
        System.out.println("1) Двух рандомных чисел: " + randomByte1 + " - (" + randomByte2 + ") = " + diffByte1);
        System.out.println("2) Для проверки переполнения в максимальную сторону: " + maxByte + " - (" + randomByte2 + ") = " + diffByte2);
        System.out.println("3) Для проверки переполнения в минимальную сторону: (" + minByte + ") - " + randomByte1 + " = " + diffByte3);

        short diffShort1 = (short) (randomShort1 - randomShort2);
        short diffShort2 = (short) (maxShort - randomShort2);
        short diffShort3 = (short) (minShort - randomShort1);
        System.out.println("=========Разность Short:=========");
        System.out.println("1) Двух рандомных чисел: " + randomShort1 + " - (" + randomShort2 + ") = " + diffShort1);
        System.out.println("2) Для проверки переполнения в максимальную сторону: " + maxShort + " - (" + randomShort2 + ") = " + diffShort2);
        System.out.println("3) Для проверки переполнения в минимальную сторону: (" + minShort + ") - " + randomShort1 + " = " + diffShort3);

        int diffInt1 = randomInt1 - randomInt2;
        int diffInt2 = maxInt - randomInt2;
        int diffInt3 = minInt - randomInt1;
        System.out.println("=========Разность Int:=========");
        System.out.println("1) Двух рандомных чисел: " + randomInt1 + " - (" + randomInt2 + ") = " + diffInt1);
        System.out.println("2) Для проверки переполнения в максимальную сторону: " + maxInt + " - (" + randomInt2 + ") = " + diffInt2);
        System.out.println("3) Для проверки переполнения в минимальную сторону: (" + minInt + ") - " + randomInt1 + " = " + diffInt3);

        long diffMixed1 = randomLong1 - randomLong2;
        long diffMixed2 = maxLong - randomLong2;
        long diffMixed3 = minLong - randomLong1;
        System.out.println("=========Разность Long:=========");
        System.out.println("1) Двух рандомных чисел: " + randomLong1 + " - (" + randomLong2 + ") = " + diffMixed1);
        System.out.println("1) Для проверки переполнения в максимальную сторону: " + maxLong + " - (" + randomLong2 + ") = " + diffMixed2);
        System.out.println("2) Для проверки переполнения в минимальную сторону: (" + minLong + ") - " + randomLong1 + " = " + diffMixed3);

        double diffDouble = randomDouble1 - randomDouble2;
        System.out.println("=========Разность Double:=========");
        System.out.println("Двух рандомных чисел: " + randomDouble1 + " - (" + randomDouble2 + ") = " + diffDouble);

        float diffFloat = randomFloat1 - randomFloat2;
        System.out.println("=========Разность Float:=========");
        System.out.println("Двух рандомных чисел: " + randomFloat1 + " - (" + randomFloat2 + ") = " + diffFloat);
    }

    static void otherOpOnDifferentDataTypes() {

        byte otherOpByte1 = (byte) (randomByte1 * randomByte2);
        byte otherOpByte2 = (byte) (maxByte / randomByte2);
        byte otherOpByte3 = (byte) (minByte % randomByte1);
        System.out.println("=========Другие операции с Byte:=========");
        System.out.println("1) Умножение двух рандомных чисел: " + randomByte1 + " * (" + randomByte2 + ") = " + otherOpByte1);
        System.out.println("2) Деление: " + maxByte + " / (" + randomByte2 + ") = " + otherOpByte2);
        System.out.println("3) Остаток от деления: (" + minByte + ") % " + randomByte1 + " = " + otherOpByte3);

        short otherOpShort1 = (short) (randomShort1 * randomShort2);
        short otherOpShort2 = (short) (maxShort / randomShort2);
        short otherOpShort3 = (short) (minShort % randomShort1);
        System.out.println("=========Другие операции с Short:=========");
        System.out.println("1) Умножение двух рандомных чисел: " + randomShort1 + " * (" + randomShort2 + ") = " + otherOpShort1);
        System.out.println("2) Деление: " + maxShort + " / (" + randomShort2 + ") = " + otherOpShort2);
        System.out.println("3) Остаток от деления: (" + minShort + ") % " + randomShort1 + " = " + otherOpShort3);

        int otherOpInt1 = randomInt1 * randomInt2;
        int otherOpInt2 = maxInt / randomInt2;
        int otherOpInt3= minInt % randomInt1;
        System.out.println("=========Другие операции с Int:=========");
        System.out.println("1) Умножение двух рандомных чисел: " + randomInt1 + " * (" + randomInt2 + ") = " + otherOpInt1);
        System.out.println("2) Деление: " + maxInt + " / (" + randomInt2 + ") = " + otherOpInt2);
        System.out.println("3) Остаток от деления: (" + minInt + ") % " + randomInt1 + " = " + otherOpInt3);

        long otherOpLong1 = randomLong1 * randomLong2;
        long otherOpLong2 = maxLong / randomLong2;
        long otherOpLong3= minLong % randomLong1;
        System.out.println("=========Другие операции с Long:=========");
        System.out.println("1) Умножение двух рандомных чисел: " + randomLong1 + " * (" + randomLong2 + ") = " + otherOpLong1);
        System.out.println("2) Деление: " + maxLong + " / (" + randomLong2 + ") = " + otherOpLong2);
        System.out.println("3) Остаток от деления: (" + minLong + ") % " + randomLong1 + " = " + otherOpLong3);

        double otherOpDouble1 = randomDouble1 * randomDouble2;
        double otherOpDouble2 = randomDouble1 / randomDouble2;
        System.out.println("=========Другие операции с Double:=========");
        System.out.println("1) Умножение двух рандомных чисел: " + randomDouble1 + " * (" + randomDouble2 + ") = " + otherOpDouble1);
        System.out.println("2) Деление двух рандомных чисел " + randomDouble1 + " / (" + randomDouble2 + ") = " + otherOpDouble2);

        double otherOpFloat1 = randomFloat1 * randomFloat2;
        double otherOpFloat2 = randomFloat1 / randomFloat2;
        System.out.println("=========Другие операции с Float:=========");
        System.out.println("1) Умножение двух рандомных чисел: " + randomFloat1 + " * (" + randomFloat2 + ") = " + otherOpFloat1);
        System.out.println("2) Деление двух рандомных чисел " + randomFloat1 + " / (" + randomFloat2 + ") = " + otherOpFloat2);
    }

    static void operationsOnDifferentDataTypes() {

        short operationShortByte1 = (short) (randomShort1 + randomByte1);
        short operationShortByte2 = (short) (randomShort1 - randomByte1);
        short operationShortByte3 = (short) (randomShort1 * randomByte1);
        short operationShortByte4 = (short) (randomShort1 / randomByte1);

        System.out.println("=========Операции с Short и Byte:=========");
        System.out.println("1) Сложение числа с типом Short на число с типом Byte: " + randomShort1 + " + " + randomByte1 + " = " + operationShortByte1);
        System.out.println("2) Разность между числом с типом Short и числом с типом Byte: " + randomShort1 + " - " + randomByte1 + " = " + operationShortByte2);
        System.out.println("3) Умножение числа с типом Short на число с типом Byte: " + randomShort1 + " * " + randomByte1 + " = " + operationShortByte3);
        System.out.println("4) Деление числа с типом Short на число с типом Byte: " + randomShort1 + " / " + randomByte1 + " = " + operationShortByte4);


        int operationIntLong1 = (int) (randomInt1 + randomLong1);
        int operationIntLong2 = (int) (randomInt1 - randomLong1);
        int operationIntLong3 = (int) (randomInt1 * randomLong1);
        int operationIntLong4 = (int) (randomInt1 / randomLong1);

        System.out.println("=========Операции с Int и Byte:=========");
        System.out.println("1) Сложение числа с типом Int на число с типом Long: " + randomInt1 + " + " + randomLong1 + " = " + operationIntLong1);
        System.out.println("2) Разность между числом с типом Int и числом с типом Long: " + randomInt1 + " * -" + randomLong1 + " = " + operationIntLong2);
        System.out.println("3) Умножение числа с типом Int на число с типом Long: " + randomInt1 + " * " + randomLong1 + " = " + operationIntLong3);
        System.out.println("4) Деление числа с типом Int на число с типом Long: " + randomInt1 + " / " + randomLong1 + " = " + operationIntLong4);

        double operationDoubleFloat1 = randomDouble1 + randomFloat1;
        double operationDoubleFloat2 = randomDouble1 - randomFloat1;
        double operationDoubleFloat3 = randomDouble1 * randomFloat1;
        double operationDoubleFloat4 = randomDouble1 / randomFloat1;

        System.out.println("=========Операции с Double и Float:=========");
        System.out.println("1) Сложение числа с типом Double на число с типом Float: " + randomDouble1 + " + " + randomFloat1 + " = " + operationDoubleFloat1);
        System.out.println("2) Разность между числом с типом Double и числом с типом Float: " + randomDouble1 + " * -" + randomFloat1 + " = " + operationDoubleFloat2);
        System.out.println("3) Умножение числа с типом Double на число с типом Float: " + randomDouble1 + " * " + randomFloat1 + " = " + operationDoubleFloat3);
        System.out.println("4) Деление числа с типом Double на число с типом Float: " + randomDouble1 + " / " + randomFloat1 + " = " + operationDoubleFloat4);
    }

    static void operationsAboveString() {

        String str1 = "Первая строка ";
        String str2 = "Вторая строка";
        String str3 = str1 + str2;

        System.out.println("=========Конкатенация строк:=========");
        System.out.println("Строка 1 = '" + str1 + "' + строка 2 ='" + str2 + "' = " + str3);

    }
    static void logicalOperations() {
        boolean a1 = (9 > 3 && 12 == 12);
        boolean a2 = (4 < 790 || 34 >= 20);
        boolean a3 = (44 != 32);

        System.out.println("=========Логические операторы:=========");
        if (a1) {
            System.out.println("'>' и '&&' и '=='");
        } else if (a2) {
            System.out.println("'<' и '||' и '>='");
        } else if (a3) {
            System.out.println("'!='");
        }
    }

    static void arrays() {
        int[] array1 = new int[] {2, 4, 7, 33, 44};
        System.out.println("=========Массив:=========");
        System.out.println("Массив 'array1' = " + Arrays.toString(array1));

    }
}
