/*******************************************************************************
 * Copyright (c) 2009 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Red Hat - initial API and implementation
 *******************************************************************************/

package org.eclipse.linuxtools.systemtap.local.callgraph.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.linuxtools.systemtap.local.callgraph.tests");
		//$JUnit-BEGIN$
		suite.addTestSuite(StapGraphParserTest.class);
		suite.addTestSuite(SystemTapGraphViewTest.class);
		suite.addTestSuite(SystemTapGraphTest.class);
		//$JUnit-END$
		return suite;
	}

}
