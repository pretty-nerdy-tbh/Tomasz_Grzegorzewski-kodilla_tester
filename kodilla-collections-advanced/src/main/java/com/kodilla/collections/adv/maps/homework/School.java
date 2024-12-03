package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> studentsCount = new ArrayList<>();
    private String schoolsName;

    public School(List<Integer> studentsCount, String schoolsName) {
        this.studentsCount = studentsCount;
        this.schoolsName = schoolsName;
    }

    public int getStudentsCountSum(){
        int sum = 0;
        for(int clas: studentsCount){
            sum = clas + sum;
        }
        return sum;
    }

    public String getSchoolsName() {
        return schoolsName;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsCount=" + studentsCount +
                ", schoolsName='" + schoolsName + '\'' +
                '}';
    }
}
