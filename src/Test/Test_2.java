public class Test_2 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;

        method();
        System.out.println("---------------");
        method1();
        System.out.println("---------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void method(){
        int a = -5;
        int b = --a;
        if (a % 2 == 0){
            a = ++b;
        }else{
            b = --a;
        };
        System.out.println(a);
        System.out.println(b);
    }
    public static void method1(){
        int a = 0;
        while (a <= 5){
            for (int b = 1;b <= 5;b++){
                System.out.print(b + " ");
            }
            System.out.println();
            a++;
        };
    }
}
