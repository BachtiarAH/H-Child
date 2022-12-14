package polije.util;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zam
 */
public class HelperClass {
    
    
    
    public static LocalDate convertToLocalDateViaSqlDate(Date dateToConvert) {
    return new java.sql.Date(dateToConvert.getTime()).toLocalDate();
}
}
