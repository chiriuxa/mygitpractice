public class Utils {


    public static int compare2Numb(int x, int y) {

        if (x > y) {
            return x;

        } else {
            return y;
        }
    }


    public static int add2Nums(int a, int b) {
        return a + b;
    }

    public static int add3Nums(int a, int b, int c) {
        return a + b + c;
    }

    public static int addNums(int... args) {
        int result = 0;
        for (int i : args) {
            result += i;
        }

        return result;

    }

    public static String citys(String... args) {

        String result = "";

        for (int i = 0; i < args.length; i++) {
            result += i;
        }
        return result;
    }

    public static int calculateNums (char x, int... args) {
        int result = 0;
        int[] arr = {1};
        switch (x) {
            case '+':
                for (int i = 0; i < args.length; i++) {
                    result += args[i];
                }

        }
        return result;

    }




}