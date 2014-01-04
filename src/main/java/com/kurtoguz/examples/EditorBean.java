package com.kurtoguz.examples;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class EditorBean {
 
	private String value = "Editor";
 
	public String getValue() {
		return value;
	}
 
	public void setValue(String value) {
		this.value = value;
	}
}