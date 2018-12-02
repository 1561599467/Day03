public class Demo_2 {
    public static void main(String[] args) {
        qiuHe();
        yuJu();
    }

    public static void qiuHe() {
        int sum = 0;
        for (int a = 12; a <= 20; a++) {
            if (a % 2 == 0) {
                sum += a;
            }


        }
        System.out.println(sum);

        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println(sum);
    }

    public static void yuJu() {
        for (int a = 1; a > 0; a++) {
            System.out.println("我想要第" + a + "个");
            if (a == 20) {
                break;
            }
        }

        do {
            System.out.println("无条件执行一次");
        } while (false);

        int score = 60;
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 60 && score < 90) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
    }
}
