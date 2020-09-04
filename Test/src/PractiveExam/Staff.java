package PractiveExam;

public class Staff {
    private int idStaff;
    private String name;
    private int age;
    private int phoneNumber;
    private String email;

    public Staff(int idStaff, String name, int age, int phoneNumber, String email) {
        this.idStaff = idStaff;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[Staff]" +
                "id nhân viên: " + idStaff +
                ", tên: '" + name + '\'' +
                ", tuổi: " + age +
                ", sđt: " + phoneNumber +
                ", email " + email + '\'' ;
    }
}
