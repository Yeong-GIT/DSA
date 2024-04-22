package DoubleLinkedList;

public class EmployeeNode {
    private Employee employee; // Node for the employee
    private EmployeeNode next; // Reference for the next node
    private EmployeeNode previous; // Reference for the previous node

    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public String toString(){
        return employee.toString();
    }
}
