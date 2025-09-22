package oops;

public class prog2 {
    static class Book{
        static String libname = "CENTRAL LIBRARY";
        String title;
        String author;
        final double isbn= 134543;

        Book(String title,String author){
            this.title=title;
            this.author=author;
            
        }
        static void libname(){
            System.out.println("library name is "+Book.libname);
        }

    }
    public static void main(String[] args) {
        Book b1 = new Book("the great man", "shakespeare");
        b1.libname();
        System.out.println(b1 instanceof Book);
    }
    
}
