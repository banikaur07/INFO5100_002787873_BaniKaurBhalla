package exercises.exercise1;

import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        // Creating FullTime Students
        FullTime student1Obj = new FullTime("student1", new int[]{1,2}, new int[]{11,2,34,44,5,65,7,12,20,24,4,15,30,20,3});
        FullTime student2Obj = new FullTime("student2", new int[]{1,2}, new int[]{13,2,13,4,5,6,7,12,20,24,14,15,30,11,12});
        FullTime student3Obj = new FullTime("student3", new int[]{1,2}, new int[]{18,12,3,14,1,6,7,12,20,24,4,15,30,20,4});
        FullTime student4Obj = new FullTime("student4", new int[]{1,2}, new int[]{10,2,3,45,2,6,7,12,20,24,4,15,30,14,10});
        FullTime student5Obj = new FullTime("student5", new int[]{1,2}, new int[]{41,20,36,4,5,12,7,12,20,24,4,15,30,10,2});
        FullTime student6Obj = new FullTime("student6", new int[]{1,2}, new int[]{30,2,31,40,2,6,15,12,20,24,4,15,30,20,30});
        FullTime student7Obj = new FullTime("student7", new int[]{1,2}, new int[]{33,22,45,4,5,6,7,11,2,24,44,16,30,30,18});
        FullTime student8Obj = new FullTime("student8", new int[]{1,2}, new int[]{15,23,30,8,6,3,7,12,10,24,4,15,30,3,20});
        FullTime student9Obj = new FullTime("student9", new int[]{1,2}, new int[]{10,20,30,4,2,6,7,10,10,24,4,15,20,30,10});
        FullTime student10Obj = new FullTime("student10", new int[]{1,2}, new int[]{30,23,3,1,5,6,7,11,20,24,9,15,30,30,10});

        List<FullTime> fullTimeStudentList = new ArrayList<>();
        fullTimeStudentList.add(student1Obj);
        fullTimeStudentList.add(student2Obj);
        fullTimeStudentList.add(student3Obj);
        fullTimeStudentList.add(student4Obj);
        fullTimeStudentList.add(student5Obj);
        fullTimeStudentList.add(student6Obj);
        fullTimeStudentList.add(student7Obj);
        fullTimeStudentList.add(student8Obj);
        fullTimeStudentList.add(student9Obj);
        fullTimeStudentList.add(student10Obj);

        // Creating PartTime Students
        PartTime student11Obj = new PartTime("student11", new int[]{1,21,3,14,15,6,7,12,20,24,4,15,15,0,22});
        PartTime student12Obj = new PartTime("student12", new int[]{20,2,30,4,15,16,15,12,20,24,4,15,10,15,10});
        PartTime student13Obj = new PartTime("student13", new int[]{1,12,3,14,5,18,1,12,20,24,4,15,4,20,30});
        PartTime student14Obj = new PartTime("student14", new int[]{10,20,3,4,5,17,17,12,20,24,4,15,0,13,10});
        PartTime student15Obj = new PartTime("student15", new int[]{1,2,13,24,5,16,10,12,20,24,4,15,20,20,20});
        PartTime student16Obj = new PartTime("student16", new int[]{1,2,13,14,15,18,17,12,20,24,4,15,30,10,10});
        PartTime student17Obj = new PartTime("student17", new int[]{10,2,3,14,5,16,7,12,20,24,4,15,15,15,30});
        PartTime student18Obj = new PartTime("student18", new int[]{1,2,13,14,15,6,17,12,20,24,4,15,3,30,30});
        PartTime student19Obj = new PartTime("student19", new int[]{1,2,13,16,18,6,0,12,20,24,4,15,18,10,0});
        PartTime student20Obj = new PartTime("student20", new int[]{10,12,13,4,15,6,0,12,20,24,4,15,20,10,3});

        List<PartTime> partTimeStudentList = new ArrayList<>();
        partTimeStudentList.add(student11Obj);
        partTimeStudentList.add(student12Obj);
        partTimeStudentList.add(student13Obj);
        partTimeStudentList.add(student14Obj);
        partTimeStudentList.add(student15Obj);
        partTimeStudentList.add(student16Obj);
        partTimeStudentList.add(student17Obj);
        partTimeStudentList.add(student18Obj);
        partTimeStudentList.add(student19Obj);
        partTimeStudentList.add(student20Obj);

        // Create Session
        Session sessionObj = new Session(fullTimeStudentList, partTimeStudentList);
        sessionObj.printAverageQuizScores();
        sessionObj.printFullTimeStudentScores();
        sessionObj.printPartTimeStudentNames();
        sessionObj.printQuizScoresInAscOrder();
    }
}
