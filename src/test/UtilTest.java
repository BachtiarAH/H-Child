/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author zam
 */
public class UtilTest {
    
    
    public static void main(String[] args) {
        test();
    }
    
    
    public static int age(LocalDate date){
        LocalDate now = LocalDate.now();
        System.out.println(now);
       int month =  Period.between(date , now).getMonths();
       return month; 
    }
    
    public static void test(){
        Calendar cal = Calendar.getInstance();
        cal.set(2022, 0, 20);
        Date input = cal.getTime();
LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(date);
    }
}
