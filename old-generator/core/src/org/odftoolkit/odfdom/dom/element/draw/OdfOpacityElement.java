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
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.draw.OdfGradientStyleType;
import org.odftoolkit.odfdom.dom.type.OdfPercent;

;

/**
 * ODF DOM Element implementation for element "<draw:opacity>".
 */
public abstract class OdfOpacityElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "opacity" );

    public OdfOpacityElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(OdfGradientStyleType _aStyle)
    {
        setStyle( _aStyle );
    }

    /**
     * Get value of attribute "draw:name".
     */
    public String getName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:name".
     */
    public void setName( String _aName )
    {                    
        String aStringVal = OdfStyleName.toString( _aName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:display-name".
     */
    public String getDisplayName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "display-name" ) );
    }

    /**
     * Set value of attribute "draw:display-name".
     */
    public void setDisplayName( String _aDisplayName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "display-name" ), _aDisplayName );
    }

    /**
     * Get value of attribute "draw:style".
     */
    public OdfGradientStyleType getStyle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style" ) );
        return OdfGradientStyleType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:style".
     */
    public void setStyle( OdfGradientStyleType _aStyle )
    {                    
        String aStringVal = OdfGradientStyleType.toString( _aStyle );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:cx".
     */
    public Double getCx()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "cx" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:cx".
     */
    public void setCx( Double _aCx )
    {                    
        String aStringVal = OdfPercent.toString( _aCx );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "cx" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:cy".
     */
    public Double getCy()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "cy" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:cy".
     */
    public void setCy( Double _aCy )
    {                    
        String aStringVal = OdfPercent.toString( _aCy );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "cy" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:angle".
     */
    public String getAngle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "angle" ) );
    }

    /**
     * Set value of attribute "draw:angle".
     */
    public void setAngle( String _aAngle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "angle" ), _aAngle );
    }

    /**
     * Get value of attribute "draw:border".
     */
    public Double getBorder()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "border" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:border".
     */
    public void setBorder( Double _aBorder )
    {                    
        String aStringVal = OdfPercent.toString( _aBorder );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "border" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:start".
     */
    public Double getStart()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:start".
     */
    public void setStart( Double _aStart )
    {                    
        String aStringVal = OdfPercent.toString( _aStart );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:end".
     */
    public Double getEnd()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:end".
     */
    public void setEnd( Double _aEnd )
    {                    
        String aStringVal = OdfPercent.toString( _aEnd );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end" ), aStringVal );
    }

}
