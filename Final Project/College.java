
public class College extends Member {
	private String firstname;
	private String lastname;
	private int grade;
	
	 public College() {
		
	}
		public College(String firstname, String lastname, int grade) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.grade = grade;
		}

		public String getfirstname() {
			return firstname;
		}
		public void setfirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getlastname() {
			return lastname;
		}
		public void setlastname(String lastname) {
			this.lastname = lastname;
		}
		public int getgrade() {
			return grade;
		}
		public void setgrade(int grade) {
			this.grade = grade;
		}
		public String toString() {
			return "First name:" + firstname + "\tLast name:" + lastname + "\tGrade:" + grade;
		}
}
