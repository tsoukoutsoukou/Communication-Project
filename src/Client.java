public class Client {
    private String lastName;
    private String firstName;
    private String phone;
    private String pay;

    //public Client(String s, String s1, String s2){}
    public Client(String lastName,String firstName,String phone, String pay){
        this.lastName=lastName;
        this.firstName=firstName;
        this.phone=phone;
        this.pay=pay;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPay() {
        return pay;
    }

    public String toString() {
        return "lastName=" + lastName +", firstName=" + firstName  +", phone='" + phone +" ,pay="+pay;
    }
}
