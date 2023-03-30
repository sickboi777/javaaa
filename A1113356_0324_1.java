import java.util.Scanner;

class animal
{
	String name;
	double height;
	int weight;
	int velocity;

	void show()
	{
		System.out.println("name : " + name + "\theight : " + height + "\tweight : " + weight + "\tvelocity : " + velocity);
	}

	int distance(int x,double y)
	{
		int d = x * (int) y * velocity;
		return d;
	}
}

public class A1113356_0324_1
{	
	public static void main(String[]argv)
	{
		animal olaf = new animal();
		animal dunkey = new animal();
		animal anna = new animal();
		animal elsa = new animal();
	
		olaf.name = "雪寶";
		olaf.height = 1.1;
		olaf.weight = 52;
		olaf.velocity = 100;

		dunkey.name = "驢子";
		dunkey.height = 1.5;
		dunkey.weight = 99;
		dunkey.velocity = 200;

		anna.name = "安娜";
		anna.height = 1.7;
		anna.weight = 48;
		anna.velocity = 120;

		elsa.name = "艾莎";
		elsa.height = 1.7;
		elsa.weight = 50;
		elsa.velocity = 120;

		olaf.show();
		dunkey.show();
		anna.show();
		elsa.show();

		System.out.println("輸入時間 : ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		double a;
		System.out.println("是否輸入加速度值？ 輸入Ｙ/Ｎ：");
		String input = sc.next();
		if(input.equals("Y")||input.equals("y"))
		{
			System.out.println("輸入加速度值：");
			a = sc.nextDouble();
		}else{
			a = 1.0;
		}

		int rd1 = olaf.distance(t,a);
		int rd2 = dunkey.distance(t,a);
		int rd3 = anna.distance(t,a);
		int rd4 = elsa.distance(t,a);

		System.out.println("雪寶跑了" + rd1+ "M");
		System.out.println("驢子跑了" + rd2+ "M");
		System.out.println("安娜跑了" + rd3+ "M");
		System.out.println("艾莎跑了" + rd4+ "M");

	}
}