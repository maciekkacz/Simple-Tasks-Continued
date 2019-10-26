package upDateTheBarman;

public class Drink {
    private Ingredient[] ingredient;

    public Drink(Ingredient[] ingredient) {
        this.ingredient = ingredient;
    }

    public Ingredient[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient[] ingredient) {
        this.ingredient = ingredient;
    }
}
