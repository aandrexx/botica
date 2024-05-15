package logica;

import javax.swing.JOptionPane;

public class Total {
    
    public double total(double suma, double cantidad){
        return suma;
    }
    public double igv(double total){
        return total*0.18;
    }
    public double descuento(int dia, double total){
        if (dia>=1 && dia<=5) {
            return total*0.1;
        }else{
            if (dia>5 && dia <=7) {
                return total*0.2;
            }else{
                return 0;
            }
        }
    }
    
    public double sub_total(double total, double igv){
        return total-igv;
    }
    public double importe(double total, double igv, double descuento){
        return total+igv-descuento;
    }
    public double vuelto(double pago, double importe){
        if (pago<importe) {
            JOptionPane.showMessageDialog(null, "El pago que se acaba de realizar es menor al importe de los medicamentos");         
        }else{
            return pago-importe;
        }
        return 0;
    }

}
