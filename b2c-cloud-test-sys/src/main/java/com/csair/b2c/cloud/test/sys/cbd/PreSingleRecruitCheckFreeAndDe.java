
package com.csair.b2c.cloud.test.sys.cbd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="in0" type="{http://dto.services.flyRecords.cbd.csair.com}RecruitApplyDto"/&gt;
 *         &lt;element name="in1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="in2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="in3" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0",
    "in1",
    "in2",
    "in3"
})
@XmlRootElement(name = "preSingleRecruitCheckFreeAndDe")
public class PreSingleRecruitCheckFreeAndDe {

    @XmlElement(required = true, nillable = true)
    protected RecruitApplyDto in0;
    protected boolean in1;
    protected boolean in2;
    protected boolean in3;

    /**
     * ��ȡin0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecruitApplyDto }
     *     
     */
    public RecruitApplyDto getIn0() {
        return in0;
    }

    /**
     * ����in0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecruitApplyDto }
     *     
     */
    public void setIn0(RecruitApplyDto value) {
        this.in0 = value;
    }

    /**
     * ��ȡin1���Ե�ֵ��
     * 
     */
    public boolean isIn1() {
        return in1;
    }

    /**
     * ����in1���Ե�ֵ��
     * 
     */
    public void setIn1(boolean value) {
        this.in1 = value;
    }

    /**
     * ��ȡin2���Ե�ֵ��
     * 
     */
    public boolean isIn2() {
        return in2;
    }

    /**
     * ����in2���Ե�ֵ��
     * 
     */
    public void setIn2(boolean value) {
        this.in2 = value;
    }

    /**
     * ��ȡin3���Ե�ֵ��
     * 
     */
    public boolean isIn3() {
        return in3;
    }

    /**
     * ����in3���Ե�ֵ��
     * 
     */
    public void setIn3(boolean value) {
        this.in3 = value;
    }

}
