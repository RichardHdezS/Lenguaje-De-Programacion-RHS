/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lp_rhs;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author AkiibaRichard
 */
public class AuxLexico {
    public void Analizar(String Cadena)
	{
		StringTokenizer Tokens = new StringTokenizer(Cadena);
		
		int i=0;
      	
        while(Tokens.hasMoreTokens())
            {
                ExpRegulares(Tokens.nextToken());
                i++;
            }
	}
	
public void ExpRegulares(String Token)
	{//en este metodo coocamos todos las palabras reservadas
		Pattern PReservada = Pattern.compile("import|package|class|static|void|main|return|new|null|extense|throw|throws" +
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
		
		if(MatPR.find())
			System.out.println(MatPR.group() + " <Palabra Reservada, " + MatPR.group().toUpperCase() + ">");
		else if(MaTipoAcceso.find())
			System.out.println(MaTipoAcceso.group() + " <Tipo de acceso, " + MaTipoAcceso.group().toUpperCase() + ">");
		else if(MaCondiciones.find())
			System.out.println(MaCondiciones.group() + " <Sentencias de control, " + MaCondiciones.group().toUpperCase() + ">");
		else if(MaOperadoresLogicos.find())
			System.out.println(MaOperadoresLogicos.group() + " <Operador logico, " + MaOperadoresLogicos.group().toUpperCase() + ">");
		else if(MaOperadorAritmeticos.find())
			System.out.println(MaOperadorAritmeticos.group() + " <Operador Aritmetico, " + MaOperadorAritmeticos.group().toUpperCase() + ">");
		else if(MaTiposDatos.find())
			System.out.println(MaTiposDatos.group() + " <Tipo dato, " + MaTiposDatos.group().toUpperCase() + ">");
		else if(MaBoleanos.find())
			System.out.println(MaBoleanos.group() + " <Valor booleano, " + MaBoleanos.group().toUpperCase() + ">");
		else if(MaErrores.find())
			System.out.println(MaErrores.group() + " <Evitar erros, " + MaErrores.group().toUpperCase() + ">");
		else if(MaAsignacion.find())
			System.out.println(MaAsignacion.group() + " <Asignacion, " + MaAsignacion.group().toUpperCase() + ">");
		else if(MaFinalizar.find())
			System.out.println(MaFinalizar.group() + " <Token finalizador, " + MaFinalizar.group().toUpperCase() + ">");
		else if(MaComma.find())
			System.out.println(MaComma.group() + " <Separacion, " + MaComma.group().toUpperCase() + ">");
		else if(MaPARENIzq.find())
			System.out.println(MaPARENIzq.group() + " <Parentesis Izq, " + MaPARENIzq.group().toUpperCase() + ">");
		else if(MaPARENDer.find())
			System.out.println(MaPARENDer.group() + " <Parentesis Der, " + MaPARENDer.group().toUpperCase() + ">");
		else if(MaBRACQIzq.find())
			System.out.println(MaBRACQIzq.group() + " <Braqued Izq, " + MaBRACQIzq.group().toUpperCase() + ">");
		else if(MaBRACQDer.find())
			System.out.println(MaBRACQDer.group() + " <Bracqued Der, " + MaBRACQDer.group().toUpperCase() + ">");
		else if(YaveIni.find())
		  	System.out.println(YaveIni.group() + " <LLave de Inicio, " + YaveIni.group().toUpperCase() + ">");
		else if(YaveFin.find())
		  	System.out.println(YaveFin.group() + " <LLave de cierre, " + YaveFin.group().toUpperCase() + ">");
		else if(VarIdent.find())
		  	System.out.println(VarIdent.group() + " <Identificador, " + VarIdent.group().toUpperCase() + ">");
		else if(MaNumber.find())
		  	System.out.println(MaNumber.group() + " <datoNumerico, " + MaNumber.group().toUpperCase() + ">");
	  }
	
    
}
