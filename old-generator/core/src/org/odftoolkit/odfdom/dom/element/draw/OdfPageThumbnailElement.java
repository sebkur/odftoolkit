/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;
import org.odftoolkit.odfdom.dom.type.OdfPresentationClasses;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfId;

import org.odftoolkit.odfdom.dom.element.svg.OdfTitleElement;
import org.odftoolkit.odfdom.dom.element.svg.OdfDescElement;

/**
 * ODF DOM Element implementation for element "<draw:page-thumbnail>".
 */
public abstract class OdfPageThumbnailElement extends OdfShapeElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "page-thumbnail" );

    public OdfPageThumbnailElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "draw:page-number".
     */
    public Integer getPageNumber()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "page-number" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:page-number".
     */
    public void setPageNumber( Integer _aPageNumber )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aPageNumber );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "page-number" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:x".
     */
    public String getX()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ) );
    }

    /**
     * Set value of attribute "svg:x".
     */
    public void setX( String _aX )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ), _aX );
    }

    /**
     * Get value of attribute "svg:y".
     */
    public String getY()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ) );
    }

    /**
     * Set value of attribute "svg:y".
     */
    public void setY( String _aY )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ), _aY );
    }

    /**
     * Get value of attribute "svg:width".
     */
    public String getWidth()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ) );
    }

    /**
     * Set value of attribute "svg:width".
     */
    public void setWidth( String _aWidth )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ), _aWidth );
    }

    /**
     * Get value of attribute "svg:height".
     */
    public String getHeight()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ) );
    }

    /**
     * Set value of attribute "svg:height".
     */
    public void setHeight( String _aHeight )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ), _aHeight );
    }

    /**
     * Get value of attribute "presentation:class".
     */
    public OdfPresentationClasses getPresentationClass()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "class" ) );
        return OdfPresentationClasses.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:class".
     */
    public void setPresentationClass( OdfPresentationClasses _aPresentationClass )
    {                    
        String aStringVal = OdfPresentationClasses.toString( _aPresentationClass );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "class" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:placeholder".
     */
    public Boolean getPlaceholder()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "placeholder" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:placeholder".
     */
    public void setPlaceholder( Boolean _aPlaceholder )
    {                    
        String aStringVal = OdfBoolean.toString( _aPlaceholder );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "placeholder" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:user-transformed".
     */
    public Boolean getUserTransformed()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "user-transformed" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:user-transformed".
     */
    public void setUserTransformed( Boolean _aUserTransformed )
    {                    
        String aStringVal = OdfBoolean.toString( _aUserTransformed );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "user-transformed" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:layer".
     */
    public String getLayer()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ) );
    }

    /**
     * Set value of attribute "draw:layer".
     */
    public void setLayer( String _aLayer )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ), _aLayer );
    }

    /**
     * Get value of attribute "draw:transform".
     */
    public String getTransform()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "transform" ) );
    }

    /**
     * Set value of attribute "draw:transform".
     */
    public void setTransform( String _aTransform )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "transform" ), _aTransform );
    }

    /**
     * Get value of attribute "draw:caption-id".
     */
    public String getCaptionId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:caption-id".
     */
    public void setCaptionId( String _aCaptionId )
    {                    
        String aStringVal = OdfId.toString( _aCaptionId );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ), aStringVal );
    }

    /**
    * Create child element "svg:title".
    */
    public OdfTitleElement createTitleElement()
    {
        OdfTitleElement  _nTitle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTitleElement.class);
        this.appendChild( _nTitle);
        return  _nTitle;
    }                   
               
    /**
    * Create child element "svg:desc".
    */
    public OdfDescElement createDescElement()
    {
        OdfDescElement  _nDesc = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDescElement.class);
        this.appendChild( _nDesc);
        return  _nDesc;
    }                   
               
}
