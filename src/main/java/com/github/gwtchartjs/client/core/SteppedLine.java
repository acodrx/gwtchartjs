package com.github.gwtchartjs.client.core;

/**
 * The following values are supported for steppedLine:
 * <ul>
 * <li>false: No Step Interpolation (default)
 * <li>true: Step-before Interpolation (eq. 'before')
 * <li>'before': Step-before Interpolation
 * <li>'after': Step-after Interpolation
 * <ul>
 * If the steppedLine value is set to anything other than false, lineTension
 * will be ignored.
 */
public class SteppedLine {
	/** No Step Interpolation (default) */
	public static final Boolean noStep = Boolean.FALSE;

	/** Step-before Interpolation (eq. 'before') */
	public static final Boolean stepBefore = Boolean.TRUE;

	/** Step-before Interpolation */
	public static final String before = "before";

	/** Step-after Interpolation */
	public static final String after = "after";
}
