public class ques15 {
    int a=10;
    void first(){
        a=20;
    }
    void second(){
        a=30;
    }
    void display(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        ques15 q=new ques15();
        q.first();
        q.second();
        q.display();
    }
}
