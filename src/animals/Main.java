package animals;

import java.util.*;

public class Main
{
    public static void printAnimals(ArrayList<AbstractAnimal> animal, CheckAnimal tester)
    {
        for(AbstractAnimal v : animal)
        {
            if (tester.test(v))
            {
                System.out.println(v);
            }
        }
    }

    public static void main(String[] args)
    {

        //Mammals
        Mammals Panda = new Mammals("Panda", 1869);
        Mammals Zebra = new Mammals("Zebra", 1778);
        Mammals Koala = new Mammals("Koala", 1816);
        Mammals Sloth = new Mammals("Sloth", 1804);
        Mammals Armadillo = new Mammals("Armadillo", 1758);
        Mammals Raccoon = new Mammals("Raccoon", 1758);
        Mammals Bigfoot = new Mammals("Bigfoot", 2021);

        //Birds
        Birds Pigeon = new Birds("Pigeon", 1837);
        Birds Peacock = new Birds("Peacock", 1821);
        Birds Toucan = new Birds("Toucan", 1758);
        Birds Parrot = new Birds("Parrot", 1824);
        Birds Swan = new Birds("Swan", 1758);

        //Fish
        Fish Salmon = new Fish("Salmon", 1758);
        Fish Catfish = new Fish("Catfish", 1817);
        Fish Perch = new Fish("Perch", 1758);

        ArrayList<AbstractAnimal> myList = new ArrayList<AbstractAnimal>();
        myList.add(Panda);
        myList.add(Zebra);
        myList.add(Koala);
        myList.add(Sloth);
        myList.add(Armadillo);
        myList.add(Raccoon);
        myList.add(Bigfoot);
        myList.add(Pigeon);
        myList.add(Peacock);
        myList.add(Toucan);
        myList.add(Parrot);
        myList.add(Swan);
        myList.add(Salmon);
        myList.add(Catfish);
        myList.add(Perch);

        //Descending Order - Years Named
        System.out.print(" ");
        System.out.print("***");
        System.out.print("Descending Order - Years Named");
        myList.sort((v1,v2) -> v2.getYear() - v1.getYear());
        System.out.println(myList.toString());
        // myList.forEach((v) -> System.out.println(v.getId()));

        //Alphabetic Order - Name
        System.out.print(" ");
        System.out.print("***");
        System.out.print("Alphabetic Order - Name");
        myList.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(myList.toString());

        //Alphabetic Order - Move
        System.out.print(" ");
        System.out.print("***");
        System.out.print("Alphabetic Order - Move");
        myList.sort((v1,v2) -> v1.move().compareToIgnoreCase(v2.move()));
        System.out.println(myList.toString());

        //Animals breathe with lungs
        System.out.print(" ");
        System.out.print("***");
        System.out.print("Animals breathe with lungs");
        printAnimals(myList, v -> (v.breath()=="Lungs"));


        //Animals breathe with lungs and named in 1758
        System.out.print(" ");
        System.out.print("***");
        System.out.print("Animals breathe with lungs and named in 1758");
        printAnimals(myList, v -> (v.breath()=="Lungs" && (v.getYear()==1758)));


        //Animals breathe with lungs and lay eggs
        System.out.print(" ");
        System.out.print("***");
        System.out.print("Animals breathe with lungs and lay eggs");
        printAnimals(myList, v -> (v.breath()=="Lungs" && (v.reproduce()=="Eggs")));

        //Alphabetic Order if born 1758
        System.out.print(" ");
        System.out.print("***");
        System.out.print("Alphabetic Order if born 1758");
        myList.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printAnimals(myList, v -> (v.getYear()==1758));
        
    }
}