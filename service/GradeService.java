package service;

import model.SubjectDto;

public interface GradeService {

    public int getTotalScore(SubjectDto subjectDto);
    public double findAverage(int totalScore);

}
