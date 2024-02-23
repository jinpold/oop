package service;

import model.PersonDto;

public interface KaupService {

    public String createBmi(PersonDto person);
    public String createBodyMass(String bmi);

}
