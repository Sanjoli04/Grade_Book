import java.util.ArrayList;
import java.util.List;
public class Student {
//    name first name last name roll no SchoolClass section
    private String firstName;
    private String lastName;
    private String rollNo;
    private SchoolClass schoolClass;
    private List<Subject> subjects;
    private List<Student> students;

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public Student(String firstName,String lastName, int numOfSubjects){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = new ArrayList<>(numOfSubjects);
        this.students = new ArrayList<>(50);
    }
    public void assignSubjects(Subject subject){
        this.subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
     public void assignClass(SchoolClass schoolClass){
        this.schoolClass = schoolClass;
     }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
