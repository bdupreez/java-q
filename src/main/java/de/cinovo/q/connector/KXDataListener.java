// -------------------------------------------------------------------------------
// Copyright (c) 2011-2012 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Apache License, Version 2.0
// which accompanies this distribution, and is available at
// http://www.apache.org/licenses/LICENSE-2.0.html
// -------------------------------------------------------------------------------

package de.cinovo.q.connector;

import de.cinovo.q.query.Result;

/**
 * KX data listener.
 * 
 * @author mwittig
 * 
 */
public interface KXDataListener {
	
	/**
	 * Data received.
	 * 
	 * @param data KX table
	 */
	@Deprecated
	void dataReceived(KXTable data);
	
	/**
	 * Result received.
	 * 
	 * @param handle Unique handle to identify received data
	 * @param result Result
	 */
	void resultReceived(Result result);
	
}
