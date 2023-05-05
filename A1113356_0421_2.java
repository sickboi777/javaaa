import java.util.*;

public class A1113356_0421_2
{
	public static void main(String[]argv)
	{
		Scanner sc = new Scanner;

		System.out.println("Please enter the date in the format of YYYY/MM/DD or MM/DD/YYYY");
		String date = sc.next();

		if(date.matches("[0-9]{4}[/]{1}[0-9]{2}[/]{1}[0-9]{2}")||date.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
		{
			int year = 0, mouth = 0, day = 0;
			String[]part =date.spilt("/");

			if (parts[0].length() == 4){
            	year = Integer.parseInt(parts[0]);
            	month = Integer.parseInt(parts[1]);
            	day = Integer.parseInt(parts[2]);
            } else {
                year = Integer.parseInt(parts[2]);
                month = Integer.parseInt(parts[0]);
                day = Integer.parseInt(parts[1]);
            }

        	if (year > 0 && month > 0 && month <= 12 && day > 0) {
                if (month == 2) {
                	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {      //是閏年
                        if (day > 29) {
                            System.out.println("There's no " + day + " in " + month);
                            return;
                        }
                    } else {
                        if (day > 28) {
                            System.out.println("There's no " + day + " in " + month);
                            return;
                        }
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 30) {
                        System.out.println("There's no " + day + " in " + month);
                        return;
                    }
                } else {
                    if (day > 31) {
                        System.out.println("There's no " + day + " in " + month);
                        return;
                    }
                }
                System.out.println(date);
            }
        }
        else{
        	System.out.println("wrong format");
        }
	}
}
