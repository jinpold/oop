package serviceImpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {

    // 싱글톤 패턴 시작

    private static UtilService instance = new UtilServiceImpl();
    private UtilServiceImpl(){}

    public static UtilService getInstance(){
        return instance;
    }
    // 싱글톤 패턴 종료

    @Override
    public int createRandomInteger(int start, int gapBetweenStartAndEnd) {
        // 0이상 50만의 값을 생성하고 150을 더해줌으로써 키의 범위를 150이상 200미만으로 만듦
        return start + (int)(Math.random() * gapBetweenStartAndEnd);
    }

    @Override
    public double createRandomDouble(double start, double gapBetweenStartAndEnd) {
        return Math.round((start + Math.random() * gapBetweenStartAndEnd)*10/10);
    }
}
