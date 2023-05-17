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
    public void testPrintI() throws NumberUnderOneException, NumberAEFourThousand {
        int arabic_number = 1;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String(" _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n"));
    }

    @Test
    public void testPrintV() throws NumberUnderOneException, NumberAEFourThousand {
        int arabic_number = 5;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String("__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n"));

    }

    @Test
    public void testPrintX() throws NumberUnderOneException, NumberAEFourThousand {
        int arabic_number = 10;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String("__   __\n" +
                "\\ \\ / /\n" +
                " \\ V / \n" +
                "  > <  \n" +
                " / . \\ \n" +
                "/_/ \\_\\\n"));

    }

    @Test
    public void testPrintL() throws NumberUnderOneException, NumberAEFourThousand {
        int arabic_number = 50;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String(" _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n"));

    }

    @Test
    public void testPrintC() throws NumberUnderOneException, NumberAEFourThousand {
        int arabic_number = 100;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String("  _____ \n" +
                " / ____|\n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                " \\_____|\n"));

    }

    @Test
    public void testPrintD() throws NumberUnderOneException, NumberAEFourThousand {
        int arabic_number = 500;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String(" _____  \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ \n"));

    }

    @Test
    public void testPrintM() throws NumberUnderOneException, NumberAEFourThousand {
        int arabic_number = 1000;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String(" __  __ \n" +
                "|  \\/  |\n" +
                "| \\  / |\n" +
                "| |\\/| |\n" +
                "| |  | |\n" +
                "|_|  |_|\n"));

    }

    @Test
    public void testNumberZeroAsciiArt() throws NumberUnderOneException, NumberAEFourThousand {
        int arabic_number = 0;
        String ascii_art_for_zero = printer.print(arabic_number);
        assertEquals(ascii_art_for_zero, new String(""));
    }

   
}
