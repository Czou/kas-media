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

public class VideoFrame extends RxPacket {

	private int[] dataFrame;
	private int width;
	private int height;

	public VideoFrame(int[] dataFrame, int width, int height, int timeBaseNum,
			int timeBaseDen, long pts, long startTime, long rxTime,
			int encodedSize) {
		super(timeBaseNum, timeBaseDen, pts, startTime, rxTime, encodedSize);
		this.dataFrame = dataFrame;
		this.width = width;
		this.height = height;
	}

	public int[] getDataFrame() {
		return dataFrame;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
