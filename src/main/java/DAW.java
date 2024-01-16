/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tomas
 * Super clase módulo DAW
 */
public class DAW {
    
    private String institut;
    private float mediaAlumnes;


    public DAW() {
        institut = "EmiliDarder";
        mediaAlumnes = 0;
    }

    public String getInstitut() {
        return institut;
    }
    //Método para sacar media aritmética de DAW
    public static double mediaAlumnes(float nota, int numAlumnes){
    float mediaAlumnes = nota / numAlumnes;
    return mediaAlumnes;
        
    }  
    public void setInstitut(String institut) {
        this.institut = institut;
    }

    public float getMediaAlumnes() {
        return mediaAlumnes;
    }

    public void setMediaAlumnes(float mediaAlumnes) {
        this.mediaAlumnes = mediaAlumnes;
    }
    
    
    
    
}
