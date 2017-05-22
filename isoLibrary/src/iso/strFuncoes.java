/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package iso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author d115970
 */
public class strFuncoes {

    public int DigMod11(String nr_cta)   
    {   
        int peso = 2; 
        int i;
        int somaPonderada =0;
        int tamanho = nr_cta.length();
        char[] aux = nr_cta.toCharArray();
        for (i = tamanho; i >= 1; i--)
           {
            int idx =  Integer.parseInt( String.valueOf(aux[i-1]));
            somaPonderada+= ( idx * peso );
            peso++;
            if (peso == 8) peso = 2;
           }
        int res1 = somaPonderada%11;
        res1 = 11 - res1;
        if (res1 >=10) res1=0;
        return res1;
    }
    
     public String strZero( int value, int n )
    {
    	  String s = Integer.toString( value ).trim();
    	  StringBuffer resp = new StringBuffer();
    	  int fim = n - s.length();
    	  for( int x = 0; x < fim; x++ ) 
    	    resp.append( '0' );
    	  return resp + s;
    }
     
    public String strFillSpaceRight(String texto, int tamanho)
    {
        int tam_entrada = texto.length();
        if (tamanho < tam_entrada)
            return texto.substring(0, tamanho);
        for (int i=0; i< tamanho - tam_entrada; i++)
            texto+=" ";
        return texto;
    }
    public String strReverse(String source) 
    {
    int i, len = source.length();
    StringBuffer dest = new StringBuffer(len);
    for (i = (len - 1); i >= 0; i--)
      dest.append(source.charAt(i));
    return dest.toString();
    }

    public String repeat(char c,int i)
         {
         String tst = "";
         for(int j = 0; j < i; j++)
             {
             tst = tst+c;
             }
         return tst;
     }
     
  public String dateFormat(String format_date)
{
    DateFormat dateFormat = new SimpleDateFormat(format_date);
    Date date = new Date();
    return dateFormat.format(date);
}  
public String microTime()
{
  DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
  Date date = new Date();
  return dateFormat.format(date);  
}
public String dtHoraGMT()
{
  DateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");
  Date date = new Date();
  return dateFormat.format(date);  
}        
        
public String getDataHoraMinSeg()
{
  DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  Date date = new Date();
  return dateFormat.format(date);
}

 public boolean isInteger( String input )   
{   
   try  
   {   
      Integer.parseInt( input );   
      return true;   
   }   
   catch( Exception e)   
   {   
      return false;   
   }   
}  
 
public boolean isAlpha (String input)
{
if ( !input.matches("[\\p{Alnum}[\\-]]*") )    
    return false;
else

  return true;
} 

  
}

