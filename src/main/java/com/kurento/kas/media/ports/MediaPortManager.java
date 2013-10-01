/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */

package com.kurento.kas.media.ports;

import com.kurento.kas.media.Native;

public class MediaPortManager extends Native {

	/**
	 * Retrieve a free local port.
	 * 
	 * @return a {@link MediaPort} related with the local port binded.
	 */
	public static MediaPort takeMediaPort() {
		return takeMediaPort(0);
	}

	/**
	 * Retrieve a local port.
	 * 
	 * @param port
	 *            to be binded.
	 * @returna {@link MediaPort} related with the local port binded.
	 */
	public static MediaPort takeMediaPort(int port) {
		long mp = takeMediaPortNative(port);
		return new MediaPort(mp);
	}

	public static MediaPort takeMediaPort(String address, int port) {
		long mp = takeMediaAddressPortNative(address, port);
		return new MediaPort(mp);
	}

	/**
	 * Release a {@link MediaPort}.
	 * 
	 * @param mediaPort
	 *            to be released
	 * @return the number of users of this the mediaPort.
	 */
	public static int releaseMediaPort(MediaPort mediaPort) {
		return releaseMediaPortNative(mediaPort.getSelf());
	}

	private static native long takeMediaPortNative(int port);

	private static native long takeMediaAddressPortNative(String address,
			int port);

	private static native int releaseMediaPortNative(long mediaPortRef);

}
