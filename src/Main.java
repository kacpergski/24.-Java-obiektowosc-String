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
    }


}
