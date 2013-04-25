package org.bimserver.webservices.authorization;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;


public class SystemAuthorization extends Authorization {
	public static final byte ID = 3;

	public SystemAuthorization(int expires, TimeUnit expiresUnit) {
		super(expires, expiresUnit);
	}

	private SystemAuthorization() {
		super();
	}
	
	public static SystemAuthorization fromBuffer(ByteBuffer buffer) {
		return new SystemAuthorization();
	}

	public byte getId() {
		return ID;
	}
	
	@Override
	protected int getBufferSize() {
		return 0;
	}

	@Override
	public void getBytes(ByteBuffer buffer) {
	}
}
