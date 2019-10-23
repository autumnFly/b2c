
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import java.lang.*;


/**
 * <p>SvcPcCertificateDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SvcPcCertificateDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://databean.etdcs}SvcPcCertificatePK" minOccurs="0"/&gt;
 *         &lt;element name="logId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://lang.java}Byte" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcPcCertificateDto", namespace = "http://business.common", propOrder = {
    "certType",
    "id",
    "logId",
    "priority",
    "remark",
    "status"
})
public class SvcPcCertificateDto {

    @XmlElementRef(name = "certType", namespace = "http://business.common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certType;
    @XmlElementRef(name = "id", namespace = "http://business.common", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcPcCertificatePK> id;
    @XmlElementRef(name = "logId", namespace = "http://business.common", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> logId;
    @XmlElementRef(name = "priority", namespace = "http://business.common", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.Byte> priority;
    @XmlElementRef(name = "remark", namespace = "http://business.common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remark;
    @XmlElementRef(name = "status", namespace = "http://business.common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;

    /**
     * ��ȡcertType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertType() {
        return certType;
    }

    /**
     * ����certType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertType(JAXBElement<String> value) {
        this.certType = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcPcCertificatePK }{@code >}
     *     
     */
    public JAXBElement<SvcPcCertificatePK> getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcPcCertificatePK }{@code >}
     *     
     */
    public void setId(JAXBElement<SvcPcCertificatePK> value) {
        this.id = value;
    }

    /**
     * ��ȡlogId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLogId() {
        return logId;
    }

    /**
     * ����logId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLogId(JAXBElement<Long> value) {
        this.logId = value;
    }

    /**
     * ��ȡpriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.Byte }{@code >}
     *     
     */
    public JAXBElement<java.lang.Byte> getPriority() {
        return priority;
    }

    /**
     * ����priority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.Byte }{@code >}
     *     
     */
    public void setPriority(JAXBElement<java.lang.Byte> value) {
        this.priority = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemark(JAXBElement<String> value) {
        this.remark = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

}
