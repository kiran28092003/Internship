package com.abc;

public class EmployeeClass {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee(12, "kiran", 20000);
		e1.setEmp_id(12);
		e1.setName("prachi");
		e1.setSalary(30000);
		System.out.println("Emp_Id is:"+e1.getEmp_id());
		System.out.println("Emp_Name is:"+e1.getName());
		System.out.println("Salary is:"+e1.getSalary());
		System.out.println("Id is:"+e2.getEmp_id());
		System.out.println("Name is:"+e2.getName());
		System.out.println("Salary is:"+e2.getSalary());
	}

}
