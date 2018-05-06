package com.sandeep;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void init() {
        System.out.println("Inside init");
    }
    public void destroy() {
        System.out.println("Destroying...");
    }
}
