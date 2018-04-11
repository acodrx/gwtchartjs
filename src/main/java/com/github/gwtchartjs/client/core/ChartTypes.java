package com.github.gwtchartjs.client.core;

/**
 * Supported chart types
 * <ul>
 * <li>line
 * <li>bar
 * <li>radar
 * <li>pie
 * <li>doughnut
 * <li>polarArea
 * <li>bubble
 * <li>scatter
 * <li>scatter
 * </ul>
 *
 */
public class ChartTypes {
  /**
   * A line chart is a way of plotting data points on a line. Often, it is used to show trend data, or the
   * comparison of two data sets.
   */
  public static final String LINE = "line";

  /**
   * A line chart is a way of plotting data points on a line. Often, it is used to show trend data, or the
   * comparison of two data sets.
   */
  public static final String BAR = "bar";

  /**
   * A horizontal bar chart is a variation on a vertical bar chart. It is sometimes used to show trend data,
   * and the comparison of multiple data sets side by side.
   */
  public static final String HORIZONTALBAR = "horizontalBar";

  /**
   * A radar chart is a way of showing multiple data points and the variation between them.
   * 
   * They are often useful for comparing the points of two or more different data sets.
   */
  public static final String RADAR = "radar";

  /**
   * Pie and doughnut charts are probably the most commonly used charts. They are divided into segments, the
   * arc of each segment shows the proportional value of each piece of data.
   * 
   * They are excellent at showing the relational proportions between data.
   * 
   * Pie and doughnut charts are effectively the same class in Chart.js, but have one different default value
   * - their cutoutPercentage. This equates what percentage of the inner should be cut out. This defaults to 0
   * for pie charts, and 50 for doughnuts.
   * 
   * They are also registered under two aliases in the Chart core. Other than their different default value,
   * and different alias, they are exactly the same.
   */
  public static final String PIE = "pie";

  /**
   * Pie and doughnut charts are probably the most commonly used charts. They are divided into segments, the
   * arc of each segment shows the proportional value of each piece of data.
   * 
   * They are excellent at showing the relational proportions between data.
   * 
   * Pie and doughnut charts are effectively the same class in Chart.js, but have one different default value
   * - their cutoutPercentage. This equates what percentage of the inner should be cut out. This defaults to 0
   * for pie charts, and 50 for doughnuts.
   * 
   * They are also registered under two aliases in the Chart core. Other than their different default value,
   * and different alias, they are exactly the same.
   */
  public static final String DOUGHNUT = "doughnut";

  /**
   * Polar area charts are similar to pie charts, but each segment has the same angle - the radius of the
   * segment differs depending on the value.
   * 
   * This type of chart is often useful when we want to show a comparison data similar to a pie chart, but
   * also show a scale of values for context.
   */
  public static final String POLARAREA = "polarArea";

  /**
   * A bubble chart is used to display three dimensions of data at the same time. The location of the bubble
   * is determined by the first two dimensions and the corresponding horizontal and vertical axes. The third
   * dimension is represented by the size of the individual bubbles.
   */
  public static final String BUBBLE = "bubble";

  /**
   * Scatter charts are based on basic line charts with the x axis changed to a linear axis. To use a scatter
   * chart, data must be passed as objects containing X and Y properties. The example below creates a scatter
   * chart with 3 points.
   */
  public static final String SCATTER = "scatter";
}
