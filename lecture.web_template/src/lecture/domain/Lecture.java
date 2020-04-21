package lecture.domain;

public class Lecture {
	//
	private String id;
	private String lectureName;
	private String instructor;
	private String introduce;

	public Lecture() {
		// Nothing to do.
	}

	public Lecture(String lectureName, String instructorName, String lectureIntroduce) {
		this.lectureName = lectureName;
		this.instructor = instructorName;
		this.introduce = lectureIntroduce;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
}
