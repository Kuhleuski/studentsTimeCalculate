package com.kuhleuski;

import java.text.DecimalFormat;
import java.util.Random;


public class Student implements Calculable {

    private int type;
    private double skill;
    private double speedOfLearning;

    private boolean practiceClasses;
    private boolean analysisClasses;
    private boolean inSchoolClasses;

    int countClassesForStudent = 0;

    public Student(int type) {
        this.type = type;
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        skill = (double) x / 10;

    }

    public int countDisciplines() {
        if (isInSchoolClasses()) {
            countClassesForStudent++;
        }
        if (isPracticeClasses()) {
            countClassesForStudent++;
        }
        if (isAnalysisClasses()) {
            countClassesForStudent++;
        }
        return countClassesForStudent;
    }

    public Calculable executeStrategy() {
        if (getType() == 1) {
            return new FirstTypeStudentCalculate(getType());
        } else if (getType() == 2) {
            return new SecondTypeStudentCalculate(getType());
        } else
            return new ThirdTypeStudentCalculate(getType());
    }


    public int getCountClassesForStudent() {
        return countClassesForStudent;
    }

    public void setCountClassesForStudent(int countClassesForStudent) {
        this.countClassesForStudent = countClassesForStudent;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getSkill() {
        return skill;
    }
    public void setSkill(double skill) {
        this.skill = skill;
    }

    @Override
    public double fullTime() {
        return (Main.AMOUNT_OF_HOURS * speedOfLearning) / getSkill();
    }

    @Override
    public double inSchoolTime() {
        if (inSchoolClasses)
            return fullTime() / getCountClassesForStudent();
        return 0;
    }

    @Override
    public double analysisTime() {
        if (analysisClasses)
            return fullTime() / getCountClassesForStudent();
        return 0;
    }

    @Override
    public double practiceTime() {
        if (practiceClasses)
            return fullTime() / getCountClassesForStudent();
        return 0;
    }

    @Override
    public void printCalculateTime() {
        DecimalFormat dc = new DecimalFormat("#0.0");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("[Type: ").append(getType()).append(" | Skill: ").append(getSkill()).
                append(" | Разборы: ").append(dc.format(analysisTime())).append(" | Практика: ").
                append(dc.format(practiceTime())).append(" | В потоке: ").append(dc.format(inSchoolTime())).
                append(" | Общ. время: ").append(dc.format(fullTime())).append("]"));
    }


    public double getSpeedOfLearning() {
        return speedOfLearning;
    }

    public void setSpeedOfLearning(double speedOfLearning) {
        this.speedOfLearning = speedOfLearning;
    }

    public boolean isPracticeClasses() {
        return practiceClasses;
    }

    public void setPracticeClasses(boolean practiceClasses) {
        this.practiceClasses = practiceClasses;
    }

    public boolean isAnalysisClasses() {
        return analysisClasses;
    }

    public void setAnalysisClasses(boolean analysisClasses) {
        this.analysisClasses = analysisClasses;
    }

    public boolean isInSchoolClasses() {
        return inSchoolClasses;
    }

    public void setInSchoolClasses(boolean inSchoolClasses) {
        this.inSchoolClasses = inSchoolClasses;
    }
}
