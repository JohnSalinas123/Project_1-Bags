/*
    Client program meant to test the three methods 
    (union, intersection,and difference) for the 
    class LinkedBag
 */
 

public class LinkedBagTest { // Question: LinkedBagTest will implement BagInterface ? //

    public static void main(String[] args) {

        // Testing union method : Priscilla
        System.out.println("Start of union method test code: \n");
        // create two bags //
        BagInterface<String> bag1 = new LinkedBag<>();
        BagInterface<String> bag2 = new LinkedBag<>();
        
        // add items to bag 
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");

        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");

        // union of bag 1 and bag 2 and display union bag //
        BagInterface<String> everything = bag1.union(bag2) ;
        displayBag(everything);

        

        // Testing intersection method : John
        System.out.println("\nStart of intersection method test code:\n");
         // Create two linked bags
         BagInterface<String> interBag1 = new LinkedBag<>();
         BagInterface<String> interBag2 = new LinkedBag<>();

         // Fill both bags with elements
         interBag1.add("a");
         interBag1.add("b");
         interBag1.add("c");

         interBag2.add("b");
         interBag2.add("b");
         interBag2.add("d");
         interBag2.add("e");

         // Display both filled bags
         displayBag(interBag1);
         displayBag(interBag2);

         // Intersection of both bags
         BagInterface<String> commonItems = interBag1.intersection(interBag2);

         // Check that both original bags are unalatered
         displayBag(interBag1);
         displayBag(interBag2);
         
         // Display results of intersection method
         displayBag(commonItems);

        

        
        // Testing difference method : Daniel
         System.out.println("\nStart of difference method test code:\n");

        BagInterface<String> diffBag1 = new LinkedBag<>();
        BagInterface<String> diffBag2 = new LinkedBag<>();
        
        diffBag1.add("a");
        diffBag1.add("b");
        diffBag1.add("c");

        diffBag2.add("b");
        diffBag2.add("b");
        diffBag2.add("d");
        diffBag2.add("e");

        BagInterface<String> leftOver1 = diffBag1.difference(diffBag2);

        displayBag(leftOver1);

        BagInterface<String> leftOver2 = diffBag2.difference(diffBag1);

        displayBag(leftOver2);

        
        
    }

    // Tests the method toArray while displaying the bag.
   private static void displayBag(BagInterface<String> aBag)
   {
      System.out.println("The bag contains the following string(s):");
      Object[] bagArray = aBag.toArray();
      for (int index = 0; index < bagArray.length; index++)
      {
         System.out.print(bagArray[index] + " ");
      } // end for
      
      System.out.println();
   } // end displayBag
    
}
