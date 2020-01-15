package com.datastructures.queue;

import java.util.*;

public class DequeArrImpl {

    public static void main(String[] args) {
        Map<Employee, String> ma=new HashMap<>();
        DequeArrImpl dequeArr =new DequeArrImpl();
        List<Employee> list=new ArrayList<>();
        Employee employee=dequeArr.new Employee(1, "a");
        list.add(employee);
        employee=dequeArr.new Employee(2, "b");
        list.add(employee);
        employee=dequeArr.new Employee(3, "c");
        list.add(employee);
        employee=dequeArr.new Employee(4, "d");
        list.add(employee);

        Iterator<Employee> itr=list.iterator();
        int count=3;
        while (itr.hasNext()){
            itr.next().setId(count++);
        }
        System.out.println(list);

    }

    private class Employee{

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
