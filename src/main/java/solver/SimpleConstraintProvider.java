package solver;


import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.score.calculator.EasyScoreCalculator;
import org.optaplanner.core.api.score.stream.Constraint;
import org.optaplanner.core.api.score.stream.ConstraintFactory;
import org.optaplanner.core.api.score.stream.ConstraintProvider;

import domain.Planningsolution;
import domain.variable;

public class SimpleConstraintProvider implements ConstraintProvider {


	
	 @Override
	    public Constraint[] defineConstraints(ConstraintFactory constraintFactory) {
	        return new Constraint[] {
	                // Hard constraints
	                maxValue(constraintFactory),

	        };
	 }
	        
	     private Constraint maxValue (ConstraintFactory constraintFactory) {
	        	
	        	return constraintFactory.forEach(variable.class)
	        			.reward("maximum", HardSoftScore.ONE_SOFT,variable::getX);
	        	    }
}
