public class oddEven {
    int num;

    void check(int num) {
        this.num = num;

        if (num % 2 != 0) {
            System.out.println("true is odd");
        } else {
            System.out.println("false is even");
        }
    }
}