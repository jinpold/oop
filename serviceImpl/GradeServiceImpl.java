package serviceImpl;

import model.SubjectDto;
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
    public int getTotalScore(SubjectDto subjectDto) {
        int totalScore = (subjectDto.getKorean() +
                subjectDto.getEnglish() + subjectDto.getMath());
        return totalScore;
    }
    @Override
    public double findAverage(int totalScore) {
        double avg = totalScore/3;
        return avg;
    }
}
