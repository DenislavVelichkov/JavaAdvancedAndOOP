package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.models.units;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.models.units.AbstractUnit;

public class Pikeman extends AbstractUnit {

	private static final int PIKEMAN_HEALTH = 30;
	private static final int PIKEMAN_DAMAGE = 15;

	public Pikeman() {
		super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
	}
}
