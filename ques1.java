public class ques1 {
    public static void main(String[] args) {
        Car c1=new Car("Honda Civic",2022);
        Car c2=new Car("Apache",2021);
        c1.display();
        c2.display();
    }
}
class Car{
    String model;
    int year;
    static int numberOfcar=0;
    Car(String model,int year){
        this.model=model;
        this.year=year;
        numberOfcar++;
    }
    void display(){
        System.out.println("model:"+model+"year: "+year);
        System.out.println("total cars:"+numberOfcar);
    }
}