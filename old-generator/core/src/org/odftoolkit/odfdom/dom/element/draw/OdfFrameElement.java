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
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.OdfPercent;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.OdfPresentationClasses;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;

import org.odftoolkit.odfdom.dom.element.table.OdfTableElement;
import org.odftoolkit.odfdom.dom.element.office.OdfEventListenersElement;
import org.odftoolkit.odfdom.dom.type.draw.OdfEscapeDirectionType;
import org.odftoolkit.odfdom.dom.element.svg.OdfTitleElement;
import org.odftoolkit.odfdom.dom.element.svg.OdfDescElement;

/**
 * ODF DOM Element implementation for element "<draw:frame>".
 */
public abstract class OdfFrameElement extends OdfShapeElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "frame" );

    public OdfFrameElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
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
     * Get value of attribute "draw:text-style-name".
     */
    public String getTextStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "text-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:text-style-name".
     */
    public void setTextStyleName( String _aTextStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aTextStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "text-style-name" ), aStringVal );
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
     * Get value of attribute "style:rel-width".
     */
    public Double getRelWidth()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "rel-width" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:rel-width".
     */
    public void setRelWidth( Double _aRelWidth )
    {                    
        String aStringVal = OdfPercent.toString( _aRelWidth );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "rel-width" ), aStringVal );
    }

    /**
     * Get value of attribute "style:rel-height".
     */
    public Double getRelHeight()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "rel-height" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:rel-height".
     */
    public void setRelHeight( Double _aRelHeight )
    {                    
        String aStringVal = OdfPercent.toString( _aRelHeight );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "rel-height" ), aStringVal );
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
     * Get value of attribute "draw:copy-of".
     */
    public String getCopyOf()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "copy-of" ) );
    }

    /**
     * Set value of attribute "draw:copy-of".
     */
    public void setCopyOf( String _aCopyOf )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "copy-of" ), _aCopyOf );
    }

    /**
    * Create child element "draw:text-box".
    */
    public OdfTextBoxElement createTextBoxElement()
    {
        OdfTextBoxElement  _nTextBox = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTextBoxElement.class);
        this.appendChild( _nTextBox);
        return  _nTextBox;
    }                   
               
    /**
    * Create child element "draw:image".
    */
    public OdfImageElement createImageElement()
    {
        OdfImageElement  _nImage = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfImageElement.class);
        this.appendChild( _nImage);
        return  _nImage;
    }                   
               
    /**
    * Create child element "draw:object".
    */
    public OdfObjectElement createObjectElement()
    {
        OdfObjectElement  _nObject = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfObjectElement.class);
        this.appendChild( _nObject);
        return  _nObject;
    }                   
               
    /**
    * Create child element "draw:object-ole".
    */
    public OdfObjectOleElement createObjectOleElement()
    {
        OdfObjectOleElement  _nObjectOle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfObjectOleElement.class);
        this.appendChild( _nObjectOle);
        return  _nObjectOle;
    }                   
               
    /**
    * Create child element "draw:applet".
    */
    public OdfAppletElement createAppletElement()
    {
        OdfAppletElement  _nApplet = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfAppletElement.class);
        this.appendChild( _nApplet);
        return  _nApplet;
    }                   
               
    /**
    * Create child element "draw:floating-frame".
    */
    public OdfFloatingFrameElement createFloatingFrameElement()
    {
        OdfFloatingFrameElement  _nFloatingFrame = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfFloatingFrameElement.class);
        this.appendChild( _nFloatingFrame);
        return  _nFloatingFrame;
    }                   
               
    /**
    * Create child element "draw:plugin".
    */
    public OdfPluginElement createPluginElement()
    {
        OdfPluginElement  _nPlugin = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPluginElement.class);
        this.appendChild( _nPlugin);
        return  _nPlugin;
    }                   
               
    /**
    * Create child element "table:table".
    */
    public OdfTableElement createTableElement()
    {
        OdfTableElement  _nTable = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableElement.class);
        this.appendChild( _nTable);
        return  _nTable;
    }                   
               
    /**
    * Create child element "office:event-listeners".
    */
    public OdfEventListenersElement createEventListenersElement()
    {
        OdfEventListenersElement  _nEventListeners = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfEventListenersElement.class);
        this.appendChild( _nEventListeners);
        return  _nEventListeners;
    }                   
               
    /**
    * Create child element "draw:glue-point".
    */
    public OdfGluePointElement createGluePointElement(Integer   _aDrawid, String   _aX, String   _aY, OdfEscapeDirectionType   _aEscapeDirection)
    {
        OdfGluePointElement  _nGluePoint = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfGluePointElement.class);
        _nGluePoint.setDrawid( _aDrawid);
        _nGluePoint.setX( _aX);
        _nGluePoint.setY( _aY);
        _nGluePoint.setEscapeDirection( _aEscapeDirection);
        this.appendChild( _nGluePoint);
        return  _nGluePoint;      
    }
    
    /**
    * Create child element "draw:image-map".
    */
    public OdfImageMapElement createImageMapElement()
    {
        OdfImageMapElement  _nImageMap = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfImageMapElement.class);
        this.appendChild( _nImageMap);
        return  _nImageMap;
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
               
    /**
    * Create child element "draw:contour-polygon".
    */
    public OdfContourPolygonElement createContourPolygonElement(Boolean   _aRecreateOnEdit, Integer   _aViewbox, String   _aPoints)
    {
        OdfContourPolygonElement  _nContourPolygon = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfContourPolygonElement.class);
        _nContourPolygon.setRecreateOnEdit( _aRecreateOnEdit);
        _nContourPolygon.setViewbox( _aViewbox);
        _nContourPolygon.setPoints( _aPoints);
        this.appendChild( _nContourPolygon);
        return  _nContourPolygon;      
    }
    
    /**
    * Create child element "draw:contour-path".
    */
    public OdfContourPathElement createContourPathElement(Boolean   _aRecreateOnEdit, Integer   _aViewbox, String   _aD)
    {
        OdfContourPathElement  _nContourPath = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfContourPathElement.class);
        _nContourPath.setRecreateOnEdit( _aRecreateOnEdit);
        _nContourPath.setViewbox( _aViewbox);
        _nContourPath.setD( _aD);
        this.appendChild( _nContourPath);
        return  _nContourPath;      
    }
    
}
