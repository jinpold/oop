package service;

import model.UserDto;

public interface KaupService {

    public String createBmi(UserDto person);
    public String createBodyMass(String bmi);

}
