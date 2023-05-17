////////////////////////////////////////////////////////////////////
// ALESSANDRO BENIN 2042356
// FILIPPO RIGHETTO 2046428
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NonRightCharacterException extends Exception {
    public NonRightCharacterException(char c) {
        super("Lettera non valida: " + c);
    }
}
