package iso;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author D115970
 */
public class IsoStructure
{
    static String[] iso_length = new String[130];
    static String[] iso_type = new String[130];
    static String[] iso_desc = new String[130];
  
    
public static void doInitiate()
{
IsoStructure.iso_length[1]="0016";
IsoStructure.iso_type[1]="ANS";
IsoStructure.iso_desc[1]="SecondBitMap";

IsoStructure.iso_length[2]="LL";
IsoStructure.iso_type[2]="NUMERIC";
IsoStructure.iso_desc[2]="PrimAcountN";

IsoStructure.iso_length[3]="0006";
IsoStructure.iso_type[3]="NUMERIC";
IsoStructure.iso_desc[3]="PCODE";

IsoStructure.iso_length[4]="0012";
IsoStructure.iso_type[4]="NUMERIC";
IsoStructure.iso_desc[4]="Valor";

IsoStructure.iso_length[5]="0012";
IsoStructure.iso_type[5]="NUMERIC";
IsoStructure.iso_desc[5]="VlrReconcil";

IsoStructure.iso_length[6]="0012";
IsoStructure.iso_type[6]="NUMERIC";
IsoStructure.iso_desc[6]="VlrCardBil";

IsoStructure.iso_length[7]="0010";
IsoStructure.iso_type[7]="NUMERIC";
IsoStructure.iso_desc[7]="DtHoraGMT";

IsoStructure.iso_length[8]="0008";
IsoStructure.iso_type[8]="NUMERIC";
IsoStructure.iso_desc[8]="ACardBilFee";

IsoStructure.iso_length[9]="0008";
IsoStructure.iso_type[9]="NUMERIC";
IsoStructure.iso_desc[9]="ConvertRate";

IsoStructure.iso_length[10]="0008";
IsoStructure.iso_type[10]="NUMERIC";
IsoStructure.iso_desc[10]="ConvRateBil";

IsoStructure.iso_length[11]="0006";
IsoStructure.iso_type[11]="NUMERIC";
IsoStructure.iso_desc[11]="NSUOrigem";

IsoStructure.iso_length[12]="0006";
IsoStructure.iso_type[12]="NUMERIC";
IsoStructure.iso_desc[12]="HoraLocal";

IsoStructure.iso_length[13]="0004";
IsoStructure.iso_type[13]="NUMERIC";
IsoStructure.iso_desc[13]="DtLocMMDD";

IsoStructure.iso_length[14]="0004";
IsoStructure.iso_type[14]="NUMERIC";
IsoStructure.iso_desc[14]="DateExpir";

IsoStructure.iso_length[15]="0006";
IsoStructure.iso_type[15]="NUMERIC";
IsoStructure.iso_desc[15]="DateSetElem";

IsoStructure.iso_length[16]="0004";
IsoStructure.iso_type[16]="NUMERIC";
IsoStructure.iso_desc[16]="DateConversion";

IsoStructure.iso_length[17]="0004";
IsoStructure.iso_type[17]="NUMERIC";
IsoStructure.iso_desc[17]="DateCapture";

IsoStructure.iso_length[18]="0004";
IsoStructure.iso_type[18]="NUMERIC";
IsoStructure.iso_desc[18]="MerchType";

IsoStructure.iso_length[19]="0003";
IsoStructure.iso_type[19]="NUMERIC";
IsoStructure.iso_desc[19]="CountryCode";

IsoStructure.iso_length[20]="0003";
IsoStructure.iso_type[20]="NUMERIC";
IsoStructure.iso_desc[20]="CountCodePAc";

IsoStructure.iso_length[21]="0003";
IsoStructure.iso_type[21]="NUMERIC";
IsoStructure.iso_desc[21]="CountCodeInst";

IsoStructure.iso_length[22]="0003";
IsoStructure.iso_type[22]="NUMERIC";
IsoStructure.iso_desc[22]="ModoEntra";

IsoStructure.iso_length[23]="0003";
IsoStructure.iso_type[23]="NUMERIC";
IsoStructure.iso_desc[23]="CardSeqNumb";

IsoStructure.iso_length[24]="0003";
IsoStructure.iso_type[24]="NUMERIC";
IsoStructure.iso_desc[24]="FunctionCode";

IsoStructure.iso_length[25]="0004";
IsoStructure.iso_type[25]="NUMERIC";
IsoStructure.iso_desc[25]="MessageReason";

IsoStructure.iso_length[26]="0002";
IsoStructure.iso_type[26]="NUMERIC";
IsoStructure.iso_desc[26]="Tamanho Senha Usuario";

IsoStructure.iso_length[27]="";
IsoStructure.iso_type[27]="";
IsoStructure.iso_desc[27]="";

IsoStructure.iso_length[28]="";
IsoStructure.iso_type[28]="";
IsoStructure.iso_desc[28]="";

IsoStructure.iso_length[29]="";
IsoStructure.iso_type[29]="";
IsoStructure.iso_desc[29]="";

IsoStructure.iso_length[30]="";
IsoStructure.iso_type[30]="";
IsoStructure.iso_desc[30]="";

IsoStructure.iso_length[31]="LL";
IsoStructure.iso_type[31]="NUMERIC";
IsoStructure.iso_desc[31]="RefData";

IsoStructure.iso_length[32]="LL";
IsoStructure.iso_type[32]="NUMERIC";
IsoStructure.iso_desc[32]="CodBanco";

IsoStructure.iso_length[33]="";
IsoStructure.iso_type[33]="";
IsoStructure.iso_desc[33]="";

IsoStructure.iso_length[34]="";
IsoStructure.iso_type[34]="";
IsoStructure.iso_desc[34]="";

IsoStructure.iso_length[35]="LL";
IsoStructure.iso_type[35]="AN";
IsoStructure.iso_desc[35]="Trilha-2";

IsoStructure.iso_length[36]="";
IsoStructure.iso_type[36]="";
IsoStructure.iso_desc[36]="";

IsoStructure.iso_length[37]="";
IsoStructure.iso_type[37]="";
IsoStructure.iso_desc[37]="";

IsoStructure.iso_length[38]="";
IsoStructure.iso_type[38]="";
IsoStructure.iso_desc[38]="";

IsoStructure.iso_length[39]="0002";
IsoStructure.iso_type[39]="AN";
IsoStructure.iso_desc[39]="RespCode";

IsoStructure.iso_length[40]="";
IsoStructure.iso_type[40]="";
IsoStructure.iso_desc[40]="";

IsoStructure.iso_length[41]="0008";
IsoStructure.iso_type[41]="ANS";
IsoStructure.iso_desc[41]="Terminal";

IsoStructure.iso_length[42]="0015";
IsoStructure.iso_type[42]="ANS";
IsoStructure.iso_desc[42]="CodOrigem";

IsoStructure.iso_length[43]="";
IsoStructure.iso_type[43]="";
IsoStructure.iso_desc[43]="";

IsoStructure.iso_length[44]="";
IsoStructure.iso_type[44]="";
IsoStructure.iso_desc[44]="";

IsoStructure.iso_length[45]="LL";
IsoStructure.iso_type[45]="ANS";
IsoStructure.iso_desc[45]="Trilha-1";

IsoStructure.iso_length[46]="";
IsoStructure.iso_type[46]="";
IsoStructure.iso_desc[46]="";

IsoStructure.iso_length[47]="";
IsoStructure.iso_type[47]="";
IsoStructure.iso_desc[47]="";

IsoStructure.iso_length[48]="LLL";
IsoStructure.iso_type[48]="ANS";
IsoStructure.iso_desc[48]="SubCampo";

IsoStructure.iso_length[49]="0003";
IsoStructure.iso_type[49]="AN";
IsoStructure.iso_desc[49]="CodMoeda";

IsoStructure.iso_length[50]="";
IsoStructure.iso_type[50]="";
IsoStructure.iso_desc[50]="";

IsoStructure.iso_length[51]="";
IsoStructure.iso_type[51]="";
IsoStructure.iso_desc[51]="";

IsoStructure.iso_length[52]="0016";
IsoStructure.iso_type[52]="NUMERIC";
IsoStructure.iso_desc[52]="SenhaCrip";

IsoStructure.iso_length[53]="0016";
IsoStructure.iso_type[53]="NUMERIC";
IsoStructure.iso_desc[53]="KeyCripto";

IsoStructure.iso_length[54]="";
IsoStructure.iso_type[54]="";
IsoStructure.iso_desc[54]="";

IsoStructure.iso_length[55]="";
IsoStructure.iso_type[55]="";
IsoStructure.iso_desc[55]="";

IsoStructure.iso_length[56]="";
IsoStructure.iso_type[56]="";
IsoStructure.iso_desc[56]="";

IsoStructure.iso_length[57]="";
IsoStructure.iso_type[57]="";
IsoStructure.iso_desc[57]="";

IsoStructure.iso_length[58]="";
IsoStructure.iso_type[58]="";
IsoStructure.iso_desc[58]="";

IsoStructure.iso_length[59]="";
IsoStructure.iso_type[59]="";
IsoStructure.iso_desc[59]="";

IsoStructure.iso_length[60]="";
IsoStructure.iso_type[60]="";
IsoStructure.iso_desc[60]="";

IsoStructure.iso_length[61]="LLL";
IsoStructure.iso_type[61]="ANS";
IsoStructure.iso_desc[61]="SubCampo";

IsoStructure.iso_length[62]="LLL";
IsoStructure.iso_type[62]="ANS";
IsoStructure.iso_desc[62]="SubCampo";

IsoStructure.iso_length[63]="LLL";
IsoStructure.iso_type[63]="ANS";
IsoStructure.iso_desc[63]="SubCampo";

IsoStructure.iso_length[64]="0016";
IsoStructure.iso_type[64]="AN";
IsoStructure.iso_desc[64]="Autenticacao";

IsoStructure.iso_length[65]="";
IsoStructure.iso_type[65]="";
IsoStructure.iso_desc[65]="";

IsoStructure.iso_length[66]="";
IsoStructure.iso_type[66]="";
IsoStructure.iso_desc[66]="";

IsoStructure.iso_length[67]="";
IsoStructure.iso_type[67]="";
IsoStructure.iso_desc[67]="";

IsoStructure.iso_length[68]="";
IsoStructure.iso_type[68]="";
IsoStructure.iso_desc[68]="";

IsoStructure.iso_length[69]="";
IsoStructure.iso_type[69]="";
IsoStructure.iso_desc[69]="";

IsoStructure.iso_length[70]="0003";
IsoStructure.iso_type[70]="NUMERIC";
IsoStructure.iso_desc[70]="Abert/Fechamento Sessao";

IsoStructure.iso_length[71]="";
IsoStructure.iso_type[71]="";
IsoStructure.iso_desc[71]="";

IsoStructure.iso_length[72]="";
IsoStructure.iso_type[72]="";
IsoStructure.iso_desc[72]="";

IsoStructure.iso_length[73]="";
IsoStructure.iso_type[73]="";
IsoStructure.iso_desc[73]="";

IsoStructure.iso_length[74]="";
IsoStructure.iso_type[74]="";
IsoStructure.iso_desc[74]="";

IsoStructure.iso_length[75]="";
IsoStructure.iso_type[75]="";
IsoStructure.iso_desc[75]="";

IsoStructure.iso_length[76]="";
IsoStructure.iso_type[76]="";
IsoStructure.iso_desc[76]="";

IsoStructure.iso_length[77]="";
IsoStructure.iso_type[77]="";
IsoStructure.iso_desc[77]="";

IsoStructure.iso_length[78]="";
IsoStructure.iso_type[78]="";
IsoStructure.iso_desc[78]="";

IsoStructure.iso_length[79]="";
IsoStructure.iso_type[79]="";
IsoStructure.iso_desc[79]="";

IsoStructure.iso_length[80]="";
IsoStructure.iso_type[80]="";
IsoStructure.iso_desc[80]="";

IsoStructure.iso_length[81]="";
IsoStructure.iso_type[81]="";
IsoStructure.iso_desc[81]="";

IsoStructure.iso_length[82]="";
IsoStructure.iso_type[82]="";
IsoStructure.iso_desc[82]="";

IsoStructure.iso_length[83]="";
IsoStructure.iso_type[83]="";
IsoStructure.iso_desc[83]="";

IsoStructure.iso_length[84]="";
IsoStructure.iso_type[84]="";
IsoStructure.iso_desc[84]="";

IsoStructure.iso_length[85]="";
IsoStructure.iso_type[85]="";
IsoStructure.iso_desc[85]="";

IsoStructure.iso_length[86]="";
IsoStructure.iso_type[86]="";
IsoStructure.iso_desc[86]="";

IsoStructure.iso_length[87]="";
IsoStructure.iso_type[87]="";
IsoStructure.iso_desc[87]="";

IsoStructure.iso_length[88]="";
IsoStructure.iso_type[88]="";
IsoStructure.iso_desc[88]="";

IsoStructure.iso_length[89]="";
IsoStructure.iso_type[89]="";
IsoStructure.iso_desc[89]="";

IsoStructure.iso_length[90]="0042";
IsoStructure.iso_type[90]="NUMERIC";
IsoStructure.iso_desc[90]="DadosTx";

IsoStructure.iso_length[91]="";
IsoStructure.iso_type[91]="";
IsoStructure.iso_desc[91]="";

IsoStructure.iso_length[92]="";
IsoStructure.iso_type[92]="";
IsoStructure.iso_desc[92]="";

IsoStructure.iso_length[93]="";
IsoStructure.iso_type[93]="";
IsoStructure.iso_desc[93]="";

IsoStructure.iso_length[94]="";
IsoStructure.iso_type[94]="";
IsoStructure.iso_desc[94]="";

IsoStructure.iso_length[95]="";
IsoStructure.iso_type[95]="";
IsoStructure.iso_desc[95]="";

IsoStructure.iso_length[96]="";
IsoStructure.iso_type[96]="";
IsoStructure.iso_desc[96]="";

IsoStructure.iso_length[97]="";
IsoStructure.iso_type[97]="";
IsoStructure.iso_desc[97]="";

IsoStructure.iso_length[98]="";
IsoStructure.iso_type[98]="";
IsoStructure.iso_desc[98]="";

IsoStructure.iso_length[99]="";
IsoStructure.iso_type[99]="";
IsoStructure.iso_desc[99]="";

IsoStructure.iso_length[100]="";
IsoStructure.iso_type[100]="";
IsoStructure.iso_desc[100]="";

IsoStructure.iso_length[101]="";
IsoStructure.iso_type[101]="";
IsoStructure.iso_desc[101]="";

IsoStructure.iso_length[102]="";
IsoStructure.iso_type[102]="";
IsoStructure.iso_desc[102]="";

IsoStructure.iso_length[103]="";
IsoStructure.iso_type[103]="";
IsoStructure.iso_desc[103]="";

IsoStructure.iso_length[104]="";
IsoStructure.iso_type[104]="";
IsoStructure.iso_desc[104]="";

IsoStructure.iso_length[105]="";
IsoStructure.iso_type[105]="";
IsoStructure.iso_desc[105]="";

IsoStructure.iso_length[106]="";
IsoStructure.iso_type[106]="";
IsoStructure.iso_desc[106]="";

IsoStructure.iso_length[107]="";
IsoStructure.iso_type[107]="";
IsoStructure.iso_desc[107]="";

IsoStructure.iso_length[108]="";
IsoStructure.iso_type[108]="";
IsoStructure.iso_desc[108]="";

IsoStructure.iso_length[109]="";
IsoStructure.iso_type[109]="";
IsoStructure.iso_desc[109]="";

IsoStructure.iso_length[110]="";
IsoStructure.iso_type[110]="";
IsoStructure.iso_desc[110]="";

IsoStructure.iso_length[111]="";
IsoStructure.iso_type[111]="";
IsoStructure.iso_desc[111]="";

IsoStructure.iso_length[112]="";
IsoStructure.iso_type[112]="";
IsoStructure.iso_desc[112]="";

IsoStructure.iso_length[113]="LLL";
IsoStructure.iso_type[113]="ANS";
IsoStructure.iso_desc[113]="Custom";

IsoStructure.iso_length[114]="";
IsoStructure.iso_type[114]="";
IsoStructure.iso_desc[114]="";

IsoStructure.iso_length[115]="";
IsoStructure.iso_type[115]="";
IsoStructure.iso_desc[115]="";

IsoStructure.iso_length[116]="";
IsoStructure.iso_type[116]="";
IsoStructure.iso_desc[116]="";

IsoStructure.iso_length[117]="";
IsoStructure.iso_type[117]="";
IsoStructure.iso_desc[117]="";

IsoStructure.iso_length[118]="";
IsoStructure.iso_type[118]="";
IsoStructure.iso_desc[118]="";

IsoStructure.iso_length[119]="";
IsoStructure.iso_type[119]="";
IsoStructure.iso_desc[119]="";

IsoStructure.iso_length[120]="LLL";
IsoStructure.iso_type[120]="ANS";
IsoStructure.iso_desc[120]="SubCampo";

IsoStructure.iso_length[121]="LLL";
IsoStructure.iso_type[121]="ANS";
IsoStructure.iso_desc[121]="SubCampo";

IsoStructure.iso_length[122]="LLL";
IsoStructure.iso_type[122]="ANS";
IsoStructure.iso_desc[122]="SubCampo";

IsoStructure.iso_length[123]="";
IsoStructure.iso_type[123]="";
IsoStructure.iso_desc[123]="";

IsoStructure.iso_length[124]="";
IsoStructure.iso_type[124]="";
IsoStructure.iso_desc[124]="";

IsoStructure.iso_length[125]="LLL";
IsoStructure.iso_type[125]="ANS";
IsoStructure.iso_desc[125]="NSU Host Trx Original";

IsoStructure.iso_length[126]="";
IsoStructure.iso_type[126]="";
IsoStructure.iso_desc[126]="";

IsoStructure.iso_length[127]="LLL";
IsoStructure.iso_type[127]="ANS";
IsoStructure.iso_desc[127]="NSUHost";

IsoStructure.iso_length[128]="";
IsoStructure.iso_type[128]="";
IsoStructure.iso_desc[128]="";
}

}
