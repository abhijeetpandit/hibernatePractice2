package org.abhi.ad.datamodel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CourseID implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="COURSE_NAME")
	private String courseName;
	private Date startDate;
	
	public CourseID() {
		
	}

	public CourseID(String courseName, Date startDate) {
		super();
		this.courseName = courseName;
		this.startDate = startDate;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "CourseID [courseName=" + courseName + ", startDate=" + startDate + "]";
	}
}
