package serviceImpl;

import service.AuthService;
import service.KaupService;
import service.UtilService;

public class AuthServiceImpl implements AuthService {

    private static AuthService instance = new AuthServiceImpl();
    private AuthServiceImpl(){}

    public static AuthService getInstance(){
        return instance;
    }


    @Override
    public String join() {
        return "";
    }

    @Override
    public String login() {
        return "";
    }
}
