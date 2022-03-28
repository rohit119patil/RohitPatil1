package math;

import java.util.Scanner;

public class Company_Product {
	
	String ProductName;
	long Price;
	int Quantity;
	static String Banner = "Welcome to IMP";
	Scanner S=new Scanner(System.in);
	
	void Input() {
		System.out.print("Enter Product Name: ");
		ProductName = S.next();
		
		System.out.print("Enter Price: ");
		Price = S.nextLong();
	
		System.out.print("Enter Quantity: ");
		Quantity = S.nextInt();
	}
	void Display() {
		System.out.println("Product Nmae ="+ ProductName);
		System.out.println("Price ="+ Price);
		System.out.println("Quantity ="+ Quantity);
	}
	void Calculate() {
		
		String Dis = (Price>3000)?"Get 10% Discount":"Get 9% Discount";
		System.out.println(Dis);
		
	}
	
	public static void main(String[] args) {
		Company_Product p=new Company_Product();
		p.Input();
		p.Display();
		p.Calculate();
		
	}
	}
	