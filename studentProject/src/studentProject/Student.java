package studentProject;

import java.util.Arrays;

public class Student {
	
	private int rollNo;
	private String name;
	private String[] courseNames;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getCourseNames() {
		return courseNames;
	}
	public void setCourseNames(String[] courseNames) {
		this.courseNames = courseNames;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", courseNames=" + Arrays.toString(courseNames) + "]";
	}

	

}
