package com.github.gwtchartjs.client.core;

/**
 * Possible modes are:
 * <ul>
 * <li>'average'
 * <li>'nearest'
 * </ul>
 * 
 * New modes can be defined by adding functions to the Chart.Tooltip.positioners map.
 *
 */
public class TooltipPosition {
  /** 'average' mode will place the tooltip at the average position of the items displayed in the tooltip. */
  public static final String average = "average";

  /** 'nearest' will place the tooltip at the position of the element closest to the event position. */
  public static final String nearest = "nearest";
}
