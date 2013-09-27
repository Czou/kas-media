/*
 * Kurento Android Media: Android Media Library based on FFmpeg.
 * Copyright (C) 2011  Tikal Technologies
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.kurento.kas.media.rx;

public interface VideoRx {

	/**
	 * Receive a video frame.
	 * 
	 * @param rgb
	 *            video frame in RGB32.
	 * @param width
	 *            frame width in pixels.
	 * @param height
	 *            frame height in pixels.
	 * @param nFrame
	 *            video frame id.
	 */
	public void putVideoFrameRx(int[] rgb, int width, int height, int nFrame);

}
