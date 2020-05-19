package service.logic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.Music;
import service.MusicService;
import store.MusicStore;

@Service
public class MusicServiceLogic implements MusicService{

	@Autowired
	private MusicStore store;

	@Override
	public Music find(int id) {
		return null;
	}
	@Override
	public List<Music> findByName(String name) {
		return null;
	}

	@Override
	public List<Music> findAll() { // List를 return 받는 findAll() 메소드를 store.readAll() 호출
		return store.readAll();		// MusicStoreLogic에 있는 readAll()이 호출됨
	}
}
