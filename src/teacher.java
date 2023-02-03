import java.util.ArrayList;
public class teacher extends person{
    private ArrayList<String> groups = new ArrayList<String>();
    private String subject;

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
