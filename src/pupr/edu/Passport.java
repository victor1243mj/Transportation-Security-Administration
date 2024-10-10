package pupr.edu;

public class Passport {

	
	private String passportNo;
	private String surName;
	private String name;
	private String nationality;
	private String dobString;
	private String photo;
	private String sex;
	private String placeOfBirth;
	private String dateOfIssue;
	private String dateOfExpiration;
	

	public Passport() {
	
	}


	public Passport(String passportNo, String surName, String name, String nationality,String dob, String phot, String sex,
			String placeOfBirth, String dateOfIssue, String dateOfExpiration) {
		setPassportNo(passportNo);
	    setSurName(surName);
	    setName(name);
	    setNationality(nationality);
	    setDobString(dob);
	    setPhoto(phot);
	    setSex(sex);
	    setPlaceOfBirth(placeOfBirth);
	    setDateOfIssue(dateOfIssue);
	    setDateOfExpiration(dateOfExpiration);
	}

private void setPhoto(String phot) {
		// TODO Auto-generated method stub
		photo=phot;
	}


private void setDobString(String dob) {
	dobString=dob;
		
	}


public String getDoubString() {
	return dobString;
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


	public String getPhoto() {
		return photo;
	}


	public void setDateOfBirth(String phot) {
		this.photo = phot;
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
