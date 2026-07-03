package com.practice.campus.model;

import com.practice.campus.enums.RoleType;

/**
 * 抽象父类：校园人员。
 *
 * 学习点：
 * 1. abstract 抽象类
 * 2. private 封装属性
 * 3. getter / setter
 * 4. 子类继承公共属性和方法
 */
public abstract class Person {
    private String name;
    private int age;
    private RoleType roleType;

    public Person() {
    }

    public Person(String name, int age, RoleType roleType) {
        this.name = name;
        setAge(age);
        this.roleType = roleType;
    }

    public abstract void doWork();

    public void introduce() {
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁，角色是" + roleType.getDescription());
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
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("年龄不合法，已设置为默认值 18");
            this.age = 18;
        }
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
