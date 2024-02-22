package serviceImpl;

import service.GradeService;
import service.KaupService;

public class GradeServiceImpl implements GradeService {

    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl() {
    }

    public static GradeService getInstance(){
        return instance;
    }


    @Override
    public int getTotalScore() {
        return 0;
    }
    @Override
    public double findAverage() {
        return 0;
    }
}
