package org.usfirst.frc.team6035.robot.auto;

import java.util.ArrayList;
import java.util.List;

public class AutoPlayGroup {

	private List<AutoPlay> autoPlayObjects = new ArrayList<>();

	public void add(AutoPlay autoPlay) {
		autoPlayObjects.add(autoPlay);
	}

	public AutoPlay get(int i) {
		return autoPlayObjects.get(i);
	}

	public int size() {
		return autoPlayObjects.size();
	}
}
