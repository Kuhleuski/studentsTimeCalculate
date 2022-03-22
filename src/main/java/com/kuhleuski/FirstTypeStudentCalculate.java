package com.kuhleuski;

public class FirstTypeStudentCalculate extends Student {



    public FirstTypeStudentCalculate(int type) {

        super(type);
        setSpeedOfLearning(1);
        setPracticeClasses(true);
        setAnalysisClasses(true);
        setInSchoolClasses(true);
        countDisciplines();
    }

}
