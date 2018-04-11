package com.github.gwtchartjs.client;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartData {

  public JsArray<String> labels;

  public JsArray<ChartDataSet<?>> datasets;

  @JsOverlay
  public final JsArray<String> getLabels() {
    if (labels == null)
      labels = new JsArray<String>();
    return labels;
  }

  @JsOverlay
  public final JsArray<ChartDataSet<?>> getDataSets() {
    if (datasets == null)
      datasets = new JsArray<ChartDataSet<?>>();
    return datasets;
  }

  @JsOverlay
  public final void pushLabels(String... datasets) {
    getLabels().push(datasets);
  }

  @JsOverlay
  public final void pushDataSets(ChartDataSet<?>... datasets) {
    getDataSets().push(datasets);
  }
}
