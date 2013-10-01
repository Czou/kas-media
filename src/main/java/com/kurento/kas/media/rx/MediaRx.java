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

import com.kurento.kas.media.Native;
import com.kurento.kas.media.ports.MediaPort;

public class MediaRx extends Native {

	public static final int DEFAULT_MAX_DELAY = 200;

	/**
	 * Start video reception from RTP based on the sdp arg and send decoded
	 * video frames (RGB32) to videoReceiver.
	 * 
	 * @param sdp
	 *            SDP to indicate the expected video RTP stream.
	 * @param maxDelay
	 *            if > 0, enable reordering received RTP packets waiting at most
	 *            maxDelay milliseconds.
	 * @param videoReceiver
	 *            object that receive decoded video frames.
	 * 
	 * @return <0 if error.
	 */
	private static native int startVideoRx(long videoMediaPortRef, String sdp,
			int maxDelay, VideoRx videoReceiver);

	public static int startVideoRx(MediaPort videoMediaPort, String sdp,
			int maxDelay, VideoRx videoReceiver) {
		return startVideoRx(videoMediaPort.getSelf(), sdp, maxDelay,
				videoReceiver);
	}

	/**
	 * Stop video reception.
	 * 
	 * @return <0 if error.
	 */
	public static native int stopVideoRx();

	/**
	 * Start audio reception from RTP based on the SDP sdp_str arg and send
	 * decoded audio frames (PCM16 samples) to audioReceiver.
	 * 
	 * @param sdp
	 *            SDP to indicate the expected audio RTP stream.
	 * @param maxDelay
	 *            if > 0, enable reordering received RTP packets waiting at most
	 *            maxDelay milliseconds.
	 * @param audioReceiver
	 *            object that receive decoded audio frames.
	 * @return
	 */
	private static native int startAudioRx(long audioMediaPortRef, String sdp,
			int maxDelay, AudioRx audioReceiver);

	public static int startAudioRx(MediaPort audioMediaPort, String sdp,
			int maxDelay, AudioRx audioReceiver) {
		return startAudioRx(audioMediaPort.getSelf(), sdp, maxDelay,
				audioReceiver);
	}

	/**
	 * Stop audio reception.
	 * 
	 * @return <0 if error.
	 */
	public static native int stopAudioRx();

}
