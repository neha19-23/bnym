package com.example.bnym.entity;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;

public class ResponsePojo {
	
	String errorMessage;
	int errorCode;
	Map<String,List<String>> data;
	public String getErrorMessage() {
		return errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public Map<String,List<String>> getData() {
		return data;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public void setData(Map<String,List<String>> data) {
		this.data = data;
	}

	
}
