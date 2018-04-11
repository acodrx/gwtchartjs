package com.github.gwtchartjs.client.widget;

import com.github.gwtchartjs.client.Chart;
import com.github.gwtchartjs.client.ChartConfig;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.dom.client.CanvasElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.user.client.ui.ComplexPanel;

import jsinterop.base.Js;

public class ChartWidget extends ComplexPanel {

  private CanvasElement canvas;
  private Chart chart;
  private ChartConfig config;

  public ChartWidget() {
    if (Canvas.isSupported()) {
      canvas = Document.get()
          .createCanvasElement();
      setElement(canvas);
    }
    else {
      SpanElement span = Document.get()
          .createSpanElement();
      span.setInnerHTML("Chart/canvas not supported by your browser");
      setElement(span);
    }
  }

  public void setType(String type) {
    getConfig().type = type;
  }

  public ChartConfig getConfig() {
    if (this.config == null) {
      init(new ChartConfig());
    }
    return config;
  }

  public void init(ChartConfig config) {
    this.config = config;
    if (chart != null)
      chart.destroy();
    chart = new Chart(Js.cast(canvas), config);
  }

  public void update() {
    if (chart != null)
      chart.update();
  }
}
