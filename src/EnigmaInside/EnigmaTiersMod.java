package EnigmaInside;
import arc.util.Log;
import EnigmaTiers.content.*;
import mindustry.game.Schematics;
import mindustry.mod.*;

public class EnigmaTiersMod extends Mod {
@Override
public ETMain(){
        Log.info("Loaded Enigma Tiers constructor.");
    }
@Override
public void loadContent(){
ETBlocks.load();   
}
}
