package org.codefx.libfx.nesting.property;

import javafx.beans.property.LongProperty;

import org.codefx.libfx.nesting.Nesting;

/**
 * A builder for a {@link NestedLongProperty} which is bound to the {@link Nesting#innerObservable() innerObservable} of
 * a {@link Nesting}.
 */
public class NestedLongPropertyBuilder extends AbstractNestedPropertyBuilder<LongProperty, NestedLongProperty> {

	// #region CONSTRUCTION

	/**
	 * Creates a new builder which uses the specified nesting.
	 *
	 * @param nesting
	 *            the nesting which will be used for all nested properties
	 */
	private NestedLongPropertyBuilder(Nesting<LongProperty> nesting) {
		super(nesting);
	}

	/**
	 * Creates a new builder which uses the specified nesting.
	 *
	 * @param nesting
	 *            the nesting which will be used for all nested properties
	 * @return a new instance of {@link NestedLongPropertyBuilder}
	 */
	public static NestedLongPropertyBuilder forNesting(Nesting<LongProperty> nesting) {
		return new NestedLongPropertyBuilder(nesting);
	}

	//#end CONSTRUCTION

	// #region METHODS

	@Override
	public NestedLongProperty build() {
		return new NestedLongProperty(getNesting(), getBean(), getName());
	}

	//#end METHODS

}
