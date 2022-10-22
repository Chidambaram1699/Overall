package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Chidambaram");
	}
	public void studentDept() {
		System.out.println("QA");
	}
	public void studentId() {
		System.out.println("12345678");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collageName();
		obj.collagecode();
		obj.collageRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
