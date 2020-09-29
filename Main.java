import java.util.Scanner;
import shop.zooshop;
import petss.pets;

public class Main
{
	public static void main (String[] args)
	{	final int LEN=100;
		final int PRICE=10;
		
		 Scanner in = new Scanner(System.in);
		 pets pet = new pets("no_name",0,0,0);
		 pet.input();
		 double sum=0;
		 sum=pet.add_price(sum);
		 zooshop store = new zooshop(1,0,0,PRICE,pet);
		 store.output();
		 store.feeding();
		 store.output();
		 store.sale();
		 store.output();
		 System.out.println("Enter numbers of pets");
		 int col=in.nextInt();
		pets[] pet1 = new pets[LEN];
		for(int i=0; i<col; i++)
		{
			pet1[i] = new pets("no_name",0,0,0);
			pet1[i].input();
			sum=pet1[i].add_price(sum);
		}
		zooshop store1 = new zooshop(col,0,0,PRICE,pet1);
		store1.output();
		store1.feeding();
		store1.output();
		store1.sale();
		store1.output();
		
	}
}