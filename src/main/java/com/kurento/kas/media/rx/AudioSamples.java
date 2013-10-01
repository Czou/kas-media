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
package com.kurento.kas.media.rx;

public class AudioSamples extends RxPacket {

	private byte[] dataSamples;
	private int size;

	public AudioSamples(byte[] dataSamples, int size, int timeBaseNum,
			int timeBaseDen, long pts, long startTime, long rxTime,
			int encodedSize) {
		super(timeBaseNum, timeBaseDen, pts, startTime, rxTime, encodedSize);
		this.dataSamples = dataSamples;
		this.size = size;
	}

	public byte[] getDataSamples() {
		return dataSamples;
	}

	public int getSize() {
		return size;
	}

}
