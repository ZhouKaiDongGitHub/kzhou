package cn.kzhou.hibernate.model;


import java.util.Date;

public class EmployeeEntity {
    private long employeeId;
    private String name;
    private Date birthday;

    private Long joinPartId;
    private DepartmentEntity departmentEntity;

    public DepartmentEntity getDepartmentEntity() {
        return departmentEntity;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getJoinPartId() {
        return joinPartId;
    }

    public void setJoinPartId(Long joinPartId) {
        this.joinPartId = joinPartId;
    }

    public void setDepartmentEntity(DepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }
}
