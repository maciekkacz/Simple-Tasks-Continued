package upDateTheBarman;

import java.util.Scanner;

public class Barman {
    private static Scanner scanner = new Scanner(System.in);

    public Drink createDrink() {
        System.out.println("amount of ingredients");
        int ingredientNumber = scanner.nextInt();
        scanner.nextLine();
        Ingredient[] ingredients = new Ingredient[ingredientNumber];
        for (int i = 0; i < ingredients.length; i++) {
            ingredients[i] = createIngredient();
        }
        return new Drink(ingredients);

    }

    private Ingredient createIngredient() {
        System.out.println("enter the name of the ingredient");
        String ingName = scanner.nextLine();
        System.out.println("enter the amount of ingredient");
        double ingAmount = scanner.nextDouble();
        scanner.nextLine();
        return new Ingredient(ingName, ingAmount);
    }

    public void printDrink(Drink drink) {
        Ingredient[] ingredients = drink.getIngredient();
        System.out.println("the drink consists of " + ingredients + "ingredients");
        for (Ingredient ingredient : ingredients) {
            System.out.print(ingredient.getName());
            System.out.print(" ");
            System.out.println(ingredient.getAmount());
        }
    }
}
