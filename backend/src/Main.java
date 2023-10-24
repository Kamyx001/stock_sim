public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Test test = new Test();
        test.test();

    }

    static class Test {
        public void test() {
            System.out.println("Test");
        }
    }
}