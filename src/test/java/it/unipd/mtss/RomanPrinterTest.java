package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RomanPrinterTest {
    static RomanPrinter printer;

    @BeforeClass
    public static void initializePrinter() {
        printer = new RomanPrinter();
    }

    @Rule
    public Timeout timer = new Timeout(5000);

    @Test
    public void testPrintI() throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 1;
        String expected = new String(" _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n");

        String ascii_art_for_I = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_I);
    }

    @Test
    public void testPrintV() throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 5;
        String expected = new String("__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n");

        String ascii_art_for_V = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_V);
    }

    @Test
    public void testPrintX() throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 10;
        String expected = new String("__   __\n" +
                "\\ \\ / /\n" +
                " \\ V / \n" +
                "  > <  \n" +
                " / . \\ \n" +
                "/_/ \\_\\\n");

        String ascii_art_for_X = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_X);
    }

    @Test
    public void testPrintL() throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 50;
        String expected = new String(" _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n");

        String ascii_art_for_L = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_L);
    }

    @Test
    public void testPrintC() throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 100;
        String expected = new String("  _____ \n" +
                " / ____|\n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                " \\_____|\n");

        String ascii_art_for_C = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_C);
    }

    @Test
    public void testPrintD() throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 500;
        String expected = new String(" _____  \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ \n");

        String ascii_art_for_D = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_D);
    }

    @Test
    public void testPrintM() throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 1000;
        String expected = new String(" __  __ \n" +
                "|  \\/  |\n" +
                "| \\  / |\n" +
                "| |\\/| |\n" +
                "| |  | |\n" +
                "|_|  |_|\n");

        String ascii_art_for_M = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_M);
    }

    @Test
    public void testNumberZeroAsciiArt()
            throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 0;
        String expected = "";

        String ascii_art_for_zero = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_zero);
    }

    @Test
    public void testLettersCombination1666()
            throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 1666;
        String expected = new String(
                " __  __ " + " _____  " + "  _____ " + " _      " + "__   __" + "__      __" + " _____ \n" +
                        "|  \\/  |" + "|  __ \\ " + " / ____|" + "| |     " + "\\ \\ / /" + "\\ \\    / /" + "|_   _|\n"
                        +
                        "| \\  / |" + "| |  | |" + "| |     " + "| |     " + " \\ V / " + " \\ \\  / / " + "  | |  \n" +
                        "| |\\/| |" + "| |  | |" + "| |     " + "| |     " + "  > <  " + "  \\ \\/ /  " + "  | |  \n" +
                        "| |  | |" + "| |__| |" + "| |____ " + "| |____ " + " / . \\ " + "   \\  /   " + " _| |_ \n" +
                        "|_|  |_|" + "|_____/ " + " \\_____|" + "|______|" + "/_/ \\_\\" + "    \\/    "
                        + "|_____|\n");

        String ascii_art_for_1666 = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_1666);
    }

    @Test
    public void testLettersCombination511()
            throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 511;
        String expected = new String(" _____  " + "__   __" + " _____ \n" +
                "|  __ \\ " + "\\ \\ / /" + "|_   _|\n"
                + "| |  | |" + " \\ V / " + "  | |  \n" +
                "| |  | |" + "  > <  " + "  | |  \n" +
                "| |__| |" + " / . \\ " + " _| |_ \n" +
                "|_____/ " + "/_/ \\_\\"
                + "|_____|\n");

        String ascii_art_for_511 = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_511);
    }

    @Test
    public void testLettersCombination56()
            throws NumberUnderZeroException, NumberOverFiveThousand, NonRightCharacterException {
        int arabic_number = 65;
        String expected = new String(" _      " + "__   __" + "__      __\n" +
                "| |     " + "\\ \\ / /" + "\\ \\    / /\n" +
                "| |     " + " \\ V / " + " \\ \\  / / \n" +
                "| |     " + "  > <  " + "  \\ \\/ /  \n" +
                "| |____ " + " / . \\ " + "   \\  /   \n" +
                "|______|" + "/_/ \\_\\" + "    \\/    \n");

        String ascii_art_for_65 = printer.print(arabic_number);

        assertEquals(expected, ascii_art_for_65);
    }
}
