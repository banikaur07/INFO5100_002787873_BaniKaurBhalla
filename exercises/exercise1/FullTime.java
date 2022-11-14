package exercises.exercise1;

/*
 * Class FullTime
 */
public class FullTime extends Student {
    public int[] examScores = new int[2];

    public FullTime(String name, int[] examScores, int[] quizScores) {
        this.name = name;
        this.examScores = examScores;
        this.quizScores = quizScores;
    }

    public void printExamScores(){
        for (int score: examScores) {
            System.out.println(score);
        }
    }
}