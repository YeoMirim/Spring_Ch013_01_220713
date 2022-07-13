package com.mirim.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mirim.dto.MemberDto;   // 패키지가 다를 경우 import 필요함 

@Controller
public class FormController {

	@RequestMapping("/login")
	public String login() {			
		
		return "login";
	}

/*	
	@RequestMapping("/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {   //  값을 보낼땐 Model객체에 실어서 보냄, request 객체로 받아줘야함
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "loginOk";
	}
*/	
	
	@RequestMapping("/loginOk")
	public String loginOk(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {   //  Parameter값을 여기에 실어둠
		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "loginOk";
	}
	
	@RequestMapping("/join")
	public String join( ) {
		
		return "join";
	}

/*
	@RequestMapping("/joinOk")
	public String joinOk(@RequestParam("name") String name, @RequestParam("id") String id, 
			@RequestParam("pw") String pw, @RequestParam("email") String email, Model model) {   //변수가 너무 길어서 가독성이 떨어짐
		
		
		return "joinOk";
	}
*/
	
	// 데이터(커맨드) 객체를 사용해서 많은 객체를 간단하게 사용 가능(Value Object) => DTO 사용
	@RequestMapping("/joinOk")
	public String joinOk(MemberDto memberDto, Model model) { // MemberDto로 만든 class를 실어주면 해당 객체들 다 가져올 수 있음, Model model는 생략가능
		
		model.addAttribute("memberDto", memberDto);		// 생략 가능한 부분
		
		return "joinOk";
	}
	
	@RequestMapping("/member/{memberNum}")  // (경로와 이름), 요청 경로의 값을 그대로 가져다가 값으로 쓰겠다.
	public String memberNumber(@PathVariable String memberNum, Model model) { // path를 경로로 쓰겠다
		
		model.addAttribute("memberNum", memberNum);
		
		return "memberNumber";
	}
	
}
