package oops;
 
public class prog3 {
    static class Company{
        static String compname;
        static int NoOfEmployees=0;
        final int  empid;
        String designation;

        Company(String compname,int empid,String designation){
            this.compname=compname;
            this.empid=empid;
            this.designation=designation;
            NoOfEmployees++;
        }
        public void displayTotalEmployees(){
            System.out.println(NoOfEmployees);
        }
    }public static void main(String[] args) {
        Company c1 = new Company("TCS", 20, "entrylevel");
        Company c2 = new Company("INfosys", 21, "mid level");
        c1.displayTotalEmployees();
    }
}

