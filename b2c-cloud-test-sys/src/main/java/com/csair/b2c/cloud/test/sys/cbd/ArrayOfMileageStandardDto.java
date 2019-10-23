
package com.csair.b2c.cloud.test.sys.cbd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMileageStandardDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMileageStandardDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MileageStandardDto" type="{http://dto.services.account.cbd.csair.com}MileageStandardDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMileageStandardDto", namespace = "http://dto.services.account.cbd.csair.com", propOrder = {
    "mileageStandardDto"
})
public class ArrayOfMileageStandardDto {

    @XmlElement(name = "MileageStandardDto", nillable = true)
    protected List<MileageStandardDto> mileageStandardDto;

    /**
     * Gets the value of the mileageStandardDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mileageStandardDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMileageStandardDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MileageStandardDto }
     * 
     * 
     */
    public List<MileageStandardDto> getMileageStandardDto() {
        if (mileageStandardDto == null) {
            mileageStandardDto = new ArrayList<MileageStandardDto>();
        }
        return this.mileageStandardDto;
    }

}
