/* Copyright (C) 2003-2016 Patrick G. Durand
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.plealog.genericapp.ui.actions;

import java.awt.event.ActionEvent;

import com.plealog.genericapp.ui.menu.EZBasicAction;

/**
 * FileExit action.
 * 
 * @author Patrick G. Durand
 */
public class ActionFileOpen extends EZBasicAction {

 	private static final long serialVersionUID = 2324015564370531703L;

	/**
	 * Default constructor.
	 */
	public ActionFileOpen() {
		super();
	}

	/**
	 * Performs the action.
	 */
    public void actionPerformed(ActionEvent e){
    	/*File f;
    	
    	f = EZFileManager.chooseDirectory();
    	EZLogger.info("Chosen file is: "+f.getAbsolutePath());
    	f = EZFileManager.chooseFileForSaveAction();
    	EZLogger.info("Chosen file is: "+f.getAbsolutePath());
    	f = EZFileManager.chooseFileForOpenAction();
    	EZLogger.info("Chosen file is: "+f.getAbsolutePath());

    	EZFileManager.useOSNativeFileDialog(false);
    	f = EZFileManager.chooseDirectory();
    	EZLogger.info("Chosen file is: "+f.getAbsolutePath());
    	f = EZFileManager.chooseFileForSaveAction();
    	EZLogger.info("Chosen file is: "+f.getAbsolutePath());
    	f = EZFileManager.chooseFileForOpenAction();
    	EZLogger.info("Chosen file is: "+f.getAbsolutePath());*/
    }
}
