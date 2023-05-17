////////////////////////////////////////////////////////////////////
// ALESSANDRO BENIN 2042356
// FILIPPO RIGHETTO 2046428
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberUnderZeroException extends Exception {
    /* Eccezione per i numeri sotto lo zero */
    public NumberUnderZeroException() {
        super("Non esistono numeri romani in negativo.");
    }
}