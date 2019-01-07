
package olmies;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for srs_sce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="srs_sce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sce_scjc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_seq2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_stuc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ayrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_crsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_blok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_occl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_cgpc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_fndc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_srtn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_esb1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_esb2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_esb3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ebal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_styc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_moac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_rftc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_fptc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_eflc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ssfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_sttc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_feed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_stac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_nayc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ncrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_nblk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_nocl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_begd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_endd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_fstc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_efid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_elsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_stld" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_isdy" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_fsfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_rfvc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_sta1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_pgsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ccd1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_crd1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_ecl1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ccd2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_crd2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_ecl2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_atno" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_rsyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_rstd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_as1r" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_prgc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_rouc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_dptc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_resc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_hesa" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_sfcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ctyc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_hrwk" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_wkyr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_tothrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_lepd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_phrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_shrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_asum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_csum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_wsum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_wels" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_psum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_elsy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_cels" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_aody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_reqd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_nols" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_nhls" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_nals" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_facc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_recs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_1str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_2ndr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_nact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ytyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ysdy" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_yprg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_mhra" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_lrad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_phra" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_moa1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_sta2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_prg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_rou1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_btch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ufip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_dsba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_adsb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_efbc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_udf1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udf2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udf3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udf4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udf5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udf6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udf7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udf8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udf9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_udfk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_stad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_scj1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_cred" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_dsbd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_ccd3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_ccd4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_ecl3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ecl4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_crd3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_crd4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_elef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_adsc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_ircp" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_gin1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_gin2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_uncn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_unqn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_eldu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_empr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ttac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_frn1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_frn2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_fpt2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_aphr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_ashr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_areg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_regd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_sclc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_hcic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_moad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sce_ftea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_fteb" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_ftem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_avgc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_itts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_qtst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_spfi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_cdd1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_cdd2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_cdd3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_redi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_brid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_cppc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_capc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_fsyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_sdyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_qenc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_fst1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_pace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ini1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_ini2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_sasd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sce_scl1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sce_insc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCE_HESD" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SCE_SFC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCE_FREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCE_GFEE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SCE_NFEE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SCE_FWYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCE_FEPH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCE_VCRF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "srs_sce", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "sceScjc",
    "sceSeq2",
    "sceStuc",
    "sceAyrc",
    "sceCrsc",
    "sceBlok",
    "sceOccl",
    "sceCgpc",
    "sceFndc",
    "sceSrtn",
    "sceEsb1",
    "sceEsb2",
    "sceEsb3",
    "sceEbal",
    "sceStyc",
    "sceMoac",
    "sceRftc",
    "sceFptc",
    "sceEflc",
    "sceSsfc",
    "sceSttc",
    "sceFeed",
    "sceStac",
    "sceNayc",
    "sceNcrc",
    "sceNblk",
    "sceNocl",
    "sceBegd",
    "sceEndd",
    "sceFstc",
    "sceEfid",
    "sceElsc",
    "sceStld",
    "sceIsdy",
    "sceFsfc",
    "sceRfvc",
    "sceSta1",
    "scePgsc",
    "sceCcd1",
    "sceCrd1",
    "sceEcl1",
    "sceCcd2",
    "sceCrd2",
    "sceEcl2",
    "sceAtno",
    "sceRsyn",
    "sceRstd",
    "sceAs1R",
    "scePrgc",
    "sceRouc",
    "sceDptc",
    "sceResc",
    "sceHesa",
    "sceSfcc",
    "sceCtyc",
    "sceHrwk",
    "sceWkyr",
    "sceTothrs",
    "sceLepd",
    "scePhrs",
    "sceShrs",
    "sceAsum",
    "sceCsum",
    "sceWsum",
    "sceWels",
    "scePsum",
    "sceElsy",
    "sceCels",
    "sceAody",
    "sceReqd",
    "sceNols",
    "sceNhls",
    "sceNals",
    "sceFacc",
    "sceRecs",
    "sce1Str",
    "sce2Ndr",
    "sceNact",
    "sceYtyp",
    "sceYsdy",
    "sceYprg",
    "sceMhra",
    "sceLrad",
    "scePhra",
    "sceMoa1",
    "sceSta2",
    "scePrg1",
    "sceRou1",
    "sceBtch",
    "sceUdsc",
    "sceUfip",
    "sceDsba",
    "sceAdsb",
    "sceEfbc",
    "sceUdf1",
    "sceUdf2",
    "sceUdf3",
    "sceUdf4",
    "sceUdf5",
    "sceUdf6",
    "sceUdf7",
    "sceUdf8",
    "sceUdf9",
    "sceUdfa",
    "sceUdfb",
    "sceUdfc",
    "sceUdfd",
    "sceUdfe",
    "sceUdff",
    "sceUdfg",
    "sceUdfh",
    "sceUdfi",
    "sceUdfj",
    "sceUdfk",
    "sceStad",
    "sceScj1",
    "sceCred",
    "sceDsbd",
    "sceCcd3",
    "sceCcd4",
    "sceEcl3",
    "sceEcl4",
    "sceCrd3",
    "sceCrd4",
    "sceElef",
    "sceAdsc",
    "sceIrcp",
    "sceGin1",
    "sceGin2",
    "sceUncn",
    "sceUnqn",
    "sceEldu",
    "sceEmpr",
    "sceTtac",
    "sceFrn1",
    "sceFrn2",
    "sceFpt2",
    "sceAphr",
    "sceAshr",
    "sceAreg",
    "sceRegd",
    "sceSclc",
    "sceHcic",
    "sceMoad",
    "sceFtea",
    "sceFteb",
    "sceFtem",
    "sceAvgc",
    "sceItts",
    "sceQtst",
    "sceSpfi",
    "sceCdd1",
    "sceCdd2",
    "sceCdd3",
    "sceRedi",
    "sceBrid",
    "sceCppc",
    "sceCapc",
    "sceFsyn",
    "sceSdyn",
    "sceQenc",
    "sceFst1",
    "scePace",
    "sceIni1",
    "sceIni2",
    "sceSasd",
    "sceScl1",
    "sceInsc",
    "scehesd",
    "scesfc1",
    "scefreg",
    "scegfee",
    "scenfee",
    "scefwyn",
    "scefeph",
    "scevcrf"
})
public class SrsSce {

    @XmlElement(name = "sce_scjc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceScjc;
    @XmlElement(name = "sce_seq2", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSeq2;
    @XmlElement(name = "sce_stuc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceStuc;
    @XmlElement(name = "sce_ayrc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceAyrc;
    @XmlElement(name = "sce_crsc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceCrsc;
    @XmlElement(name = "sce_blok", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceBlok;
    @XmlElement(name = "sce_occl", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceOccl;
    @XmlElement(name = "sce_cgpc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceCgpc;
    @XmlElement(name = "sce_fndc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFndc;
    @XmlElement(name = "sce_srtn", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSrtn;
    @XmlElement(name = "sce_esb1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEsb1;
    @XmlElement(name = "sce_esb2", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEsb2;
    @XmlElement(name = "sce_esb3", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEsb3;
    @XmlElement(name = "sce_ebal", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEbal;
    @XmlElement(name = "sce_styc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceStyc;
    @XmlElement(name = "sce_moac", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceMoac;
    @XmlElement(name = "sce_rftc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceRftc;
    @XmlElement(name = "sce_fptc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFptc;
    @XmlElement(name = "sce_eflc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEflc;
    @XmlElement(name = "sce_ssfc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSsfc;
    @XmlElement(name = "sce_sttc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSttc;
    @XmlElement(name = "sce_feed", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceFeed;
    @XmlElement(name = "sce_stac", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceStac;
    @XmlElement(name = "sce_nayc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceNayc;
    @XmlElement(name = "sce_ncrc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceNcrc;
    @XmlElement(name = "sce_nblk", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceNblk;
    @XmlElement(name = "sce_nocl", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceNocl;
    @XmlElement(name = "sce_begd", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceBegd;
    @XmlElement(name = "sce_endd", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceEndd;
    @XmlElement(name = "sce_fstc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFstc;
    @XmlElement(name = "sce_efid", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEfid;
    @XmlElement(name = "sce_elsc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceElsc;
    @XmlElement(name = "sce_stld", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceStld;
    @XmlElement(name = "sce_isdy", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceIsdy;
    @XmlElement(name = "sce_fsfc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFsfc;
    @XmlElement(name = "sce_rfvc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceRfvc;
    @XmlElement(name = "sce_sta1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSta1;
    @XmlElement(name = "sce_pgsc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String scePgsc;
    @XmlElement(name = "sce_ccd1", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCcd1;
    @XmlElement(name = "sce_crd1", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCrd1;
    @XmlElement(name = "sce_ecl1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEcl1;
    @XmlElement(name = "sce_ccd2", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCcd2;
    @XmlElement(name = "sce_crd2", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCrd2;
    @XmlElement(name = "sce_ecl2", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEcl2;
    @XmlElement(name = "sce_atno", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceAtno;
    @XmlElement(name = "sce_rsyn", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceRsyn;
    @XmlElement(name = "sce_rstd", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceRstd;
    @XmlElement(name = "sce_as1r", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceAs1R;
    @XmlElement(name = "sce_prgc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String scePrgc;
    @XmlElement(name = "sce_rouc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceRouc;
    @XmlElement(name = "sce_dptc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceDptc;
    @XmlElement(name = "sce_resc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceResc;
    @XmlElement(name = "sce_hesa", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceHesa;
    @XmlElement(name = "sce_sfcc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSfcc;
    @XmlElement(name = "sce_ctyc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceCtyc;
    @XmlElement(name = "sce_hrwk", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceHrwk;
    @XmlElement(name = "sce_wkyr", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceWkyr;
    @XmlElement(name = "sce_tothrs", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceTothrs;
    @XmlElement(name = "sce_lepd", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceLepd;
    @XmlElement(name = "sce_phrs", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal scePhrs;
    @XmlElement(name = "sce_shrs", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceShrs;
    @XmlElement(name = "sce_asum", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceAsum;
    @XmlElement(name = "sce_csum", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCsum;
    @XmlElement(name = "sce_wsum", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceWsum;
    @XmlElement(name = "sce_wels", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceWels;
    @XmlElement(name = "sce_psum", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal scePsum;
    @XmlElement(name = "sce_elsy", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceElsy;
    @XmlElement(name = "sce_cels", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCels;
    @XmlElement(name = "sce_aody", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceAody;
    @XmlElement(name = "sce_reqd", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceReqd;
    @XmlElement(name = "sce_nols", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceNols;
    @XmlElement(name = "sce_nhls", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceNhls;
    @XmlElement(name = "sce_nals", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceNals;
    @XmlElement(name = "sce_facc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFacc;
    @XmlElement(name = "sce_recs", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceRecs;
    @XmlElement(name = "sce_1str", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sce1Str;
    @XmlElement(name = "sce_2ndr", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sce2Ndr;
    @XmlElement(name = "sce_nact", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceNact;
    @XmlElement(name = "sce_ytyp", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceYtyp;
    @XmlElement(name = "sce_ysdy", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceYsdy;
    @XmlElement(name = "sce_yprg", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceYprg;
    @XmlElement(name = "sce_mhra", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceMhra;
    @XmlElement(name = "sce_lrad", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceLrad;
    @XmlElement(name = "sce_phra", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal scePhra;
    @XmlElement(name = "sce_moa1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceMoa1;
    @XmlElement(name = "sce_sta2", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSta2;
    @XmlElement(name = "sce_prg1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String scePrg1;
    @XmlElement(name = "sce_rou1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceRou1;
    @XmlElement(name = "sce_btch", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceBtch;
    @XmlElement(name = "sce_udsc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdsc;
    @XmlElement(name = "sce_ufip", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUfip;
    @XmlElement(name = "sce_dsba", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceDsba;
    @XmlElement(name = "sce_adsb", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceAdsb;
    @XmlElement(name = "sce_efbc", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceEfbc;
    @XmlElement(name = "sce_udf1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdf1;
    @XmlElement(name = "sce_udf2", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdf2;
    @XmlElement(name = "sce_udf3", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdf3;
    @XmlElement(name = "sce_udf4", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdf4;
    @XmlElement(name = "sce_udf5", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdf5;
    @XmlElement(name = "sce_udf6", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdf6;
    @XmlElement(name = "sce_udf7", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdf7;
    @XmlElement(name = "sce_udf8", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdf8;
    @XmlElement(name = "sce_udf9", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdf9;
    @XmlElement(name = "sce_udfa", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfa;
    @XmlElement(name = "sce_udfb", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfb;
    @XmlElement(name = "sce_udfc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfc;
    @XmlElement(name = "sce_udfd", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfd;
    @XmlElement(name = "sce_udfe", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfe;
    @XmlElement(name = "sce_udff", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdff;
    @XmlElement(name = "sce_udfg", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfg;
    @XmlElement(name = "sce_udfh", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfh;
    @XmlElement(name = "sce_udfi", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfi;
    @XmlElement(name = "sce_udfj", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfj;
    @XmlElement(name = "sce_udfk", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceUdfk;
    @XmlElement(name = "sce_stad", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceStad;
    @XmlElement(name = "sce_scj1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceScj1;
    @XmlElement(name = "sce_cred", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceCred;
    @XmlElement(name = "sce_dsbd", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceDsbd;
    @XmlElement(name = "sce_ccd3", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCcd3;
    @XmlElement(name = "sce_ccd4", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCcd4;
    @XmlElement(name = "sce_ecl3", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEcl3;
    @XmlElement(name = "sce_ecl4", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEcl4;
    @XmlElement(name = "sce_crd3", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCrd3;
    @XmlElement(name = "sce_crd4", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceCrd4;
    @XmlElement(name = "sce_elef", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceElef;
    @XmlElement(name = "sce_adsc", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceAdsc;
    @XmlElement(name = "sce_ircp", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceIrcp;
    @XmlElement(name = "sce_gin1", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceGin1;
    @XmlElement(name = "sce_gin2", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceGin2;
    @XmlElement(name = "sce_uncn", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceUncn;
    @XmlElement(name = "sce_unqn", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceUnqn;
    @XmlElement(name = "sce_eldu", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEldu;
    @XmlElement(name = "sce_empr", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceEmpr;
    @XmlElement(name = "sce_ttac", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceTtac;
    @XmlElement(name = "sce_frn1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFrn1;
    @XmlElement(name = "sce_frn2", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFrn2;
    @XmlElement(name = "sce_fpt2", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFpt2;
    @XmlElement(name = "sce_aphr", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceAphr;
    @XmlElement(name = "sce_ashr", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceAshr;
    @XmlElement(name = "sce_areg", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceAreg;
    @XmlElement(name = "sce_regd", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceRegd;
    @XmlElement(name = "sce_sclc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSclc;
    @XmlElement(name = "sce_hcic", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceHcic;
    @XmlElement(name = "sce_moad", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sceMoad;
    @XmlElement(name = "sce_ftea", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceFtea;
    @XmlElement(name = "sce_fteb", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceFteb;
    @XmlElement(name = "sce_ftem", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFtem;
    @XmlElement(name = "sce_avgc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceAvgc;
    @XmlElement(name = "sce_itts", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceItts;
    @XmlElement(name = "sce_qtst", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceQtst;
    @XmlElement(name = "sce_spfi", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSpfi;
    @XmlElement(name = "sce_cdd1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceCdd1;
    @XmlElement(name = "sce_cdd2", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceCdd2;
    @XmlElement(name = "sce_cdd3", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceCdd3;
    @XmlElement(name = "sce_redi", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceRedi;
    @XmlElement(name = "sce_brid", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceBrid;
    @XmlElement(name = "sce_cppc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceCppc;
    @XmlElement(name = "sce_capc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceCapc;
    @XmlElement(name = "sce_fsyn", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFsyn;
    @XmlElement(name = "sce_sdyn", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceSdyn;
    @XmlElement(name = "sce_qenc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceQenc;
    @XmlElement(name = "sce_fst1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceFst1;
    @XmlElement(name = "sce_pace", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String scePace;
    @XmlElement(name = "sce_ini1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceIni1;
    @XmlElement(name = "sce_ini2", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceIni2;
    @XmlElement(name = "sce_sasd", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal sceSasd;
    @XmlElement(name = "sce_scl1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceScl1;
    @XmlElement(name = "sce_insc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String sceInsc;
    @XmlElement(name = "SCE_HESD", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scehesd;
    @XmlElement(name = "SCE_SFC1", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String scesfc1;
    @XmlElement(name = "SCE_FREG", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String scefreg;
    @XmlElement(name = "SCE_GFEE", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal scegfee;
    @XmlElement(name = "SCE_NFEE", namespace = "http://olmiesservice.utech.edu.jm/", required = true, nillable = true)
    protected BigDecimal scenfee;
    @XmlElement(name = "SCE_FWYN", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String scefwyn;
    @XmlElement(name = "SCE_FEPH", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String scefeph;
    @XmlElement(name = "SCE_VCRF", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String scevcrf;

    /**
     * Gets the value of the sceScjc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceScjc() {
        return sceScjc;
    }

    /**
     * Sets the value of the sceScjc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceScjc(String value) {
        this.sceScjc = value;
    }

    /**
     * Gets the value of the sceSeq2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSeq2() {
        return sceSeq2;
    }

    /**
     * Sets the value of the sceSeq2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSeq2(String value) {
        this.sceSeq2 = value;
    }

    /**
     * Gets the value of the sceStuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceStuc() {
        return sceStuc;
    }

    /**
     * Sets the value of the sceStuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceStuc(String value) {
        this.sceStuc = value;
    }

    /**
     * Gets the value of the sceAyrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceAyrc() {
        return sceAyrc;
    }

    /**
     * Sets the value of the sceAyrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceAyrc(String value) {
        this.sceAyrc = value;
    }

    /**
     * Gets the value of the sceCrsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceCrsc() {
        return sceCrsc;
    }

    /**
     * Sets the value of the sceCrsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceCrsc(String value) {
        this.sceCrsc = value;
    }

    /**
     * Gets the value of the sceBlok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceBlok() {
        return sceBlok;
    }

    /**
     * Sets the value of the sceBlok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceBlok(String value) {
        this.sceBlok = value;
    }

    /**
     * Gets the value of the sceOccl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceOccl() {
        return sceOccl;
    }

    /**
     * Sets the value of the sceOccl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceOccl(String value) {
        this.sceOccl = value;
    }

    /**
     * Gets the value of the sceCgpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceCgpc() {
        return sceCgpc;
    }

    /**
     * Sets the value of the sceCgpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceCgpc(String value) {
        this.sceCgpc = value;
    }

    /**
     * Gets the value of the sceFndc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFndc() {
        return sceFndc;
    }

    /**
     * Sets the value of the sceFndc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFndc(String value) {
        this.sceFndc = value;
    }

    /**
     * Gets the value of the sceSrtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSrtn() {
        return sceSrtn;
    }

    /**
     * Sets the value of the sceSrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSrtn(String value) {
        this.sceSrtn = value;
    }

    /**
     * Gets the value of the sceEsb1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEsb1() {
        return sceEsb1;
    }

    /**
     * Sets the value of the sceEsb1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEsb1(String value) {
        this.sceEsb1 = value;
    }

    /**
     * Gets the value of the sceEsb2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEsb2() {
        return sceEsb2;
    }

    /**
     * Sets the value of the sceEsb2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEsb2(String value) {
        this.sceEsb2 = value;
    }

    /**
     * Gets the value of the sceEsb3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEsb3() {
        return sceEsb3;
    }

    /**
     * Sets the value of the sceEsb3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEsb3(String value) {
        this.sceEsb3 = value;
    }

    /**
     * Gets the value of the sceEbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEbal() {
        return sceEbal;
    }

    /**
     * Sets the value of the sceEbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEbal(String value) {
        this.sceEbal = value;
    }

    /**
     * Gets the value of the sceStyc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceStyc() {
        return sceStyc;
    }

    /**
     * Sets the value of the sceStyc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceStyc(String value) {
        this.sceStyc = value;
    }

    /**
     * Gets the value of the sceMoac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceMoac() {
        return sceMoac;
    }

    /**
     * Sets the value of the sceMoac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceMoac(String value) {
        this.sceMoac = value;
    }

    /**
     * Gets the value of the sceRftc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceRftc() {
        return sceRftc;
    }

    /**
     * Sets the value of the sceRftc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceRftc(String value) {
        this.sceRftc = value;
    }

    /**
     * Gets the value of the sceFptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFptc() {
        return sceFptc;
    }

    /**
     * Sets the value of the sceFptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFptc(String value) {
        this.sceFptc = value;
    }

    /**
     * Gets the value of the sceEflc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEflc() {
        return sceEflc;
    }

    /**
     * Sets the value of the sceEflc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEflc(String value) {
        this.sceEflc = value;
    }

    /**
     * Gets the value of the sceSsfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSsfc() {
        return sceSsfc;
    }

    /**
     * Sets the value of the sceSsfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSsfc(String value) {
        this.sceSsfc = value;
    }

    /**
     * Gets the value of the sceSttc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSttc() {
        return sceSttc;
    }

    /**
     * Sets the value of the sceSttc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSttc(String value) {
        this.sceSttc = value;
    }

    /**
     * Gets the value of the sceFeed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceFeed() {
        return sceFeed;
    }

    /**
     * Sets the value of the sceFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceFeed(XMLGregorianCalendar value) {
        this.sceFeed = value;
    }

    /**
     * Gets the value of the sceStac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceStac() {
        return sceStac;
    }

    /**
     * Sets the value of the sceStac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceStac(String value) {
        this.sceStac = value;
    }

    /**
     * Gets the value of the sceNayc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceNayc() {
        return sceNayc;
    }

    /**
     * Sets the value of the sceNayc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceNayc(String value) {
        this.sceNayc = value;
    }

    /**
     * Gets the value of the sceNcrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceNcrc() {
        return sceNcrc;
    }

    /**
     * Sets the value of the sceNcrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceNcrc(String value) {
        this.sceNcrc = value;
    }

    /**
     * Gets the value of the sceNblk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceNblk() {
        return sceNblk;
    }

    /**
     * Sets the value of the sceNblk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceNblk(String value) {
        this.sceNblk = value;
    }

    /**
     * Gets the value of the sceNocl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceNocl() {
        return sceNocl;
    }

    /**
     * Sets the value of the sceNocl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceNocl(String value) {
        this.sceNocl = value;
    }

    /**
     * Gets the value of the sceBegd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceBegd() {
        return sceBegd;
    }

    /**
     * Sets the value of the sceBegd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceBegd(XMLGregorianCalendar value) {
        this.sceBegd = value;
    }

    /**
     * Gets the value of the sceEndd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceEndd() {
        return sceEndd;
    }

    /**
     * Sets the value of the sceEndd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceEndd(XMLGregorianCalendar value) {
        this.sceEndd = value;
    }

    /**
     * Gets the value of the sceFstc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFstc() {
        return sceFstc;
    }

    /**
     * Sets the value of the sceFstc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFstc(String value) {
        this.sceFstc = value;
    }

    /**
     * Gets the value of the sceEfid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEfid() {
        return sceEfid;
    }

    /**
     * Sets the value of the sceEfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEfid(String value) {
        this.sceEfid = value;
    }

    /**
     * Gets the value of the sceElsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceElsc() {
        return sceElsc;
    }

    /**
     * Sets the value of the sceElsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceElsc(String value) {
        this.sceElsc = value;
    }

    /**
     * Gets the value of the sceStld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceStld() {
        return sceStld;
    }

    /**
     * Sets the value of the sceStld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceStld(BigDecimal value) {
        this.sceStld = value;
    }

    /**
     * Gets the value of the sceIsdy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceIsdy() {
        return sceIsdy;
    }

    /**
     * Sets the value of the sceIsdy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceIsdy(BigDecimal value) {
        this.sceIsdy = value;
    }

    /**
     * Gets the value of the sceFsfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFsfc() {
        return sceFsfc;
    }

    /**
     * Sets the value of the sceFsfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFsfc(String value) {
        this.sceFsfc = value;
    }

    /**
     * Gets the value of the sceRfvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceRfvc() {
        return sceRfvc;
    }

    /**
     * Sets the value of the sceRfvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceRfvc(String value) {
        this.sceRfvc = value;
    }

    /**
     * Gets the value of the sceSta1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSta1() {
        return sceSta1;
    }

    /**
     * Sets the value of the sceSta1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSta1(String value) {
        this.sceSta1 = value;
    }

    /**
     * Gets the value of the scePgsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScePgsc() {
        return scePgsc;
    }

    /**
     * Sets the value of the scePgsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScePgsc(String value) {
        this.scePgsc = value;
    }

    /**
     * Gets the value of the sceCcd1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCcd1() {
        return sceCcd1;
    }

    /**
     * Sets the value of the sceCcd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCcd1(BigDecimal value) {
        this.sceCcd1 = value;
    }

    /**
     * Gets the value of the sceCrd1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCrd1() {
        return sceCrd1;
    }

    /**
     * Sets the value of the sceCrd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCrd1(BigDecimal value) {
        this.sceCrd1 = value;
    }

    /**
     * Gets the value of the sceEcl1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEcl1() {
        return sceEcl1;
    }

    /**
     * Sets the value of the sceEcl1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEcl1(String value) {
        this.sceEcl1 = value;
    }

    /**
     * Gets the value of the sceCcd2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCcd2() {
        return sceCcd2;
    }

    /**
     * Sets the value of the sceCcd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCcd2(BigDecimal value) {
        this.sceCcd2 = value;
    }

    /**
     * Gets the value of the sceCrd2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCrd2() {
        return sceCrd2;
    }

    /**
     * Sets the value of the sceCrd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCrd2(BigDecimal value) {
        this.sceCrd2 = value;
    }

    /**
     * Gets the value of the sceEcl2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEcl2() {
        return sceEcl2;
    }

    /**
     * Sets the value of the sceEcl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEcl2(String value) {
        this.sceEcl2 = value;
    }

    /**
     * Gets the value of the sceAtno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceAtno() {
        return sceAtno;
    }

    /**
     * Sets the value of the sceAtno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceAtno(BigDecimal value) {
        this.sceAtno = value;
    }

    /**
     * Gets the value of the sceRsyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceRsyn() {
        return sceRsyn;
    }

    /**
     * Sets the value of the sceRsyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceRsyn(String value) {
        this.sceRsyn = value;
    }

    /**
     * Gets the value of the sceRstd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceRstd() {
        return sceRstd;
    }

    /**
     * Sets the value of the sceRstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceRstd(XMLGregorianCalendar value) {
        this.sceRstd = value;
    }

    /**
     * Gets the value of the sceAs1R property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceAs1R() {
        return sceAs1R;
    }

    /**
     * Sets the value of the sceAs1R property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceAs1R(String value) {
        this.sceAs1R = value;
    }

    /**
     * Gets the value of the scePrgc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScePrgc() {
        return scePrgc;
    }

    /**
     * Sets the value of the scePrgc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScePrgc(String value) {
        this.scePrgc = value;
    }

    /**
     * Gets the value of the sceRouc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceRouc() {
        return sceRouc;
    }

    /**
     * Sets the value of the sceRouc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceRouc(String value) {
        this.sceRouc = value;
    }

    /**
     * Gets the value of the sceDptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceDptc() {
        return sceDptc;
    }

    /**
     * Sets the value of the sceDptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceDptc(String value) {
        this.sceDptc = value;
    }

    /**
     * Gets the value of the sceResc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceResc() {
        return sceResc;
    }

    /**
     * Sets the value of the sceResc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceResc(String value) {
        this.sceResc = value;
    }

    /**
     * Gets the value of the sceHesa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceHesa() {
        return sceHesa;
    }

    /**
     * Sets the value of the sceHesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceHesa(BigDecimal value) {
        this.sceHesa = value;
    }

    /**
     * Gets the value of the sceSfcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSfcc() {
        return sceSfcc;
    }

    /**
     * Sets the value of the sceSfcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSfcc(String value) {
        this.sceSfcc = value;
    }

    /**
     * Gets the value of the sceCtyc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceCtyc() {
        return sceCtyc;
    }

    /**
     * Sets the value of the sceCtyc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceCtyc(String value) {
        this.sceCtyc = value;
    }

    /**
     * Gets the value of the sceHrwk property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceHrwk() {
        return sceHrwk;
    }

    /**
     * Sets the value of the sceHrwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceHrwk(BigDecimal value) {
        this.sceHrwk = value;
    }

    /**
     * Gets the value of the sceWkyr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceWkyr() {
        return sceWkyr;
    }

    /**
     * Sets the value of the sceWkyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceWkyr(BigDecimal value) {
        this.sceWkyr = value;
    }

    /**
     * Gets the value of the sceTothrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceTothrs() {
        return sceTothrs;
    }

    /**
     * Sets the value of the sceTothrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceTothrs(BigDecimal value) {
        this.sceTothrs = value;
    }

    /**
     * Gets the value of the sceLepd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceLepd() {
        return sceLepd;
    }

    /**
     * Sets the value of the sceLepd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceLepd(XMLGregorianCalendar value) {
        this.sceLepd = value;
    }

    /**
     * Gets the value of the scePhrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScePhrs() {
        return scePhrs;
    }

    /**
     * Sets the value of the scePhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScePhrs(BigDecimal value) {
        this.scePhrs = value;
    }

    /**
     * Gets the value of the sceShrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceShrs() {
        return sceShrs;
    }

    /**
     * Sets the value of the sceShrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceShrs(BigDecimal value) {
        this.sceShrs = value;
    }

    /**
     * Gets the value of the sceAsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceAsum() {
        return sceAsum;
    }

    /**
     * Sets the value of the sceAsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceAsum(BigDecimal value) {
        this.sceAsum = value;
    }

    /**
     * Gets the value of the sceCsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCsum() {
        return sceCsum;
    }

    /**
     * Sets the value of the sceCsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCsum(BigDecimal value) {
        this.sceCsum = value;
    }

    /**
     * Gets the value of the sceWsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceWsum() {
        return sceWsum;
    }

    /**
     * Sets the value of the sceWsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceWsum(BigDecimal value) {
        this.sceWsum = value;
    }

    /**
     * Gets the value of the sceWels property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceWels() {
        return sceWels;
    }

    /**
     * Sets the value of the sceWels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceWels(BigDecimal value) {
        this.sceWels = value;
    }

    /**
     * Gets the value of the scePsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScePsum() {
        return scePsum;
    }

    /**
     * Sets the value of the scePsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScePsum(BigDecimal value) {
        this.scePsum = value;
    }

    /**
     * Gets the value of the sceElsy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceElsy() {
        return sceElsy;
    }

    /**
     * Sets the value of the sceElsy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceElsy(String value) {
        this.sceElsy = value;
    }

    /**
     * Gets the value of the sceCels property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCels() {
        return sceCels;
    }

    /**
     * Sets the value of the sceCels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCels(BigDecimal value) {
        this.sceCels = value;
    }

    /**
     * Gets the value of the sceAody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceAody() {
        return sceAody;
    }

    /**
     * Sets the value of the sceAody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceAody(String value) {
        this.sceAody = value;
    }

    /**
     * Gets the value of the sceReqd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceReqd() {
        return sceReqd;
    }

    /**
     * Sets the value of the sceReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceReqd(XMLGregorianCalendar value) {
        this.sceReqd = value;
    }

    /**
     * Gets the value of the sceNols property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceNols() {
        return sceNols;
    }

    /**
     * Sets the value of the sceNols property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceNols(BigDecimal value) {
        this.sceNols = value;
    }

    /**
     * Gets the value of the sceNhls property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceNhls() {
        return sceNhls;
    }

    /**
     * Sets the value of the sceNhls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceNhls(BigDecimal value) {
        this.sceNhls = value;
    }

    /**
     * Gets the value of the sceNals property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceNals() {
        return sceNals;
    }

    /**
     * Sets the value of the sceNals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceNals(BigDecimal value) {
        this.sceNals = value;
    }

    /**
     * Gets the value of the sceFacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFacc() {
        return sceFacc;
    }

    /**
     * Sets the value of the sceFacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFacc(String value) {
        this.sceFacc = value;
    }

    /**
     * Gets the value of the sceRecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceRecs() {
        return sceRecs;
    }

    /**
     * Sets the value of the sceRecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceRecs(String value) {
        this.sceRecs = value;
    }

    /**
     * Gets the value of the sce1Str property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSce1Str() {
        return sce1Str;
    }

    /**
     * Sets the value of the sce1Str property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSce1Str(String value) {
        this.sce1Str = value;
    }

    /**
     * Gets the value of the sce2Ndr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSce2Ndr() {
        return sce2Ndr;
    }

    /**
     * Sets the value of the sce2Ndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSce2Ndr(String value) {
        this.sce2Ndr = value;
    }

    /**
     * Gets the value of the sceNact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceNact() {
        return sceNact;
    }

    /**
     * Sets the value of the sceNact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceNact(String value) {
        this.sceNact = value;
    }

    /**
     * Gets the value of the sceYtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceYtyp() {
        return sceYtyp;
    }

    /**
     * Sets the value of the sceYtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceYtyp(String value) {
        this.sceYtyp = value;
    }

    /**
     * Gets the value of the sceYsdy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceYsdy() {
        return sceYsdy;
    }

    /**
     * Sets the value of the sceYsdy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceYsdy(BigDecimal value) {
        this.sceYsdy = value;
    }

    /**
     * Gets the value of the sceYprg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceYprg() {
        return sceYprg;
    }

    /**
     * Sets the value of the sceYprg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceYprg(BigDecimal value) {
        this.sceYprg = value;
    }

    /**
     * Gets the value of the sceMhra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceMhra() {
        return sceMhra;
    }

    /**
     * Sets the value of the sceMhra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceMhra(BigDecimal value) {
        this.sceMhra = value;
    }

    /**
     * Gets the value of the sceLrad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceLrad() {
        return sceLrad;
    }

    /**
     * Sets the value of the sceLrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceLrad(XMLGregorianCalendar value) {
        this.sceLrad = value;
    }

    /**
     * Gets the value of the scePhra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScePhra() {
        return scePhra;
    }

    /**
     * Sets the value of the scePhra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScePhra(BigDecimal value) {
        this.scePhra = value;
    }

    /**
     * Gets the value of the sceMoa1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceMoa1() {
        return sceMoa1;
    }

    /**
     * Sets the value of the sceMoa1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceMoa1(String value) {
        this.sceMoa1 = value;
    }

    /**
     * Gets the value of the sceSta2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSta2() {
        return sceSta2;
    }

    /**
     * Sets the value of the sceSta2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSta2(String value) {
        this.sceSta2 = value;
    }

    /**
     * Gets the value of the scePrg1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScePrg1() {
        return scePrg1;
    }

    /**
     * Sets the value of the scePrg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScePrg1(String value) {
        this.scePrg1 = value;
    }

    /**
     * Gets the value of the sceRou1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceRou1() {
        return sceRou1;
    }

    /**
     * Sets the value of the sceRou1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceRou1(String value) {
        this.sceRou1 = value;
    }

    /**
     * Gets the value of the sceBtch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceBtch() {
        return sceBtch;
    }

    /**
     * Sets the value of the sceBtch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceBtch(String value) {
        this.sceBtch = value;
    }

    /**
     * Gets the value of the sceUdsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdsc() {
        return sceUdsc;
    }

    /**
     * Sets the value of the sceUdsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdsc(String value) {
        this.sceUdsc = value;
    }

    /**
     * Gets the value of the sceUfip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUfip() {
        return sceUfip;
    }

    /**
     * Sets the value of the sceUfip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUfip(String value) {
        this.sceUfip = value;
    }

    /**
     * Gets the value of the sceDsba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceDsba() {
        return sceDsba;
    }

    /**
     * Sets the value of the sceDsba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceDsba(String value) {
        this.sceDsba = value;
    }

    /**
     * Gets the value of the sceAdsb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceAdsb() {
        return sceAdsb;
    }

    /**
     * Sets the value of the sceAdsb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceAdsb(String value) {
        this.sceAdsb = value;
    }

    /**
     * Gets the value of the sceEfbc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceEfbc() {
        return sceEfbc;
    }

    /**
     * Sets the value of the sceEfbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceEfbc(BigDecimal value) {
        this.sceEfbc = value;
    }

    /**
     * Gets the value of the sceUdf1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdf1() {
        return sceUdf1;
    }

    /**
     * Sets the value of the sceUdf1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdf1(String value) {
        this.sceUdf1 = value;
    }

    /**
     * Gets the value of the sceUdf2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdf2() {
        return sceUdf2;
    }

    /**
     * Sets the value of the sceUdf2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdf2(String value) {
        this.sceUdf2 = value;
    }

    /**
     * Gets the value of the sceUdf3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdf3() {
        return sceUdf3;
    }

    /**
     * Sets the value of the sceUdf3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdf3(String value) {
        this.sceUdf3 = value;
    }

    /**
     * Gets the value of the sceUdf4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdf4() {
        return sceUdf4;
    }

    /**
     * Sets the value of the sceUdf4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdf4(String value) {
        this.sceUdf4 = value;
    }

    /**
     * Gets the value of the sceUdf5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdf5() {
        return sceUdf5;
    }

    /**
     * Sets the value of the sceUdf5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdf5(String value) {
        this.sceUdf5 = value;
    }

    /**
     * Gets the value of the sceUdf6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdf6() {
        return sceUdf6;
    }

    /**
     * Sets the value of the sceUdf6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdf6(String value) {
        this.sceUdf6 = value;
    }

    /**
     * Gets the value of the sceUdf7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdf7() {
        return sceUdf7;
    }

    /**
     * Sets the value of the sceUdf7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdf7(String value) {
        this.sceUdf7 = value;
    }

    /**
     * Gets the value of the sceUdf8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdf8() {
        return sceUdf8;
    }

    /**
     * Sets the value of the sceUdf8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdf8(String value) {
        this.sceUdf8 = value;
    }

    /**
     * Gets the value of the sceUdf9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdf9() {
        return sceUdf9;
    }

    /**
     * Sets the value of the sceUdf9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdf9(String value) {
        this.sceUdf9 = value;
    }

    /**
     * Gets the value of the sceUdfa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfa() {
        return sceUdfa;
    }

    /**
     * Sets the value of the sceUdfa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfa(String value) {
        this.sceUdfa = value;
    }

    /**
     * Gets the value of the sceUdfb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfb() {
        return sceUdfb;
    }

    /**
     * Sets the value of the sceUdfb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfb(String value) {
        this.sceUdfb = value;
    }

    /**
     * Gets the value of the sceUdfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfc() {
        return sceUdfc;
    }

    /**
     * Sets the value of the sceUdfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfc(String value) {
        this.sceUdfc = value;
    }

    /**
     * Gets the value of the sceUdfd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfd() {
        return sceUdfd;
    }

    /**
     * Sets the value of the sceUdfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfd(String value) {
        this.sceUdfd = value;
    }

    /**
     * Gets the value of the sceUdfe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfe() {
        return sceUdfe;
    }

    /**
     * Sets the value of the sceUdfe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfe(String value) {
        this.sceUdfe = value;
    }

    /**
     * Gets the value of the sceUdff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdff() {
        return sceUdff;
    }

    /**
     * Sets the value of the sceUdff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdff(String value) {
        this.sceUdff = value;
    }

    /**
     * Gets the value of the sceUdfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfg() {
        return sceUdfg;
    }

    /**
     * Sets the value of the sceUdfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfg(String value) {
        this.sceUdfg = value;
    }

    /**
     * Gets the value of the sceUdfh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfh() {
        return sceUdfh;
    }

    /**
     * Sets the value of the sceUdfh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfh(String value) {
        this.sceUdfh = value;
    }

    /**
     * Gets the value of the sceUdfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfi() {
        return sceUdfi;
    }

    /**
     * Sets the value of the sceUdfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfi(String value) {
        this.sceUdfi = value;
    }

    /**
     * Gets the value of the sceUdfj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfj() {
        return sceUdfj;
    }

    /**
     * Sets the value of the sceUdfj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfj(String value) {
        this.sceUdfj = value;
    }

    /**
     * Gets the value of the sceUdfk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceUdfk() {
        return sceUdfk;
    }

    /**
     * Sets the value of the sceUdfk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceUdfk(String value) {
        this.sceUdfk = value;
    }

    /**
     * Gets the value of the sceStad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceStad() {
        return sceStad;
    }

    /**
     * Sets the value of the sceStad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceStad(XMLGregorianCalendar value) {
        this.sceStad = value;
    }

    /**
     * Gets the value of the sceScj1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceScj1() {
        return sceScj1;
    }

    /**
     * Sets the value of the sceScj1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceScj1(String value) {
        this.sceScj1 = value;
    }

    /**
     * Gets the value of the sceCred property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceCred() {
        return sceCred;
    }

    /**
     * Sets the value of the sceCred property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceCred(XMLGregorianCalendar value) {
        this.sceCred = value;
    }

    /**
     * Gets the value of the sceDsbd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceDsbd() {
        return sceDsbd;
    }

    /**
     * Sets the value of the sceDsbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceDsbd(XMLGregorianCalendar value) {
        this.sceDsbd = value;
    }

    /**
     * Gets the value of the sceCcd3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCcd3() {
        return sceCcd3;
    }

    /**
     * Sets the value of the sceCcd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCcd3(BigDecimal value) {
        this.sceCcd3 = value;
    }

    /**
     * Gets the value of the sceCcd4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCcd4() {
        return sceCcd4;
    }

    /**
     * Sets the value of the sceCcd4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCcd4(BigDecimal value) {
        this.sceCcd4 = value;
    }

    /**
     * Gets the value of the sceEcl3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEcl3() {
        return sceEcl3;
    }

    /**
     * Sets the value of the sceEcl3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEcl3(String value) {
        this.sceEcl3 = value;
    }

    /**
     * Gets the value of the sceEcl4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEcl4() {
        return sceEcl4;
    }

    /**
     * Sets the value of the sceEcl4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEcl4(String value) {
        this.sceEcl4 = value;
    }

    /**
     * Gets the value of the sceCrd3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCrd3() {
        return sceCrd3;
    }

    /**
     * Sets the value of the sceCrd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCrd3(BigDecimal value) {
        this.sceCrd3 = value;
    }

    /**
     * Gets the value of the sceCrd4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceCrd4() {
        return sceCrd4;
    }

    /**
     * Sets the value of the sceCrd4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceCrd4(BigDecimal value) {
        this.sceCrd4 = value;
    }

    /**
     * Gets the value of the sceElef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceElef() {
        return sceElef;
    }

    /**
     * Sets the value of the sceElef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceElef(String value) {
        this.sceElef = value;
    }

    /**
     * Gets the value of the sceAdsc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceAdsc() {
        return sceAdsc;
    }

    /**
     * Sets the value of the sceAdsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceAdsc(BigDecimal value) {
        this.sceAdsc = value;
    }

    /**
     * Gets the value of the sceIrcp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceIrcp() {
        return sceIrcp;
    }

    /**
     * Sets the value of the sceIrcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceIrcp(BigDecimal value) {
        this.sceIrcp = value;
    }

    /**
     * Gets the value of the sceGin1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceGin1() {
        return sceGin1;
    }

    /**
     * Sets the value of the sceGin1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceGin1(BigDecimal value) {
        this.sceGin1 = value;
    }

    /**
     * Gets the value of the sceGin2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceGin2() {
        return sceGin2;
    }

    /**
     * Sets the value of the sceGin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceGin2(BigDecimal value) {
        this.sceGin2 = value;
    }

    /**
     * Gets the value of the sceUncn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceUncn() {
        return sceUncn;
    }

    /**
     * Sets the value of the sceUncn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceUncn(BigDecimal value) {
        this.sceUncn = value;
    }

    /**
     * Gets the value of the sceUnqn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceUnqn() {
        return sceUnqn;
    }

    /**
     * Sets the value of the sceUnqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceUnqn(BigDecimal value) {
        this.sceUnqn = value;
    }

    /**
     * Gets the value of the sceEldu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEldu() {
        return sceEldu;
    }

    /**
     * Sets the value of the sceEldu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEldu(String value) {
        this.sceEldu = value;
    }

    /**
     * Gets the value of the sceEmpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceEmpr() {
        return sceEmpr;
    }

    /**
     * Sets the value of the sceEmpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceEmpr(String value) {
        this.sceEmpr = value;
    }

    /**
     * Gets the value of the sceTtac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceTtac() {
        return sceTtac;
    }

    /**
     * Sets the value of the sceTtac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceTtac(String value) {
        this.sceTtac = value;
    }

    /**
     * Gets the value of the sceFrn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFrn1() {
        return sceFrn1;
    }

    /**
     * Sets the value of the sceFrn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFrn1(String value) {
        this.sceFrn1 = value;
    }

    /**
     * Gets the value of the sceFrn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFrn2() {
        return sceFrn2;
    }

    /**
     * Sets the value of the sceFrn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFrn2(String value) {
        this.sceFrn2 = value;
    }

    /**
     * Gets the value of the sceFpt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFpt2() {
        return sceFpt2;
    }

    /**
     * Sets the value of the sceFpt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFpt2(String value) {
        this.sceFpt2 = value;
    }

    /**
     * Gets the value of the sceAphr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceAphr() {
        return sceAphr;
    }

    /**
     * Sets the value of the sceAphr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceAphr(BigDecimal value) {
        this.sceAphr = value;
    }

    /**
     * Gets the value of the sceAshr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceAshr() {
        return sceAshr;
    }

    /**
     * Sets the value of the sceAshr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceAshr(BigDecimal value) {
        this.sceAshr = value;
    }

    /**
     * Gets the value of the sceAreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceAreg() {
        return sceAreg;
    }

    /**
     * Sets the value of the sceAreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceAreg(String value) {
        this.sceAreg = value;
    }

    /**
     * Gets the value of the sceRegd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceRegd() {
        return sceRegd;
    }

    /**
     * Sets the value of the sceRegd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceRegd(XMLGregorianCalendar value) {
        this.sceRegd = value;
    }

    /**
     * Gets the value of the sceSclc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSclc() {
        return sceSclc;
    }

    /**
     * Sets the value of the sceSclc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSclc(String value) {
        this.sceSclc = value;
    }

    /**
     * Gets the value of the sceHcic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceHcic() {
        return sceHcic;
    }

    /**
     * Sets the value of the sceHcic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceHcic(String value) {
        this.sceHcic = value;
    }

    /**
     * Gets the value of the sceMoad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSceMoad() {
        return sceMoad;
    }

    /**
     * Sets the value of the sceMoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSceMoad(XMLGregorianCalendar value) {
        this.sceMoad = value;
    }

    /**
     * Gets the value of the sceFtea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceFtea() {
        return sceFtea;
    }

    /**
     * Sets the value of the sceFtea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceFtea(BigDecimal value) {
        this.sceFtea = value;
    }

    /**
     * Gets the value of the sceFteb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceFteb() {
        return sceFteb;
    }

    /**
     * Sets the value of the sceFteb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceFteb(BigDecimal value) {
        this.sceFteb = value;
    }

    /**
     * Gets the value of the sceFtem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFtem() {
        return sceFtem;
    }

    /**
     * Sets the value of the sceFtem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFtem(String value) {
        this.sceFtem = value;
    }

    /**
     * Gets the value of the sceAvgc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceAvgc() {
        return sceAvgc;
    }

    /**
     * Sets the value of the sceAvgc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceAvgc(String value) {
        this.sceAvgc = value;
    }

    /**
     * Gets the value of the sceItts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceItts() {
        return sceItts;
    }

    /**
     * Sets the value of the sceItts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceItts(String value) {
        this.sceItts = value;
    }

    /**
     * Gets the value of the sceQtst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceQtst() {
        return sceQtst;
    }

    /**
     * Sets the value of the sceQtst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceQtst(String value) {
        this.sceQtst = value;
    }

    /**
     * Gets the value of the sceSpfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSpfi() {
        return sceSpfi;
    }

    /**
     * Sets the value of the sceSpfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSpfi(String value) {
        this.sceSpfi = value;
    }

    /**
     * Gets the value of the sceCdd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceCdd1() {
        return sceCdd1;
    }

    /**
     * Sets the value of the sceCdd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceCdd1(String value) {
        this.sceCdd1 = value;
    }

    /**
     * Gets the value of the sceCdd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceCdd2() {
        return sceCdd2;
    }

    /**
     * Sets the value of the sceCdd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceCdd2(String value) {
        this.sceCdd2 = value;
    }

    /**
     * Gets the value of the sceCdd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceCdd3() {
        return sceCdd3;
    }

    /**
     * Sets the value of the sceCdd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceCdd3(String value) {
        this.sceCdd3 = value;
    }

    /**
     * Gets the value of the sceRedi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceRedi() {
        return sceRedi;
    }

    /**
     * Sets the value of the sceRedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceRedi(String value) {
        this.sceRedi = value;
    }

    /**
     * Gets the value of the sceBrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceBrid() {
        return sceBrid;
    }

    /**
     * Sets the value of the sceBrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceBrid(String value) {
        this.sceBrid = value;
    }

    /**
     * Gets the value of the sceCppc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceCppc() {
        return sceCppc;
    }

    /**
     * Sets the value of the sceCppc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceCppc(String value) {
        this.sceCppc = value;
    }

    /**
     * Gets the value of the sceCapc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceCapc() {
        return sceCapc;
    }

    /**
     * Sets the value of the sceCapc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceCapc(String value) {
        this.sceCapc = value;
    }

    /**
     * Gets the value of the sceFsyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFsyn() {
        return sceFsyn;
    }

    /**
     * Sets the value of the sceFsyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFsyn(String value) {
        this.sceFsyn = value;
    }

    /**
     * Gets the value of the sceSdyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceSdyn() {
        return sceSdyn;
    }

    /**
     * Sets the value of the sceSdyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceSdyn(String value) {
        this.sceSdyn = value;
    }

    /**
     * Gets the value of the sceQenc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceQenc() {
        return sceQenc;
    }

    /**
     * Sets the value of the sceQenc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceQenc(String value) {
        this.sceQenc = value;
    }

    /**
     * Gets the value of the sceFst1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceFst1() {
        return sceFst1;
    }

    /**
     * Sets the value of the sceFst1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceFst1(String value) {
        this.sceFst1 = value;
    }

    /**
     * Gets the value of the scePace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScePace() {
        return scePace;
    }

    /**
     * Sets the value of the scePace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScePace(String value) {
        this.scePace = value;
    }

    /**
     * Gets the value of the sceIni1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceIni1() {
        return sceIni1;
    }

    /**
     * Sets the value of the sceIni1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceIni1(String value) {
        this.sceIni1 = value;
    }

    /**
     * Gets the value of the sceIni2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceIni2() {
        return sceIni2;
    }

    /**
     * Sets the value of the sceIni2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceIni2(String value) {
        this.sceIni2 = value;
    }

    /**
     * Gets the value of the sceSasd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSceSasd() {
        return sceSasd;
    }

    /**
     * Sets the value of the sceSasd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSceSasd(BigDecimal value) {
        this.sceSasd = value;
    }

    /**
     * Gets the value of the sceScl1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceScl1() {
        return sceScl1;
    }

    /**
     * Sets the value of the sceScl1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceScl1(String value) {
        this.sceScl1 = value;
    }

    /**
     * Gets the value of the sceInsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceInsc() {
        return sceInsc;
    }

    /**
     * Sets the value of the sceInsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceInsc(String value) {
        this.sceInsc = value;
    }

    /**
     * Gets the value of the scehesd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSCEHESD() {
        return scehesd;
    }

    /**
     * Sets the value of the scehesd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSCEHESD(XMLGregorianCalendar value) {
        this.scehesd = value;
    }

    /**
     * Gets the value of the scesfc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCESFC1() {
        return scesfc1;
    }

    /**
     * Sets the value of the scesfc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCESFC1(String value) {
        this.scesfc1 = value;
    }

    /**
     * Gets the value of the scefreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCEFREG() {
        return scefreg;
    }

    /**
     * Sets the value of the scefreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCEFREG(String value) {
        this.scefreg = value;
    }

    /**
     * Gets the value of the scegfee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSCEGFEE() {
        return scegfee;
    }

    /**
     * Sets the value of the scegfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSCEGFEE(BigDecimal value) {
        this.scegfee = value;
    }

    /**
     * Gets the value of the scenfee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSCENFEE() {
        return scenfee;
    }

    /**
     * Sets the value of the scenfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSCENFEE(BigDecimal value) {
        this.scenfee = value;
    }

    /**
     * Gets the value of the scefwyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCEFWYN() {
        return scefwyn;
    }

    /**
     * Sets the value of the scefwyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCEFWYN(String value) {
        this.scefwyn = value;
    }

    /**
     * Gets the value of the scefeph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCEFEPH() {
        return scefeph;
    }

    /**
     * Sets the value of the scefeph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCEFEPH(String value) {
        this.scefeph = value;
    }

    /**
     * Gets the value of the scevcrf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCEVCRF() {
        return scevcrf;
    }

    /**
     * Sets the value of the scevcrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCEVCRF(String value) {
        this.scevcrf = value;
    }

}
