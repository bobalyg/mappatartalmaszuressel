/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Merry Xmas
 */
 class FajlkiterjesztesSzuro implements  FilenameFilter{
    private String kiterjesztes;

    public FajlkiterjesztesSzuro(String kiterjesztes) {
        this.kiterjesztes = kiterjesztes;
    }
    
    

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith("."+kiterjesztes);
        
    }
    
    
}
// a public class nevének kell az osztály nevét tartalmaznia, a másik a belső osztály
public class MappaTartalmaSzuressel {
    public static void main(String[] args) {
        File mappa=new File("c:/windows");
        
        System.out.println("A "+mappa.getAbsolutePath()+" mappa szűrt tartalma (*.ini");
        String[] szurtmappatartalom=mappa.list(new FajlkiterjesztesSzuro("ini"));
        for (String bejegyzes : szurtmappatartalom) {
            System.out.println(bejegyzes+", ");
          
            
        }
        
    }
}

