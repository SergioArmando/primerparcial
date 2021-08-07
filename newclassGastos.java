
package Gastos;
import java.util.Scanner;
/**
 *
 * @author Sergio Armando
 */
public class newclassGastos{
    private Scanner teclado = new Scanner(System.in);
    private Double seguro;
    private Double flete;
    private Double aduana;
    private Double acarreos;
    private Double bancos;
    

    public void ObtenerInformacion(){
        System.out.println(" --cantidad  Seguros:-- ");
        setSeguro(Double.valueOf(gets().nextLine()));
        
        System.out.println(" --cantidad  Flete:-- ");
        setFlete(Double.valueOf(gets().nextLine()));
        
        System.out.println(" --cantidad Pago en las Aduanas:-- ");
        setAduana(Double.valueOf(gets().nextLine()));
        
        System.out.println("--cantidad  Acarreos:-- ");
        setAcarreo(Double.valueOf(gets().nextLine()));
        
        System.out.println("--cantidad  pago a Bancos:-- "); 
        setBanco(Double.valueOf(gets().nextLine()));
    }

    public Scanner gets() {
        return teclado;
    }

    public void setT(Scanner teclado) {
        this.teclado = teclado;
    }

    public Double getSeguro() {
        return seguro;
    }

    public void setSeguro(Double seguro) {
        this.seguro = seguro;
    }

    public Double getFlete() {
        return flete;
    }

    public void setFlete(Double flete) {
        this.flete = flete;
    }

    public Double getAduana() {
        return aduana;
    }

    public void setAduana(Double aduana) {
        this.aduana = aduana;
    }

    public Double getAcarreo() {
        return acarreos;
    }

    public void setAcarreo(Double acarreo) {
        this.acarreos = acarreo;
    }

    public Double getBanco() {
        return bancos;
    }

    public void setBanco(Double banco) {
        this.bancos = banco;
    }
}


