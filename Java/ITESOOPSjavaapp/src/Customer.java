
public class Customer {
		public int id; // identity
		//state
		private String firstname;
		private String lastname;
		private String middlename;
		public String address;
		public String email;
		public String mobileno;
		public double amount;
		public char gender;
		
		public Customer() {
			
		}
		public Customer(String firstName, String lastName, String middleName) {
			// TODO Auto-generated constructor stub
			this.firstname=firstName;
			this.lastname=lastName;
			this.middlename=middleName;
			
		}


		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
//		public String getFirstname() {
//			return firstname;
//		}
//		public void setFirstname(String firstname) {
//			this.firstname = firstname;
//		}
//		public String getLastname() {
//			return lastname;
//		}
//		public void setLastname(String lastname) {
//			this.lastname = lastname;
//		}
//		public String getMiddlename() {
//			return middlename;
//		}
//		public void setMiddlename(String middlename) {
//			this.middlename = middlename;
//		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobileno() {
			return mobileno;
		}
		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}


}
