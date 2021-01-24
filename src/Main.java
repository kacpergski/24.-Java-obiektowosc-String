public class Main {
    public static void main(String[] args) {
        String[] postCodes = {"52-023","52-02","53--50","0--95"};

       // postCodes.postCodesCheck();

        //postCodesCheck(String[] postCodes){
            for (String postCode: postCodes){
                if (postCode.indexOf('-') == 2 && postCode.length() == 6)
                    System.out.println("Postcode "+ postCode +" correct");
                else
                {
                    System.out.println("Postcode " +postCode + " inncorect");
                }
            }

            //Zadanie 2
        System.out.println();
        System.out.println("*******************************************************");
        System.out.println();
        RecipeRepo recipiesAll = new RecipeRepo(5);

        String [] ingredients = {"woda","mąka","drożdże"};

        Recipe r1 = new Recipe("Chleb", ingredients, 20,"STEP 1 Mix 500g strong white flour, 2 tsp salt and a 7g sachet of fast-action yeast in a large bowl. STEP 2  Make a well in the centre, then add 3 tbsp olive oil and 300ml water, and mix well. If the dough seems a little stiff, add another 1-2 tbsp water and mix. STEP 3 Tip onto a lightly floured work surface and knead for around 10 mins. STEP 4 Once the dough is satin-smooth, place it in a lightly oiled bowl and cover with cling film. Leave to rise for 1 hour until doubled in size or place in the fridge overnight. STEP 5 Line a baking tray with baking parchment. Knock back the dough (punch the air out and pull the dough in on itself) then gently mould the dough into a ball.");
        recipiesAll.add(r1);
        Recipe r2 = new Recipe("Chleb2", ingredients, 25,"Zmieszać i upiec");
        recipiesAll.add(r2);
        //r1.displayOne();


        recipiesAll.displayAll(1);
    }


}
