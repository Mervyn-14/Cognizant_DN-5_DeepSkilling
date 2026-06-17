package com.exmple;

public class Myservice {
    private ExternalApi api;
    public Myservice(ExternalApi api) {
        this.api =api;
    }
    public void processData() {
        api.saveData();
    }
}