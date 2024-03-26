import java.io.PrintWriter;
import java.util.Scanner;

interface Pet {
    void play();
}
interface Animal extends Pet{
    void eat();
    void sound();
    void play();
}

class Dog implements Animal {
    @Override
    public void eat(){
        System.out.println("Ест собачий корм");
    }
    public void sound(){
        System.out.println("Издаёт звук 'Гав'");
    }

    @java.lang.Override
    public void play() {
        System.out.println("Играет с костью");
    }
}

class Cat implements Animal{
    public void eat(){
        System.out.println("Ест кошачий корм");
    }
    public void sound(){
        System.out.println("Издаёт звук 'Мяу'");
    }

    @java.lang.Override
    public void play() {
        System.out.println("Играет с комком ниток");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру, под которой находится животное:");
        System.out.println("1. Собака");
        System.out.println("2. Кот");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                Dog dog = new Dog();
                dog.eat();
                dog.sound();
                dog.play();
                break;
            case 2:
                Cat cat = new Cat();
                cat.eat();
                cat.sound();
                cat.play();
                break;
        }
    }
}