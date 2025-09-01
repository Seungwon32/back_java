package equalsTest;

import java.util.Objects;

public class Student {
	private int Id;
	private String name;
	private int age;
	
	public Student() {;}
	public Student(int id, String name, int age) {
		Id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
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
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", age=" + age + "]";
	}
	
////	alt+shift+s+h
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		if(obj instanceof Student) {
//			Student anotherStudent = (Student)obj;
//			if(this.getId() == anotherStudent.getId()) {
//				return true;
//			}
//		}
//		return false;
//	}
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Id == other.Id;
	}
	
	public static void main(String[] args) {
		Student student = new Student(1,"배승원",23);
		
		if(student.equals(new Student(1,"배승원",23))) {
			System.out.println("책 대여 완료");
		}else {
			System.out.println("도난 신고");
		}
	}
	
}	
