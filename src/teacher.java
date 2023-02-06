import java.sql.*;
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
    public static teacher getTeacherFromDatabase(int student_id){
        Connection con = null;
        teacher temp = new teacher();
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("SELECT * FROM student WHERE student_id = %d", student_id));
            while(rs.next()){
                temp.setId(rs.getInt("teacher_id"));
                temp.setName(rs.getString("teacher_name"));
                temp.setSurename(rs.getString("teacher_surename"));
                temp.setAge(rs.getInt("age"));
                temp.setSubject(rs.getString("subject"));
                temp.addGroup(rs.getString("groups"));
            }
            return temp;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void uploadTeacher(teacher teacherToUpload){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
            Statement stmt = con.createStatement();
            int a = stmt.executeUpdate(String.format(
                            "INSERT INTO student (teacher_name, teacher_surename, age, subject, groups) VALUES (%s, %s, %d, %s, %s)",
                            teacherToUpload.getName(),
                            teacherToUpload.getSurename(),
                            teacherToUpload.getAge(),
                            teacherToUpload.getSubject(),
                            teacherToUpload.getGroups()
                    )
            );


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
