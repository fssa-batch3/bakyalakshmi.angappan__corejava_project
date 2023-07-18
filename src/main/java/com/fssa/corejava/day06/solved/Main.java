package com.fssa.corejava.day06.solved;

public class Main {

	static class Department {

		String deptName;
		int deptId;

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public Department(String deptName, int deptId) {
			super();
			this.deptName = deptName;
			this.deptId = deptId;
		}
	}

	static class Student {

		String name;
		int id;
		String department;

		public Student(String name, int id, Department department) {
			super();
			this.name = name;
			this.id = id;
			this.department = department.getDeptName();
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + ", department=" + department + "]";
		}

		// Create a constructor and assign department and respective attributes
		// Add toString method to get the Student details.
	}

	// Create a main class to create a Student and Department objects
	// and print the details

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department department = new Department("SCIENCE", 01);
		Student student = new Student("bakya", 1, department);

		System.out.println(student.toString());

	}

}
