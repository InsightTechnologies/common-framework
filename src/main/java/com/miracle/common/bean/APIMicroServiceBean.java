package com.miracle.common.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIMicroServiceBean {

	private String projectName;
	// Velocity
	private double maxStoryPoint;
	private String filterType;
	private List<String> featureStatus;
//	private List<String> storyStates;
//	private List<String> featureStates;
	private List<Integer> featureStateList;
	private List<Integer> storyStateList;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public double getMaxStoryPoint() {
		return maxStoryPoint;
	}

	public void setMaxStoryPoint(double maxStoryPoint) {
		this.maxStoryPoint = maxStoryPoint;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public List<String> getFeatureStatus() {
		return featureStatus;
	}

	public void setFeatureStatus(List<String> featureStatus) {
		this.featureStatus = featureStatus;
	}

//	public List<String> getStoryStates() {
//		return storyStates;
//	}
//
//	public void setStoryStates(List<String> storyStates) {
//		this.storyStates = storyStates;
//	}
//
//	public List<String> getFeatureStates() {
//		return featureStates;
//	}
//
//	public void setFeatureStates(List<String> featureStates) {
//		this.featureStates = featureStates;
//	}
//
//	@Override
//	public String toString() {
//		return "APIMicroServiceBean [projectName=" + projectName + ", maxStoryPoint=" + maxStoryPoint + ", filterType="
//				+ filterType + ", featureStatus=" + featureStatus + ", storyStates=" + storyStates + ", featureStates="
//				+ featureStates + "]";
//	}

	/**
	 * @return the featureStateList
	 */
	public List<Integer> getFeatureStateList() {
		return featureStateList;
	}

	/**
	 * @param featureStateList the featureStateList to set
	 */
	public void setFeatureStateList(List<Integer> featureStateList) {
		this.featureStateList = featureStateList;
	}

	/**
	 * @return the storyStateList
	 */
	public List<Integer> getStoryStateList() {
		return storyStateList;
	}

	/**
	 * @param storyStateList the storyStateList to set
	 */
	public void setStoryStateList(List<Integer> storyStateList) {
		this.storyStateList = storyStateList;
	}

}
