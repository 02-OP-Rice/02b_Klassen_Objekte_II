package com.cc.java;

public class Cat {

    private String name;
    private String furColor;
    private int age;    
    
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    
    public String getName() {
        if (checkPermission()) {
            return name; 
        } else {
            return "Sorry, no permission!";
        }   
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }
    

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    // Adresse der Objektinstanz vom Typ Cat
       public Cat getInstanceVar(){
            return this;
        }

    
    private boolean checkPermission(){
        return true;
    }


    
}
