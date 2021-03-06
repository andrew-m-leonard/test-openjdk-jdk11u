/*
 * Copyright (c) 2014, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 *
 */

package sun.jvm.hotspot.gc.shared;

//These definitions should be kept in sync with the definitions in the HotSpot code.

public enum GCName {
  ParallelOld ("ParallelOld"),
  SerialOld ("SerialOld"),
  PSMarkSweep ("PSMarkSweep"),
  ParallelScavenge ("ParallelScavenge"),
  DefNew ("DefNew"),
  ParNew ("ParNew"),
  G1New ("G1New"),
  ConcurrentMarkSweep ("ConcurrentMarkSweep"),
  G1Old ("G1Old"),
  G1Full ("G1Full"),
  Z ("Z"),
  NA ("N/A"),
  GCNameEndSentinel ("GCNameEndSentinel");

  private final String value;

  GCName(String val) {
    this.value = val;
  }
  public String value() {
    return value;
  }
}
