package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class RomanPrinterTest {
    static RomanPrinter printer;

    @BeforeClass
    public static void initializePrinter() {
        printer = new RomanPrinter();
    }

    

    @Test
    public void testNumberZeroAsciiArt() throws NumberUnderOneException, NumberAEFourThousand {
        int arabic_number = 0;
        String ascii_art_for_zero = printer.print(arabic_number);
        assertEquals(ascii_art_for_zero, new String(""));
    }

   
}
