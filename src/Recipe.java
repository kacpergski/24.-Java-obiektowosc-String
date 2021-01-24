public class Recipe
{
    String nameOfRecipe;
    String [] ingredients;
    int timeInMinutes;
    String howTo;

    Recipe(String nameOfRecipe,String [] ingredients, int timeInMinutes, String howTo){

        this.nameOfRecipe = nameOfRecipe;
        this.ingredients = ingredients;
        this.timeInMinutes = timeInMinutes;
        this.howTo = howTo;
    }

    void displayOne(){
        System.out.println("Name: " + nameOfRecipe);
        System.out.print("Ingredients: ");
        for (String ingridient : ingredients){
            System.out.print(ingridient + ", ");

        }
        System.out.println();
        System.out.println("Time: " + timeInMinutes);
        System.out.println("Recipe: " + howTo);

    }

//    void displayMod(){
//        System.out.println("Name: " + nameOfRecipe);
//        System.out.print("Ingredients: ");
//        for (String ingridient : ingredients){
//            System.out.print(ingridient + ", ");
//
//        }
//        System.out.println();
//        System.out.println("Time: " + timeInMinutes);
//        System.out.println("Recipe: " + howTo);
//        System.out.println("Zachęcam do zapoznania się z innymi przepisami");

//    }


}
