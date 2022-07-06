package topic.subtopic;

import java.io.File;

import topic.Topic;

public class Beach extends Topic{
	String topic = "Beach";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Beaches_of_Vietnam");
	public Beach() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}