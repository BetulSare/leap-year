
package leap.year;

import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year=scan.nextInt();
        if((year%100==0&&year%400!=0)||year%4!=0){
            System.out.printf("%s is not leap year.",year);
        }else{
        if(year%4==0){
            System.out.printf("%s is  leap year.",year);
        }
            }
        
    }
    
}
