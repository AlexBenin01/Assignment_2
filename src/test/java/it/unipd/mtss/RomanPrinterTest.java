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
    public void testPrintI() throws NumberUnderZeroException, NumberAEFiveThousand {
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
    public void testPrintV() throws NumberUnderZeroException, NumberAEFiveThousand {
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
    public void testPrintX() throws NumberUnderZeroException, NumberAEFiveThousand {
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
    public void testPrintL() throws NumberUnderZeroException, NumberAEFiveThousand {
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
    public void testPrintC() throws NumberUnderZeroException, NumberAEFiveThousand {
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
    public void testPrintD() throws NumberUnderZeroException, NumberAEFiveThousand {
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
    public void testPrintM() throws NumberUnderZeroException, NumberAEFiveThousand {
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
    public void testNumberZeroAsciiArt() throws NumberUnderZeroException, NumberAEFiveThousand {
        int arabic_number = 0;
        String ascii_art_for_zero = printer.print(arabic_number);
        assertEquals(ascii_art_for_zero, new String(""));
    }

    @Test
    public void testLettersCombination1666() throws NumberUnderZeroException, NumberAEFiveThousand {
        int arabic_number = 1666;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I,
                new String(" __  __ " + " _____  " + "  _____ " + " _      " + "__   __" + "__      __" + " _____ \n" +
                        "|  \\/  |" + "|  __ \\ " + " / ____|" + "| |     " + "\\ \\ / /" + "\\ \\    / /" + "|_   _|\n"
                        +
                        "| \\  / |" + "| |  | |" + "| |     " + "| |     " + " \\ V / " + " \\ \\  / / " + "  | |  \n" +
                        "| |\\/| |" + "| |  | |" + "| |     " + "| |     " + "  > <  " + "  \\ \\/ /  " + "  | |  \n" +
                        "| |  | |" + "| |__| |" + "| |____ " + "| |____ " + " / . \\ " + "   \\  /   " + " _| |_ \n" +
                        "|_|  |_|" + "|_____/ " + " \\_____|" + "|______|" + "/_/ \\_\\" + "    \\/    "
                        + "|_____|\n"));
    }
}
