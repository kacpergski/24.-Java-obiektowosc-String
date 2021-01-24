public class RecipeRepo {
    // tu są pola

    Recipe [] recipies;
    int i = 0;
    int mod = 0;

     //tu jest konstruktor  -

    RecipeRepo (int size){
      recipies = new Recipe[size];}


    // tu są metody

    void add (Recipe recipe){
        if (i < recipies.length){
           recipies[i] = recipe;
           i++;
        }
        else System.out.println("Yours book is full");
    }
    void displayAll(int mod){

        for (int j = 0; j < recipies.length && recipies[j]!=null; j++) {
            System.out.println("................");
            if (mod == 0) {
                recipies[j].displayOne();}
            else{
                recipies[j].howTo = recipies[j].howTo.replaceAll("\\. ","\\. \\\n");
                // dodac petle by co drugie zdanie, stworzyc tablice zdań i dzilic na akapity
                recipies[j].displayOne();
                System.out.println("Zachęcam do zapoznania się z innymi przepisami");
                }
                        }
    }


}
