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

package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartStyleNameAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element chart:wall}.
 *
 */
public class ChartWallElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.CHART, "wall" );


	/**
	 * Create the instance of <code>ChartWallElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public ChartWallElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME, OdfStyleFamily.Chart, OdfName.newName(OdfNamespaceNames.CHART, "style-name" )	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element chart:wall}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgWidthAttribute</code> , See {@odf.attribute svg:width}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgWidthAttribute()
	{
		SvgWidthAttribute attr = (SvgWidthAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "width" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgWidthAttribute</code> , See {@odf.attribute svg:width}
	 *
	 * @param svgWidthValue   The type is <code>String</code>
	 */
	public void setSvgWidthAttribute( String svgWidthValue )
	{
		SvgWidthAttribute attr =  new SvgWidthAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgWidthValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartStyleNameAttribute()
	{
		ChartStyleNameAttribute attr = (ChartStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.CHART), "style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @param chartStyleNameValue   The type is <code>String</code>
	 */
	public void setChartStyleNameAttribute( String chartStyleNameValue )
	{
		ChartStyleNameAttribute attr =  new ChartStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( chartStyleNameValue );
	}

}
