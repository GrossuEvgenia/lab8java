import java.util.Scanner;
import shop.zooshop;
import petss.pets;
import tax_s.tax;
import ex.Ex;
public class Main
{
	public static void main (String[] args) throws Exception
	{	final int LEN=100;
		
		
		 
		 Scanner in = new Scanner(System.in);
		
		 

		 System.out.println("Enter names pet\n");
		 String s = in.nextLine();
		 pets pet = new pets("kisa",1,4,5);//constructor with all value
		 System.out.println("for class pets: constructor with all value");
		 pet.output_pets();
		 pets pet9=new pets();//constructor without value
		 System.out.println("for class pets: constructor without value");
		 pet9.output_pets();
		 pets pet91 = new pets("cota");//constructor with one value
		 System.out.println("for class pets: constructor with one value");
		 pet91.output_pets();
		 //array from constructor with one value
		 pets [] pet92 = new pets[2];
		 for(int i=0; i<2; i++)
		 {
			 pet92[i]=new pets("bobik");
		 }
		 
		 pet.input();
		 double sum=0;
		 sum=pet.add_price(sum);
		 zooshop store = new zooshop(1,0,0,pet);//constructor with one pet
		 System.out.println("for class zooshop: constructor with one pet");
		 store.output();
		 store.feeding();
		 store.output();
		 store.sale();
		 store.output();
		 tax t= new tax();
		 store.taxax(t);
		 double t1=t.taxa;
		 System.out.println("Store tax is "+ t1);
		 
		 
		 System.out.println(" array : constructor with one value");
		 zooshop for_array= new zooshop(2,0,0,pet92);
		 for_array.output();
		 
		 
		 System.out.println("Enter numbers of pets");
		 int col=in.nextInt();
		pets[] pet1 = new pets[LEN];
		for(int i=0; i<col; i++)
		{
			pet1[i] = new pets("no_name",0,0,0);
			pet1[i].input();
			sum=pet1[i].add_price(sum);
		}
		zooshop store1 = new zooshop(col,0,0,pet1);//constructor with array pet
		System.out.println("for class zooshop: constructor with array pet");
		store1.output();
		//for 8 labaratory
		zooshop store8 = new zooshop(1,0,0,pet);
		zooshop.compare(store1, store8);
		zooshop.set_price_feed(15);
		System.out.println("New feed price"+zooshop.get_price_feed()+"\n"); 
		

		store1.feeding();
		store1.output();
		store1.found(s);
		store1.sale();
		store1.output();
		store1.income();
		store1.output();
		 pets pet10 = new pets("forerror",-1,0,0);
		
	}
}