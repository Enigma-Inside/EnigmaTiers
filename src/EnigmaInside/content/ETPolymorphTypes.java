package EnigmaInside.content;

import arc.graphics.Color;
import enigma.custom.polymorph.PolymorphPowerType;
import enigma.graphics.EniPal;

public class ETPolymorphTypes {
	public static PolymorphPowerType caster;

	public static void load(){
		castero = new PolymorphPowerType("castero");

		castero.color = Color.valueOf("d0c400");
		castero.colorDark = Color.valueOf("3e3b00");

	}
}
