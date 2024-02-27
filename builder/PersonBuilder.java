package builder;

import model.PersonDto;

public class PersonBuilder {
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

    public PersonBuilder userName(String userName) {
        this.userName = userName;
        return this;
    }

    public PersonBuilder password(String password) {
        this.password = password;
        return this;
    }

    public PersonBuilder checkPassword(String checkPassword) {
        this.checkPassword = checkPassword;
        return this;
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder personNumber(String personNumber) {
        this.personNumber = personNumber;
        return this;
    }

    public PersonBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder job(String job) {
        this.job = job;
        return this;
    }

    public PersonBuilder height(double height) {
        this.height = height;
        return this;
    }

    public PersonBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    public PersonDto build(){
        return new PersonDto(userName, password, checkPassword, name, personNumber,
                phoneNumber, address, job, height, weight);
    }
}
