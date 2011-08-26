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

package org.odftoolkit.odfdom.dom.element.presentation;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPagesAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element presentation:show}.
 *
 */
public class PresentationShowElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.PRESENTATION, "show" );


	/**
	 * Create the instance of <code>PresentationShowElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public PresentationShowElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element presentation:show}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  PresentationShowElement}
	 *
     * @param presentationNameAttributeValue  The mandatory attribute {@odf.attribute  presentation:name}"
     * @param presentationPagesAttributeValue  The mandatory attribute {@odf.attribute  presentation:pages}"
     *
	 */
	public void init(String presentationNameAttributeValue, String presentationPagesAttributeValue)
	{
		setPresentationNameAttribute( presentationNameAttributeValue );
		setPresentationPagesAttribute( presentationPagesAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationNameAttribute</code> , See {@odf.attribute presentation:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationNameAttribute()
	{
		PresentationNameAttribute attr = (PresentationNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationNameAttribute</code> , See {@odf.attribute presentation:name}
	 *
	 * @param presentationNameValue   The type is <code>String</code>
	 */
	public void setPresentationNameAttribute( String presentationNameValue )
	{
		PresentationNameAttribute attr =  new PresentationNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPagesAttribute</code> , See {@odf.attribute presentation:pages}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPagesAttribute()
	{
		PresentationPagesAttribute attr = (PresentationPagesAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "pages" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPagesAttribute</code> , See {@odf.attribute presentation:pages}
	 *
	 * @param presentationPagesValue   The type is <code>String</code>
	 */
	public void setPresentationPagesAttribute( String presentationPagesValue )
	{
		PresentationPagesAttribute attr =  new PresentationPagesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationPagesValue );
	}

}
