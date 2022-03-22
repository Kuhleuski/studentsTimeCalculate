package com.kuhleuski;

public class ThirdTypeStudentCalculate extends Student implements Calculable {


    public ThirdTypeStudentCalculate(int type) {
        super(type);
        setSpeedOfLearning(3);
        setPracticeClasses(true);
        setAnalysisClasses(false);
        setInSchoolClasses(false);
        countDisciplines();
    }
}