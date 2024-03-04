package service;

import model.Subject;

public interface GradeService {

    public int getTotalScore(Subject subjectDto);
    public double findAverage(int totalScore);

}
