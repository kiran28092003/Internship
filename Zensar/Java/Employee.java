package com.abc;

public class Employee {
		int emp_id;
		String name;
		int salary;
		public Employee(){
			
		}
		
		public Employee(int emp_id, String name, int salary) {
			this.emp_id = emp_id;
			this.name = name;
			this.salary = salary;
		}

		public int getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
}
