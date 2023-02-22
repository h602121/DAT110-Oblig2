package no.hvl.dat110.messages;

import no.hvl.dat110.messagetransport.MessagingClient;

public class CreateTopicMsg extends Message {

    private String topic;

	// message sent from client to create topic on the broker

    public CreateTopicMsg(String user, String topic) {
        super(MessageType.CREATETOPIC,user);
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "CreateTopicMsg{" +
                "topic='" + topic + '\'' +
                '}';
    }
    // TODO:
	// Implement object variables - a topic is required
	
	// Complete the constructor, get/set-methods, and toString method
    // as described in the project text	
}
