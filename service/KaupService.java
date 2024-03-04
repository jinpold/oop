package service;

import model.User;

public interface KaupService {

    public String createBmi(User person);
    public String createBodyMass(String bmi);

}
