
package com.csair.b2c.cloud.test.sys.cbd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMbTipsDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMbTipsDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MbTipsDto" type="{http://domain.mileage.cbd.csair.com}MbTipsDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMbTipsDto", namespace = "http://domain.mileage.cbd.csair.com", propOrder = {
    "mbTipsDto"
})
public class ArrayOfMbTipsDto {

    @XmlElement(name = "MbTipsDto", nillable = true)
    protected List<MbTipsDto> mbTipsDto;

    /**
     * Gets the value of the mbTipsDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mbTipsDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMbTipsDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MbTipsDto }
     * 
     * 
     */
    public List<MbTipsDto> getMbTipsDto() {
        if (mbTipsDto == null) {
            mbTipsDto = new ArrayList<MbTipsDto>();
        }
        return this.mbTipsDto;
    }

}
