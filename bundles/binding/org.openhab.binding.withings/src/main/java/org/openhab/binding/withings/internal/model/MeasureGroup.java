package org.openhab.binding.withings.internal.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Java object for response of Withings API.
 * 
 * @see http://www.withings.com/de/api#bodymetrics
 * @author Dennis Nobel
 * @since 1.5.0
 */
public class MeasureGroup {

	@SerializedName("attrib")
	public Attribute attribute;

	public Category category;

	public int date;

	@SerializedName("grpid")
	public int groupId;

	public List<Measure> measures;

}
