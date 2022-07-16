package com.java.newfeature.v8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for(int i=5;i>0;i--){
            employees.add(new Employee("name"+i, 45+i, "city"+i));
        }
        Collections.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getAge).thenComparing(Employee::getCity));
        System.out.println(employees);
    }

    static class Employee{

        public Employee(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        private String name;
        private int age;
        private String city;

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
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}
