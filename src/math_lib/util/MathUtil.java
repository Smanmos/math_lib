public class MathUtil {
    private MathUtil() {
        // Prevent instantiazation
    }
    /**
    * Returns the greatest common divisor d of a and b;
    * In other words, returns an integer d, where:
    * d | a, d | b,
    * whenever d' | a and d' | b, d' | d
    */
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }

    public static class EEResult {
        public final int x;
        public final int y;
        EEResult(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    /**
    * Returns two integers (x, y) satisfying a*x + b*y = gcd(a, b)
    */
    public static EEResult extendedEuclid(int a, int b){
        if (a < 0){
            EEResult res = extendedEuclid(-a, b);
            return new EEResult(-res.x, res.y);
        }
        if (b == 0){
            return new EEResult(1, 0);
        }
        else if (b < 0){
            EEResult res = extendedEuclid(a, b);
            return new EEResult(res.x, -res.y);
        }
        else{
            EEResult res = extendedEuclid(b, a % b);
            // bx + (a%b)y = gcd
            // bx + (a%b + b(a/b) - b(a/b))y = gcd
            // bx + (a - b(a/b))y = gcd
            // bx + ay - b(a/b)y = gcd
            // ay + b(x - (a/b)y) = gcd
            return new EEResult(res.y, res.x - a / b * res.y);
        }
    }
}
