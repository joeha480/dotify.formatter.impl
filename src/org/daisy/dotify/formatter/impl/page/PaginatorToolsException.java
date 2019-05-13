package org.daisy.dotify.formatter.impl.page;

/**
 * <p>A PaginatorToolsException is an exception that indicates conditions in a {@link PaginatorTools} process that a
 * reasonable application might want to catch.</p>
 *
 * @author Joel Håkansson
 */
class PaginatorToolsException extends Exception {

	static final long serialVersionUID = 2207586942417976960L;

	/**
	 * Constructs a new exception with null as its detail message.
	 */
	public PaginatorToolsException() { super(); }

	/**
	 * Constructs a new exception with the specified detail message.
	 * @param message the detail message
	 */
	public PaginatorToolsException(String message) { super(message); }

	/**
	 * Constructs a new exception with the specified cause
	 * @param cause the cause
	 */
	public PaginatorToolsException(Throwable cause) { super(cause); }

	/**
	 * Constructs a new exception with the specified detail message and cause.
	 * @param message the detail message
	 * @param cause the cause
	 */
	public PaginatorToolsException(String message, Throwable cause) { super(message, cause); }

}
