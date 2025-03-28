package com.cal.AverageResponse;

import java.util.List;

public class AverageResponse {

	
	  private List<Integer> windowPrevState;
	    private List<Integer> windowCurrState;
	    private int newNumber;
	    private double avg;

	    public AverageResponse(List<Integer> windowPrevState, List<Integer> windowCurrState, int newNumber, double avg) {
	        this.windowPrevState = windowPrevState;
	        this.windowCurrState = windowCurrState;
	        this.newNumber = newNumber;
	        this.avg = avg;
	    }

	    public List<Integer> getWindowPrevState() {
	        return windowPrevState;
	    }

	    public List<Integer> getWindowCurrState() {
	        return windowCurrState;
	    }

	    public int getNewNumber() {
	        return newNumber;
	    }

	    public double getAvg() {
	        return avg;
	    }
}
