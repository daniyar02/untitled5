package com.GEECTECH;

public class Main {

    public static void main(String[] args) {
        Shelter romashka =new Shelter("Romashka","Ibraimova 98");
	Dog sharik = new Dog();
	sharik.setShelter(romashka);
	Dog layka = new Dog("Layka","Чихуахуа",Color.BLACK,romashka);
	layka.setShelter(romashka);
	Dog barsik =new Dog("Barsik","домашный",Color.BROWN,romashka,
            new String[]{"Стоять","Сидеть"});
	barsik.setShelter(romashka);
        System.out.println(barsik.getInfo());
        System.out.println(layka.getInfo());

        barsik.makeVoice("гав гав",3);
        sharik.makeVoice(1,"Гав гав");
        layka.makeVoice("Гав");
    }
}
