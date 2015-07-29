package org.abhi.ad.datamodel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private CourseID courseID;
	private String timing;
	private String classroom;
	private String noOfStudents;
	public Course() {
		super();
	}
	public Course(CourseID courseID, String timing, String classroom, String noOfStudents) {
		super();
		this.courseID = courseID;
		this.timing = timing;
		this.classroom = classroom;
		this.noOfStudents = noOfStudents;
	}
	public CourseID getCourseID() {
		return courseID;
	}
	public void setCourseID(CourseID courseID) {
		this.courseID = courseID;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(String noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	
}
