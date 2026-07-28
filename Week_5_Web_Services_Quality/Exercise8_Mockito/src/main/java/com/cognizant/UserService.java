package com.cognizant;

public class UserService {

    private final ExternalApi api;

    public UserService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

}