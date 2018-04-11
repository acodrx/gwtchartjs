package com.github.gwtchartjs.client;

import elemental2.core.JsArray;
import elemental2.core.JsObject;
import elemental2.dom.Element;
import elemental2.dom.Event;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * For each chart, there are a set of methods which you may find useful. These
 * are available on all charts created with Chart.js. <br>
 * <br>
 * http://www.chartjs.org/docs/latest/
 * 
 * <h1>Responsive Charts</h1> When it comes to change the chart size based on
 * the window size, a major limitation is that the canvas render size
 * (canvas.width and .height) can not be expressed with relative values,
 * contrary to the display size (canvas.style.width and .height). Furthermore,
 * these sizes are independent from each other and thus the canvas render size
 * does not adjust automatically based on the display size, making the rendering
 * inaccurate. <br>
 * The following examples do not work: <br>
 * <br>
 * <code>&lt;canvas height="40vh" width="80vw"&gt;</code>: invalid values, the
 * canvas doesn't resize<br>
 * 
 * <code>&lt;canvas style="height:40vh; width:80vw"&gt;</code>: invalid
 * behavior, the canvas is resized but becomes blurry <br>
 * <br>
 * Chart.js provides a few options to enable responsiveness and control the
 * resize behavior of charts by detecting when the canvas display size changes
 * and update the render size accordingly. <br>
 * <br>
 * <h2>Configuration Options</h2>
 * 
 * <table>
 * <tr>
 * <th>Name</th>
 * <th>Type</th>
 * <th>Default</th>
 * <th>Description</th>
 * </tr>
 * <tr>
 * <td>responsive</td>
 * <td>Boolean</td>
 * <td>true</td>
 * <td>Resizes the chart canvas when its container does (important
 * note...).</td>
 * </tr>
 * <tr>
 * <td>responsiveAnimationDuration</td>
 * <td>Number</td>
 * <td>0</td>
 * <td>Duration in milliseconds it takes to animate to new size after a resize
 * event.</td>
 * </tr>
 * <tr>
 * <td>maintainAspectRatio</td>
 * <td>Boolean</td>
 * <td>true</td>
 * <td>Maintain the original canvas aspect ratio (width / height) when
 * resizing.</td>
 * </tr>
 * <tr>
 * <td>onResize</td>
 * <td>Function</td>
 * <td>null</td>
 * <td>Called when a resize occurs. Gets passed two arguments: the chart
 * instance and the new size.</td>
 * </tr>
 * </table>
 * <h2>Important Note</h2> Detecting when the canvas size changes can not be
 * done directly from the CANVAS element. Chart.js uses its parent container to
 * update the canvas render and display sizes. However, this method requires the
 * container to be relatively positioned and dedicated to the chart canvas only.
 * Responsiveness can then be achieved by setting relative values for the
 * container size (example):
 * 
 * <pre>
 * &lt;div class="chart-container" style="position: relative; height:40vh; width:80vw"&gt; 
 *     &lt;canvas id="chart"&gt;
 *     &lt;/canvas&gt; 
 * &lt;/div&gt;
 * </pre>
 * 
 * The chart can also be programmatically resized by modifying the container
 * size: <code>
 * chart.canvas.parentNode.style.height = '128px'; 
 * </code>
 * <h2>Printing Resizeable Charts</h2> CSS media queries allow changing styles
 * when printing a page. The CSS applied from these media queries may cause
 * charts to need to resize. However, the resize won't happen automatically. To
 * support resizing charts when printing, one needs to hook the onbeforeprint
 * event and manually trigger resizing of each chart. <code><pre>
 * function beforePrintHandler () { 
 *     for (var id in Chart.instances) {
 *         Chart.instances[id].resize() 
 *     } 
 * }
 * </pre></code>
 */
@JsType(isNative = true, name = "Chart", namespace = JsPackage.GLOBAL)
public class Chart {

	public Chart(JsObject ctx, ChartConfig parameter) {
	}
	
	public static ChartDefaults defaults;

	/**
	 * Use this to destroy any chart instances that are created. This will clean up
	 * any references stored to the chart object within Chart.js, along with any
	 * associated event listeners attached by Chart.js. This must be called before
	 * the canvas is reused for a new chart.
	 */
	public native void destroy();

	/**
	 * Triggers an update of the chart. This can be safely called after updating the
	 * data object. This will update all scales, legends, and then re-render the
	 * chart.
	 */
	public native void update();

	/**
	 * Triggers an update of the chart. This can be safely called after updating the
	 * data object. This will update all scales, legends, and then re-render the
	 * chart.
	 * 
	 * @param config
	 *            A config object can be provided with additional configuration for
	 *            the update process. This is useful when update is manually called
	 *            inside an event handler and some different animation is desired.
	 */
	public native void update(ChartAnimation config);

	/**
	 * Triggers a redraw of all chart elements. Note, this does not update elements
	 * for new data. Use .update() in that case.
	 */
	public native void render();

	/**
	 * Triggers a redraw of all chart elements. Note, this does not update elements
	 * for new data. Use .update() in that case.
	 * 
	 * @param config
	 *            A config object can be provided with additional configuration for
	 *            the update process. This is useful when update is manually called
	 *            inside an event handler and some different animation is desired.
	 */
	public native void render(ChartAnimation config);

	/**
	 * Reset the chart to it's state before the initial animation. A new animation
	 * can then be triggered using update.
	 */
	public native void reset();

	/**
	 * Use this to stop any current animation loop. This will pause the chart during
	 * any current animation frame. Call .render() to re-animate.
	 */
	public native void stop();

	/**
	 * Use this to manually resize the canvas element. This is run each time the
	 * canvas container is resized, but you can call this method manually if you
	 * change the size of the canvas nodes container element.
	 */
	public native void resize();

	/**
	 * Will clear the chart canvas. Used extensively internally between animation
	 * frames, but you might find it useful.
	 */
	public native void clear();

	/**
	 * This returns a base 64 encoded string of the chart in it's current state.
	 * 
	 * @return Returns png data url of the image on the canvas
	 */
	public native String toBase64Image();

	/**
	 * Returns an HTML string of a legend for that chart. The legend is generated
	 * from the legendCallback in the options.
	 */
	public native String generateLegend();

	/**
	 * Calling getElementAtEvent(event) on your Chart instance passing an argument
	 * of an event, or jQuery event, will return the single element at the event
	 * position. If there are multiple items within range, only the first is
	 * returned. The value returned from this method is an array with a single
	 * parameter. An array is used to keep a consistent API between the get*AtEvent
	 * methods.
	 * 
	 * @param event
	 *            Event
	 * @return Returns the first element at the event point.
	 */
	public native Element getElementAtEvent(Event event);

	/**
	 * Looks for the element under the event point, then returns all elements at the
	 * same data index. This is used internally for 'label' mode highlighting.
	 * 
	 * Calling getElementsAtEvent(event) on your Chart instance passing an argument
	 * of an event, or jQuery event, will return the point elements that are at that
	 * the same position of that event.
	 * 
	 * @param event
	 *            Event
	 * @return Array of points on the canvas that are at the same position as the
	 *         click event.
	 */
	public native JsArray<Element> getElementsAtEvent(Event event);

	/**
	 * Looks for the element under the event point, then returns all elements from
	 * that dataset. This is used internally for 'dataset' mode highlighting
	 * 
	 * @param event
	 * @return Returns an array of elements
	 */
	public native ChartDataSet<?> getDatasetAtEvent(Event event);

	/**
	 * Looks for the dataset that matches the current index and returns that
	 * metadata. This returned data has all of the metadata that is used to
	 * construct the chart.
	 * 
	 * The data property of the metadata will contain information about each point,
	 * rectangle, etc. depending on the chart type.
	 * 
	 * @param index
	 *            Index
	 * @return
	 */
	public native ChartDataSet<?> getDatasetMeta(int index);
}
