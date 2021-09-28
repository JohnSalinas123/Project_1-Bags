import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedBagUnitTesting {

    /**
     * Testing Union method for LinkedBag
     */

    // Tests the union of two empty bags
    @Test
    public void testUnionTwoEmpty() {
        // Create two linked bags
        BagInterface<String> unionBag1 = new LinkedBag<>();
        BagInterface<String> unionBag2 = new LinkedBag<>();

        BagInterface<String> everything = unionBag1.union(unionBag2);

        // Test union of two empty bags results in an empty bag
        assertTrue(everything.isEmpty());

    }

    // Tests the union of an empty bag and a filled bag
    @Test
    public void testUnionOneEmpty() {
        // Create two linked bags
        BagInterface<String> unionBag1 = new LinkedBag<>();
        BagInterface<String> emptyBag1 = new LinkedBag<>();

        // Add string elements to one of the bags
        unionBag1.add("a");
        unionBag1.add("b");
        unionBag1.add("c");

        // Expected contents of the linked bag
        String[] expectedArray = {"a","b","c"};

        BagInterface<String> everything1 = unionBag1.union(emptyBag1);
        BagInterface<String> everything2 = emptyBag1.union(unionBag1);
        
        // Test union of bag and an empty bag
        assertArrayEquals(expectedArray, everything1.toArray());
        assertArrayEquals(expectedArray, everything2.toArray());

    }

    // Tests the union of two filled bags
    @Test
    public void testUnionTwoBags() {
        // Create two linked bags
        BagInterface<String> unionBag1 = new LinkedBag<>();
        BagInterface<String> unionBag2 = new LinkedBag<>();

        // Fill both bags with data
        unionBag1.add("a");
        unionBag1.add("b");
        unionBag1.add("c");
        
        unionBag2.add("b");
        unionBag2.add("b");
        unionBag2.add("d");
        unionBag2.add("e");

        // Expected union of both filled bags
        String[] expectedArray = {"b","b","d","e","a","b","c"};

        BagInterface<String> everything = unionBag1.union(unionBag2);

        assertArrayEquals(expectedArray, everything.toArray());
    }

    /**
     * Testing intersection method for LinkedBag
     */

    // Tests intersection of two empty bags
    @Test
    public void testIntersectionTwoEmpty() {
        // Create two linked bags
        BagInterface<String> interBag1 = new LinkedBag<>();
        BagInterface<String> interBag2 = new LinkedBag<>();

        BagInterface<String> commonItems = interBag1.intersection(interBag2);

        // Test intersection of two empty bags results in an empty bag
        assertTrue(commonItems.isEmpty());

    }

    // Tests the intersection of an empty bag and a filled bag
    @Test
    public void testIntersectionOneEmpty() {
        // Create two linked bags
        BagInterface<String> interBag1 = new LinkedBag<>();
        BagInterface<String> emptyBag1 = new LinkedBag<>();

        // Add string elements to one of the bags
        interBag1.add("a");
        interBag1.add("b");
        interBag1.add("c");

        BagInterface<String> commonItems = interBag1.intersection(emptyBag1);
        
        // Expected to result in an empty bag, because there are no intersections
        assertTrue(commonItems.isEmpty());


}

    // Tests the intersection of two filled bags
    @Test
    public void testIntersectionTwoBags() {
        // Create two linked bags
        BagInterface<String> interBag1 = new LinkedBag<>();
        BagInterface<String> interBag2 = new LinkedBag<>();

        // Fill both bags with data
        interBag1.add("a");
        interBag1.add("b");
        interBag1.add("c");
        
        interBag2.add("b");
        interBag2.add("b");
        interBag2.add("d");

        // Expected intersection of both filled bags
        String[] expectedArray = {"b"};

        BagInterface<String> everything1 = interBag1.intersection(interBag2);
        BagInterface<String> everything2 = interBag2.intersection(interBag1);

        assertArrayEquals(expectedArray, everything1.toArray());
        assertArrayEquals(expectedArray, everything2.toArray());

    }

    /**
     * Testing difference method for LinkedBag 
     */

    // Tests the difference of two empty bags
    @Test
    public void testDiffTwoEmpty() {
        // Create two linked bags
        BagInterface<String> emptyBag1 = new LinkedBag<>();
        BagInterface<String> emptyBag2 = new LinkedBag<>();

        BagInterface<String> leftOver1 = emptyBag1.difference(emptyBag2);
        BagInterface<String> leftOver2 = emptyBag2.difference(emptyBag1);

        // Test difference of two empty bags results in an empty bag
        assertTrue(leftOver1.isEmpty());
        assertTrue(leftOver2.isEmpty());

    }

    // Tests the difference of an empty bag and a filled bag
    @Test
    public void testDiffOneEmpty() {
        // Create two linked bags
        BagInterface<String> diffBag1 = new LinkedBag<>();
        BagInterface<String> emptyBag1 = new LinkedBag<>();

        // Add string elements to one of the bags
        diffBag1.add("a");
        diffBag1.add("b");
        diffBag1.add("c");

        BagInterface<String> leftOver1 = diffBag1.difference(emptyBag1);
        BagInterface<String> leftOver2 = emptyBag1.difference(diffBag1);
        
        String[] expectedLinked = {"a","b","c"}; 

        // Expected to result in expectedLinked
        assertArrayEquals(expectedLinked, leftOver1.toArray());

        // Expected to result in an empty bag
        assertTrue(leftOver2.isEmpty());


}

    // Tests the intersection of two filled bags
    @Test
    public void testDiffTwoBags() {
        // Create two linked bags
        BagInterface<String> interBag1 = new LinkedBag<>();
        BagInterface<String> interBag2 = new LinkedBag<>();

        // Fill both bags with data
        interBag1.add("a");
        interBag1.add("b");
        interBag1.add("c");
        
        interBag2.add("b");
        interBag2.add("b");
        interBag2.add("d");
        interBag2.add("e");

        // Expected union of both filled bags
        String[] expectedArray1 = {"a", "c"};
        String[] expectedArray2 = {"b","d","e"};

        BagInterface<String> leftOver1 = interBag1.difference(interBag2);
        BagInterface<String> leftOver2 = interBag2.difference(interBag1);

        assertArrayEquals(expectedArray1, leftOver1.toArray());

        assertArrayEquals(expectedArray2, leftOver2.toArray());
    }

}

