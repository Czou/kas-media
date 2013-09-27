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

public interface AudioRx {

	/**
	 * Receive a set of audio samples.
	 * 
	 * @param audio
	 *            audio samples in PCM16.
	 * @param length
	 *            number of audio samples.
	 * @param nFrame
	 *            audio frame id.
	 */
	public void putAudioSamplesRx(byte[] audio, int length, int nFrame);

}
