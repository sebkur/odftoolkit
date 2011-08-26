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
import org.odftoolkit.odfdom.dom.attribute.text.TextIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextKey1Attribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextKey2Attribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStringValuePhoneticAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextKey1PhoneticAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextKey2PhoneticAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextMainEntryAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:alphabetical-index-mark-start}.
 *
 */
public class TextAlphabeticalIndexMarkStartElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "alphabetical-index-mark-start" );


	/**
	 * Create the instance of <code>TextAlphabeticalIndexMarkStartElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextAlphabeticalIndexMarkStartElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:alphabetical-index-mark-start}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextAlphabeticalIndexMarkStartElement}
	 *
     * @param textIdAttributeValue  The mandatory attribute {@odf.attribute  text:id}"
     *
	 */
	public void init(String textIdAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIdAttribute()
	{
		TextIdAttribute attr = (TextIdAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "id" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * @param textIdValue   The type is <code>String</code>
	 */
	public void setTextIdAttribute( String textIdValue )
	{
		TextIdAttribute attr =  new TextIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextKey1Attribute</code> , See {@odf.attribute text:key1}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextKey1Attribute()
	{
		TextKey1Attribute attr = (TextKey1Attribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "key1" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextKey1Attribute</code> , See {@odf.attribute text:key1}
	 *
	 * @param textKey1Value   The type is <code>String</code>
	 */
	public void setTextKey1Attribute( String textKey1Value )
	{
		TextKey1Attribute attr =  new TextKey1Attribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textKey1Value );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextKey2Attribute</code> , See {@odf.attribute text:key2}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextKey2Attribute()
	{
		TextKey2Attribute attr = (TextKey2Attribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "key2" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextKey2Attribute</code> , See {@odf.attribute text:key2}
	 *
	 * @param textKey2Value   The type is <code>String</code>
	 */
	public void setTextKey2Attribute( String textKey2Value )
	{
		TextKey2Attribute attr =  new TextKey2Attribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textKey2Value );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStringValuePhoneticAttribute</code> , See {@odf.attribute text:string-value-phonetic}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStringValuePhoneticAttribute()
	{
		TextStringValuePhoneticAttribute attr = (TextStringValuePhoneticAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "string-value-phonetic" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStringValuePhoneticAttribute</code> , See {@odf.attribute text:string-value-phonetic}
	 *
	 * @param textStringValuePhoneticValue   The type is <code>String</code>
	 */
	public void setTextStringValuePhoneticAttribute( String textStringValuePhoneticValue )
	{
		TextStringValuePhoneticAttribute attr =  new TextStringValuePhoneticAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textStringValuePhoneticValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextKey1PhoneticAttribute</code> , See {@odf.attribute text:key1-phonetic}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextKey1PhoneticAttribute()
	{
		TextKey1PhoneticAttribute attr = (TextKey1PhoneticAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "key1-phonetic" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextKey1PhoneticAttribute</code> , See {@odf.attribute text:key1-phonetic}
	 *
	 * @param textKey1PhoneticValue   The type is <code>String</code>
	 */
	public void setTextKey1PhoneticAttribute( String textKey1PhoneticValue )
	{
		TextKey1PhoneticAttribute attr =  new TextKey1PhoneticAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textKey1PhoneticValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextKey2PhoneticAttribute</code> , See {@odf.attribute text:key2-phonetic}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextKey2PhoneticAttribute()
	{
		TextKey2PhoneticAttribute attr = (TextKey2PhoneticAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "key2-phonetic" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextKey2PhoneticAttribute</code> , See {@odf.attribute text:key2-phonetic}
	 *
	 * @param textKey2PhoneticValue   The type is <code>String</code>
	 */
	public void setTextKey2PhoneticAttribute( String textKey2PhoneticValue )
	{
		TextKey2PhoneticAttribute attr =  new TextKey2PhoneticAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textKey2PhoneticValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextMainEntryAttribute</code> , See {@odf.attribute text:main-entry}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextMainEntryAttribute()
	{
		TextMainEntryAttribute attr = (TextMainEntryAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "main-entry" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextMainEntryAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextMainEntryAttribute</code> , See {@odf.attribute text:main-entry}
	 *
	 * @param textMainEntryValue   The type is <code>Boolean</code>
	 */
	public void setTextMainEntryAttribute( Boolean textMainEntryValue )
	{
		TextMainEntryAttribute attr =  new TextMainEntryAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textMainEntryValue.booleanValue() );
	}

}
