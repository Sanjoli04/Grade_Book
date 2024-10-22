import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    // class Num and subjects??
    public static List<SchoolClass> classes;
    private int classNum;
    private List<String> subjects;
    public static      void __init__(){
        classes = new ArrayList<>();
    }
    public SchoolClass(int classNum, List<String> subjects){
        this.classNum = classNum;
        this.subjects = subjects;
        classes.add(this);
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "classNum=" + classNum +
                '}';
    }

}
