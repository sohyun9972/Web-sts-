package lecture.service;

import java.util.List;

import lecture.domain.Lecture;

public interface LectureService {
	//
	void register(Lecture lecture);
	Lecture find(String lectureId);
	void modify(Lecture lecture);
	void remove(String lectureId);
	List<Lecture> findAll();
}
