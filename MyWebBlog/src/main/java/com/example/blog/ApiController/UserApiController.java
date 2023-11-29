package com.example.blog.ApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.Model.roletype;
import com.example.blog.Repository.userRepository;
import com.example.blog.Service.UserService;
import com.example.blog.sshTools.SshChannel;

@RestController
public class UserApiController {
	@Autowired
	private UserService userService;

	@PostMapping("/api/user/joinProc")
	public void joinProc(@RequestBody com.example.blog.Model.user user) {
		user.setRoletype(roletype.USER);
		userService.save(user);
		
		// 우분투 이메일 서버에 회원 등록하기.
		//SshChannel sshChannel = SshChannel.getInstance();
		//sshChannel.makeEmail(user.getUsername(), user.getPassword());
	}
}
