package be.intecbrussel;

public class PersonApp {

    public static void main(String[] args) {

        Person Aviva = new Person("Aviva", "Shuman", 54, 152, 62);

        System.out.println("This person's name is " + Aviva.getName() + " " + Aviva.getSurname());
        System.out.println("This person is " + Aviva.getAge() + " years old.");
        System.out.println("This person is " + Aviva.getHeight() + " cms tall.");
        System.out.println("This person weighs " + Aviva.getWeight() + "kgs.");
        System.out.println();

        Person Jan = new Person("Jan", "Jacob", 52, 177, 79);


        System.out.println("This person's name is " + Jan.getName() + " " + Jan.getSurname());
        System.out.println("This person is " + Jan.getAge() + " years old.");
        System.out.println("This person is " + Jan.getHeight() + " cms tall.");
        System.out.println("This person weighs " + Jan.getWeight() + "kgs.");
        System.out.println();

        Person poes = new Person("Poes", "Klein Gent", 14);
        poes.setHeight(25);
        poes.setWeight(5);
        
        System.out.println("This person's name is " + poes.getName() + " " + poes.getSurname());
        System.out.println("This person is " + poes.getAge() + " years old.");
        System.out.println("This person is " + poes.getHeight() + " cms tall.");
        System.out.println("This person weighs " + poes.getWeight() + "kgs.");
        System.out.println();

    }
}
