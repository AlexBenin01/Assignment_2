////////////////////////////////////////////////////////////////////
// ALESSANDRO BENIN 2042356
// FILIPPO RIGHETTO 2046428
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class NumberAEFourThousand extends Exception {
    /* Eccezione per i numeri superiori o uguali a 4000 */
    public NumberAEFourThousand() {
        super("Non esistono numeri romani maggiori di 3999. ");
    }
}
