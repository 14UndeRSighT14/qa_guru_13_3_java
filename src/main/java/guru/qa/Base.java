package guru.qa;

public class Base {
    /* Примитивные типы данных */
    boolean bool = false;  // используется постоянно
    char character = 'a';

    byte aByte = -128;
    short aShort = 0;

    int aInt = 0; // используется постоянно
    int[] arr = new int[] {1, 2, 3};

    long aLong = 0;

    float aFloat = 0.0F;
    double aDouble = 0.0; // используется более-менее

    /* Тип данных - класс */
    String aString = "Hello qa.guru";

    void someMethod() {
        int result = 1 + 4;
        int result0 = 1 - 4;
        int result1 = 10 / 3;
        int result2 = 10 % 3;
        int result3 = 10 * 3;

        boolean result4 = ((3 > 2) && (4 > 2));
        boolean result5 = ((3 > 2) || (4 > 2));
        boolean result6 = 3 >= 2;
        boolean result7 = 3 < 2;
        boolean result8 = 3 <= 2;
        boolean result9 = 3 != 2;
        boolean result10 = 3 == 2;
        boolean result11 = !(3 > 2);

        String str = null;

        if (str != null && str.length() == 3) {
            System.out.println(str);
        } else {
            str = "test";
            System.out.println(str);
        }
    }
}
