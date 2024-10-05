import java.util.*;
public class Main {
    public static ArrayList<SchoolClass> createSchoolClasses(){
        int[] classes = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        List<SchoolClass> schoolClasses = new ArrayList<>(12);
        List<String> sections = new ArrayList<>();
        sections.add("Dragons");
        sections.add("Enthusiasts");
        sections.add("Triggered");
        for (int i = 0; i < classes.length; i++) {
            SchoolClass schoolClass = new SchoolClass(classes[i],sections);
            schoolClasses.add(schoolClass);
        }
        return (ArrayList<SchoolClass>) schoolClasses;
    }
    public static ArrayList<Subject> createSubjects(){
        // create subjects
        String[] subjects = new String[] {"Hindi","English","Maths","EVS","Arts and Crafts","Civics","Geography","History","Physical Education","Information Technology","Chemistry","Physics","Biology","Social Studies"};
        int[] credits = new int[] {3,3,3,3,2,4,3,4,3,3,3,3,3,4};
        List<Subject> subjectList = new ArrayList<>();
        for (int i = 0; i < subjects.length; i++) {
            subjectList.add(new Subject(credits[i],subjects[i]));
        }
        return (ArrayList<Subject>) subjectList;
    }
    public static void main(String[] args) {
// need a way to create
// today 's work is  done in next one we will assignSubjects to classes
        // ********** bye ********************
    }
}