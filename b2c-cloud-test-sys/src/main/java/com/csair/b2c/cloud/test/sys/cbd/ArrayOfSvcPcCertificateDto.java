
package com.csair.b2c.cloud.test.sys.cbd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSvcPcCertificateDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSvcPcCertificateDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcPcCertificateDto" type="{http://business.common}SvcPcCertificateDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSvcPcCertificateDto", namespace = "http://business.common", propOrder = {
    "svcPcCertificateDto"
})
public class ArrayOfSvcPcCertificateDto {

    @XmlElement(name = "SvcPcCertificateDto", nillable = true)
    protected List<SvcPcCertificateDto> svcPcCertificateDto;

    /**
     * Gets the value of the svcPcCertificateDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcPcCertificateDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcPcCertificateDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcPcCertificateDto }
     * 
     * 
     */
    public List<SvcPcCertificateDto> getSvcPcCertificateDto() {
        if (svcPcCertificateDto == null) {
            svcPcCertificateDto = new ArrayList<SvcPcCertificateDto>();
        }
        return this.svcPcCertificateDto;
    }

}
