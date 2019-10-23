
package com.csair.b2c.cloud.test.sys.cbd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfRecruitDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecruitDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecruitDto" type="{http://dto.services.cbdinterface.cbd.csair.com}RecruitDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecruitDto", namespace = "http://dto.services.cbdinterface.cbd.csair.com", propOrder = {
    "recruitDto"
})
public class ArrayOfRecruitDto {

    @XmlElement(name = "RecruitDto", nillable = true)
    protected List<RecruitDto> recruitDto;

    /**
     * Gets the value of the recruitDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recruitDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecruitDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecruitDto }
     * 
     * 
     */
    public List<RecruitDto> getRecruitDto() {
        if (recruitDto == null) {
            recruitDto = new ArrayList<RecruitDto>();
        }
        return this.recruitDto;
    }

}
