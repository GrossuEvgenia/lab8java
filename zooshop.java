package shop;
import petss.*;
public class zooshop
{
	private int col;
	private double income;
	private double damages;
	private double price_feed;
	private pets[] pet = new pets[100];
		
	public zooshop(int col, double income, double damages, double price_feed, pets[] pet)
	{
		this.col=col;
		this.income=income;
		this.damages=damages;
		for(int i=0; i<col; i++)
		{
			this.pet[i]=pet[i];
		}
	}
	public zooshop(int col, double income, double damages, double price_feed, pets pet)
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
	public void set_price_feed(double price_feed)
	{
		this.price_feed=price_feed;
	}
	public double get_price_feed()
	{
		return this.price_feed;
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
		System.out.println("The numbers of pets : " +col);
		System.out.println("Store profit is " +income);
		System.out.println("Store damages is " +damages);
		System.out.println("Food price is " +price_feed);
		for(int i=0; i<col; i++)
		{
		
		System.out.println("Enter pet's name "+pet[i].get_name());
		System.out.println("Enter pet's age "+ pet[i].get_age());
		System.out.println("Enter pet's wheit "+pet[i].get_wheit());
		System.out.println("Enter pet's price "+pet[i].get_price());		
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
			this.damages= this.damages-this.price_feed;
			this.col-=1;
		}
		System.out.println("Pet's sold");
	}
}