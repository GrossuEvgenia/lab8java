package petss;
import java.util.Scanner;
import ex.*;
public class pets 
{
	private String name;
	private int age;
	private int wheit;
	private double price;
	public pets ()
	{
		name="no_name";
		age=0;
		wheit=0;
		price=0;
	}
	public pets(String name)
	{
		this.name=name;
		this.age=0;
		this.wheit=0;
		this.price=0;
	}
	public pets(String name, int age, int wheit, double price)throws Ex
	{
		if(age<0||wheit<0||price<0)
		{
		throw  new Ex(1);	
		}
		this.name=name;
		this.age=age;
		this.wheit=wheit;
		this.price=price;
	}
	public void set_name(String name)
	{
		this.name=name;
	}
	public String get_name()
	{
		return this.name;
	}
	public void set_age(int age)
	{
		this.age=age;
	}
	public int get_age()
	{
		return this.age;
	}
	public void set_wheit(int wheit)
	{
		this.wheit=wheit;
	}
	public int get_wheit()
	{
		return this.wheit;
	}
	public void set_price(double price)
	{
		this.price=price;
	}
	public double get_price()
	{
		return this.price;
	}
	public void input()
	{	Scanner in = new Scanner(System.in);
		System.out.println("Enter pet's name");
		name=in.nextLine();
		try{
		System.out.println("Enter pet's age");
		age=in.nextInt();}
		catch(Exception e){
			System.out.println("NOT DIGIT!!! - press any key");
			in.next();
		}
		try{
		System.out.println("Enter pet's wheit");
		wheit=in.nextInt();}
		catch(Exception e){
			System.out.println("NOT DIGIT!!! - press any key");
			
		}
		
		try{
		System.out.println("Enter pet's price");
		price=in.nextDouble();}
		catch(Exception e){
			System.out.println("NOT DIGIT!!! - press any key");
			
		}
	}
	public void output_pets()
	{
		System.out.println("pet's name "+name+" pet's age "+ age+" pet's wheit "+wheit+" pet's price "+price);		
	}
	public double add_price(double sum)
	{
		sum+=this.price;
		System.out.println("Total price: " + sum);
		return sum;
	}
}