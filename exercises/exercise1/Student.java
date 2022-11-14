package exercises.exercise1;

/*
 * Class Student
 */
public class Student {
    public String name;
    public int[] quizScores = new int[15]; // common to FullTime and PartTime

    /*
     * Return Sum of Total Quiz Scores 
     */
    public float getAverageQuizScore(){
        int totalQuizScore = 0;
        for (int i = 0; i<quizScores.length; i++){
            totalQuizScore = totalQuizScore + quizScores[i];
        }
        float averageScore = totalQuizScore / quizScores.length;
        return averageScore;
    }
}
