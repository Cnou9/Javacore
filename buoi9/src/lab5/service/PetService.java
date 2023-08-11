package lab5.service;

import lab5.entities.Pet;
import lab5.entities.TYPE;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PetService {
    public void Match(ArrayList<Pet> pets) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap thong tin pet: ");
        System.out.println("Nhap ten: ");
        String name= scanner.nextLine();
        System.out.println("Nhap giong loai : ");
        String species= scanner.nextLine();
        System.out.println("Nhap tuoi cua pet: ");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh cua pet: ");
        boolean sex= Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhap dac diem cua pet: ");
        String description= scanner.nextLine();
        System.out.println("Nhap loai(CAT/DOG): ");
        TYPE type=TYPE.valueOf(scanner.nextLine());
        System.out.println("Image: ");
        String images= scanner.nextLine();
        Pet pet=new Pet("D1","BC",1,true,"BC", TYPE.DOG,"Img1");

        Random random=new Random();
        do {
            int index=random.nextInt(pets.size());
            System.out.println(index);
            Pet petDisplay=pets.get(index);
            if(petDisplay.isSex()!=pet.isSex()&&petDisplay.getType()==pet.getType()){
                System.out.println(petDisplay);
                break;
            }
            System.out.println("Do you want to continue?");
            String ans=scanner.nextLine();

        } while (true);

    }
}
