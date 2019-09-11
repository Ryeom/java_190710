package com.test.demo;

public class ActionForward {

	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	private boolean isRedirect = false;
	private String path = null;
	
	
}
