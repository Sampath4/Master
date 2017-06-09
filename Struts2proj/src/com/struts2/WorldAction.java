package com.struts2;

public class WorldAction {

private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String execute() throws Exception
{
	return "Success";
}
}

