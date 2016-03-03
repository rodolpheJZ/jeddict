//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.21 at 01:52:19 PM IST
//
package org.netbeans.jpa.modeler.spec;

import java.util.Set;
import java.util.TreeSet;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.StringUtils;
import org.eclipse.persistence.internal.jpa.metadata.accessors.mappings.EmbeddedIdAccessor;
import org.netbeans.jpa.modeler.spec.extend.AttributeOverrideHandler;
import org.netbeans.jpa.modeler.spec.extend.CompositionAttribute;
import org.netbeans.jpa.source.JavaSourceParserUtil;
import org.netbeans.modeler.core.NBModelerUtil;

/**
 *
 *
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface EmbeddedId {}
 *
 *
 *
 * <p>
 * Java class for embedded-id complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="embedded-id">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attribute-override" type="{http://java.sun.com/xml/ns/persistence/orm}attribute-override" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="access" type="{http://java.sun.com/xml/ns/persistence/orm}access-type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "embedded-id", propOrder = {
    "attributeOverride"
})
public class EmbeddedId extends CompositionAttribute implements AttributeOverrideHandler {

    @XmlElement(name = "attribute-override")
    protected Set<AttributeOverride> attributeOverride;
    @XmlAttribute
    protected AccessType access;
//No need to set connectedClassId cause is mapped to virtual(hidden) Embaddable not Visual Embaddable

    public static EmbeddedId load(EntityMappings entityMappings, Element element, VariableElement variableElement) {
        EmbeddedId embeddedId = new EmbeddedId();
        embeddedId.setId(NBModelerUtil.getAutoGeneratedStringId());

        embeddedId.getAttributeOverride().addAll(AttributeOverride.load(element));

        embeddedId.name = variableElement.getSimpleName().toString();
        embeddedId.access = AccessType.load(element);

        DeclaredType declaredType = (DeclaredType) variableElement.asType();

        org.netbeans.jpa.modeler.spec.Embeddable embeddableClassSpec = entityMappings.findEmbeddable(declaredType.asElement().getSimpleName().toString());
        if (embeddableClassSpec == null) {
            boolean fieldAccess = false;
            if (element == variableElement) {
                fieldAccess = true;
            }
            embeddableClassSpec = new org.netbeans.jpa.modeler.spec.Embeddable();
            TypeElement embeddableTypeElement = JavaSourceParserUtil.getAttributeTypeElement(variableElement);
            embeddableClassSpec.load(entityMappings, embeddableTypeElement, fieldAccess);
            entityMappings.addEmbeddable(embeddableClassSpec);
        }
        embeddedId.setConnectedClass(embeddableClassSpec);

        JavaSourceParserUtil.addNonEEAnnotation(embeddedId, element);
        return embeddedId;
    }

    /**
     * Gets the value of the attributeOverride property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the attributeOverride property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeOverride().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeOverride }
     *
     *
     */
    @Override
    public Set<AttributeOverride> getAttributeOverride() {
        if (attributeOverride == null) {
            attributeOverride = new TreeSet<>();
        }
        return this.attributeOverride;
    }

    public AttributeOverride findAttributeOverride(String name) {
        for (AttributeOverride attributeOverride : getAttributeOverride()) {
            if (StringUtils.equals(name, attributeOverride.getName())) {
                return attributeOverride;
            }
        }
        return null;
    }

    public boolean addAttributeOverride(AttributeOverride attributeOverride) {
        return getAttributeOverride().add(attributeOverride);
    }

    public boolean removeAttributeOverride(AttributeOverride attributeOverride) {
        return getAttributeOverride().remove(attributeOverride);
    }

    /**
     * Gets the value of the access property.
     *
     * @return possible object is {@link AccessType }
     *
     */
    @Override
    public AccessType getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     *
     * @param value allowed object is {@link AccessType }
     *
     */
    @Override
    public void setAccess(AccessType value) {
        this.access = value;
    }

    @Override
    public AttributeOverride getAttributeOverride(String attributePath) {
        Set<AttributeOverride> attributeOverrides = getAttributeOverride();
        for (AttributeOverride attributeOverride_TMP : attributeOverrides) {
            if (attributeOverride_TMP.getName().equals(attributePath)) {
                return attributeOverride_TMP;
            }
        }
        AttributeOverride attributeOverride_TMP = new AttributeOverride();
        attributeOverride_TMP.setName(attributePath);
        attributeOverrides.add(attributeOverride_TMP);
        return attributeOverride_TMP;
    }

    public EmbeddedIdAccessor getAccessor() {
        EmbeddedIdAccessor attr = new EmbeddedIdAccessor();
        attr.setName(name);
//        attr.setAttributeType(a);
        return attr;

    }
}
