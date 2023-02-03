import java.util.HashMap;
public class student extends person{
    private HashMap<String, HashMap<String, Integer>> grades = new HashMap<String, HashMap<String, Integer>>();
    private String group;

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public HashMap<String, HashMap<String, Integer>> getGrades() {
        return this.grades;
    }
    public void addGrade(String subjectName, HashMap<String, Integer> grade){
        this.grades.put(subjectName, grade);
    }
}
