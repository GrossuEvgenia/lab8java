import java.util.Scanner;
import shop.zooshop;
import petss.pets;
import tax_s.tax;
public class Main
{
	public static void main (String[] args)
	{	final int LEN=100;
		
		
		 
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter names pet\n");
		 String s = in.nextLine();
		 pets pet = new pets("no_name",0,0,0);
		 pet.input();
		 double sum=0;
		 sum=pet.add_price(sum);
		 zooshop store = new zooshop(1,0,0,pet);
		 store.output();
		 store.feeding();
		 store.output();
		 store.sale();
		 store.output();
		 tax t= new tax();
		 store.taxax(t);
		 double t1=t.taxa;
		 System.out.println("Store tax is "+ t1);
		 
		 
		 
		 
		 System.out.println("Enter numbers of pets");
		 int col=in.nextInt();
		pets[] pet1 = new pets[LEN];
		for(int i=0; i<col; i++)
		{
			pet1[i] = new pets("no_name",0,0,0);
			pet1[i].input();
			sum=pet1[i].add_price(sum);
		}
		zooshop store1 = new zooshop(col,0,0,pet1);
		//for 8 labaratory
		zooshop store8 = new zooshop(1,0,0,pet);
		zooshop.compare(store1, store8);
		zooshop.set_price_feed(15);
		System.out.println("New feed price"+zooshop.get_price_feed()+"\n"); 
		
		store1.output();
		store1.feeding();
		store1.output();
		store1.found(s);
		store1.sale();
		store1.output();
		store1.income();
		store1.output();
		
	}
}