package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class NationalPark extends VnTourismTopic{
	public NationalPark() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbr:List_of_national_parks_of_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}