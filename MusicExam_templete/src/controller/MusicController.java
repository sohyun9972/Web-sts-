package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Music;
import service.MusicService;

@Controller
public class MusicController {
	
	@Autowired
	private MusicService service;

	@GetMapping("/")	// "/" 오면 return 수행
	public String main() {
		
		return "redirect:list"; // url을 list로 다시 알려줌(redirect로)
	}
	
	@GetMapping("/list")		// 여기로옴
	public ModelAndView showMusicChart() {
		List<Music> list = service.findAll();
		//serviec를 거쳐 저장되어있는 music의 정보를 list형태로 list에 받음
		
		ModelAndView modelAndView = new ModelAndView("list.jsp");
		// ModelAndView 객체에 어디로 가야하는지에 대한 경로명을 지정
		modelAndView.addObject("musicList", list);
		// modelAndView에 service를 거쳐 가져와서 저장한 list를 musicList 라는 이름으로 저장
		// list.jsp로 넘어감
		return modelAndView;
	}
}

// 초기화면 list.jsp로 갈 수 있게 설정