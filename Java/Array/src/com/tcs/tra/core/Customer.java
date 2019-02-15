package com.tcs.tra.core;




public class Customer {
		
		private String firstname;
		private String lastname;
		private String middlename;
		private Address add;
		
		
		public Customer() {
			
		}


		public Customer(String firstname, String lastname, String middlename,
				Address add) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.middlename = middlename;
			this.add = add;
		}


		public String getFirstname() {
			return firstname;
		}


		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		public String getLastname() {
			return lastname;
		}


		public void setLastname(String lastname) {
			this.lastname = lastname;
		}


		public String getMiddlename() {
			return middlename;
		}


		public void setMiddlename(String middlename) {
			this.middlename = middlename;
		}


		public Address getAdd() {
			return add;
		}


		public void setAdd(Address add) {
			this.add = add;
		}
		


		




}
