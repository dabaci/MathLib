package math;

public class Math {
    // TODO constants

    public static int abs(int x) {
        return x >= 0 ? x : -x;
    }

    public static long abs(long x) {
        return x >= 0 ? x : -x;
    }

    public static double abs(double x) {
        return x >= 0 ? x : -x;
    }

    public static double pow(double base, int power) throws Exception {
        if (base == 0 && power == 0) {
            throw new Exception("pow(0, 0) is undefined.");
        } else {
            double result = 1;
            for (int i = 0; i < abs(power); i++) {
                result *= base;
            }

            return power >= 0 ? result : 1.0 / result;
        }
    }

    // TODO pow for non-integer powers
    public static double pow(double base, double power) {
        return 1;
    }
}
