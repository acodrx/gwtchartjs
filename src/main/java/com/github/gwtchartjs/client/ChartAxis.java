package com.github.gwtchartjs.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartAxis {

  /**
   * Bar charts can be configured into stacked bar charts by changing the settings on the X and Y axes to
   * enable stacking. Stacked bar charts can be used to show how one data series is made up of a number of
   * smaller pieces.
   */
  public Boolean stacked;

  /**
   * If true, the bars for a particular data point fall between the grid lines. The grid line will move to the
   * left by one half of the tick interval, which is the space between the grid lines. If false, the grid line
   * will go right down the middle of the bars. This is set to true for a bar chart while false for other
   * charts by default.
   * 
   * This setting applies to the axis configuration. If axes are added to the chart, this setting will need to
   * be set for each new axis.
   */
  public ChartGridLines gridLines;
}
