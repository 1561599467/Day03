public class Demo_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i <= 10; ++i) {

            if (i % 2 == 0) {
                sum -= i;//sum = sum + i
            }

        }

        System.out.println(sum);
    }
}
