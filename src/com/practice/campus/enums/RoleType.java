package com.practice.campus.enums;

public enum RoleType {
    STUDENT("学生"),
    TEACHER("老师"),
    ADMIN("管理员");

    private final String description;

    RoleType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
