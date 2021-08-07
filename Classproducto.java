
package producto;
import java.util.Scanner;

/**
 *
 * @author Sergio Armando
 */
public class Classproducto {
    private Scanner teclados = new Scanner(System.in);
    private String descripcion;
    private int cantidades;
    private Double valores;
    private Double pesos;
    
    public void recolectarInformacion(){
        System.out.println("--registre la especificación del producto:-- ");
        setDescripcion(getT().nextLine());
        
        System.out.println("--registre  cantidad:-- ");
        setCantidad(getT().nextInt());
        getT().nextLine();
        
        System.out.println("--registre  valor en factura :-- ");
        setValor(Double.valueOf(getT().nextLine()));
        
        System.out.println("--registre  peso:-- ");
        setPeso(Double.valueOf(getT().nextLine()));
    }

   
    public Scanner getT() {
        return teclados;
    }

    
    public void setT(Scanner t) {
        this.teclados = teclados;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidades;
    }

    
    public void setCantidad(int cantidad) {
        this.cantidades = cantidad;
    }

    
    public Double getValor() {
        return valores;
    }

    
    public void setValor(Double valor) {
        this.valores = valor;
    }

    
    public Double getPeso() {
        return pesos;
    }

    
    public void setPeso(Double peso) {
        this.pesos = peso;
    }

    
}

