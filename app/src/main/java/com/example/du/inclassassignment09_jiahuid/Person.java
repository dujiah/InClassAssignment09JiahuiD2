package com.example.du.inclassassignment09_jiahuid;

/**
 * Created by du on 4/2/18.
 */

public class Person {
    private String name;
    private int age;
    private boolean gradHS;

    public Person(String name, int age, boolean gradHS) {
        this.name = name;
        this.age = age;
        this.gradHS = gradHS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGradHS() {
        return gradHS;
    }

    public void setGradHS(boolean gradHS) {
        this.gradHS = gradHS;
    }
}
