package com.hexmeet.chatadmin.sample;

import com.hexmeet.chat.admin.ChatEventNotifier;
import com.hexmeet.chat.admin.ChatAdminClient;
import com.hexmeet.chat.admin.ChatAdminEvent;
import com.hexmeet.chat.admin.ChatAdminMsgEvent;
import com.hexmeet.chat.admin.ChatAdminGroupMsgEvent;

public class ChatAdminSampleEventHandler implements ChatEventNotifier{

	public void onEvent(ChatAdminEvent event) {
		System.out.println(event.getEventType());
		
		if (ChatAdminEvent.EVENT_TYPE.LOGIN_SUCCESS == event.getEventType()) {
			
			ChatAdminClient.getDefaultInstance().createChatGroup("beluga", "");
		}
		
	}
}
