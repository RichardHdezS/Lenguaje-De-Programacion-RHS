/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lp_rhs;
import IDE.IDE;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AkiibaRichard
 */
public class AuxLexico {
     IDE tabla =new IDE();
     DefaultTableModel miModelo;// definimos un defaultTablemodel para el metodo analizar que recive la tabal de IDE
 
    //*******************************************************************************************
    public void Analizar(String Cadena, JTable ta)
	{
            String [] columnas = {"Lexema", "Token"};//con un arreglo, definimos las columnas de la tabla
            miModelo = new DefaultTableModel(null,columnas);//las definimos al modelo de la tabla
            
		StringTokenizer Tokens = new StringTokenizer(Cadena);
		int i=0;
                while(Tokens.hasMoreTokens())
                    {
                        ExpRegulares(Tokens.nextToken());
                        i++;
                    }
                ta.setModel(miModelo);//al final del analisis de los tokens, establecemos las filas del modleo a la tabla de IDE
        }
    //*****************************************************************************************
public void ExpRegulares(String Token)
	{//en este metodo coocamos todos las palabras reservadas
		Pattern PReservada = Pattern.compile("BEGIN|StartMain|import|package|class|static|void|main|return|new|null|extense|throw|throws" +
			"|break|continue|default|implements|super|this|super|abstract|interface|synchronized");
		Pattern PTipoAcceso=Pattern.compile("public|private|protected|finally|final|Menu");
		Pattern TCiclos =Pattern.compile("for|do|while|foreach");
		Pattern TCondiciones = Pattern.compile("if|else|ifelse|switch|case");
		Pattern TOperadoresLogicos = Pattern.compile(">|<|>=|<=|!=|==|&&");
		Pattern	TOperadorAritmeticos = Pattern.compile("\\+|\\-|\\/|\\%|\\*|\\++|\\--|\\^");
		Pattern TiposDatos = Pattern.compile("int|short|long|byte|double|float|String|chart|BigInteger|boolean");
		Pattern TBoleanos = Pattern.compile("true|false");
		Pattern TErrores = Pattern.compile("try|catch");
		
		Pattern LLaveIni = Pattern.compile("\\{");
		Pattern LLaveFin = Pattern.compile("\\}");
		
		Pattern TAsignacion = Pattern.compile("\\=");
		Pattern TFinalizar = Pattern.compile("\\;");
		Pattern TComma = Pattern.compile("\\,");
		
		Pattern PARENIzq = Pattern.compile("\\(");
		Pattern PARENDer = Pattern.compile("\\)");
		
		Pattern BRACQIzq = Pattern.compile("\\[");
		Pattern BRACQDer = Pattern.compile("\\]");
		
		Pattern Comillas = Pattern.compile("\"");
		Pattern Comilla = Pattern.compile("\\'");
		
		Pattern PIdentificador = Pattern.compile("([a-zA-Z|_]+([0-9]|[a-zA-Z]|_)*)+"); 
		Pattern TNumber = Pattern.compile("[0-9]*");  
//***fin de los tokens***//
		
//***Comenzamos a marcar los tokens***//
		Matcher MatPR = PReservada.matcher(Token);
		Matcher MaTipoAcceso = PTipoAcceso.matcher(Token);
		Matcher MaCiclos = TCiclos.matcher(Token);
		Matcher MaCondiciones = TCondiciones.matcher(Token);
		Matcher MaOperadoresLogicos = TOperadoresLogicos.matcher(Token);
		Matcher MaOperadorAritmeticos = TOperadorAritmeticos.matcher(Token);
		Matcher MaTiposDatos = TiposDatos.matcher(Token);
		Matcher MaBoleanos = TBoleanos.matcher(Token);
		Matcher MaErrores = TErrores.matcher(Token);
		Matcher YaveIni = LLaveIni.matcher(Token);
		Matcher YaveFin = LLaveFin.matcher(Token);
		Matcher VarIdent = PIdentificador.matcher(Token);
		Matcher MaAsignacion = TAsignacion.matcher(Token);
		Matcher MaFinalizar = TFinalizar.matcher(Token);
		Matcher MaComma = TComma.matcher(Token);
		Matcher MaPARENIzq = PARENIzq.matcher(Token);
		Matcher MaPARENDer = PARENDer.matcher(Token);
		Matcher MaBRACQIzq  = BRACQIzq.matcher(Token);
		Matcher MaBRACQDer = BRACQDer.matcher(Token);
		Matcher MaNumber = TNumber.matcher(Token);
		Matcher MaComillas = Comillas.matcher(Token);
		Matcher MaComilla = Comilla.matcher(Token);
		
		
                if(MatPR.find()){
                    //System.out.println(MatPR.group() + " <Palabra Reservada, " + MatPR.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                    fila[0] = "Palabra Reservada";
                    fila[1] = MatPR.group().toString();
                   miModelo.addRow(fila);
                    
                }
		else if(MaTipoAcceso.find()){
                   // System.out.println(MaTipoAcceso.group() + " <Tipo de acceso, " + MaTipoAcceso.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                    fila[0] = "Tipo de acceso";
                    fila[1] = MaTipoAcceso.group().toString();
                   miModelo.addRow(fila);
                    
                }
			
		else if(MaCondiciones.find()){
                    	//System.out.println(MaCondiciones.group() + " <Sentencias de control, " + MaCondiciones.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Sentencia de Control";
                        fila[1] = MaCondiciones.group().toString();
                       miModelo.addRow(fila);
                        
                }
		
		else if(MaOperadoresLogicos.find()){
                	//System.out.println(MaOperadoresLogicos.group() + " <Operador logico, " + MaOperadoresLogicos.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Operador logico";
                        fila[1] = MaOperadoresLogicos.group().toString();
                       miModelo.addRow(fila);
                        
                }
		
		else if(MaOperadorAritmeticos.find()){
                    	//System.out.println(MaOperadorAritmeticos.group() + " <Operador Aritmetico, " + MaOperadorAritmeticos.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Operador Aritmetico";
                        fila[1] = MaOperadorAritmeticos.group().toString();
                       miModelo.addRow(fila);
                        
                }
		
		else if(MaTiposDatos.find()){
                    	//System.out.println(MaTiposDatos.group() + " <Tipo dato, " + MaTiposDatos.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Tipo de Dato";
                        fila[1] = MaTiposDatos.group().toString();
                       miModelo.addRow(fila);
                        
                }
		
		else if(MaBoleanos.find()){
                    	//System.out.println(MaBoleanos.group() + " <Valor booleano, " + MaBoleanos.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Valor Booleano";
                        fila[1] = MaBoleanos.group().toString();
                       miModelo.addRow(fila);
                        
                }
		
		else if(MaErrores.find()){
                        //System.out.println(MaErrores.group() + " <Evitar erros, " + MaErrores.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Manejo de Errores";
                        fila[1] = MaErrores.group().toString();
                       miModelo.addRow(fila);
                        
                }
			
		else if(MaAsignacion.find()){
                    // System.out.println(MaAsignacion.group() + " <Asignacion, " + MaAsignacion.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Token de Asignasion";
                        fila[1] = MaAsignacion.group().toString();
                       miModelo.addRow(fila);
                        
                }
			
		else if(MaFinalizar.find()){
                    	//System.out.println(MaFinalizar.group() + " <Token finalizador, " + MaFinalizar.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Token de Finalizacion";
                        fila[1] = MaFinalizar.group().toString();
                       miModelo.addRow(fila);
                        
                }
		
		else if(MaComma.find()){
                    	//System.out.println(MaComma.group() + " <Separacion, " + MaComma.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Token de Separacion";
                        fila[1] = MaComma.group().toString();
                       miModelo.addRow(fila);
                        
                }
		
		else if(MaPARENIzq.find()){
                    	//System.out.println(MaPARENIzq.group() + " <Parentesis Izq, " + MaPARENIzq.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Parentesis Izquierdo";
                        fila[1] = MaPARENIzq.group().toString();
                       miModelo.addRow(fila);
                        
                }
			
		else if(MaPARENDer.find()){
                    	//System.out.println(MaPARENDer.group() + " <Parentesis Der, " + MaPARENDer.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Parentesis Derecho";
                        fila[1] = MaPARENDer.group().toString();
                       miModelo.addRow(fila);
                        
                }
		
		else if(MaBRACQIzq.find()){
                    	//System.out.println(MaBRACQIzq.group() + " <Braqued Izq, " + MaBRACQIzq.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Corchete Derecho";
                        fila[1] = MaBRACQIzq.group().toString();
                       miModelo.addRow(fila);
                        
                }
		
		else if(MaBRACQDer.find()){
                    	//System.out.println(MaBRACQDer.group() + " <Bracqued Der, " + MaBRACQDer.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Corcherte Izquierdo";
                        fila[1] = MaBRACQDer.group() + "";
                       miModelo.addRow(fila);
                        
                }
		
		else if(YaveIni.find()){
                    	//System.out.println(YaveIni.group() + " <LLave de Inicio, " + YaveIni.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Llave Izquierda";
                        fila[1] = YaveIni.group().toString();
                       miModelo.addRow(fila);
                        
                }
		  
		else if(YaveFin.find()){
                    	//System.out.println(YaveFin.group() + " <LLave de cierre, " + YaveFin.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Llave Derecha";
                        fila[1] = YaveFin.group().toString();
                       miModelo.addRow(fila);
                        
                }
		  
		else if(VarIdent.find()){
                    	//System.out.println(VarIdent.group() + " <Identificador, " + VarIdent.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Identificador";
                        fila[1] = VarIdent.group() + "";
                       miModelo.addRow(fila);
                        
                }
		  
		else if(MaNumber.find()){
                    	//System.out.println(MaNumber.group() + " <datoNumerico, " + MaNumber.group().toUpperCase() + ">");
                    String [] fila=new String[2];//arreglo que maneja las filas de la tabla de tokens
                        fila[0] = "Llave Derecha";
                        fila[1] = MaNumber.group().toString();
                       miModelo.addRow(fila);
                        
                }
		  
	  }
	
    
}
