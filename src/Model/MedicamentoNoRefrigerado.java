/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author Sofia Moreno
 */
public class MedicamentoNoRefrigerado extends Medicamento{
    private List<String> noAlmacenar;
    
    public MedicamentoNoRefrigerado(){
        super();
        noAlmacenar.add("1. No Almacenar");
        noAlmacenar.add("2. No Almacenar");
        noAlmacenar.add("3. No Almacenar");
    }

    public List<String> getNoAlmacenar() {
        return noAlmacenar;
    }

    public void setNoAlmacenar(List<String> noAlmacenar) {
        this.noAlmacenar = noAlmacenar;
    }
    
    
}
