import org.jetbrains.annotations.NotNull;

import java.sql.*;
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

    public static student getStudentFromDatabase(int student_id){
        Connection con = null;
        student temp = new student();
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("SELECT * FROM student WHERE student_id = %d", student_id));
            while(rs.next()){
                temp.setId(rs.getInt("student_id"));
                temp.setName(rs.getString("student_name"));
                temp.setSurename(rs.getString("student_surename"));
                temp.setAge(rs.getInt("age"));
                temp.setGroup(rs.getString("student_group"));
            }
            return temp;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void uploadStudent(@NotNull student studentToUpload){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
            Statement stmt = con.createStatement();
            int a = stmt.executeUpdate(String.format(
                    "INSERT INTO student (student_name, student_surename, age, student_group) VALUES (%s, %s, %d, %s)",
                    studentToUpload.getName(),
                    studentToUpload.getSurename(),
                    studentToUpload.getAge(),
                    studentToUpload.getGroup()
            )
            );


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
