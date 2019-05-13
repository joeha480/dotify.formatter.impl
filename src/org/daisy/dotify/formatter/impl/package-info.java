/**
 * <p>Provides a {@link org.daisy.dotify.api.formatter.FormatterFactory} implementation.</p>
 * 
 * <p>In order to successfully modify this implementation, it is vital to understand the following:</p>
 * <ul>
 * <li>A new instance of any class which is part of the DOM is created by a higher level
 * implementation, in response to a method call which is defined by the interface it implements.</li>
 * <li>Any instance which is part of the DOM is populated directly by the user of the API
 * (using the methods defined by the interface it implements).</li>
 * </ul>
 *
 * <p><b>IMPORTANT: This package contains an implementation that should only be 
 * accessed using the Java SPI or OSGi. Additional classes in this package 
 * should only be used by the implementation herein.</b>
 * </p>
 * @author Joel Håkansson
 */
package org.daisy.dotify.formatter.impl;
