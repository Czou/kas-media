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
 * Supported audio codecs.
 */
public enum AudioCodecType {
	AMR(0, 8000, 12200, new String[]{ "AMR", "AMR-NB" }),
	MP2(1, 44100, 64000, new String[]{ "MP2", "MPA" }),
	AAC(2, 44100, 64000, new String[]{ "AAC" }),
	PCMU(3, 8000, 64000, new String[]{ "PCMU" }),
	PCMA(4, 8000, 64000, new String[]{ "PCMA" });
	
	private int codecID;
	private int supportedSampleRate;
	private int supportedBitRate;
	private Collection<String> collectionCodecStrings;

	private AudioCodecType(int codecID, int supportedSampleRate, int supportedBitRate, String[] codecStrings) {
		this.codecID = codecID;
		this.supportedSampleRate = supportedSampleRate;
		this.supportedBitRate = supportedBitRate;
		collectionCodecStrings = new ArrayList<String>();
		for (String s : codecStrings)
			collectionCodecStrings.add(s);
	}

	public int getCodecID() {
		return codecID;
	}

	public int getSupportedSampleRate() {
		return supportedSampleRate;
	}

	public int getSupportedBitRate() {
		return supportedBitRate;
	}

	public Collection<String> getCollectionCodecStrings() {
		return collectionCodecStrings;
	}
	
	public static int getCodecIdFromName(String codecName) throws CodecNotSupportedException {
		if (AMR.collectionCodecStrings.contains(codecName.toUpperCase()))
			return AMR.codecID;
		else if (MP2.collectionCodecStrings.contains(codecName.toUpperCase()))
			return MP2.codecID;
		else if (AAC.collectionCodecStrings.contains(codecName.toUpperCase()))
			return AAC.codecID;
		else if (PCMU.collectionCodecStrings.contains(codecName.toUpperCase()))
			return PCMU.codecID;
		else if (PCMA.collectionCodecStrings.contains(codecName.toUpperCase()))
			return PCMA.codecID;

		throw new CodecNotSupportedException("Codec not supported");
	}
	
	public static AudioCodecType getCodecTypeFromName(String codecName) throws CodecNotSupportedException {
		if (AMR.collectionCodecStrings.contains(codecName.toUpperCase()))
			return AMR;
		else if (MP2.collectionCodecStrings.contains(codecName.toUpperCase()))
			return MP2;
		else if (AAC.collectionCodecStrings.contains(codecName.toUpperCase()))
			return AAC;
		else if (PCMU.collectionCodecStrings.contains(codecName.toUpperCase()))
			return PCMU;
		else if (PCMA.collectionCodecStrings.contains(codecName.toUpperCase()))
			return PCMA;

		throw new CodecNotSupportedException("Codec not supported");
	}
	
}
