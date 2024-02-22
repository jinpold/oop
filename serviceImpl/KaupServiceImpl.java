package serviceImpl;

import service.KaupService;
import service.UtilService;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl() {
    }

    public static KaupService getInstance(){
        return instance;
    }

    @Override
    public double createBmi() {
        return 0;
    }

    @Override
    public String createBodyMass() {
        return "";
    }
}


