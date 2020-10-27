package shop;
import petss.*;
import tax_s.tax;
public class zooshop
{	private static final int LEN = 100;
	private static final int proc = 2;
	private int col;
	private double income;
	private double damages;
	final int PRICE=10;
	private static double price_feed=10; //for 8 lab
	private pets[] pet = new pets[LEN];
		
	public zooshop(int col, double income, double damages, pets[] pet)
	{
		this.col=col;
		this.income=income;
		this.damages=damages;
		for(int i=0; i<col; i++)
		{
			this.pet[i]=pet[i];
		}
	}
	public zooshop(int col, double income, double damages, pets pet)
	{
		this.col=col;
		this.income=income;
		this.damages=damages;
		for(int i=0; i<col; i++)
		{
			this.pet[i]=pet;
		}
	
	}
	public void set_col(int col)
	{
		this.col=col;
	}
	public int get_col()
	{
		return this.col;
	}
	public void set_income(double income)
	{
		this.income=income;
	}
	public double  get_income()
	{
		return this.income;
	}
	public void set_damages(double damages)
	{
		this.damages=damages;
	}
	public double get_damages()
	{
		return this.damages;
	}
	public static void set_price_feed(double pricefeed)
	{
	price_feed=pricefeed;
	}
	public static double get_price_feed()
	{
		return price_feed;
	}
	public void read()
	{
		System.out.println("The numbers of pets : " +col);
		System.out.println("Store profit is " +income);
		System.out.println("Store damages is " +damages);
		System.out.println("Food price is " +price_feed);
	}
	public void output()
	{
		System.out.println("The numbers of pets : " +col+" store profit is " +income+" store damages is " +damages +" food price is " +price_feed);
		for(int i=0; i<col; i++)
		{
		
		System.out.println("Enter pet's name "+pet[i].get_name()+" pet's age "+ pet[i].get_age()+" pet's wheit "+pet[i].get_wheit()+" pet's price "+pet[i].get_price());		
		System.out.println();
		}
		
	}
	public void feeding()
	{
		int w;
		for(int i=0; i<col; i++)
		{
		this.pet[i].set_wheit(pet[i].get_wheit()+1);	
		this.damages += this.price_feed;
		}
		System.out.println("Pet is fed");
	}
	public void sale()
	{
		for(int i=0; i<=col; i++)
		{
			this.income+=this.pet[i].get_price();
			this.col-=1;
		}
		System.out.println("Pet's sold");
	}
	public void income()
	{ pets p = new 	pets("no_name",0,0,0);
	  p.input();
	  pet[col]=p;
	  col++;
		
	}
	public void taxax(tax s)
	{
		s.taxa=(int)income*proc;
	}
	public void found(String names)
	{
		int res=0;
		for(int i=0; i<col; i++)
		{
			res = names.compareTo(pet[i].get_name());
				if(names=="123")
			{
				System.out.println("Pet found\n");
				break;
			}
		}
		if(res==1)
		{
			System.out.println("Pet didn't found\n");
		}
	}
	//for 8 lab
	public static void compare(zooshop s1, zooshop s2)
	{
		if(s1.get_col()>s2.get_col())
			{
				System.out.println("More animals in first shop\n");
			}
			else if(s2.get_col()>s1.get_col())
			{
				System.out.println("More animals in second shop\n");
			}
			else System.out.println("Store is equals\n");
		
	}
}