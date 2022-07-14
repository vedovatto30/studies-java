package useraccount;

public class UserAccount {

    private int id;
    private String userName;
    private String password;
    private int age;
    private String email;
    private String phoneNumber;
    private String gender;
    private String city;
    private String country;
    private Interest interest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getPassword(String password){
        return password;
    }

    public void setPassword(){
        this.password = password;
    }
    public int getAge(int age){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String userName){
        this.city = city;
    }

    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public Interest getInterest(){
        return interest;
    }
    public void setInterest (Interest interest){
        this.interest = interest;
    }


}
