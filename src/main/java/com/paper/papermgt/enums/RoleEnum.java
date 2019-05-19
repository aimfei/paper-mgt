package com.paper.papermgt.enums;

public enum RoleEnum {
    TEACHER("teacher"),STUDENT("student"),SYSTEM("system");
    private final String roleName;

    RoleEnum(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public  static  RoleEnum getRole(String roleName){
        for (RoleEnum roleEnum:RoleEnum.values()) {
            if (roleEnum.getRoleName().equals(roleName)){
                return  roleEnum;
            }
        }
        return null;
    }
}

