package exercises.exercise1;

import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        // Creating FullTime Students
        FullTime student1Obj = new FullTime("student1", new int[]{1,2}, new int[]{11,2,34,44,5,65,7,12,20,24,4,15,30,30,30});
        FullTime student2Obj = new FullTime("student2", new int[]{1,2}, new int[]{13,2,13,4,5,6,7,12,20,24,14,15,30,30,30});
        FullTime student3Obj = new FullTime("student3", new int[]{1,2}, new int[]{18,12,3,14,5,6,7,12,20,24,4,15,30,30,30});
        FullTime student4Obj = new FullTime("student4", new int[]{1,2}, new int[]{10,2,3,45,5,6,7,12,20,24,4,15,30,30,30});
        FullTime student5Obj = new FullTime("student5", new int[]{1,2}, new int[]{41,20,36,4,5,6,7,12,20,24,4,15,30,30,30});
        FullTime student6Obj = new FullTime("student6", new int[]{1,2}, new int[]{30,2,31,40,5,6,7,12,20,24,4,15,30,30,30});
        FullTime student7Obj = new FullTime("student7", new int[]{1,2}, new int[]{33,22,45,4,5,6,7,12,20,24,44,16,30,30,30});
        FullTime student8Obj = new FullTime("student8", new int[]{1,2}, new int[]{15,23,30,4,5,6,7,12,20,24,4,15,30,30,30});
        FullTime student9Obj = new FullTime("student9", new int[]{1,2}, new int[]{10,20,30,4,5,6,7,12,20,24,4,15,20,30,30});
        FullTime student10Obj = new FullTime("student10", new int[]{1,2}, new int[]{30,23,3,41,5,6,7,12,20,24,9,15,30,30,30});

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
        PartTime student11Obj = new PartTime("student11", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});
        PartTime student12Obj = new PartTime("student12", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});
        PartTime student13Obj = new PartTime("student13", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});
        PartTime student14Obj = new PartTime("student14", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});
        PartTime student15Obj = new PartTime("student15", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});
        PartTime student16Obj = new PartTime("student16", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});
        PartTime student17Obj = new PartTime("student17", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});
        PartTime student18Obj = new PartTime("student18", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});
        PartTime student19Obj = new PartTime("student19", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});
        PartTime student20Obj = new PartTime("student20", new int[]{1,2,3,4,5,6,7,12,20,24,4,15,30,30,30});

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
