package domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class variable {

	@PlanningVariable(valueRangeProviderRefs = "xRange")
	private Integer x;

	public variable() {

	}	

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}
	
}
