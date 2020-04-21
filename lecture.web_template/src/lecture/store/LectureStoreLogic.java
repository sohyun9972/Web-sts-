package lecture.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lecture.domain.Lecture;

public class LectureStoreLogic implements LectureStore {

	private static Map<String, Lecture> lectureRepository = new HashMap<String, Lecture>();
	
	@Override
	public void create(Lecture lecture) {
		//
		
//		Lecture lec = new Lecture();
//		lec.setId("123");
//		lec.setInstructor("Kim");
//		lec.setLectureName("Servlet/JSP");
		
		
		lectureRepository.put(lecture.getId(), lecture);
	}

	@Override
	public Lecture read(String lectureId) {
		//
		return lectureRepository.get(lectureId);
	}

	@Override
	public void update(Lecture lecture) {
		//
		lectureRepository.put(lecture.getId(), lecture);
	}

	@Override
	public void delete(String lectureId) {
		//
		lectureRepository.remove(lectureId);
	}

	@Override
	public List<Lecture> readAll() {
		//
		return new ArrayList<Lecture>(lectureRepository.values());
	}

}
