import java.util.*;

public class A1113356_0421_1
{
	public static void main(String[]argv) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your email address.");
		String email = sc.next();

        if(email.matches("\\w+[@]{1}[a-z]+[.]{1}[a-z]+[.]*[a-z]*[.]*[a-z]*")){
			System.out.println(":)");
		}else{
			System.out.println("Please enter a valid email");
		}
	}
}
