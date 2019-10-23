
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>QueryPriceDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QueryPriceDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arriveAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departureAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="realCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saleCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upgradedClazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPriceDto", namespace = "http://dto.services.marketing.cbd.csair.com", propOrder = {
    "arriveAirport",
    "clazz",
    "departureAirport",
    "flightDate",
    "flightNumber",
    "realCarrier",
    "saleCarrier",
    "ticketNumber",
    "upgradedClazz"
})
public class QueryPriceDto {

    @XmlElementRef(name = "arriveAirport", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arriveAirport;
    @XmlElementRef(name = "clazz", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clazz;
    @XmlElementRef(name = "departureAirport", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureAirport;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlElementRef(name = "flightNumber", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNumber;
    @XmlElementRef(name = "realCarrier", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> realCarrier;
    @XmlElementRef(name = "saleCarrier", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleCarrier;
    @XmlElementRef(name = "ticketNumber", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketNumber;
    @XmlElementRef(name = "upgradedClazz", namespace = "http://dto.services.marketing.cbd.csair.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> upgradedClazz;

    /**
     * ��ȡarriveAirport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArriveAirport() {
        return arriveAirport;
    }

    /**
     * ����arriveAirport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArriveAirport(JAXBElement<String> value) {
        this.arriveAirport = value;
    }

    /**
     * ��ȡclazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClazz() {
        return clazz;
    }

    /**
     * ����clazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClazz(JAXBElement<String> value) {
        this.clazz = value;
    }

    /**
     * ��ȡdepartureAirport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartureAirport() {
        return departureAirport;
    }

    /**
     * ����departureAirport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartureAirport(JAXBElement<String> value) {
        this.departureAirport = value;
    }

    /**
     * ��ȡflightDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * ����flightDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * ��ȡflightNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightNumber() {
        return flightNumber;
    }

    /**
     * ����flightNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightNumber(JAXBElement<String> value) {
        this.flightNumber = value;
    }

    /**
     * ��ȡrealCarrier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRealCarrier() {
        return realCarrier;
    }

    /**
     * ����realCarrier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRealCarrier(JAXBElement<String> value) {
        this.realCarrier = value;
    }

    /**
     * ��ȡsaleCarrier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleCarrier() {
        return saleCarrier;
    }

    /**
     * ����saleCarrier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleCarrier(JAXBElement<String> value) {
        this.saleCarrier = value;
    }

    /**
     * ��ȡticketNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTicketNumber() {
        return ticketNumber;
    }

    /**
     * ����ticketNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTicketNumber(JAXBElement<String> value) {
        this.ticketNumber = value;
    }

    /**
     * ��ȡupgradedClazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpgradedClazz() {
        return upgradedClazz;
    }

    /**
     * ����upgradedClazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpgradedClazz(JAXBElement<String> value) {
        this.upgradedClazz = value;
    }

}
