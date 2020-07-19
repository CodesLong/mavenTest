import java.util.Random;

public class Test {
    @org.junit.Test
    public void Test1() {
        System.out.println("hello maven");

        int total = 0;
        while (true){

            int r  = new Random().nextInt(1000);
            if (r % 30 == 0){
                System.out.println(r +"能被30整除，推出");
                break;
            }else {
                System.out.println(r + "不能被30整除");
            }
            total += 1;
        }
        System.out.println("总共循环了："+ total);

    }
}
