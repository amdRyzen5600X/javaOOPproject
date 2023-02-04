import java.util.HashMap;
public class student extends person{
    private HashMap<String, HashMap<String, Integer>> grades = new HashMap<String, HashMap<String, Integer>>();
    private String group;

    public student(Integer id, String name, String surename, Integer age, String group){
        super.setId(id);
        super.setName(name);
        super.setSurename(surename);
        super.setAge(age);
        this.group = group;
    }
    public student(){

    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return this.group;
    }

    public HashMap<String, HashMap<String, Integer>> getGrades() {
        return this.grades;
    }
    public void addGrade(String subjectName, HashMap<String, Integer> grade){
        this.grades.put(subjectName, grade);
    }
}
