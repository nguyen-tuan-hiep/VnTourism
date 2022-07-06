package topic.subtopic;

import java.io.File;

import topic.Topic;

public class OperaHouse extends Topic{
	String topic = "OperaHouse";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Opera_houses_in_Vietnam");
	public OperaHouse() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}