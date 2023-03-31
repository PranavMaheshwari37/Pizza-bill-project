public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        //  Delux dp = new Delux(false);
    //     System.out.println(dp.getPrice());
        //   dp.addExtraCheese();
    //      dp.addExtraCheese();
        //  dp.addTakeaway();
    //    dp.addExtraCheese();
    //     dp.addExtraCheese();
    //     dp.addExtraCheese();
    //     dp.addExtraCheese();
    // //    dp.addExtraCheese();
    // //    dp.addExtraCheese();
    //     dp.addTakeaway();
    // //    dp.addTakeaway();
    // //    dp.addTakeaway();dp.addTakeaway();
    // //    dp.addTakeaway();
    //     dp.addTakeaway();
        //  System.out.println(dp.getBill());

        Simple p = new Simple(true);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeaway();
        p.getBill();
        p.getBill();
        System.out.println(p.getBill());
    }
}
