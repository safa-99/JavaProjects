package entities;

public class Player   {
		
		private int id;
		private String firstName;
		private String lastName;
		private int yearOfBirth;
		private String nationalIdentityNumber;
		
		
		public Player() {
			
			
		}

		public Player(int id, String firstName, String lastName, int yearOfBirth , String nationalIdentityNumber) {
			
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.yearOfBirth = yearOfBirth;
			this.nationalIdentityNumber = nationalIdentityNumber;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public int getYearOfBirth() {
			return yearOfBirth;
		}

		public void setYearOfBirth(int yearOfBirth) {
			
			this.yearOfBirth = yearOfBirth;
		}

		public String getNationalIdentityNumber() {
			return nationalIdentityNumber;
		}

		public void setNationalIdentityNumber(String nationalIdentityNumber) {
			this.nationalIdentityNumber = nationalIdentityNumber;
		}
		
		
}
