public class ques8 {
    static int count;
    static{
        System.out.println("static block");
        count=10;
    }
    public static void main(String[] args) {
        System.out.println("count is "+count);
    }
}
