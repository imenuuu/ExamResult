import javax.security.auth.Subject;
import java.util.ArrayList;

public class Student {


    private int studentId; //학번
    private String studentName; //이름
    private Subject majorSubject; //중점과목

    //학생 성적리스트
    //addSubjectScore() 메서드가 호출되면 리스트에 추가됨
    private ArrayList<Score> scoreList=new ArrayList<Score>();

    public Student(int studentId, String studentName, Subject majorSubject){
        this.studentId=studentId;
        this.studentName=studentName;
        this.majorSubject=majorSubject;
    }
    public void addSubjectScore(Score score){
        scoreList.add(score);
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
