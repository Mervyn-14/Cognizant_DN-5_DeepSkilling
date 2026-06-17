package com.exmple;

public class Service {
	 private ExternalApi api;

	    public Service(ExternalApi api) {
	        this.api = api;
	    }

	    public String fetchData(int id) {
	        return api.getData(id);
	    }
}
