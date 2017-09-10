package com.practice.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudent {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("12", "ab", "CS"),
				new Student("13", "ze", "EC"),
				new Student("14", "fg", "ME"),
				new Student("15", "jh", "CH"),
				new Student("16", "io", "IT"));
		
		
		/*Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getSpecialization().compareTo(o2.getSpecialization());
			}
		});
		*/
		
		// below line of code is equivalant to above one for sorting using lambda expression
		// 
		
		Collections.sort(students, (Student s1, Student s2) -> s1.getSpecialization().compareTo(s2.getSpecialization()));
		
		for(Student student: students) {
			System.out.println(student);
		}
		
		// filter out students specialization containing "C"
		
		students = students.stream().filter((student) -> student.getSpecialization().contains("C")).collect(Collectors.toList());
		System.out.println(students);
	}
}
class Student
{
	private String id;
	
	private String name;
	
	private String specialization;

	public String getId() {
		return id;
	}

	public Student() {
	}
	
	public Student(String id, String name, String specialization) {
		this.id = id;
		this.name = name;
		this.specialization = specialization;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	@Override
	public String toString() {
		return "id: "+id+" name: "+name+" specialization: "+specialization;
	}
}