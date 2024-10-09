package pupr.edu;

public class Passport {

	
	private String passportNo;
	private String surName;
	private String name;
	private String nationality;
	private String dateOfBirth;
	private String sex;
	private String placeOfBirth;
	private String dateOfIssue;
	private String dateOfExpiration;
	

	public Passport() {
		super();
	}


	public Passport(String passportNo, String surName, String name, String nationality,String dob, String dateOfBirth, String sex,
			String placeOfBirth, String dateOfIssue, String dateOfExpiration) {
		super();
		this.passportNo = passportNo;
		this.surName = surName;
		this.name = name;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.placeOfBirth = placeOfBirth;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiration = dateOfExpiration;
	}


	public String getPassportNo() {
		return passportNo;
	}


	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getPlaceOfBirth() {
		return placeOfBirth;
	}


	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}


	public String getDateOfIssue() {
		return dateOfIssue;
	}


	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}


	public String getDateOfExpiration() {
		return dateOfExpiration;
	}


	public void setDateOfExpiration(String dateOfExpiration) {
		this.dateOfExpiration = dateOfExpiration;
	}
	
} 
