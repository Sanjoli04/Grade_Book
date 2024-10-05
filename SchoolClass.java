import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
//    classNum,section
    private int classNum;
    private List<String> sections;
    private List<Student> students;
    public ArrayList<String> getSections() {
        return (ArrayList<String>) sections;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public void setSection(List<String> sections) {
        this.sections = sections;
    }

    public int getClassNum() {
        return classNum;
    }
    SchoolClass(int classNum,List<String> sections){
        this.classNum = classNum;
        this.sections = sections;
        this.students = new ArrayList<>(50);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SchoolClass){
            SchoolClass schoolClass = (SchoolClass) obj;
            if(schoolClass.classNum == this.classNum && schoolClass.sections.equals(this.sections)){
                return true;
            }
            return false;
        }
        return false;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
