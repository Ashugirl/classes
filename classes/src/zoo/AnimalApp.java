package zoo;

public class AnimalApp {
    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.color1 = "brown";
        cat.color2 = "grey";
        cat.feathers = false;
        cat.fur = true;
        cat.legs = 4;
        cat.wings = 0;

        System.out.printf("\nThis animal is %s and %s.", cat.color1, cat.color2);
        System.out.println("\nThis animal has feathers. true or false? " + cat.feathers);
        System.out.println("This animal has fur. true or false? " + cat.fur);
        System.out.printf("This animal has %d legs.", cat.legs);
        System.out.printf("\nThis animal has %d wings.", cat.wings);

        Animal robin = new Animal();
        robin.color1 = "light brown";
        robin.color2 = "red";
        robin.feathers = true;
        robin.fur = false;
        robin.legs = 2;
        robin.wings = 2;

        System.out.printf("\n\nThis animal is %s and %s.", robin.color1, robin.color2);
        System.out.println("\nThis animal has feathers. true or false? " + robin.feathers);
        System.out.println("This animal has fur. true or false? " + robin.fur);
        System.out.printf("This animal has %d legs.", robin.legs);
        System.out.printf("\nThis animal has %d wings.", robin.wings);

        Animal blackWidow = new Animal();
        blackWidow.color1 = "black";
        blackWidow.color2 = "red";
        blackWidow.fur = false;
        blackWidow.feathers = false;
        blackWidow.legs = 8;
        blackWidow.wings = 0;

        System.out.printf("\n\nThis animal is %s and %s.", blackWidow.color1, blackWidow.color2);
        System.out.println("\nThis animal has feathers. true or false? " + blackWidow.feathers);
        System.out.println("This animal has fur. true or false? " + blackWidow.fur);
        System.out.printf("This animal has %d legs.", blackWidow.legs);
        System.out.printf("\nThis animal has %d wings.", blackWidow.wings);

        Animal bee = new Animal();
        bee.color1 = "black";
        bee.color2 = "yellow";
        bee.fur = false;
        bee.feathers = false;
        bee.legs = 6;
        bee.wings = 2;

        System.out.printf("\n\nThis animal is %s and %s.", bee.color1, bee.color2);
        System.out.println("\nThis animal has feathers. true or false? " + bee.feathers);
        System.out.println("This animal has fur. true or false? " + bee.fur);
        System.out.printf("This animal has %d legs.", bee.legs);
        System.out.printf("\nThis animal has %d wings.", bee.wings);

        Animal bat = new Animal();
        bat.color1 = "brown";
        bat.color2 = "black";
        bat.fur = true;
        bat.feathers = false;
        bat.legs = 4;
        bat.wings = 2;

        System.out.printf("\n\nThis animal is %s and %s.", bat.color1, bat.color2);
        System.out.println("\nThis animal has feathers. true or false? " + bat.feathers);
        System.out.println("This animal has fur. true or false? " + bat.fur);
        System.out.printf("This animal has %d legs.", bat.legs);
        System.out.printf("\nThis animal has %d wings.", bat.wings);








    }
}
