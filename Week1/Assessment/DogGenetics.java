
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleogden
 */
public class DogGenetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String dogName = sc.nextLine();
        
        System.out.println("Well then, I have this highly reputable report on " + dogName + "'s prestigous background right here.\n");
        System.out.println(dogName + " is:\n");
        
        int sum = 0;
        Random percentages = new Random();
        
        int[] dogBreedPercentages = new int[5];
        do
        {
            dogBreedPercentages[0] = percentages.nextInt(100);
            dogBreedPercentages[1] = percentages.nextInt(100);
            dogBreedPercentages[2] = percentages.nextInt(100);
            dogBreedPercentages[3] = percentages.nextInt(100);
            dogBreedPercentages[4] = percentages.nextInt(100);
            sum = (dogBreedPercentages[0] + dogBreedPercentages[1] + dogBreedPercentages[2] + dogBreedPercentages[3] + dogBreedPercentages[4]);
        } while (sum != 100);
        
        System.out.println(dogBreedPercentages[0] + "% German Shepard");
        System.out.println(dogBreedPercentages[1] + "% Siberian Husky");
        System.out.println(dogBreedPercentages[2] + "% Golden Retriever");
        System.out.println(dogBreedPercentages[3] + "% Chihuahua");
        System.out.println(dogBreedPercentages[4] + "% Bijon Frise");
        
        System.out.println("\nWow, that's QUITE the dog!");
        
    }
}
