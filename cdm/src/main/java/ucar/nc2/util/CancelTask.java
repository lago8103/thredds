// $Id:CancelTask.java 63 2006-07-12 21:50:51Z edavis $
/*
 * Copyright 1997-2006 Unidata Program Center/University Corporation for
 * Atmospheric Research, P.O. Box 3000, Boulder, CO 80307,
 * support@unidata.ucar.edu.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package ucar.nc2.util;

/**
 * Allows long tasks to be cancelled. Use this when you are making a call that could take a long time,
 *  and you want to allow the user to cancel it.
 *
 * @author jcaron
 * @version $Revision:63 $ $Date:2006-07-12 21:50:51Z $
 */

public interface CancelTask {

  /** Called routine should check often during the task and cancel the task if it returns true. */
  public boolean isCancel();

  /** Called routine got an error, so it sets a message for calling program to show to user. */
  public void setError(String msg);
}