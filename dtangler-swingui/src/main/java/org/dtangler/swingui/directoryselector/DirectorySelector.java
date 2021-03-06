//This product is provided under the terms of EPL (Eclipse Public License) 
//version 1.0.
//
//The full license text can be read from: http://www.eclipse.org/org/documents/epl-v10.php

package org.dtangler.swingui.directoryselector;

import java.util.List;

public interface DirectorySelector {

	String selectDirectory();

	String selectDirectory(String dialogTitle, String fileTypesDescription, boolean isDirectoryInputAllowed, List<String> fileNameExtensions);

}
