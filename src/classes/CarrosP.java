/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class CarrosP implements Comparable<CarrosP>{
    
    private String placa;
    private String marca;
    

    public CarrosP (String placa, String marca){
        this.placa = placa;
        this.marca = marca;
                
    }
    
    @Override
    public int compareTo(CarrosP o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getplaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
        @Override
    public String toString(){
        return "Placa: "+placa+ " Modelo: "+marca;
    }
}
