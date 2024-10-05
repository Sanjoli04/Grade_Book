public class Subject {
    private int credits;
    private String subjectName;
    public Subject(int credits,String subjectName){
        this.credits = credits;
        this.subjectName = subjectName;
    }

    public int getCredits() {
        return credits;
    }

    public String getSubjectName() {
        return subjectName;
    }

}
