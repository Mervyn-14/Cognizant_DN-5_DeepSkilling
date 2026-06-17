package com.exmple;

public class Service {
	 private Repositary repository;

	    public Service(Repositary repository) {
	        this.repository = repository;
	    }

	    public String processData() {
	        return "Processed " + repository.getData();
	    }
}
