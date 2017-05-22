/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package iso;


/**
 *
 * @author D115970
 */

public class msgISO
{
    private String msg_iso;
    private String MIT;
    private String[] bit = new String[129];
 
 public msgISO()
 {
      IsoStructure.doInitiate();
 }
    public void setMsg (String msg)
    {
        this.msg_iso=msg;
    }
    public String getMsg()
    {
        return this.msg_iso;
    }
    public String getMIT()
    {
        return this.MIT;
    }
    public void setMIT(String mit)
    {
        this.MIT=mit;
    }
    public void doClear()
    {
       this.MIT=null;
       this.msg_iso=null;
       for (int k=1;k<128;k++)
       {
          this.bit[k]=null;
       }
    }      
    public void makeIsoMsg()
    {
        String aux="";
        String bits="";
        String bit_hexa="";
        Integer tamanho=128;
        boolean second_bitmap=false;
        for (Integer k=1;k<129;k++)
        {
            if (this.get_bit(k)==null)
            {
                bits+="0";
            }
            else
            {
                bits+="1";
            }
            if ( k > 63 && this.get_bit(k)!=null)
                second_bitmap=true;
        }
        if (second_bitmap)
             bits = "1" + bits.substring(1);
         if ( bits.substring(0,1).equals("0"))
        {
            bits=bits.substring(0,64);
            tamanho=64;
        }
        for (Integer k=0;k<tamanho;k=k+4)
        {
            bit_hexa+= this.BinaryToHexa(bits.substring(k, k+4));
        }
        aux=this.getMIT()+bit_hexa;
        strFunc str1 = new strFunc();
        for (Integer k=2;k<129;k++)
        {
         if (this.get_bit(k)!=null)
         {
            if (IsoStructure.iso_length[k].equals("LL"))
            {
                aux+= str1.strZero(this.get_bit(k).length(),2);
                aux+= this.get_bit(k);
            } 
            else
                if (IsoStructure.iso_length[k].equals("LLL"))
                {
                  aux+= str1.strZero(this.get_bit(k).length(),3);
                  aux+= this.get_bit(k);
                }  
                else
                {
                  aux+= this.get_bit(k);
                }
          }
        }
        this.setMsg(aux);
    }
public static String getSubCampo(String bit, String subcampo)
{
  int pointer =0;
  String id_subcampo;
  String conteudo;
  int tam_subcampo;
  String retorno=null;
  //String bit1= bit.substring(3);
  int len = bit.length();
  while (pointer < len)
  {
      tam_subcampo = Integer.valueOf(bit.substring(pointer, pointer+3));
      id_subcampo = bit.substring(pointer+3, pointer+5);
      conteudo = bit.substring(pointer+5,pointer+tam_subcampo+3);
      pointer=pointer+tam_subcampo+3;
      if (id_subcampo.equals(subcampo)) {
          retorno=conteudo;
      }
     }
  return retorno;
  }
 public void loadFields()   // ISO parser
    {
        this.setMIT(this.msg_iso.substring(0,4));
        String bitmaphexa1 = this.msg_iso.substring(4,20);
        int k;
        String bit_hexa;
        Integer bit1;
        Integer pointer;
        Integer field_length;
        String bitmap1="";
        String bitmap2="";
        String bitmap_tot="";
        for (k=0;k<bitmaphexa1.length();k++)
        {
           bit_hexa=bitmaphexa1.substring(k,k+1);
           bitmap1+= this.HexaToBinary(bit_hexa);
        }
        pointer=20;
        if ( bitmap1.substring(0,1).equals("1") )   // there is a second bitmap
        {
         String bitmaphexa2 = this.msg_iso.substring(20,36);
         for (k=0;k<bitmaphexa2.length();k++)
           {
             bit_hexa=bitmaphexa2.substring(k,k+1);
             bitmap2+= this.HexaToBinary(bit_hexa);
           }   
        }
        bitmap_tot = bitmap1 + bitmap2;
        for (k=0;k<bitmap_tot.length();k++)
        {    
         bit1 = Integer.parseInt(bitmap_tot.substring(k,k+1));
         if (bit1==1)
         {    
          if (IsoStructure.iso_length[k+1].equals("LL"))
            {
             field_length = Integer.parseInt(this.msg_iso.substring(pointer,pointer+2));
             this.bit[k+1]=this.msg_iso.substring(pointer+2, pointer+2+field_length);
             pointer=pointer+field_length+2;
            }
           else
              if (IsoStructure.iso_length[k+1].equals("LLL"))
               {
                field_length = Integer.parseInt(this.msg_iso.substring(pointer,pointer+3));
                this.bit[k+1]=this.msg_iso.substring(pointer+3,pointer+3+field_length);
                pointer=pointer+field_length+3;
               }   
              else
              {
                field_length = Integer.parseInt(IsoStructure.iso_length[k+1]); 
                this.bit[k+1]=this.msg_iso.substring(pointer,pointer+field_length);
                pointer=pointer+field_length;
               }
        }
     }
    
    }
    public void set_bit(Integer nbit, String bit_value)
    {
        this.bit[nbit]=bit_value;
    }
    public String get_bit(Integer nbit)
    {
        return this.bit[nbit];
    }
   public boolean msgCheckFields()   // check if all numeric fields has really numeric values
   {
       strFunc str = new strFunc();
       boolean error = false;
       for (Integer k=1;k<128;k++)
       {
           if (this.bit[k]!=null)
              if (IsoStructure.iso_type[k].equalsIgnoreCase("NUMERIC"))
                  if (!str.isInteger(this.bit[k]))
                      {
                       error=true;
                       System.out.println("msgCheckFields - Erro Field("+k+")");
                      }
       }
       if (error)
           return false;
       else
           return true;
     }
    private String HexaToBinary(String hexa)
    {
     String aux="";   
     if (hexa.equals("0")) aux= "0000";
     if (hexa.equals("1")) aux= "0001";
     if (hexa.equals("2")) aux= "0010";
     if (hexa.equals("3")) aux= "0011";
     if (hexa.equals("4")) aux= "0100";
     if (hexa.equals("5")) aux= "0101";
     if (hexa.equals("6")) aux= "0110";
     if (hexa.equals("7")) aux= "0111";
     if (hexa.equals("8")) aux= "1000";
     if (hexa.equals("9")) aux= "1001";
     if (hexa.equals("A")) aux= "1010";
     if (hexa.equals("B")) aux= "1011";
     if (hexa.equals("C")) aux= "1100";
     if (hexa.equals("D")) aux= "1101";
     if (hexa.equals("E")) aux= "1110";
     if (hexa.equals("F")) aux= "1111";
     return aux;
    }
     private String BinaryToHexa(String bin)
    {
     String aux="";   
     if (bin.equals("0000")) aux= "0";
     if (bin.equals("0001")) aux= "1";
     if (bin.equals("0010")) aux= "2";
     if (bin.equals("0011")) aux= "3";
     if (bin.equals("0100")) aux= "4";
     if (bin.equals("0101")) aux= "5";
     if (bin.equals("0110")) aux= "6";
     if (bin.equals("0111")) aux= "7";
     if (bin.equals("1000")) aux= "8";
     if (bin.equals("1001")) aux= "9";
     if (bin.equals("1010")) aux= "A";
     if (bin.equals("1011")) aux= "B";
     if (bin.equals("1100")) aux= "C";
     if (bin.equals("1101")) aux= "D";
     if (bin.equals("1110")) aux= "E";
     if (bin.equals("1111")) aux= "F";
     return aux;
    }
     
}     
            

