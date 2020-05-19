package store;

import java.util.List;

import entity.Music;

public interface MusicStore {
	//
	Music read(int id);
	List<Music> readByName(String name);
	List<Music> readAll();
}
