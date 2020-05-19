package service;

import java.util.List;

import entity.Music;

public interface MusicService {
	//
	Music find(int id);
	List<Music> findByName(String name);
	List<Music> findAll();
}
