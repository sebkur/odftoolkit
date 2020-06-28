/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */
package org.odftoolkit.odfvalidator;

import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import org.odftoolkit.odfdom.pkg.OdfPackage;
import org.xml.sax.ErrorHandler;

/** Validator for Files */
public class ODFFileValidator extends ODFRootPackageValidator {

    private File m_aFile = null;

        /** Creates a new instance of ODFFileValidator */
    public ODFFileValidator( File aFile, Logger.LogLevel nLogLevel,
                             OdfValidatorMode eMode, OdfVersion aVersion,
                             SAXParseExceptionFilter aFilter,
                             ODFValidatorProvider aValidatorProvider ) throws ODFValidatorException
    {
        super( nLogLevel, eMode, aVersion, aFilter, aValidatorProvider );
        m_aFile = aFile;
    }

    protected String getLoggerName()
    {
        return m_aFile.getAbsolutePath();
    }

    @Override
    protected String getDocumentPath()
    {
        return ""; // this is the root document
    }

    protected OdfPackage getPackage(ErrorHandler handler) throws Exception
    {
        return OdfPackage.loadPackage(m_aFile, handler);
    }

}
