package cn.dragon.restful.spring.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 为 Employee 集合声明一个包装类。这个包装类是 JAXB 2 所需要的，因为它无法正确地编组 java.util.List 类
 * Created with IntelliJ IDEA.
 * User: dragon
 * Date: 13-5-20
 * Time: 下午12:01
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "employees")
public class EmployeeList {
    private int count;
    private List<Employee> employees;

    public EmployeeList() {
    }

    public EmployeeList(List<Employee> employees) {
        this.employees = employees;
        this.count = employees.size();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @XmlElement(name = "employee")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
