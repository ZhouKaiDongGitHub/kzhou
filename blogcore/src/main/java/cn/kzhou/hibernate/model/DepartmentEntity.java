package cn.kzhou.hibernate.model;

import java.util.HashSet;
import java.util.Set;

public class DepartmentEntity {
    private long id;
    private String departmentName;
    private Set<EmployeeEntity> emList = new HashSet();

    public Set<EmployeeEntity> getEmList() {
        return emList;
    }

    public void setEmList(Set<EmployeeEntity> emList) {
        this.emList = emList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
