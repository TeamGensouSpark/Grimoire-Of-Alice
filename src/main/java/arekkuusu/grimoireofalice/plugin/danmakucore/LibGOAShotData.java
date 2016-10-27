/*
 * This class was created by <Katrix>. It's distributed as
 * part of the Grimoire Of Alice Mod. Get the Source Code in github:
 * https://github.com/ArekkuusuJerii/Grimore-Of-Alice
 *
 * Grimoire Of Alice is Open Source and distributed under the
 * Grimoire Of Alice license: https://github.com/ArekkuusuJerii/Grimore-Of-Alice/blob/master/LICENSE.md
 */
package arekkuusu.grimoireofalice.plugin.danmakucore;

import static net.katsstuff.danmakucore.lib.LibColor.*;

import arekkuusu.grimoireofalice.plugin.danmakucore.form.GOAForms;
import arekkuusu.grimoireofalice.plugin.danmakucore.subentity.GOASubEntities;
import net.katsstuff.danmakucore.data.ShotData;
import net.katsstuff.danmakucore.lib.data.LibForms;

public class LibGOAShotData {

	public static final ShotData WIND = new ShotData(GOAForms.WIND, COLOR_VANILLA_RED, 0.4F, 0.5F, 0, 50, GOASubEntities.WIND);
	public static final ShotData NOTE = new ShotData(LibForms.CONTROL, COLOR_VANILLA_RED, 0.4F, 0.5F, 0, 50, GOASubEntities.NOTE);
	public static final ShotData UFO = new ShotData(GOAForms.UFO, COLOR_SATURATED_CYAN, 0.4F, 0.5F, 0, 50, GOASubEntities.UFO);
	public static final ShotData LEAF = new ShotData(GOAForms.LEAF, COLOR_SATURATED_GREEN, 0.4F, 0.3F, 0, 50, GOASubEntities.LEAF);
}
