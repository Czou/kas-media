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
package com.kurento.kas.media.tx;

public class AudioSamplesTx {

	private short[] dataSamples;
	private int size;
	private long time;

	public AudioSamplesTx(short[] data, int size, long time) {
		this.dataSamples = data;
		this.size = size;
		this.time = time;
	}

	public short[] getDataSamples() {
		return dataSamples;
	}

	public int getSize() {
		return size;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

}
