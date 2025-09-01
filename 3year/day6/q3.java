package day6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class q3 {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

    
        System.out.println("Current Date in dd/MM/yyyy : " + today.format(format1));
        System.out.println("Current Date in yyyy-MM-dd : " + today.format(format2));
        System.out.println("Current Date in EEE, MMM dd, yyyy : " + today.format(format3));
    }
}

