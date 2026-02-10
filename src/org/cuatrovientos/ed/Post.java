package org.cuatrovientos.ed;


import java.time.LocalDate;

public class Post {
String name;
LocalDate createdDate;
String body;
public Post(String name, LocalDate createdDate, String body) {
	super();
	this.name = name;
	this.createdDate = createdDate;
	this.body = body;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(LocalDate createdDate) {
	this.createdDate = createdDate;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
@Override
public String toString() {
	return "Post [name=" + name + ", createdDate=" + createdDate + ", body=" + body + "]";
}


}
