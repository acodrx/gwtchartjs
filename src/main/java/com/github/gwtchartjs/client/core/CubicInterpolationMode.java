package com.github.gwtchartjs.client.core;

/**
 * The following interpolation modes are supported:
 * 
 * 'default' 'monotone'. The 'default' algorithm uses a custom weighted cubic
 * interpolation, which produces pleasant curves for all types of datasets.
 * 
 * The 'monotone' algorithm is more suited to y = f(x) datasets : it preserves
 * monotonicity (or piecewise monotonicity) of the dataset being interpolated,
 * and ensures local extremums (if any) stay at input data points.
 * 
 * If left untouched (undefined), the global
 * options.elements.line.cubicInterpolationMode property is used.
 */
public class CubicInterpolationMode {
	public static final String DEFAULT = "default";

	public static final String MONOTONE = "monotone";
}
