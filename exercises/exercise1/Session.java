package exercises.exercise1;

import java.util.*;

public class Session {
    public List<FullTime> fullTimeStudentList;
    public List<PartTime> partTimeStudentList;

    public Session(List<FullTime> fullTimeStudentList, List<PartTime> partTimeStudentList) {
        this.fullTimeStudentList = fullTimeStudentList;
        this.partTimeStudentList = partTimeStudentList;
    }
  
    /*
     * Print Average Quiz Scores for all students
     */
    public void printAverageQuizScores(){
        // Print avg exam scores for full time students
        for(int i = 0; i < fullTimeStudentList.size(); i++){
            System.out.println("Average Score of " + fullTimeStudentList.get(i).name + " is: " + fullTimeStudentList.get(i).getAverageQuizScore());
        }

        // Print avg exam scores for part time students
        for(int i = 0; i < partTimeStudentList.size(); i++){
            System.out.println("Average Score of " + partTimeStudentList.get(i).name + " is: " + partTimeStudentList.get(i).getAverageQuizScore());
        }
    }

    /*
     * Print Quiz Scores in Asc Order
     */
    public void printQuizScoresInAscOrder(){
        List<Integer> quizScoreList = new ArrayList<>();

        //  get all scores for full time students
        for(int i = 0; i < fullTimeStudentList.size(); i++){
            Student currStudent = fullTimeStudentList.get(i);

            for(int score: currStudent.quizScores) {
                quizScoreList.add(score);
            }
        }

        //  get all scores for part time students
        for(int i = 0; i < partTimeStudentList.size(); i++){
            Student currStudent = partTimeStudentList.get(i);

            for(int score: currStudent.quizScores) {
                quizScoreList.add(score);
            }
        }

        Collections.sort(quizScoreList);   // sorted in asc order 
        
        // print all quiz scores in asc order
        for(int i = 0; i < quizScoreList.size(); i++){
            System.out.println(quizScoreList.get(i));
        }
    }

    /*
     * Print Names of PartTime Students 
     */
    public void printPartTimeStudentNames(){
        for(int i = 0; i < partTimeStudentList.size(); i++){
            System.out.println(partTimeStudentList.get(i).name);
        }
    }

    public void printFullTimeStudentScores(){
        for(int i = 0; i < fullTimeStudentList.size(); i++){
            fullTimeStudentList.get(i).printExamScores();
        }
    }
}
