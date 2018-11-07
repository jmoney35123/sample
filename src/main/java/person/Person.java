package person;

import java.util.ArrayList;

public class Person {
    private String name;
   private Integer age;
   private ArrayList<String> listOfHobbies;

    public Person() {
    }

    public Person(String name, Integer age, ArrayList<String> listOfHobbies) {
        this.name = name;
        this.age = age;
        this.listOfHobbies = listOfHobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ArrayList<String> getListOfHobbies() {
        return listOfHobbies;
    }

    public void setListOfHobbies(ArrayList<String> listOfHobbies) {
        this.listOfHobbies = listOfHobbies;
    }
}
