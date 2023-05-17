////////////////////////////////////////////////////////////////////
// ALESSANDRO BENIN 2042356
// FILIPPO RIGHETTO 2046428
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberUnderOneException extends Exception {
    /* Eccezione per i numeri sotto lo zero */
    public NumberUnderOneException() {
        super("Non esistono numeri romani in negativo.");
    }
}
