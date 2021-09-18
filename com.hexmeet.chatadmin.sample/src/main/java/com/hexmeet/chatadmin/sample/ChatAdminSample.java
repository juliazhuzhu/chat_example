package com.hexmeet.chatadmin.sample;

import com.hexmeet.chat.admin.ChatAdminClient;

public class ChatAdminSample {
	
	
	
	
public static void main(String[] args) throws InterruptedException {
	
	   
    	
    	ChatAdminClient admin = ChatAdminClient.getDefaultInstance();
    	admin.setHost("127.0.0.1");
    	admin.setPort(6061);
    	//admin.setUser("hexmeetim");
    	//admin.setPassword("2ghlmcl@#$");
    	admin.setUser("xena");
    	admin.setPassword("xena123");
    	//admin.setLogPath("/Users/zhuyiye/Downloads/MyLogFile.log");
    	//admin.createChatGroup(topic_name, pri_comments);
    	ChatAdminSampleEventHandler event_handler = new ChatAdminSampleEventHandler();
    	admin.setEventNotifier(event_handler);
    	Thread admin_thread = new Thread(admin);
    	admin_thread.start();
    	//admin.login();
    	//admin.stop();
    	admin_thread.join();
        
    	System.out.println("app exited...");
   
    }

}
