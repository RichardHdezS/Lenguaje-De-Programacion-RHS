/*
 * Esta clase tendra todo elc odigo que permite darle "semantica al codigo analizado"
 */
package lp_rhs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTextPane;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author Ricardo
 */
public class Compilador {
    String Entrada="";
    //creamos 4 arreglos que permitiran guardar las variables
    String [] variablesDec;
    String [] variablesStr;
    String [] variablesChr;
    String [] variablesBool;
    JTextPane consola;
    public Compilador(String ent, JTextPane tp) {
        //System.out.println("La entrada fue: \n " + ent);
        Entrada=ent;   
        consola=tp;
        String [] lineas = Entrada.split("\\s");
       /* for(int i=0; i<lineas.length; i++){
               System.out.println(i + lineas[i]);
        }*/
        busquedaVariables(lineas);
        busquedaPrints(lineas);
    }

    private void busquedaVariables(String[] lineas) {
        int i=0, iniciaDato=0, finDato=0;
        boolean datoDec=false, datoStr=false, datoBool=false, datoChr=false;
        String TiposDec="", TiposStr="", TiposChr="", TiposBool="";
        while(i<lineas.length){//recorremos palaba a palabera de toda la entrada
         if(lineas[i].equals("Dec"))//si encontramos la delcracion de un Dec
         {
             iniciaDato=i+1;
             //System.out.println("Encontre Dec en la posicion " + iniciaDato);
             datoDec=true;
         }
         else if(lineas[i].equals("Str")){  //si encontramos la declaracion de un Str
             iniciaDato=i+1;
             //System.out.println("Encontre Str en la posicion " + iniciaDato);
             datoStr=true;
         }
         else if(lineas[i].equals("Bool")){  //si encontramos la declaracion de un Bool
             iniciaDato=i+1;
             //System.out.println("Encontre Bool en la posicion " + iniciaDato);
             datoBool=true;
         }
         else if(lineas[i].equals("Chr")){  //si encontramos la declaracion de un Chr
             iniciaDato=i+1;
             //System.out.println("Encontre Chr en la posicion " + iniciaDato);
             datoChr=true;
         }
         //fin de la localizacion del inicio de variables
         
         //extraemos todas las declaracion de un tipo de variables
         //EXTRAEMOS DEC
         if(datoDec==true && lineas[i].equals(";")){//si encontramos un Dec, seguimos analizando hasta encontrar un ; lo que indica que hasta ese punto se crearon varoables del mismo tipo
             finDato=i;//marcamos donde se encontro el ;
             for(int c=iniciaDato; c<=finDato; c++){
             TiposDec=TiposDec+lineas[c];//extraemos toda la declaracion de ese tipo de dato en Resultante
            }
             datoDec=false;//un vez terminada la extraccion, colocamos el tipo de dato en false para que puedan existir otras declaraciones
         }
         //EXTRAEMOS STR
         else if(datoStr==true && lineas[i].equals(";")){
              finDato=i;//marcamos donde se encontro el ;
              for(int c=iniciaDato; c<=finDato; c++){
                  TiposStr=TiposStr+lineas[c];//extraemos toda la declaracion de ese tipo de dato en Resultante
              }
              datoStr=false;//un vez terminada la extraccion, colocamos el tipo de dato en false para que puedan existir otras declaraciones
         }
         //EXTRAEMOS CHR
         else if(datoChr==true && lineas[i].equals(";")){
              finDato=i;//marcamos donde se encontro el ;
              for(int c=iniciaDato; c<=finDato; c++){
                  TiposChr=TiposChr+lineas[c];//extraemos toda la declaracion de ese tipo de dato en Resultante
              }
              datoChr=false;//un vez terminada la extraccion, colocamos el tipo de dato en false para que puedan existir otras declaraciones
         }
         //EXTRAEMOS BOOL
         else if(datoBool==true && lineas[i].equals(";")){
              finDato=i;//marcamos donde se encontro el ;
              for(int c=iniciaDato; c<=finDato; c++){
                  TiposBool=TiposBool+lineas[c];//extraemos toda la declaracion de ese tipo de dato en Resultante
              }
              datoBool=false;//un vez terminada la extraccion, colocamos el tipo de dato en false para que puedan existir otras declaraciones
         }
         //fin de la extraccion de un mismo tipo
         
         
        i++;//aun mentamos el contador que recorre toda la entrada
        }
        variablesDec=TiposDec.split(",|;|=");//separa las cadenas de las variables por comas',' o punto y coma ';'
          variablesStr=TiposStr.split(",|;|=");//separa las cadenas de las variables por comas',' o punto y coma ';'
            variablesChr=TiposChr.split(",|;|=");//separa las cadenas de las variables por comas',' o punto y coma ';'
              variablesBool=TiposBool.split(",|;|=");//separa las cadenas de las variables por comas',' o punto y coma ';'
    }

    private void busquedaPrints(String[] lineas) {
        int iniciaSentencia=0, finSentencia=0;
        boolean escribe=false;
        String es="";
        int i =0;
        while(i < lineas.length){
            if(lineas[i].equals("_escribe_"))
            {iniciaSentencia=i;
            escribe=true;}
            if(escribe==true && lineas[i].equals(";")){
                finSentencia=i;
                for(int e=iniciaSentencia; e<finSentencia; e++){//extraemos la sentencia _escribe_
                    es=es+lineas[e] + "";
                }
            }
            i++;
        }
        System.out.println(es);
        String [] variable=es.split("_escribe_");
        buscaValor(variable);
    }

    private void buscaValor(String[] variable) {
        for(int i=1; i<variable.length; i++){
            String dato=variable[i].substring(0,2);
            String nombre=variable[i].substring(2);
            System.out.println("El dato es: "+ dato + " El nombre es: "+nombre);
            if(dato.equals("%d")){//si se imprimira u numero
                boolean dec=false;
                for(int d=0; d<variablesDec.length; d++){//busco en el arreglo de numeros
                    if(variablesDec[d].equals(nombre)){
                        consola.setText(consola.getText() + "\n" +variablesDec[d+1] + "\n");
                        dec=true;
                    }
                }
                if(dec==false){
                    consola.setText(consola.getText() + "\n" + "ERROR: La variable '" +nombre + "' no fue declarada" + "\n"); break;
                }
            }
            else if(dato.equals("%s")){//si se imprimira u numero
              boolean str=false;
                for(int s=0; s<variablesStr.length; s++){//busco en el arreglo de numeros
                  if(variablesStr[s].equals(nombre)){
                      consola.setText(consola.getText() + "\n" +variablesStr[s+1].substring(1,variablesStr[s+1].length()-1) + "\n");
                      str=true;
                  }
              }
                if(str==false){consola.setText(consola.getText() + "\n" + "ERROR: La variable '" +nombre + "' no fue declarada" + "\n"); break;}
          }
            else  if(dato.equals("%c")){//si se imprimira u numero
                boolean chr=false;
                for(int c=0; c<variablesChr.length; c++){//busco en el arreglo de numeros
                    if(variablesChr[c].equals(nombre)){
                        consola.setText(consola.getText() + "\n" +variablesChr[c+1].substring(1,variablesChr[c+1].length()-1) + "\n");
                        chr=true;
                    }
                }
                if(chr==false){consola.setText(consola.getText() + "\n" + "ERROR: La variable '" +nombre + "' no fue declarada" + "\n"); break;}
            }
             else if(dato.equals("%b")){//si se imprimira u numero
                boolean bool=false;
                 for(int b=0; b<variablesBool.length; b++){//busco en el arreglo de numeros
                    if(variablesBool[b].equals(nombre)){
                        consola.setText(consola.getText() + "\n" +variablesBool[b+1] + "\n");
                        bool=true;
                    }
                }
                 if(bool==false){consola.setText(consola.getText() + "\n" + "ERROR: La variable '" +nombre + "' no fue declarada" + "\n"); break;}
            }
        }genObjeCod();
    }
  
    public void genObjeCod(){
        String [] ext = Entrada.split(" ");
         String nameFile="obj_"+ext[1]+".ree";
         System.out.println(nameFile);
        try {
           
            String ruta = "E:\\NetBeansProjects\\Lenguaje-De-Programacion-RHS\\src\\lp_rhs\\"+nameFile;
            String contenido = "initiali_Treeofvars_";
           for(int d=0; d<variablesDec.length; d++){contenido=contenido+variablesDec[d]+"%d";}
            for(int s=0; s<variablesDec.length; s++){contenido=contenido+variablesDec[s]+"%s";}
            for(int c=0; c<variablesDec.length; c++){contenido=contenido+variablesDec[c]+"%c";}
            for(int b=0; b<variablesDec.length; b++){contenido=contenido+variablesDec[b]+"%d";}
            contenido=contenido+Entrada.replaceAll("(Dec|Str|Bool|Chr)|\\s|;", "");
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
