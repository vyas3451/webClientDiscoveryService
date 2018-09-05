package com.webClientService.webClientDiscoveryService;

public class User {

	
private long id;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private String name;
	
}
