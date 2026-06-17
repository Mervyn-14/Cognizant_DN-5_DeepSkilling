package com.exmple;

public class ServiceClass {
	 private ExternalApi api;

	    public ServiceClass(ExternalApi api) {
	        this.api = api;
	    }

	    public void processData() {
	        api.saveData();
	    }
}
