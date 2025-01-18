package com.abc;

public class Product {
		int prod_id;
		String prod_name;
		String Prod_Address;
		public Product(int prod_id, String prod_name, String prod_Address) {
			super();
			this.prod_id = prod_id;
			this.prod_name = prod_name;
			Prod_Address = prod_Address;
		}
		public int getProd_id() {
			return prod_id;
		}
		public void setProd_id(int prod_id) {
			this.prod_id = prod_id;
		}
		public String getProd_name() {
			return prod_name;
		}
		public void setProd_name(String prod_name) {
			this.prod_name = prod_name;
		}
		public String getProd_Address() {
			return Prod_Address;
		}
		public void setProd_Address(String prod_Address) {
			Prod_Address = prod_Address;
		}
		@Override
		public String toString() {
			return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", Prod_Address=" + Prod_Address + "]";
		}
		
}
