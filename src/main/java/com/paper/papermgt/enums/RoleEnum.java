package com.paper.papermgt.enums;

public enum RoleEnum {
    TEACHER("teacher", "老师"), STUDENT("student", "学生"), SYSTEM("sysadmin", "管理员"),DEPTADMIN("deptadmin", "院管理员");
    private final String roleName;
    private final String desc;

    RoleEnum(String roleName, String desc) {
        this.roleName = roleName;
        this.desc = desc;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDesc() {
        return desc;
    }

    public static RoleEnum getRole(String roleName) {
        for (RoleEnum roleEnum : RoleEnum.values()) {
            if (roleEnum.getRoleName().equals(roleName)) {
                return roleEnum;
            }
        }
        return null;
    }
}

