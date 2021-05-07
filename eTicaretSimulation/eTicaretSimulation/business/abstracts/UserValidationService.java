package eTicaretSimulation.business.abstracts;

import  eTicaretSimulation.entities.concretes.User;

public interface UserValidationService {
    boolean validate(User user);
}
