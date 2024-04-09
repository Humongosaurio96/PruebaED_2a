/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 *
 * @author ProfDiurno
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Nif automatico con numero y letra autogenerado
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     *
     * @param numero el numero del dni, la letra se genera a partir del numero
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Compara dos objetos para comprobar si son iguales
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
