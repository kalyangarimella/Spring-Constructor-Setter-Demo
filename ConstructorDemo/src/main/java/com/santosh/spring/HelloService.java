package com.santosh.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelloService {
	
	private String message;
	private Map<String, String> map;
	private List<String> list;
	private Set<String> set;
	private Properties props; 
	
	public HelloService() {
		this.message = "Hello to Spring Framework (Default Message)";
	}
	
	public HelloService(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public HelloService(Map<String, String> map) {
		this.map = map;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public HelloService(List<String> list) {
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}
	
	public HelloService(Set<String> set) {
		this.set = set;
	}

	public Set<String> getSet() {
		return set;
	}

	public HelloService(Properties props) {
		this.props = props;
	}

	public Properties getProps() {
		return props;
	}	
}
