package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class FIFOScheduler extends JobScheduler {
	public JobDescription next() {
        
        JobDescription nextJob = jobs.remove(0);
        this.unschedule(nextJob);
        return nextJob;
    }
}
