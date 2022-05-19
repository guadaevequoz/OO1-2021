package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class LIFOScheduler extends JobScheduler {
    
    public JobDescription next() {
        
        JobDescription nextJob = jobs.remove(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
    }

}