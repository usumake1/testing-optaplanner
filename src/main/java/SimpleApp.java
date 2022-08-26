import java.time.Duration;

import org.optaplanner.core.api.score.ScoreExplanation;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.optaplanner.core.config.solver.SolverConfig;
import org.optaplanner.core.impl.score.DefaultScoreManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.Planningsolution;
import domain.variable;
import solver.SimpleConstraintProvider;


public class SimpleApp {

	 private static final Logger LOGGER = LoggerFactory.getLogger(SimpleApp.class);

	    public static void main(String[] args) {
	        SolverFactory<Planningsolution> solverFactory = SolverFactory.create(new SolverConfig()
	                .withSolutionClass(Planningsolution.class)
	                .withEntityClasses(variable.class)
	                .withConstraintProviderClass(SimpleConstraintProvider.class)

	                .withTerminationSpentLimit(Duration.ofSeconds(10)));

	        // Load the problem
	        Planningsolution problem = new Planningsolution();
	        
	        

	        // Solve the problem
	        Solver<Planningsolution> solver = solverFactory.buildSolver();
	        Planningsolution solution = solver.solve(problem);

	        // Visualize the solution
	       System.out.println("solution: " + display(solution) + "\n" + "score: " + solution.getScore());
	       
	    }
	
	    
	    public static Integer display(Planningsolution solution) {

	    	variable var = new variable();
	    	return var.getX();
	    }
}
