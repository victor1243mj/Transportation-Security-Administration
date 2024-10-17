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

    public Passport(String passportNo, String surName, String name, String nationality, String dob, String phot, String sex,
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

    // Método para verificar si un valor está vacío o es nulo
    private void validateField(String field, String fieldName) {
        if (field == null || field.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        validateField(passportNo, "Passport No");
        this.passportNo = passportNo;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        validateField(surName, "Surname");
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateField(name, "Given Name");
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        validateField(nationality, "Nationality");
        this.nationality = nationality;
    }

    public String getDobString() {
        return dobString;
    }

    public void setDobString(String dobString) {
        validateField(dobString, "Date of Birth");
        this.dobString = dobString;
    }

    public String getPhoto() {
        return photo;
    }

    private void setPhoto(String photo) {
        validateField(photo, "Photo");
        this.photo = photo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        validateField(sex, "Sex");
        this.sex = sex;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        validateField(placeOfBirth, "Place of Birth");
        this.placeOfBirth = placeOfBirth;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        validateField(dateOfIssue, "Date of Issue");
        this.dateOfIssue = dateOfIssue;
    }

    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(String dateOfExpiration) {
        validateField(dateOfExpiration, "Date of Expiration");
        this.dateOfExpiration = dateOfExpiration;
    }

    @Override
    public String toString() {
        return "Passport Details:\n" +
               "Passport No: " + passportNo + "\n" +
               "Surname: " + surName + "\n" +
               "Given Name: " + name + "\n" +
               "Nationality: " + nationality + "\n" +
               "Date of Birth: " + dobString + "\n" +
               "Sex: " + sex + "\n" +
               "Place of Birth: " + placeOfBirth + "\n" +
               "Date of Issue: " + dateOfIssue + "\n" +
               "Date of Expiration: " + dateOfExpiration + "\n" +
               "Photo (URL/Path): " + photo;
    }
}

