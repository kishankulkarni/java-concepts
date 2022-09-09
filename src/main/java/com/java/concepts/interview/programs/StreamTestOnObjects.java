package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java.concepts.model.Address;
import com.java.concepts.model.MobileNumber;
import com.java.concepts.model.Student;
import com.java.concepts.model.TempStudent;

public class StreamTestOnObjects {

	public static void main(String[] args) {
		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3);

		/*****************************************************
		 * Get student with exact match name "jayesh"
		 *****************************************************/
		Optional<Student> exactName = students.stream().filter(e -> e.getName().equalsIgnoreCase("jayesh")).findFirst();
		System.out.println(exactName.isPresent() ? exactName.get().getName() : "No student with this name");
		System.out.println("--------------------");

		/*****************************************************
		 * Get student with matching address "1235"
		 *****************************************************/
		Optional<Student> studAddress = students.stream().filter(a -> a.getAddress().getZipcode().equals("1235"))
				.findFirst();
		System.out.println(studAddress.isPresent() ? studAddress.get().getAddress().getZipcode() : "Address not fount");
		System.out.println("--------------------");

		/*****************************************************
		 * Get all student having mobile numbers 3333.
		 *****************************************************/
		List<Student> studMobile = students.stream()
				.filter(s -> s.getMobileNumbers().stream().anyMatch(m -> m.getNumber().equals("3333")))
				.collect(Collectors.toList());
		String studMob = studMobile.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(studMob);
		System.out.println("--------------------");

		/*****************************************************
		 * Get all student having mobile number 1233 and 1234
		 *****************************************************/
		List<Student> studMulMob = students.stream()
				.filter(s -> s.getMobileNumbers().stream()
						.allMatch(m -> m.getNumber().equals("1233") || m.getNumber().equals("1234")))
				.collect(Collectors.toList());
		String mulStudName = studMulMob.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(mulStudName);
		System.out.println("--------------------");

		/*****************************************************
		 * Create a List<Student> from the List<TempStudent>
		 *****************************************************/
		TempStudent tmpStud1 = new TempStudent("Jayesh1", 201, new Address("12341"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

		TempStudent tmpStud2 = new TempStudent("Khyati1", 202, new Address("12351"),
				Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

		List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);
		List<Student> stuList = tmpStudents.stream()
				.map(tmp -> new Student(tmp.name, tmp.age, tmp.address, tmp.mobileNumbers))
				.collect(Collectors.toList());
		System.out.println(stuList);
		System.out.println("--------------------");

		/*****************************************************
        Convert List<Student> to List<String> of student name
       *****************************************************/
		List<String> studStringList = students.stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(studStringList);
		System.out.println("--------------------");

		/*****************************************************
        Convert List<students> to String
       *****************************************************/
		String studListToString = students.stream().map(Student::getName).collect(Collectors.joining(",","[","]"));
		System.out.println(studListToString);
		System.out.println("--------------------");
	}

}
