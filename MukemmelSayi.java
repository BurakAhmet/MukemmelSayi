import java.util.Scanner;
public class MukemmelSayi {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		System.out.println("Mükemmel olup olmadığını öğrenmek istediğiniz sayıyı giriniz");
		var num = in.nextInt();
		in.close();
		var isPerfect = false;
		var total=0;
		for(var i=1; i<num-2; i++)
		{
			if(num%i==0)
			{
				total+=i;
				if(total==num)
				{
					isPerfect=true;
				}
			}
		}
		if(isPerfect)
		{
			System.out.println("Sayı mükemmeldir");
		}
		else
		{
			System.out.println("Sayı mükemmel değildir");
		}
	}
}