package com.example.blog.sshTools;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

// 싱글톤으로 수정해야함!
public class SshChannel {
		
		private static SshChannel sshChannel;
	
		private SshChannel() {
			
		}
		
	    public static SshChannel getInstance() {
	    	// 만약에 처음 생성할 경우 => new SshChannel()
	    	if(sshChannel==null) {
	    		return new SshChannel();
	    	}
	    	else {
	    		// 만약 한번더 생성을 했다면, 기존의 것을 보낸다.
	    		return sshChannel;
	    	}
	    }

		public void makeEmail(String username,String password) {
			
			 String host = "192.168.111.100";
		     int port = 22;
		     String user = "root";
		     String sshPassword = "password";
		     
		     try {
		     JSch jsch = new JSch();
		     Session session = jsch.getSession(user, host, port);
	         session.setPassword(sshPassword);
	         session.setConfig("StrictHostKeyChecking", "no");
	         session.connect();
	         System.out.println("우분투 터미널에 연결 성공했습니다.");
	         
	         // 새로 등록할 회원정보
	         ChannelExec channel = (ChannelExec) session.openChannel("exec");
	         String command = "sudo useradd -m -p $(openssl passwd -1 " + password + ") " + username;
	         // 권한 부여 0755
	         String chmod = "chmod 755 /home/"+username+"/";
	         
	         channel.setCommand(command);
	         channel.connect();
	         channel.disconnect();
	         System.out.println("회원 등록완료?");
		     }
		     catch (Exception e) {
				System.out.println("Fail to connect Linux Terminal");
			}
			
		

	}
	

}
