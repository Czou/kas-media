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

package com.kurento.kas.media.codecs;

import java.util.ArrayList;
import java.util.Collection;

import com.kurento.kas.media.exception.CodecNotSupportedException;

/**
 * Supported video codecs.
 */
public enum VideoCodecType {
	H264(0, new String[]{ "H264" }),
	MPEG4(1, new String[]{ "MPEG4", "MP4V-ES" }),
	H263(2, new String[]{ "H263", "H263-1998", "H263-2000" });
	
	private int codecID;
	private Collection<String> collectionCodecStrings;
	
	//private int[] supportedBitrates
	//private int[] supportedFramerates

	private VideoCodecType(int codecID, String[] codecStrings) {
		this.codecID = codecID;
		collectionCodecStrings = new ArrayList<String>();
		for (String s : codecStrings)
			collectionCodecStrings.add(s);
	}

	public int getCodecID() {
		return codecID;
	}

	public Collection<String> getCollectionCodecStrings() {
		return collectionCodecStrings;
	}
	
	public static int getCodecIdFromName(String codecName) throws CodecNotSupportedException {
		if (H264.collectionCodecStrings.contains(codecName.toUpperCase()))
			return H264.codecID;
		else if (MPEG4.collectionCodecStrings.contains(codecName.toUpperCase()))
			return MPEG4.codecID;
		else if (H263.collectionCodecStrings.contains(codecName.toUpperCase()))
			return H263.codecID;

		throw new CodecNotSupportedException("Codec not supported");
	}
	
	public static VideoCodecType getCodecTypeFromName(String codecName) throws CodecNotSupportedException {
		if (H264.collectionCodecStrings.contains(codecName.toUpperCase()))
			return H264;
		else if (MPEG4.collectionCodecStrings.contains(codecName.toUpperCase()))
			return MPEG4;
		else if (H263.collectionCodecStrings.contains(codecName.toUpperCase()))
			return H263;

		throw new CodecNotSupportedException("Codec not supported");
	}
	
}
