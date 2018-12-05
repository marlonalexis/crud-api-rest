package com.crud.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ListGenericResponse<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private int code;
	private String status;
	private String message;
	private List<T> response;

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<T> getResponse() {
		return response;
	}
	public void setResponse(List<T> response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "ListGenericResponse [code=" + code + ", status=" + status + ", message=" + message + ", response="
				+ response + "]";
	}
	
}