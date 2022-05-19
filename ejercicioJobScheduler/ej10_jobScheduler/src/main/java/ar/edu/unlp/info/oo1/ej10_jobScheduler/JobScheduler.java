package ar.edu.unlp.info.oo1.ej10_jobScheduler;


import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected String strategy;
     
    public JobScheduler () {
    	this.jobs = new ArrayList<>(); 
    	this.strategy = "FIFO";
    }
    
    public void schedule(JobDescription job) {
    	this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
    	if (job != null) {
    	   this.jobs.remove(job);
    	}
    }
    
    public String getStrategy() {
    	return this.strategy; 
    }
    
    public List<JobDescription> getJobs(){
    	return jobs;
    }
    
    public void setStrategy(String aStrategy) {
    	this.strategy = aStrategy; 
    }
    
    public JobDescription next() {
    	JobDescription nextJob = null;
    	
    	switch (strategy) {
    	case "FIFO": 
    		nextJob = jobs.remove(0);
        	this.unschedule(nextJob);
        	return nextJob;

    	case "LIFO": 
    		nextJob = jobs.remove(jobs.size()-1);
        	this.unschedule(nextJob);
        	return nextJob;

    	case "HighestPriority": 
    		nextJob = jobs.stream()
				.max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
				.orElse(null);
        	this.unschedule(nextJob);
        	return nextJob;
        	
    	case "MostEffort":
		     nextJob = jobs.stream()
     			.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
     			.orElse(null);
		    this.unschedule(nextJob);
		    return nextJob;

    	default: return nextJob;    	
    	}
      	
    }
    
}

