import java.util.ArrayList;
public class teacher extends person{
    private ArrayList<String> groups = new ArrayList<String>();
    private String subject;

    public teacher(Integer id, String name, String surename, Integer age, String subject){
        super.setId(id);
        super.setName(name);
        super.setSurename(surename);
        super.setAge(age);
        this.subject = subject;
    }
    public teacher(){

    }
    public ArrayList<String> getGroups() {
        return this.groups;
    }
    public void addGroup(String group){
        this.groups.add(group);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }
}
