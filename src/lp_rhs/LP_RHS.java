/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lp_rhs;

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
public class LP_RHS {

    
    public static void main(String[] args) {
        try {
            Sintaxis_RHS parser = new Sintaxis_RHS(new BufferedReader(new FileReader("./code_AnalizaExpresiones.txt")));
            parser.EjecutarLP();
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            Logger.getLogger(LP_RHS.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
        } catch(TokenMgrError e){
            System.err.println(e.getMessage());
        }
        
    }
    
}
