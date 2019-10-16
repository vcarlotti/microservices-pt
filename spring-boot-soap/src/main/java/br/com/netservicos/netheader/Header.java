//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.29 às 06:33:05 PM BRST 
//


package br.com.netservicos.netheader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Elemento raiz de header de NET.
 * 			
 * 
 * <p>Classe Java de Header complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aplicacao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NETSMS"/>
 *               &lt;enumeration value="NETSALES"/>
 *               &lt;enumeration value="PORTAL NET"/>
 *               &lt;enumeration value="URA"/>
 *               &lt;enumeration value="MODULO COBRANCA"/>
 *               &lt;enumeration value="ATLAS"/>
 *               &lt;enumeration value="RETENCAO REVERSAO"/>
 *               &lt;enumeration value="COMISSIONAMENTO"/>
 *               &lt;enumeration value="WORKFORCE"/>
 *               &lt;enumeration value="EMBRATEL"/>
 *               &lt;enumeration value="ARRIS"/>
 *               &lt;enumeration value="ACTIVIA"/>
 *               &lt;enumeration value="DECODER DIGITAL"/>
 *               &lt;enumeration value="OTHER"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="funcionalidade" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="versaoServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="atendimento" type="{http://www.netservicos.com.br/NetHeader}Atendimento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "aplicacao",
    "funcionalidade",
    "versaoServico",
    "token",
    "atendimento"
})
public class Header {

    protected String aplicacao;
    protected String funcionalidade;
    protected String versaoServico;
    protected String token;
    protected Atendimento atendimento;

    /**
     * Obtém o valor da propriedade aplicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplicacao() {
        return aplicacao;
    }

    /**
     * Define o valor da propriedade aplicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplicacao(String value) {
        this.aplicacao = value;
    }

    /**
     * Obtém o valor da propriedade funcionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncionalidade() {
        return funcionalidade;
    }

    /**
     * Define o valor da propriedade funcionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncionalidade(String value) {
        this.funcionalidade = value;
    }

    /**
     * Obtém o valor da propriedade versaoServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoServico() {
        return versaoServico;
    }

    /**
     * Define o valor da propriedade versaoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoServico(String value) {
        this.versaoServico = value;
    }

    /**
     * Obtém o valor da propriedade token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define o valor da propriedade token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtém o valor da propriedade atendimento.
     * 
     * @return
     *     possible object is
     *     {@link Atendimento }
     *     
     */
    public Atendimento getAtendimento() {
        return atendimento;
    }

    /**
     * Define o valor da propriedade atendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Atendimento }
     *     
     */
    public void setAtendimento(Atendimento value) {
        this.atendimento = value;
    }

}
