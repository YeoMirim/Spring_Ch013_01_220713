package com.mirim.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mirim.dto.MemberDto;   // ��Ű���� �ٸ� ��� import �ʿ��� 

@Controller
public class FormController {

	@RequestMapping("/login")
	public String login() {			
		
		return "login";
	}

/*	
	@RequestMapping("/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {   //  ���� ������ Model��ü�� �Ǿ ����, request ��ü�� �޾������
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "loginOk";
	}
*/	
	
	@RequestMapping("/loginOk")
	public String loginOk(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {   //  Parameter���� ���⿡ �Ǿ��
		
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
			@RequestParam("pw") String pw, @RequestParam("email") String email, Model model) {   //������ �ʹ� �� �������� ������
		
		
		return "joinOk";
	}
*/
	
	// ������(Ŀ�ǵ�) ��ü�� ����ؼ� ���� ��ü�� �����ϰ� ��� ����(Value Object) => DTO ���
	@RequestMapping("/joinOk")
	public String joinOk(MemberDto memberDto, Model model) { // MemberDto�� ���� class�� �Ǿ��ָ� �ش� ��ü�� �� ������ �� ����, Model model�� ��������
		
		model.addAttribute("memberDto", memberDto);		// ���� ������ �κ�
		
		return "joinOk";
	}
	
	@RequestMapping("/member/{memberNum}")  // (��ο� �̸�), ��û ����� ���� �״�� �����ٰ� ������ ���ڴ�.
	public String memberNumber(@PathVariable String memberNum, Model model) { // path�� ��η� ���ڴ�
		
		model.addAttribute("memberNum", memberNum);
		
		return "memberNumber";
	}
	
}
