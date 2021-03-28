package top.tomxwd.test.combination;

import java.util.List;

/**
 * 组合 没什么可说的额
 *
 * @author xwd
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    /** 下属 */
    private List<Employee> subordinates;

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
