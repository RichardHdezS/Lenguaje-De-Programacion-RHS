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
        
    
    public void ejecutaLP(String rootFile, JTextPane tp){
        //IDE msg = new IDE();
        try {
            Sintaxis_RHS parser = new Sintaxis_RHS(new BufferedReader(new FileReader(rootFile)));
            parser.EjecutarLP();
            tp.setText(tp.getText() + "\n" + "Analisis Exitoso");
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
