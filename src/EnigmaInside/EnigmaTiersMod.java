package EnigmaInside;
import arc.util.Log;
import EnigmaInside.content.*;
import mindustry.game.Schematics;
import mindustry.mod.Mod;

public class EnigmaTiersMod extends Mod {
    public ETMain(){
        Log.info("Loaded Enigma Tiers constructor.");
    }

@Override
public void loadContent(){
ETBlocks.load();   
}
}
