package com.encapsulation;

public class Encap1 {
		String Name;
		int StudentId;
		double GPA;
		
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getStudentId() {
			return StudentId;
		}
		public void setStudentId(int studentId) {
			StudentId = studentId;
		}
		public double getGPA() {
			return GPA;
		}
		public void setGPA(double gPA) {
			GPA = gPA;
		}
		
	public static void main(String[] args) {
		Encap1 aaa = new Encap1();
		aaa.setName("Araf");
		aaa.setStudentId(201);
		aaa.setGPA(4.1);
		
		System.out.println(aaa.getName());
		System.out.println(aaa.getStudentId());
		System.out.println(aaa.getGPA());
	}
	
}
