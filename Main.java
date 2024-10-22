import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void makeClasses(){
        SchoolClass.__init__();// will init the classes list
        String[] primarySubjects = {"Hindi", "English",
                "Maths","EVS","Arts and Crafts","Information Technology",
                "GK"};
        String[] secondarySubjects = {
                "Hindi", "English",
                "Maths","Science",
                "GK",
                "Social Studies",
                "Information Technology",
                "Sanskrit"
        } ;
        String[] med = {"Botany","Zoology","Physics","Chemistry",};
        String[] nonmed = {"Maths","Physics","Chemistry"};
        String[] pcmb = {"Botany","Zoology","Physics","Chemistry","Maths"};
        for (int i = 1; i < 13; i++) {
            List<String> subjs = new ArrayList<>();
            if(i<6){
                for(String s:primarySubjects){
                    subjs.add(s);
                }
                // make class of it
                new SchoolClass(i,subjs);
            } else if (i >=5 && i< 11) {
                for(String s:secondarySubjects){
                    subjs.add(s);
                }
                new SchoolClass(i,subjs);
            } else if (i == 11) {
                // med and non-med
                for(String s:med){
                    subjs.add(s);
                }
                new SchoolClass(i,subjs);
                subjs = new ArrayList<>();

                for(String s:nonmed){
                    subjs.add(s);
                }
                new SchoolClass(i,subjs);
            }
            else if(i == 12){
                // med and non-med
                for(String s:med){
                    subjs.add(s);
                }
                new SchoolClass(12,subjs);
                subjs = new ArrayList<>();

                for(String s:nonmed){
                    subjs.add(s);
                }
                new SchoolClass(12,subjs);
            }
        }
        System.out.println(SchoolClass.classes);
    }
    public static void main(String[] args) {
        makeClasses();
    }
}
