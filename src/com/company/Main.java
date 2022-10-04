package com.company;

public class Main {
    public static void main (String [] args){
        Dog dog1 = new Dog("Сніжок", "white");
        Dog dog2 = new Dog("Барсик", "Orange");

        System.out.println("There are two dogs, their names are: " + dog1.name+ " and "+dog2.name);
        String dogText1 = dog1.sayAboutUrself("Вразливий вид, занесений до Червоної книги України. Сучасний ареал кота лісового в Україні охоплює Карпатський регіон, західне Полісся (Волинська та Рівненська області), Поділля, а також дельти Дунаю та Дністра.");
        System.out.println(dog1.name + " has discription: "+dogText1);

        String dogText2 = dog2.sayAboutUrself("Вимерлий в Україні вид. До кінця XIX століття — початку XX століття зустрічалася на Поділлі, Поліссі та на півночі Лісостепу.");
        System.out.println(dog2.name + " has discription: "+dogText2);


    }
}
