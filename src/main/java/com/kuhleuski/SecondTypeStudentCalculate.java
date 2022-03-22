package com.kuhleuski;

public class SecondTypeStudentCalculate extends Student implements Calculable {

    public SecondTypeStudentCalculate(int type) {
        super(type);
        setSpeedOfLearning(2);
        setPracticeClasses(true);
        setAnalysisClasses(true);
        setInSchoolClasses(false);
        countDisciplines();

    }
}
