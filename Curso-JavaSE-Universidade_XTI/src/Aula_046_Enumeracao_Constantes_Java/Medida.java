
package Aula_046_Enumeracao_Constantes_Java;

/**
 *
 * @author Leonardo VAIO
 */
public enum Medida {
    MM("Milimetro"),CM("Centimetro"),M("Metro");
    
    public String titulo;
    Medida(String titulo){
        this.titulo = titulo;
    }
}
