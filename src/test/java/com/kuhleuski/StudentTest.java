package com.kuhleuski;

import junit.framework.TestCase;
import org.junit.Assert;


public class StudentTest extends TestCase {
    Student studentType1 = new FirstTypeStudentCalculate(1);
    Student studentType2 = new SecondTypeStudentCalculate(2);
    Student studentType3 = new ThirdTypeStudentCalculate(3);

    public void testFullTime() {
        studentType1.setSpeedOfLearning(1);
        studentType2.setSpeedOfLearning(2);
        studentType3.setSpeedOfLearning(3);
        studentType1.setSkill(1);
        studentType2.setSkill(0.3);
        studentType3.setSkill(0.8);

        Assert.assertEquals(198,studentType1.fullTime(),1e-9);
        Assert.assertEquals(1320,studentType2.fullTime(),1e-9);
        Assert.assertEquals(742.5,studentType3.fullTime(),1e-9);
    }

    public void testInSchoolTime() {

        Student studentType1 =  new FirstTypeStudentCalculate(1);
        studentType1.setSpeedOfLearning(1);
        studentType1.setSkill(0.5);
        studentType1.fullTime();
        studentType1.setCountClassesForStudent(3);
        studentType1.setInSchoolClasses(true);


        Student studentType2 =  new SecondTypeStudentCalculate(2);
        studentType2.setSpeedOfLearning(2);
        studentType2.setSkill(0.5);
        studentType2.fullTime();
        studentType2.setCountClassesForStudent(2);
        studentType2.setInSchoolClasses(false);


        Student studentType3 =  new ThirdTypeStudentCalculate(3);
        studentType3.setSpeedOfLearning(3);
        studentType3.setSkill(0.5);
        studentType3.fullTime();
        studentType3.setCountClassesForStudent(1);
        studentType3.setInSchoolClasses(false);


        Assert.assertEquals(132,studentType1.inSchoolTime(),1e-9);
        Assert.assertEquals(0.0,studentType2.inSchoolTime(),1e-9);
        Assert.assertEquals(0.0,studentType3.inSchoolTime(),1e-9);
    }

    public void testAnalysisTime() {

        Student studentType1 =  new FirstTypeStudentCalculate(1);
        studentType1.setSpeedOfLearning(1);
        studentType1.setSkill(0.3);
        studentType1.fullTime();
        studentType1.setCountClassesForStudent(3);
        studentType1.setAnalysisClasses(true);


        Student studentType2 =  new SecondTypeStudentCalculate(2);
        studentType2.setSpeedOfLearning(2);
        studentType2.setSkill(0.3);
        studentType2.fullTime();
        studentType2.setCountClassesForStudent(2);
        studentType2.setAnalysisClasses(true);


        Student studentType3 =  new ThirdTypeStudentCalculate(3);
        studentType3.setSpeedOfLearning(3);
        studentType3.setSkill(0.3);
        studentType3.fullTime();
        studentType3.setCountClassesForStudent(1);
        studentType3.setAnalysisClasses(false);


        Assert.assertEquals(220,studentType1.analysisTime(),1e-9);
        Assert.assertEquals(660,studentType2.analysisTime(),1e-9);
        Assert.assertEquals(0.0,studentType3.analysisTime(),1e-9);

    }

    public void testPracticeTime() {

        Student studentType1 =  new FirstTypeStudentCalculate(1);
        studentType1.setSpeedOfLearning(1);
        studentType1.setSkill(0.8);
        studentType1.fullTime();
        studentType1.setCountClassesForStudent(3);
        studentType1.setPracticeClasses(true);


        Student studentType2 =  new SecondTypeStudentCalculate(2);
        studentType2.setSpeedOfLearning(2);
        studentType2.setSkill(0.8);
        studentType2.fullTime();
        studentType2.setCountClassesForStudent(2);
        studentType2.setPracticeClasses(true);


        Student studentType3 =  new ThirdTypeStudentCalculate(3);
        studentType3.setSpeedOfLearning(3);
        studentType3.setSkill(0.8);
        studentType3.fullTime();
        studentType3.setCountClassesForStudent(1);
        studentType3.setPracticeClasses(true);


        Assert.assertEquals(82.5,studentType1.practiceTime(),1e-9);
        Assert.assertEquals(247.5,studentType2.practiceTime(),1e-9);
        Assert.assertEquals(742.5,studentType3.practiceTime(),1e-9);
    }

}