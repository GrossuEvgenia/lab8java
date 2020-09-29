import java.util.Scanner;
import shop.zooshop;
import petss.pets;

public class Main
{
	public static void main (String[] args)
	{
		 Scanner in = new Scanner(System.in);
		 pets pet = new pets("no_name",0,0,0);
		 pet.input();
		 zooshop store = new zooshop(1,0,0,10,pet);
		 store.output();
		 store.feeding();
		 store.output();
		 store.sale();
		 store.output();
		 int col=in.nextInt();
		pets[] pet1 = new pets[100];
		for(int i=0; i<col; i++)
		{
			pet1[i] = new pets("no_name",0,0,0);
			pet1[i].input();
		}
		zooshop store1 = new zooshop(col,0,0,10,pet1);
		store1.output();
		store1.feeding();
		store1.output();
		store1.sale();
		store1.output();
		
	}
}