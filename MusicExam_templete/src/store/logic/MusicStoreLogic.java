package store.logic;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Music;
import store.MusicStore;
import store.repository.MusicPlayRepository;


@Repository
public class MusicStoreLogic implements MusicStore {
	//
	private MusicPlayRepository repository;
	
	public MusicStoreLogic() {
		//
		repository = MusicPlayRepository.createInstance();
	}
	
	@Override
	public Music read(int id) {
		//
		return repository.readMusic(id);
	}

	@Override
	public List<Music> readByName(String name) {
		//
		return repository.readMusicByName(name);
	}

	@Override
	public List<Music> readAll() {
		//
		return repository.readAllMusics();
	}

}
