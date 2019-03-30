package com.laozhao.springboot.function;

import java.util.LinkedList;
import java.util.List;

import java.util.function.Consumer;

public class testFunction {
    public static void main(String[] args) {
        UserFactoy.config(u->u.setUseName("zy"));
        UserFactoy.config(u->u.setUseName("&wzy"));
        UserFactoy.config(u->u.setAge(26));
        UserFactoy.config(u->u.setAge(24));
        System.out.println(UserFactoy.generateUser());
    }
}

class UserFactoy{
 private final static    List<Consumer<User>> configName=new LinkedList();

 public static void init(){
     configName.clear();
 }

 public static void  config(Consumer<User> userStringBiConsumer){
    configName.add(userStringBiConsumer);
 }


 public static User generateUser(){
     User u=new User();
     configName.forEach(e->e.accept(u));
     return u;
 }
}
