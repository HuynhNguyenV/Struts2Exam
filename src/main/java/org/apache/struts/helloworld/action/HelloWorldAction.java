package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.helloworld.model.MessageStore;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    private static int helloCount = 0;
    public String execute(){
        messageStore = new MessageStore();

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public int getHelloCount(){
        helloCount++;
        return helloCount;
    }
}
