
public class Member {
	private String School;
	private String firstname;
	private String lastname;
	private int grade;
	private java.util.Date dateCreated;

	protected Member() {
		dateCreated = new java.util.Date();
	}

	public Member(String School, String firstname, String lastname, int grade) {
		dateCreated = new java.util.Date();
		this.School =School;
		this.firstname = firstname;
		this.lastname = lastname;
		this.grade = grade;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String School) {
		this.School = School;
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
		this.lastname =lastname;
	}
	public int getgrade() {
		return grade;
	}
	public void setgrade( int grade) {
		this.grade = grade;
	}
	public java.util.Date getDateCreated() {
		return  dateCreated;
	}
	public String toString() {
		return "created on" + dateCreated;
	}
}
