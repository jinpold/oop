package model;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class User {

    //private int id;
    private String username;
    private String password;
    private String checkPassword;
    private String name;
    private String personNumber;
    private String phoneNumber;
    private String address;
    private String job;

    private double height;

    private double weight;

    @Builder(builderMethodName = "builder")
    public User(String username, String password, String checkPassword, String name, String personNumber, String phoneNumber, String address, String job, double height, double weight) {
        this.username = username;
        this.password = password;
        this.checkPassword = checkPassword;
        this.name = name;
        this.personNumber = personNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

