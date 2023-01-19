package com.crisil;

public class FirstApp {
		// you can have 3 things
		// 1. Variables, 2.Methods, 3.constructors
		// creating main:public static void main(String[]args)
		// to create main & hit control + space
	public static void main(String[] args) {
		// inside method you can declare local variables
		// inside method you can have if, for ,while,return
		// object creation and many more executable lines
		
		int intValue=20;
		double doubleValue=5200.03;
		String stringValue="Hello Everyone"; //String is class
		
		System.out.println("Int Value= "+intValue);
		System.out.println("Double Value= "+doubleValue);
		System.out.println("String Value="+stringValue);
		// create array in java
		System.out.println("________________________");
		String[] items= {"hey","bonjour","konichiwa"};
		for(String s: items) {
			System.out.println("Items= "+s);
		}
		System.out.println("________________________");
		Employee emp2= new Employee();
		emp2.setId(456);
		emp2.setName("Bruce");
		emp2.setSalary(60000.0);
		
		Employee emp1= new Employee();
		emp1.setId(123);
		emp1.setName("Manan");
		emp1.setSalary(50000.0);
		
		Employee[] employees= {emp1,emp2};
		
		System.out.println("Id= "+emp1.getId());
		System.out.println("Name= "+emp1.getName());
		System.out.println("Salary= "+emp1.getSalary());
		
		for(Employee e:employees)
		{
			System.out.println("Id ="+e.getId());
			System.out.println("Name ="+e.getName());
			System.out.println("Salary ="+e.getSalary());
			System.out.println("________________________");
		}
		// Abstraction Hides Complexity From The End User
		
		System.out.println("--First way of calling methods---");
		DBOperation dbOperation= new OracleDbImpl();
		dbOperation.store();
		dbOperation.delete();
		System.out.println("--Second way of calling methods---");
		DBOperation dbOperation2=FactoryPattern.getDBInstance();
		dbOperation2.store();
		dbOperation2.delete();
	}
}
