public class person {
    private String name;
    private String surename;
    private int age;
    public void person(String name, String surename, int age){
        this.name = name;
        this.surename = surename;
        this.age = age;
    }
    public void person(){

    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

}
