class A {
    static int x = 10;
}

class ques13 {
    public static void main(String[] args) {
        System.out.println( A.x);
        A.x = 50;
        System.out.println( A.x);
    }
}
