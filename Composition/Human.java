package Composition;

public class Human {
    private Heart heart;
    Human(){
        heart=new Heart();
    }

    public void features(){
        System.out.println("Human is living");
        heart.beat();
    }
    public static void main(String[] args) {
        Human a=new Human();
        a.features();
    }
}
