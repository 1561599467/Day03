public class Test_4 {
    public static void main(String[] args) {
        String str = "J";
        for (int i = 0; i < 5; i++) {
            int key = i % 3;
            switch (key) {
                case 0:
                    str += 'a';
                    break;
                case 2:
                    str += 'V';
                    break;
            }
        }
        System.out.println(str);
    }
}
