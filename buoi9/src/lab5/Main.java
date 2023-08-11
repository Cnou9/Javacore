package lab5;

import lab5.entities.Pet;
import lab5.entities.TYPE;
import lab5.service.PetService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        Pet pet1=new Pet("Dog1","spe1",1,true,"dog",TYPE.DOG,"img1");
        Pet pet2=new Pet("Dog2","spe2",1,false,"dog",TYPE.DOG,"img2");
        Pet pet3=new Pet("Dog3","spe3",1,true,"dog",TYPE.DOG,"img4");
        Pet pet4=new Pet("Cat1","spe1",1,false,"dog",TYPE.CAT,"img5");
        Pet pet5=new Pet("Cat2","spe2",1,true,"dog",TYPE.CAT,"img6");
        Pet pet6=new Pet("Cat3","spe3",1,true,"dog",TYPE.CAT,"img7");
        ArrayList<Pet> pets=new ArrayList<>(Arrays.asList(pet1,pet2,pet3,pet4,pet5,pet6));


        PetService petService=new PetService();
        petService.Match(pets);
    }
}
