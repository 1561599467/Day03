public class Test_3 {
    public static void main(String[] args) {
        int jj = 20;
        int a = 0;
        int b = 0;
        for (int ii = 0; ii < jj; ii += 2, jj--) {
            if (ii % 3 == 0) {
                a = ii;
                System.out.println(ii + " " + "Hello");
            } else {
                b = jj;
                System.out.println(ii + "   " + "World");
            }
        }
        ;
        System.out.println("a*b的值:" + a + "*" + b + "=" + (a * b));
    }
}
