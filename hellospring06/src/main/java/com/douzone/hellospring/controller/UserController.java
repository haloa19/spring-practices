package com.douzone.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.vo.UserVo;

/*
 * RequestMapping
 * Class + Method
 * 
 * */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
//	UserRepository userRespository;

	@RequestMapping(value= {"/join", "/j"}, method=RequestMethod.GET)
	public String join() {
		return "join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVo userVo) {  //get, post방식을 구분가능 -> 오버로딩 가능, join과 joinform을 구분할 필요 없음
		System.out.println(userVo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping(value="/update")
	public String update(@RequestParam String name) {  //원래는 @RequestParam이 원칙인데 없어도 가능 (파라미터변수와 name이 다른경우에는 필수 - @RequestParam ("n") String name)
		/**
		 * 만일 n이라는 이름으로 파라미터가 없는 경우 400 Bad Request 오류 발생
		 * */
		System.out.println(name);
		return "UserController:update";
	}
	
	@ResponseBody
	@RequestMapping(value="/update2")
	public String update2(@RequestParam(value="n", required=true, defaultValue = "") String name, @RequestParam(value="a", required=true, defaultValue = "0") int age) {
		System.out.println("-----" + name + ":" + age + "-----");
		return "UserController:update2";
	}
	
}
