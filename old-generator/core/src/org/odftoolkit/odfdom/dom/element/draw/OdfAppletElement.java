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
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.OdfAnyURI;

;

/**
 * ODF DOM Element implementation for element "<draw:applet>".
 */
public abstract class OdfAppletElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "applet" );

    public OdfAppletElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "draw:code".
     */
    public String getCode()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "code" ) );
    }

    /**
     * Set value of attribute "draw:code".
     */
    public void setCode( String _aCode )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "code" ), _aCode );
    }

    /**
     * Get value of attribute "draw:object".
     */
    public String getObject()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "object" ) );
    }

    /**
     * Set value of attribute "draw:object".
     */
    public void setObject( String _aObject )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "object" ), _aObject );
    }

    /**
     * Get value of attribute "draw:archive".
     */
    public String getArchive()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "archive" ) );
    }

    /**
     * Set value of attribute "draw:archive".
     */
    public void setArchive( String _aArchive )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "archive" ), _aArchive );
    }

    /**
     * Get value of attribute "draw:may-script".
     */
    public Boolean getMayScript()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "may-script" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:may-script".
     */
    public void setMayScript( Boolean _aMayScript )
    {                    
        String aStringVal = OdfBoolean.toString( _aMayScript );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "may-script" ), aStringVal );
    }

    /**
     * Get value of attribute "xml:id".
     */
    public String getXmlid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xml:id".
     */
    public void setXmlid( String _aXmlid )
    {                    
        String aStringVal = OdfId.toString( _aXmlid );
        setOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "xlink:href".
     */
    public String getHref()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xlink:href".
     */
    public void setHref( String _aHref )
    {                    
        String aStringVal = OdfAnyURI.toString( _aHref );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ), aStringVal );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "type" ), "simple" );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "show" ), "embed" );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "actuate" ), "onLoad" );
    }

    /**
    * Create child element "draw:param".
    */
    public OdfParamElement createParamElement()
    {
        OdfParamElement  _nParam = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfParamElement.class);
        this.appendChild( _nParam);
        return  _nParam;
    }                   
               
}
