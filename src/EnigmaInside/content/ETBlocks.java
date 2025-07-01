package EnigmaInside.content
  
import arc.Core;
import arc.graphics.g2d.TextureRegion;
import arc.math.Interp;
import arc.struct.Seq;
import enigma.custom.block.*;
import enigma.custom.polymorph.PolymorphPowerStack;
import enigma.graphics.EFx;
import enigma.graphics.EniPal;
import enigma.graphics.draw.DrawBlades;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.ShrapnelBulletType;
import mindustry.entities.part.RegionPart;
import mindustry.gen.Sounds;
import mindustry.graphics.CacheLayer;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.AutoDoor;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.distribution.DirectionLiquidBridge;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.liquid.LiquidJunction;
import mindustry.world.blocks.liquid.LiquidRouter;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.draw.*;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.BuildVisibility;

import static enigma.content.EniItems.*;
import static enigma.content.EniLiquids.*;
import static enigma.content.EniPolymorphTypes.*;
import static enigma.content.EniUnits.*;
import static enigma.util.Consts.*;
import static mindustry.type.ItemStack.with;

public class ETBlocks {
public static Block
public static void load(){
BigEvaporationDynamo = new MultiPolymorphCrafter("big-evaporation-dynamo"){{
			size = 4;
			health = 2600;
			requirements(Category.power, with(molybdenum, 100, irtran, 40, ruthenium, 50));
			researchCost = with(molybdenum, 1000, irtran, 400, ruthenium, 910);

			consumed = new Seq<>();
			consumed.add(new PolymorphPowerStack(therma, 250/s));
			consumeLiquid(distilledAmmonia, 10/s);

			produced = new Seq<>();
			produced.add(new PolymorphPowerStack(ion, 1250/s));

			squareSprite = false;
			updateEffect = EFx.ammoniaPlume;
			updateEffectChance = 0.25f;
			drawer = new DrawMulti(
					new DrawRegion("-bottom"),
					new DrawLiquidTile(distilledAmmonia, 2f),
					new DrawDefault(),
					new DrawBlades("-blade", 12, 360/s),
					new DrawRegion("-top")
			);
		}};
}}
