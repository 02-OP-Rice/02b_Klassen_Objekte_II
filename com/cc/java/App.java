package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Cat --> Referenztyp (Klasse aus dem das Objekt ensteht)
        // cat1 --> Refenzvariable (Adresse des Objekts im RAM)

        Cat cat1 = new Cat("Grizabella", "white", 29); // Instanziierung >> Objekt
        output("Blick von aussen: " + cat1); // Adresse des Objekts
        output("Blick von innen: " + cat1.getInstanceVar());


        output(cat1.getName());
        output(cat1.getFurColor());
        output(Integer.toString(cat1.getAge()));

        cat1.setFurColor("pink");
        output(cat1.getFurColor());


        output("--------------------");
        
        Cat cat2 = new Cat("Alonso", "grey", 35);
        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVar());

        
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));

    } 

    // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

