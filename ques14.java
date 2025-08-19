
public class ques14 {
    String name;
    void setname(String name){
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        ques14 q=new ques14();
        q.setname("Gunjan Sirohi");
        q.display();
    }
}