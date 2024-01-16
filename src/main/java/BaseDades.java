/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tomas
 * Subclase de super clase DAW
 */
public class BaseDades extends DAW {
    
    private int numAlumnes;
    private String profesor;
    
    private BaseDades(){    
    }

    public BaseDades(int numAlumnes, String profesor) {
        this.numAlumnes = numAlumnes;
        this.profesor = profesor;
    }
 

    public float getNumAlumnes() {
        return numAlumnes;
    }

    public void setNumAlumnes(int numAlumnes) {
        this.numAlumnes = numAlumnes;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    
    
    
    
}
