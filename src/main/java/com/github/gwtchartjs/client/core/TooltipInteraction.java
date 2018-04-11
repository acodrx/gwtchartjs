package com.github.gwtchartjs.client.core;

/**
 * When configuring interaction with the graph via hover or tooltips, a number of different modes are
 * available.
 * 
 * The modes are detailed below and how they behave in conjunction with the intersect setting.
 *
 */
public class TooltipInteraction {

  /** Finds all of the items that intersect the point. */
  public static final String point = "point";

  /**
   * Gets the item that is nearest to the point. The nearest item is determined based on the distance to the
   * center of the chart item (point, bar). If 2 or more items are at the same distance, the one with the
   * smallest area is used. If intersect is true, this is only triggered when the mouse position intersects an
   * item in the graph. This is very useful for combo charts where points are hidden behind bars.
   */
  public static final String nearest = "nearest";

  /**
   * Finds the first item that intersects the point and returns it. Behaves like 'nearest' mode with intersect
   * = true.
   */
  @Deprecated
  public static final String single = "single";

  /** See 'index' mode */
  @Deprecated
  public static final String label = "label";

  /**
   * Finds item at the same index. If the intersect setting is true, the first intersecting item is used to
   * determine the index in the data. If intersect false the nearest item, in the x direction, is used to
   * determine the index.
   */
  public static final String index = "index";

  /**
   * Behaves like 'index' mode with intersect = false.
   */
  @Deprecated
  public static final String xAxis = "x-axis";

  /**
   * Finds items in the same dataset. If the intersect setting is true, the first intersecting item is used to
   * determine the index in the data. If intersect false the nearest item is used to determine the index.
   */
  public static final String dataset = "dataset";

  /**
   * Returns all items that would intersect based on the X coordinate of the position only. Would be useful
   * for a vertical cursor implementation. Note that this only applies to cartesian charts
   */
  public static final String x = "x";

  /**
   * Returns all items that would intersect based on the Y coordinate of the position. This would be useful
   * for a horizontal cursor implementation. Note that this only applies to cartesian charts.
   */
  public static final String y = "y";

}
