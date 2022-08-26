package domain;

import java.util.List;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningEntityProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.ProblemFactProperty;
import org.optaplanner.core.api.domain.valuerange.CountableValueRange;
import org.optaplanner.core.api.domain.valuerange.ValueRangeFactory;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@PlanningSolution
public class Planningsolution {

	@PlanningEntityProperty
	private variable variable;
	

	
	@ValueRangeProvider(id="xRange")
	public CountableValueRange<Integer> getxRange(){
		return ValueRangeFactory.createIntValueRange(1, 30);
	}
	
    @PlanningScore
    private HardSoftScore score;
    
    public Planningsolution() {


	}


	public variable getVariable() {
		return variable;
	}



	public void setVariable(variable variable) {
		this.variable = variable;
	}



	public HardSoftScore getScore() {
		return score;
	}

	public void setScore(HardSoftScore score) {
		this.score = score;
	}
    
    	
}
