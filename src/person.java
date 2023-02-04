public class person {
    private int id;
    private String name;
    private String surename;
    private int age;
    public void person(Integer id, String name, String surename, int age){
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.age = age;
    }
    public void person(){

    }
    public int getId(){
        return this.id;
    }
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurename() {
        return this.surename;
    }

    public void setId(int id) {
        this.id = id;
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
