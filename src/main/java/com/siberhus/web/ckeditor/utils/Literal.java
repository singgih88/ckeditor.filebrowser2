/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package com.siberhus.web.ckeditor.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Literal {

	/** Returns an array containing all the elements supplied. */
	public static <T> T[] array(T... elements) {
		return elements;
	}

	/** Returns an array containing all the elements supplied. */
	public static boolean[] array(boolean... elements) {
		return elements;
	}

	/** Returns an array containing all the elements supplied. */
	public static byte[] array(byte... elements) {
		return elements;
	}

	/** Returns an array containing all the elements supplied. */
	public static char[] array(char... elements) {
		return elements;
	}

	/** Returns an array containing all the elements supplied. */
	public static short[] array(short... elements) {
		return elements;
	}

	/** Returns an array containing all the elements supplied. */
	public static int[] array(int... elements) {
		return elements;
	}

	/** Returns an array containing all the elements supplied. */
	public static long[] array(long... elements) {
		return elements;
	}

	/** Returns an array containing all the elements supplied. */
	public static float[] array(float... elements) {
		return elements;
	}

	/** Returns an array containing all the elements supplied. */
	public static double[] array(double... elements) {
		return elements;
	}
	
	/** Returns a new List instance containing the supplied elements. */
	public static <T> List<T> list(T... elements) {
		List<T> list = new ArrayList<T>();
		Collections.addAll(list, elements);
		return list;
	}

	/** Returns a new Set instance containing the supplied elements. */
	public static <T> Set<T> set(T... elements) {
		Set<T> set = new HashSet<T>();
		Collections.addAll(set, elements);
		return set;
	}

	/** Returns a new SortedSet instance containing the supplied elements. */
	public static <T extends Comparable<?>> SortedSet<T> sortedSet(
			T... elements) {
		SortedSet<T> set = new TreeSet<T>();
		Collections.addAll(set, elements);
		return set;
	}
}