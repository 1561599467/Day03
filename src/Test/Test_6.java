public class Test_6 {
    public static void main(String[] args) {
        int count = 0;
        double h = 0.0001;
        for (h = 0.0001; h <= 8848; count++) {
            h *= 2;
        }
        System.out.println(count);
    }
}
