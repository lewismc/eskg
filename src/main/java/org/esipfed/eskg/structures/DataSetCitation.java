/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.07 at 01:56:59 PM PDT 
//

package org.esipfed.eskg.structures;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Dataset_Creator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Dataset_Title" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Dataset_Series_Name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Dataset_Release_Date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Dataset_Release_Place" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Dataset_Publisher" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Version" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Issue_Identification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Data_Presentation_Form" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Other_Citation_Details" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Online_Resource" minOccurs="0"/&gt;
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
    "datasetCreator",
    "datasetTitle",
    "datasetSeriesName",
    "datasetReleaseDate",
    "datasetReleasePlace",
    "datasetPublisher",
    "version",
    "issueIdentification",
    "dataPresentationForm",
    "otherCitationDetails",
    "onlineResource"
})
@XmlRootElement(name = "Data_Set_Citation")
public class DataSetCitation {

    @XmlElement(name = "Dataset_Creator")
    protected String datasetCreator;
    @XmlElement(name = "Dataset_Title")
    protected String datasetTitle;
    @XmlElement(name = "Dataset_Series_Name")
    protected String datasetSeriesName;
    @XmlElement(name = "Dataset_Release_Date")
    protected String datasetReleaseDate;
    @XmlElement(name = "Dataset_Release_Place")
    protected String datasetReleasePlace;
    @XmlElement(name = "Dataset_Publisher")
    protected String datasetPublisher;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Issue_Identification")
    protected String issueIdentification;
    @XmlElement(name = "Data_Presentation_Form")
    protected String dataPresentationForm;
    @XmlElement(name = "Other_Citation_Details")
    protected String otherCitationDetails;
    @XmlElement(name = "Online_Resource")
    protected String onlineResource;

    /**
     * Gets the value of the datasetCreator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetCreator() {
        return datasetCreator;
    }

    /**
     * Sets the value of the datasetCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetCreator(String value) {
        this.datasetCreator = value;
    }

    /**
     * Gets the value of the datasetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetTitle() {
        return datasetTitle;
    }

    /**
     * Sets the value of the datasetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetTitle(String value) {
        this.datasetTitle = value;
    }

    /**
     * Gets the value of the datasetSeriesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetSeriesName() {
        return datasetSeriesName;
    }

    /**
     * Sets the value of the datasetSeriesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetSeriesName(String value) {
        this.datasetSeriesName = value;
    }

    /**
     * Gets the value of the datasetReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetReleaseDate() {
        return datasetReleaseDate;
    }

    /**
     * Sets the value of the datasetReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetReleaseDate(String value) {
        this.datasetReleaseDate = value;
    }

    /**
     * Gets the value of the datasetReleasePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetReleasePlace() {
        return datasetReleasePlace;
    }

    /**
     * Sets the value of the datasetReleasePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetReleasePlace(String value) {
        this.datasetReleasePlace = value;
    }

    /**
     * Gets the value of the datasetPublisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetPublisher() {
        return datasetPublisher;
    }

    /**
     * Sets the value of the datasetPublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetPublisher(String value) {
        this.datasetPublisher = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the issueIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueIdentification() {
        return issueIdentification;
    }

    /**
     * Sets the value of the issueIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueIdentification(String value) {
        this.issueIdentification = value;
    }

    /**
     * Gets the value of the dataPresentationForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPresentationForm() {
        return dataPresentationForm;
    }

    /**
     * Sets the value of the dataPresentationForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPresentationForm(String value) {
        this.dataPresentationForm = value;
    }

    /**
     * Gets the value of the otherCitationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCitationDetails() {
        return otherCitationDetails;
    }

    /**
     * Sets the value of the otherCitationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCitationDetails(String value) {
        this.otherCitationDetails = value;
    }

    /**
     * Gets the value of the onlineResource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineResource() {
        return onlineResource;
    }

    /**
     * Sets the value of the onlineResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineResource(String value) {
        this.onlineResource = value;
    }

}
