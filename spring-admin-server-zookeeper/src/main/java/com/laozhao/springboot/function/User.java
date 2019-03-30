package com.laozhao.springboot.function;

public class User {
    private String useName="";
    private Integer age=0;

    public void setUseName(String userName){
        this.useName+=userName;
    }

    public void setAge(int age){
        this.age+=age;
    }

    public String getUseName() {
        return useName;
    }

    public Integer getAge() {
        return age;
    }

    public String toString(){
        return "useName="  +useName+"  age="+age;
    }


}
