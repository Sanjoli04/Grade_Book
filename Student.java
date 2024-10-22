public class Student {
    // students have name, class subjects and rollno
    private SchoolClass studentClass;
    private String rollNo;
    private String name;
    // initially no subject and roll no assigned;
    Student(String name, SchoolClass studentClass){
        this.name = name;
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Roll no: "+ rollNo+" class: "+ this.studentClass.getClassNum()+ " " + "Name: "+name;
    }
}
