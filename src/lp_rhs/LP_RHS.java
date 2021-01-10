/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lp_rhs;
import IDE.IDE;
        
/**
 *
 * @author AkiibaRichard
 * @author MiGaki
 * @author FlipEduardo7
 */

/*
Si desean modificar la sintaxis deben entrar al archivo 'Sintaxis.jj' que esta
dentro de la carpeta Analizador.
Una vez que haya terminado de hacer modificaciones deben compilar el archivo 
con javacc, para ello:
        1.-En el CMD accedan hasta la carpeta donde esta el archivo .jj
        2.- Ejecuten la intruccion javacc Sintaxis.jj
        3.- Listo, el resto de archivos dentro de la carpeta analizador se actu-
        alizaran. Ya solo recuerden ejecutar en nuestro "IDE" :) una neuva sintaxis
        con las nuevas modificaciones.
*/
import Analizador.Sintaxis_RHS;
import Analizador.ParseException;
import Analizador.TokenMgrError;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
public class LP_RHS {
        
    
    public void ejecutaLP(String rootFile, JTextPane tp, String Entrada){
        //IDE msg = new IDE();
        try {
            Sintaxis_RHS parser = new Sintaxis_RHS(new BufferedReader(new FileReader(rootFile)));
            parser.EjecutarLP();
            tp.setText(tp.getText() + "\n" + "Analisis Exitoso");
            new Compilador(Entrada, tp);//enviamos el texto de entrada a analizar
        } catch (ParseException e) {
            tp.setText(tp.getText() + "\n" + e.getMessage());
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            tp.setText(tp.getText() + "\n" + e.getMessage());
            Logger.getLogger(LP_RHS.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
        } catch(TokenMgrError e){
            tp.setText(tp.getText() + "\n" + e.getMessage());
            //System.err.println(e.getMessage());
        }
    }
    
}
