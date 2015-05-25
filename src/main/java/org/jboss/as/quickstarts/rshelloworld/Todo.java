package org.jboss.as.quickstarts.rshelloworld;

public class Todo {
	private String id;
	private String summary;
	private String description;
	
	Todo(String id, String summary){
		this.id = id;
		this.summary = summary;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descryption) {
		this.description = descryption;
	}

}
