public class ques10 {
    int a=10;
    static int b=20;
    void display(){
        int c=30;
        System.out.println("instance var: "+a);
        System.out.println("Static var: "+b);
        System.out.println("local var: "+c);
    }
    public static void main(String[] args) {
        ques10 q=new ques10();
        q.display();
    }
}
