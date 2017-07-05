/*
 * Copyright 1999 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
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
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */
package com.sun.org.omg.CORBA;


/**
* com/sun/org/omg/CORBA/OperationMode.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* Thursday, May 6, 1999 1:51:50 AM PDT
*/

public class OperationMode implements org.omg.CORBA.portable.IDLEntity
{
    private        int __value;
    private static int __size = 2;
    private static com.sun.org.omg.CORBA.OperationMode[] __array = new com.sun.org.omg.CORBA.OperationMode [__size];

    public static final int _OP_NORMAL = 0;
    public static final com.sun.org.omg.CORBA.OperationMode OP_NORMAL = new com.sun.org.omg.CORBA.OperationMode(_OP_NORMAL);
    public static final int _OP_ONEWAY = 1;
    public static final com.sun.org.omg.CORBA.OperationMode OP_ONEWAY = new com.sun.org.omg.CORBA.OperationMode(_OP_ONEWAY);

    public int value ()
    {
        return __value;
    }

    public static com.sun.org.omg.CORBA.OperationMode from_int (int value)
    {
        if (value >= 0 && value < __size)
            return __array[value];
        else
            throw new org.omg.CORBA.BAD_PARAM ();
    }

    protected OperationMode (int value)
    {
        __value = value;
        __array[__value] = this;
    }
} // class OperationMode
