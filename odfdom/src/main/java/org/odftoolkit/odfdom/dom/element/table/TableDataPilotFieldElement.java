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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableSourceFieldNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableOrientationAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableSelectedPageAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableIsDataLayoutFieldAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableFunctionAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUsedHierarchyAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:data-pilot-field}.
 *
 */
public class TableDataPilotFieldElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TABLE, "data-pilot-field" );


	/**
	 * Create the instance of <code>TableDataPilotFieldElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDataPilotFieldElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:data-pilot-field}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableDataPilotFieldElement}
	 *
     * @param tableSourceFieldNameAttributeValue  The mandatory attribute {@odf.attribute  table:source-field-name}"
     * @param tableOrientationAttributeValue  The mandatory attribute {@odf.attribute  table:orientation}"
     * @param tableSelectedPageAttributeValue  The mandatory attribute {@odf.attribute  table:selected-page}"
     *
	 */
	public void init(String tableSourceFieldNameAttributeValue, String tableOrientationAttributeValue, String tableSelectedPageAttributeValue)
	{
		setTableSourceFieldNameAttribute( tableSourceFieldNameAttributeValue );
		setTableOrientationAttribute( tableOrientationAttributeValue );
		setTableSelectedPageAttribute( tableSelectedPageAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableSourceFieldNameAttribute</code> , See {@odf.attribute table:source-field-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableSourceFieldNameAttribute()
	{
		TableSourceFieldNameAttribute attr = (TableSourceFieldNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "source-field-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableSourceFieldNameAttribute</code> , See {@odf.attribute table:source-field-name}
	 *
	 * @param tableSourceFieldNameValue   The type is <code>String</code>
	 */
	public void setTableSourceFieldNameAttribute( String tableSourceFieldNameValue )
	{
		TableSourceFieldNameAttribute attr =  new TableSourceFieldNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableSourceFieldNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableOrientationAttribute</code> , See {@odf.attribute table:orientation}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableOrientationAttribute()
	{
		TableOrientationAttribute attr = (TableOrientationAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "orientation" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableOrientationAttribute</code> , See {@odf.attribute table:orientation}
	 *
	 * @param tableOrientationValue   The type is <code>String</code>
	 */
	public void setTableOrientationAttribute( String tableOrientationValue )
	{
		TableOrientationAttribute attr =  new TableOrientationAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableOrientationValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableSelectedPageAttribute</code> , See {@odf.attribute table:selected-page}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableSelectedPageAttribute()
	{
		TableSelectedPageAttribute attr = (TableSelectedPageAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "selected-page" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableSelectedPageAttribute</code> , See {@odf.attribute table:selected-page}
	 *
	 * @param tableSelectedPageValue   The type is <code>String</code>
	 */
	public void setTableSelectedPageAttribute( String tableSelectedPageValue )
	{
		TableSelectedPageAttribute attr =  new TableSelectedPageAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableSelectedPageValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIsDataLayoutFieldAttribute</code> , See {@odf.attribute table:is-data-layout-field}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableIsDataLayoutFieldAttribute()
	{
		TableIsDataLayoutFieldAttribute attr = (TableIsDataLayoutFieldAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "is-data-layout-field" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return TableIsDataLayoutFieldAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIsDataLayoutFieldAttribute</code> , See {@odf.attribute table:is-data-layout-field}
	 *
	 * @param tableIsDataLayoutFieldValue   The type is <code>String</code>
	 */
	public void setTableIsDataLayoutFieldAttribute( String tableIsDataLayoutFieldValue )
	{
		TableIsDataLayoutFieldAttribute attr =  new TableIsDataLayoutFieldAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableIsDataLayoutFieldValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFunctionAttribute</code> , See {@odf.attribute table:function}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFunctionAttribute()
	{
		TableFunctionAttribute attr = (TableFunctionAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "function" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFunctionAttribute</code> , See {@odf.attribute table:function}
	 *
	 * @param tableFunctionValue   The type is <code>String</code>
	 */
	public void setTableFunctionAttribute( String tableFunctionValue )
	{
		TableFunctionAttribute attr =  new TableFunctionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableFunctionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUsedHierarchyAttribute</code> , See {@odf.attribute table:used-hierarchy}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableUsedHierarchyAttribute()
	{
		TableUsedHierarchyAttribute attr = (TableUsedHierarchyAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "used-hierarchy" ) ;
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return Integer.valueOf( TableUsedHierarchyAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUsedHierarchyAttribute</code> , See {@odf.attribute table:used-hierarchy}
	 *
	 * @param tableUsedHierarchyValue   The type is <code>Integer</code>
	 */
	public void setTableUsedHierarchyAttribute( Integer tableUsedHierarchyValue )
	{
		TableUsedHierarchyAttribute attr =  new TableUsedHierarchyAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( tableUsedHierarchyValue.intValue() );
	}

	/**
	 * Create child element {@odf.element table:data-pilot-level}.
	 *
	 * @return   return  the element {@odf.element table:data-pilot-level}
	 * DifferentQName 
	 */
	public TableDataPilotLevelElement newTableDataPilotLevelElement()
	{
		TableDataPilotLevelElement  tableDataPilotLevel = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDataPilotLevelElement.class);
		this.appendChild( tableDataPilotLevel);
		return  tableDataPilotLevel;
	}                   
               
	/**
	 * Create child element {@odf.element table:data-pilot-field-reference}.
	 *
     * @param tableFieldNameAttributeValue  the <code>String</code> value of <code>TableFieldNameAttribute</code>, see {@odf.attribute  table:field-name} at specification
	 * @param tableMemberTypeAttributeValue  the <code>String</code> value of <code>TableMemberTypeAttribute</code>, see {@odf.attribute  table:member-type} at specification
	 * @param tableTypeAttributeValue  the <code>String</code> value of <code>TableTypeAttribute</code>, see {@odf.attribute  table:type} at specification
	 * @return   return  the element {@odf.element table:data-pilot-field-reference}
	 * DifferentQName 
	 */
    
	public TableDataPilotFieldReferenceElement newTableDataPilotFieldReferenceElement(String tableFieldNameAttributeValue, String tableMemberTypeAttributeValue, String tableTypeAttributeValue)
	{
		TableDataPilotFieldReferenceElement  tableDataPilotFieldReference = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDataPilotFieldReferenceElement.class);
		tableDataPilotFieldReference.setTableFieldNameAttribute( tableFieldNameAttributeValue );
		tableDataPilotFieldReference.setTableMemberTypeAttribute( tableMemberTypeAttributeValue );
		tableDataPilotFieldReference.setTableTypeAttribute( tableTypeAttributeValue );
		this.appendChild( tableDataPilotFieldReference);
		return  tableDataPilotFieldReference;      
	}
    
	/**
	 * Create child element {@odf.element table:data-pilot-field-reference}.
	 *
     * @param tableFieldNameAttributeValue  the <code>String</code> value of <code>TableFieldNameAttribute</code>, see {@odf.attribute  table:field-name} at specification
	 * @param tableMemberNameAttributeValue  the <code>String</code> value of <code>TableMemberNameAttribute</code>, see {@odf.attribute  table:member-name} at specification
	 * @param tableMemberTypeAttributeValue  the <code>String</code> value of <code>TableMemberTypeAttribute</code>, see {@odf.attribute  table:member-type} at specification
	 * @param tableTypeAttributeValue  the <code>String</code> value of <code>TableTypeAttribute</code>, see {@odf.attribute  table:type} at specification
	 * @return   return  the element {@odf.element table:data-pilot-field-reference}
	 * DifferentQName 
	 */
    
	public TableDataPilotFieldReferenceElement newTableDataPilotFieldReferenceElement(String tableFieldNameAttributeValue, String tableMemberNameAttributeValue, String tableMemberTypeAttributeValue, String tableTypeAttributeValue)
	{
		TableDataPilotFieldReferenceElement  tableDataPilotFieldReference = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDataPilotFieldReferenceElement.class);
		tableDataPilotFieldReference.setTableFieldNameAttribute( tableFieldNameAttributeValue );
		tableDataPilotFieldReference.setTableMemberNameAttribute( tableMemberNameAttributeValue );
		tableDataPilotFieldReference.setTableMemberTypeAttribute( tableMemberTypeAttributeValue );
		tableDataPilotFieldReference.setTableTypeAttribute( tableTypeAttributeValue );
		this.appendChild( tableDataPilotFieldReference);
		return  tableDataPilotFieldReference;      
	}
    
	/**
	 * Create child element {@odf.element table:data-pilot-groups}.
	 *
     * @param tableDateStartAttributeValue  the <code>String</code> value of <code>TableDateStartAttribute</code>, see {@odf.attribute  table:date-start} at specification
	 * @param tableGroupedByAttributeValue  the <code>String</code> value of <code>TableGroupedByAttribute</code>, see {@odf.attribute  table:grouped-by} at specification
	 * @param tableSourceFieldNameAttributeValue  the <code>String</code> value of <code>TableSourceFieldNameAttribute</code>, see {@odf.attribute  table:source-field-name} at specification
	 * @param tableStepAttributeValue  the <code>double</code> value of <code>TableStepAttribute</code>, see {@odf.attribute  table:step} at specification
	 * @return   return  the element {@odf.element table:data-pilot-groups}
	 * DifferentQName 
	 */
    
	public TableDataPilotGroupsElement newTableDataPilotGroupsElement(String tableDateStartAttributeValue, String tableGroupedByAttributeValue, String tableSourceFieldNameAttributeValue, double tableStepAttributeValue)
	{
		TableDataPilotGroupsElement  tableDataPilotGroups = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDataPilotGroupsElement.class);
		tableDataPilotGroups.setTableDateStartAttribute( tableDateStartAttributeValue );
		tableDataPilotGroups.setTableGroupedByAttribute( tableGroupedByAttributeValue );
		tableDataPilotGroups.setTableSourceFieldNameAttribute( tableSourceFieldNameAttributeValue );
		tableDataPilotGroups.setTableStepAttribute( Double.valueOf(tableStepAttributeValue) );
		this.appendChild( tableDataPilotGroups);
		return  tableDataPilotGroups;      
	}
    
	/**
	 * Create child element {@odf.element table:data-pilot-groups}.
	 *
     * @param tableGroupedByAttributeValue  the <code>String</code> value of <code>TableGroupedByAttribute</code>, see {@odf.attribute  table:grouped-by} at specification
	 * @param tableSourceFieldNameAttributeValue  the <code>String</code> value of <code>TableSourceFieldNameAttribute</code>, see {@odf.attribute  table:source-field-name} at specification
	 * @param tableStartAttributeValue  the <code>String</code> value of <code>TableStartAttribute</code>, see {@odf.attribute  table:start} at specification
	 * @param tableStepAttributeValue  the <code>double</code> value of <code>TableStepAttribute</code>, see {@odf.attribute  table:step} at specification
	 * @return   return  the element {@odf.element table:data-pilot-groups}
	 * DifferentQName table:start
	 */
    
	public TableDataPilotGroupsElement newTableDataPilotGroupsElementByStart(String tableGroupedByAttributeValue, String tableSourceFieldNameAttributeValue, String tableStartAttributeValue, double tableStepAttributeValue)
	{
		TableDataPilotGroupsElement  tableDataPilotGroups = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDataPilotGroupsElement.class);
		tableDataPilotGroups.setTableGroupedByAttribute( tableGroupedByAttributeValue );
		tableDataPilotGroups.setTableSourceFieldNameAttribute( tableSourceFieldNameAttributeValue );
		tableDataPilotGroups.setTableStartAttribute( tableStartAttributeValue );
		tableDataPilotGroups.setTableStepAttribute( Double.valueOf(tableStepAttributeValue) );
		this.appendChild( tableDataPilotGroups);
		return  tableDataPilotGroups;      
	}
    
	/**
	 * Create child element {@odf.element table:data-pilot-groups}.
	 *
     * @param tableDateEndAttributeValue  the <code>String</code> value of <code>TableDateEndAttribute</code>, see {@odf.attribute  table:date-end} at specification
	 * @param tableGroupedByAttributeValue  the <code>String</code> value of <code>TableGroupedByAttribute</code>, see {@odf.attribute  table:grouped-by} at specification
	 * @param tableSourceFieldNameAttributeValue  the <code>String</code> value of <code>TableSourceFieldNameAttribute</code>, see {@odf.attribute  table:source-field-name} at specification
	 * @param tableStepAttributeValue  the <code>double</code> value of <code>TableStepAttribute</code>, see {@odf.attribute  table:step} at specification
	 * @return   return  the element {@odf.element table:data-pilot-groups}
	 * DifferentQName table:date-end
	 */
    
	public TableDataPilotGroupsElement newTableDataPilotGroupsElementByDateEnd(String tableDateEndAttributeValue, String tableGroupedByAttributeValue, String tableSourceFieldNameAttributeValue, double tableStepAttributeValue)
	{
		TableDataPilotGroupsElement  tableDataPilotGroups = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDataPilotGroupsElement.class);
		tableDataPilotGroups.setTableDateEndAttribute( tableDateEndAttributeValue );
		tableDataPilotGroups.setTableGroupedByAttribute( tableGroupedByAttributeValue );
		tableDataPilotGroups.setTableSourceFieldNameAttribute( tableSourceFieldNameAttributeValue );
		tableDataPilotGroups.setTableStepAttribute( Double.valueOf(tableStepAttributeValue) );
		this.appendChild( tableDataPilotGroups);
		return  tableDataPilotGroups;      
	}
    
	/**
	 * Create child element {@odf.element table:data-pilot-groups}.
	 *
     * @param tableEndAttributeValue  the <code>String</code> value of <code>TableEndAttribute</code>, see {@odf.attribute  table:end} at specification
	 * @param tableGroupedByAttributeValue  the <code>String</code> value of <code>TableGroupedByAttribute</code>, see {@odf.attribute  table:grouped-by} at specification
	 * @param tableSourceFieldNameAttributeValue  the <code>String</code> value of <code>TableSourceFieldNameAttribute</code>, see {@odf.attribute  table:source-field-name} at specification
	 * @param tableStepAttributeValue  the <code>double</code> value of <code>TableStepAttribute</code>, see {@odf.attribute  table:step} at specification
	 * @return   return  the element {@odf.element table:data-pilot-groups}
	 * DifferentQName table:end
	 */
    
	public TableDataPilotGroupsElement newTableDataPilotGroupsElementByEnd(String tableEndAttributeValue, String tableGroupedByAttributeValue, String tableSourceFieldNameAttributeValue, double tableStepAttributeValue)
	{
		TableDataPilotGroupsElement  tableDataPilotGroups = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDataPilotGroupsElement.class);
		tableDataPilotGroups.setTableEndAttribute( tableEndAttributeValue );
		tableDataPilotGroups.setTableGroupedByAttribute( tableGroupedByAttributeValue );
		tableDataPilotGroups.setTableSourceFieldNameAttribute( tableSourceFieldNameAttributeValue );
		tableDataPilotGroups.setTableStepAttribute( Double.valueOf(tableStepAttributeValue) );
		this.appendChild( tableDataPilotGroups);
		return  tableDataPilotGroups;      
	}
    
}
