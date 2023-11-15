package Project2;

public class ScoreInfo extends Student{

   Student student;
   int score;


    public ScoreInfo(Student student, int score) {
        super(student.name,student.lastName);
        this.student = student;
        this.score = score;
    }

    @Override
    public String toString() {
        return "ScoreInfo{" +
                "student=" + student +
                ", score=" + score +
                "} \n";
    }
}
