package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.helloworld.model.MessageStore;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;
    private String userName;
    private static int helloCount = 0;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String execute() throws Exception{
        messageStore = new MessageStore();

        if(userName != null){
            messageStore.setMessage(messageStore.getMessage() + " " + userName);
        }
        helloCount++;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public int getHelloCount(){
        return helloCount;
    }
}
