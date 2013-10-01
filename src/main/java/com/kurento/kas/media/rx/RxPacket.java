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

public class RxPacket {

	private int timeBaseNum;
	private int timeBaseDen;
	private long pts;
	private long startTime;
	private long rxTime;
	private int encodedSize;

	public RxPacket(int timeBaseNum, int timeBaseDen, long pts, long startTime,
			long rxTime, int encodedSize) {
		this.timeBaseNum = timeBaseNum;
		this.timeBaseDen = timeBaseDen;
		this.pts = pts;
		this.startTime = startTime;
		this.rxTime = rxTime;
		this.encodedSize = encodedSize;
	}

	public int getTimeBaseNum() {
		return timeBaseNum;
	}

	public int getTimeBaseDen() {
		return timeBaseDen;
	}

	public long getPts() {
		return pts;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getRxTime() {
		return rxTime;
	}

	public int getEncodedSize() {
		return encodedSize;
	}

}
