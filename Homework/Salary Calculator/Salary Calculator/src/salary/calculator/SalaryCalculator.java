package salary.calculator;

import java.util.Scanner;

/**
 * @author Josh McIntyre
 * Purpose: Calculates salary
 */
public class SalaryCalculator {

    public static void main(String[] args) {
        
        //Declare Variables
        Scanner scanner = new Scanner(System.in);
        String empl1Nm, empl2Nm, empl3Nm;
        double empl1Rt, empl2Rt, empl3Rt, empl1Work, empl2Work, empl3Work, empl1Total, empl2Total, empl3Total;
        
        //Employee 1
        empl1Total = 0;
        System.out.print("Please input the name of employee 1: ");
        empl1Nm = scanner.next();
        System.out.print("\nPlease input " + empl1Nm + "'s hourly rates as a decimal: ");
        empl1Rt = scanner.nextDouble();
        System.out.print("\nPlease input " + empl1Nm + "'s amount of hours worked last week: ");
        empl1Work = scanner.nextDouble();
        System.out.println(empl1Nm + " worked " + empl1Work + " last week.");
        
        if (empl1Work <= 40) {
            empl1Total = empl1Work*empl1Rt;
            System.out.println("\nThe gross pay for " + empl1Nm + " is $" + empl1Total);
        }
        
        if (empl1Work > 40) {
            empl1Total = (empl1Work*empl1Rt)-((empl1Work%40) * empl1Rt);
            empl1Total = empl1Total + (empl1Work%40)*(empl1Rt*1.5);
            System.out.println("\nThe gross pay for " + empl1Nm + " is $" + empl1Total);
        }
        
        //Employee 2
        empl2Total = 0;
        System.out.print("Please input the name of employee 2: ");
        empl2Nm = scanner.next();
        System.out.print("\nPlease input " + empl2Nm + "'s hourly rates as a decimal: ");
        empl2Rt = scanner.nextDouble();
        System.out.print("\nPlease input " + empl2Nm + "'s amount of hours worked last week: ");
        empl2Work = scanner.nextDouble();
        System.out.println(empl2Nm + " worked " + empl2Work + " last week.");
        
        if (empl2Work <= 40) {
            empl2Total = empl2Work*empl2Rt;
            System.out.println("\nThe gross pay for " + empl2Nm + " is $" + empl2Total);
        }
        
        if (empl2Work > 40) {
            empl2Total = (empl2Work*empl2Rt)-((empl2Work%40) * empl2Rt);
            empl2Total = empl2Total + ((empl2Work%40)*(empl2Rt*1.5));
            System.out.println("\nThe gross pay for " + empl2Nm + " is $" + empl2Total);
        }
        
        //Employee 3
        empl3Total = 0;
        System.out.print("Please input the name of employee 3: ");
        empl3Nm = scanner.next();
        System.out.print("\nPlease input " + empl3Nm + "'s hourly rates as a decimal: ");
        empl3Rt = scanner.nextDouble();
        System.out.print("\nPlease input " + empl3Nm + "'s amount of hours worked last week: ");
        empl3Work = scanner.nextDouble();
        System.out.println(empl3Nm + " worked " + empl3Work + " last week.");
        
        if (empl3Work <= 40) {
            empl3Total = empl3Work*empl3Rt;
            System.out.println("\nThe gross pay for " + empl3Nm + " is $" + empl3Total);
        }
        
        if (empl3Work > 40) {
            empl3Total = (empl3Work*empl3Rt)-((empl3Work%40) * empl3Rt);
            empl3Total = empl3Total + ((empl3Work%40)*(empl3Rt*1.5));
            System.out.println("\nThe gross pay for " + empl3Nm + " is $" + empl3Total);
        }
        
    }
    
}














