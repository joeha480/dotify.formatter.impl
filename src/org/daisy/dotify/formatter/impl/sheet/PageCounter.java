package org.daisy.dotify.formatter.impl.sheet;

/**
 * Provides state needed for a text flow.
 *
 * <p>There is one counter for the body of the whole document, and one for the pre-content or
 * post-content of each volume.</p>
 *
 * @author Joel Håkansson
 */
public class PageCounter {
	private int pageOffset;
	private int pageCount;

	public PageCounter() {
		pageOffset = 0;
		pageCount = 0;
	}

	public PageCounter(PageCounter template) {
		this.pageOffset = template.pageOffset;
		this.pageCount = template.pageCount;
	}

	/**
	 * The value specified with <code>initial-page-number</code> minus 1.
	 * @param value the default page offset
	 */
	public void setDefaultPageOffset(int value) {
		pageOffset = value;
	}

	/**
	 * Page number counter. Represents the current value of the default "<a
	 * href="http://braillespecs.github.io/obfl/obfl-specification.html#pagenumbercounter"
	 * ><code>page-number-counter</code></a>" (i.e. the value for the page that was produced
	 * last).
	 *
	 * <p>Initially <code>0</code>.</p>
	 * @return the default page offset
	 */
	public int getDefaultPageOffset() {
		return pageOffset;
	}

	/**
	 * Simple page counter. Represents the number of pages currently produced. This is used for
	 * searching and MUST be continuous. Do not use for page numbers.
	 *
	 * <p>Initially <code>0</code>.</p>
	 *
	 * @return returns the page count
	 */
	public int getPageCount() {
		return pageCount;
	}
	
	/**
	 * Advance to the next page.
	 */
	public void increasePageCount() {
		pageCount++;
	}

}