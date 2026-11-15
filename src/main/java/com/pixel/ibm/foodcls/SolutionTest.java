package com.pixel.ibm.foodcls;

import org.junit.Test;
import java.io.*;
import static org.junit.Assert.assertEquals;

class SolutionTest {

    private String runMain(String input) throws Exception {
        InputStream  originalIn  = System.in;
        PrintStream  originalOut = System.out;

        try (ByteArrayInputStream  fakeIn  = new ByteArrayInputStream(input.getBytes());
             ByteArrayOutputStream fakeOut = new ByteArrayOutputStream();
             PrintStream           ps      = new PrintStream(fakeOut)) {

            System.setIn(fakeIn);
            System.setOut(ps);

            Solution.main(new String[0]);

            return fakeOut.toString();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
   public void sampleCase() throws Exception {
        String input = """
                2
                Bread
                getMacros
                getTaste
                getType
                Egg
                getMacros
                getTaste
                getType
                """;

        String expected = """
                Carbs: 1.1, Fat: 13.8
                Taste: 4
                Bread is Bread
                Protein: 6.3, Fat: 5.3, Cholesterol: 0.6
                Taste: 6
                Egg is Egg
                """;

        assertEquals(expected, runMain(input));
    }

    @Test
    void emptyInput_doesNothing() throws Exception {
        assertEquals("", runMain(""));
    }
}
