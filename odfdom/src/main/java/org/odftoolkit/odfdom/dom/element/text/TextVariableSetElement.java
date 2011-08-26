/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextFormulaAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeCurrencyAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeDateValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeTimeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeBooleanValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeStringValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDisplayAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDataStyleNameAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:variable-set}.
 *
 */
public class TextVariableSetElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "variable-set" );

	/**
	 * The value set of {@odf.attribute office:value-type}.
	 */
	 public enum OfficeValueTypeAttributeValue {
	 
	 BOOLEAN( OfficeValueTypeAttribute.Value.BOOLEAN.toString() ), CURRENCY( OfficeValueTypeAttribute.Value.CURRENCY.toString() ), DATE( OfficeValueTypeAttribute.Value.DATE.toString() ), FLOAT( OfficeValueTypeAttribute.Value.FLOAT.toString() ), PERCENTAGE( OfficeValueTypeAttribute.Value.PERCENTAGE.toString() ), STRING( OfficeValueTypeAttribute.Value.STRING.toString() ), TIME( OfficeValueTypeAttribute.Value.TIME.toString() );
              
		private String mValue;
	 	
		OfficeValueTypeAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static OfficeValueTypeAttributeValue enumValueOf( String value )
	    {
	        for( OfficeValueTypeAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	/**
	 * The value set of {@odf.attribute text:display}.
	 */
	 public enum TextDisplayAttributeValue {
	 
	 NONE( TextDisplayAttribute.Value.NONE.toString() ), VALUE( TextDisplayAttribute.Value.VALUE.toString() );
              
		private String mValue;
	 	
		TextDisplayAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static TextDisplayAttributeValue enumValueOf( String value )
	    {
	        for( TextDisplayAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}

	/**
	 * Create the instance of <code>TextVariableSetElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextVariableSetElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:variable-set}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextVariableSetElement}
	 *
     * @param textNameAttributeValue  The mandatory attribute {@odf.attribute  text:name}"
     * @param officeValueTypeAttributeValue  The mandatory attribute {@odf.attribute  office:value-type}"
     * @param officeValueAttributeValue  The mandatory attribute {@odf.attribute  office:value}"
     * @param officeDateValueAttributeValue  The mandatory attribute {@odf.attribute  office:date-value}"
     * @param officeTimeValueAttributeValue  The mandatory attribute {@odf.attribute  office:time-value}"
     * @param officeBooleanValueAttributeValue  The mandatory attribute {@odf.attribute  office:boolean-value}"
     *
	 */
	public void init(String textNameAttributeValue, String officeValueTypeAttributeValue, double officeValueAttributeValue, String officeDateValueAttributeValue, String officeTimeValueAttributeValue, boolean officeBooleanValueAttributeValue)
	{
		setTextNameAttribute( textNameAttributeValue );
		setOfficeValueAttribute( Double.valueOf(officeValueAttributeValue) );
		setOfficeDateValueAttribute( officeDateValueAttributeValue );
		setOfficeTimeValueAttribute( officeTimeValueAttributeValue );
		setOfficeBooleanValueAttribute( Boolean.valueOf(officeBooleanValueAttributeValue) );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextNameAttribute()
	{
		TextNameAttribute attr = (TextNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * @param textNameValue   The type is <code>String</code>
	 */
	public void setTextNameAttribute( String textNameValue )
	{
		TextNameAttribute attr =  new TextNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextFormulaAttribute</code> , See {@odf.attribute text:formula}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextFormulaAttribute()
	{
		TextFormulaAttribute attr = (TextFormulaAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "formula" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextFormulaAttribute</code> , See {@odf.attribute text:formula}
	 *
	 * @param textFormulaValue   The type is <code>String</code>
	 */
	public void setTextFormulaAttribute( String textFormulaValue )
	{
		TextFormulaAttribute attr =  new TextFormulaAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textFormulaValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See {@odf.attribute office:value-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeValueTypeAttribute()
	{
		OfficeValueTypeAttribute attr = (OfficeValueTypeAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "value-type" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See {@odf.attribute office:value-type}
	 *
	 * @param officeValueTypeValue   The type is <code>String</code>
	 */
	public void setOfficeValueTypeAttribute( String officeValueTypeValue )
	{
		OfficeValueTypeAttribute attr =  new OfficeValueTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeValueTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeValueAttribute</code> , See {@odf.attribute office:value}
	 *
	 * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Double getOfficeValueAttribute()
	{
		OfficeValueAttribute attr = (OfficeValueAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "value" ) ;
		if( attr != null ){
			return Double.valueOf( attr.doubleValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeValueAttribute</code> , See {@odf.attribute office:value}
	 *
	 * @param officeValueValue   The type is <code>Double</code>
	 */
	public void setOfficeValueAttribute( Double officeValueValue )
	{
		OfficeValueAttribute attr =  new OfficeValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setDoubleValue( officeValueValue.doubleValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeCurrencyAttribute</code> , See {@odf.attribute office:currency}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeCurrencyAttribute()
	{
		OfficeCurrencyAttribute attr = (OfficeCurrencyAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "currency" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeCurrencyAttribute</code> , See {@odf.attribute office:currency}
	 *
	 * @param officeCurrencyValue   The type is <code>String</code>
	 */
	public void setOfficeCurrencyAttribute( String officeCurrencyValue )
	{
		OfficeCurrencyAttribute attr =  new OfficeCurrencyAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeCurrencyValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeDateValueAttribute</code> , See {@odf.attribute office:date-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeDateValueAttribute()
	{
		OfficeDateValueAttribute attr = (OfficeDateValueAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "date-value" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeDateValueAttribute</code> , See {@odf.attribute office:date-value}
	 *
	 * @param officeDateValueValue   The type is <code>String</code>
	 */
	public void setOfficeDateValueAttribute( String officeDateValueValue )
	{
		OfficeDateValueAttribute attr =  new OfficeDateValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeDateValueValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeTimeValueAttribute</code> , See {@odf.attribute office:time-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeTimeValueAttribute()
	{
		OfficeTimeValueAttribute attr = (OfficeTimeValueAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "time-value" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeTimeValueAttribute</code> , See {@odf.attribute office:time-value}
	 *
	 * @param officeTimeValueValue   The type is <code>String</code>
	 */
	public void setOfficeTimeValueAttribute( String officeTimeValueValue )
	{
		OfficeTimeValueAttribute attr =  new OfficeTimeValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeTimeValueValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeBooleanValueAttribute</code> , See {@odf.attribute office:boolean-value}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getOfficeBooleanValueAttribute()
	{
		OfficeBooleanValueAttribute attr = (OfficeBooleanValueAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "boolean-value" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeBooleanValueAttribute</code> , See {@odf.attribute office:boolean-value}
	 *
	 * @param officeBooleanValueValue   The type is <code>Boolean</code>
	 */
	public void setOfficeBooleanValueAttribute( Boolean officeBooleanValueValue )
	{
		OfficeBooleanValueAttribute attr =  new OfficeBooleanValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( officeBooleanValueValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeStringValueAttribute</code> , See {@odf.attribute office:string-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeStringValueAttribute()
	{
		OfficeStringValueAttribute attr = (OfficeStringValueAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "string-value" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeStringValueAttribute</code> , See {@odf.attribute office:string-value}
	 *
	 * @param officeStringValueValue   The type is <code>String</code>
	 */
	public void setOfficeStringValueAttribute( String officeStringValueValue )
	{
		OfficeStringValueAttribute attr =  new OfficeStringValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeStringValueValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextDisplayAttribute</code> , See {@odf.attribute text:display}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextDisplayAttribute()
	{
		TextDisplayAttribute attr = (TextDisplayAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "display" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextDisplayAttribute</code> , See {@odf.attribute text:display}
	 *
	 * @param textDisplayValue   The type is <code>String</code>
	 */
	public void setTextDisplayAttribute( String textDisplayValue )
	{
		TextDisplayAttribute attr =  new TextDisplayAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textDisplayValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleDataStyleNameAttribute()
	{
		StyleDataStyleNameAttribute attr = (StyleDataStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "data-style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @param styleDataStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleDataStyleNameAttribute( String styleDataStyleNameValue )
	{
		StyleDataStyleNameAttribute attr =  new StyleDataStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleDataStyleNameValue );
	}

}
