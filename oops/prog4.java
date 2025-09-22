package oops;

public class prog4 {
    static class Product{
        static int discount;
        String productname;
        int price;
        int quantity;

        Product(String productname,int price,int quantity){
            this.productname=productname;
            this.price=price;
            this.quantity=quantity;
        }

        static void updatediscount(int disc){
           
            discount+=disc;
            
            System.out.println("the updated discount is "+Product.discount);
        }
        void realprice(){
            System.out.println("the total price is "+this.price*this.quantity);
            
        }
        void updatedprice(){
            System.out.println("updated price is "+((this.price*this.quantity)-(this.price*this.quantity)*discount/100));


        }
    }
    public static void main(String[] args) {
        Product p1 = new Product("clothes", 200, 3);
        p1.updatediscount(10);
        p1.realprice();
        p1.updatedprice();
        System.out.println(p1 instanceof Product);
    }
    
}

