
package com.csair.b2c.cloud.test.sys.cbd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfTravelCountDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTravelCountDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelCountDto" type="{http://dto.service.custombehavior.cbd.csair.com}TravelCountDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTravelCountDto", namespace = "http://dto.service.custombehavior.cbd.csair.com", propOrder = {
    "travelCountDto"
})
public class ArrayOfTravelCountDto {

    @XmlElement(name = "TravelCountDto", nillable = true)
    protected List<TravelCountDto> travelCountDto;

    /**
     * Gets the value of the travelCountDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelCountDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelCountDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelCountDto }
     * 
     * 
     */
    public List<TravelCountDto> getTravelCountDto() {
        if (travelCountDto == null) {
            travelCountDto = new ArrayList<TravelCountDto>();
        }
        return this.travelCountDto;
    }

}
