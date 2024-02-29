package builder;

import model.UserDto;

public class UserBuilder {
    private String userName;
    private String password;
    private String checkPassword;
    private String name;
    private String personNumber;
    private String phoneNumber;
    private String address;
    private String job;

    private double height;

    private double weight;

    public UserBuilder userName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder checkPassword(String checkPassword) {
        this.checkPassword = checkPassword;
        return this;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder personNumber(String personNumber) {
        this.personNumber = personNumber;
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder job(String job) {
        this.job = job;
        return this;
    }

    public UserBuilder height(double height) {
        this.height = height;
        return this;
    }

    public UserBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    public UserDto build(){
        return new UserDto(userName, password, checkPassword, name, personNumber,
                phoneNumber, address, job, height, weight);
    }
}
