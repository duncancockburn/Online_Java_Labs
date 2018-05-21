package com.company;

class Controller{
    public static void main(String[] args){
        Engine myEngine = new Engine( 200);
        Engine yourEngine = new Engine( 150);
        Part wheels = new Part("big");
        Part whelsryan = new Part("small");
        Vehicle duncan = new Vehicle("polo","volks",100, "blue", myEngine,wheels);
        Vehicle ryan = new Vehicle("xterra","nisson", 20, "blue", yourEngine, whelsryan);


        duncan.miles = 100000;
        ryan.miles = 200000;
        System.out.println(duncan.toString());
        System.out.println(ryan.toString());

        duncan = paint(duncan);
        ryan = paint(ryan);
        System.out.println(duncan.toString());
        System.out.println(ryan.toString());

    }


    public static Vehicle paint(Vehicle vehicle){
        vehicle.colour = "red";
        return vehicle;
    }

}
