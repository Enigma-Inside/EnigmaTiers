package EnigmaInside;
import arc.util.Log;
import EnigmaInside.content.*;
import mindustry.game.Schematics;
import mindustry.mod.Mod;

public class EnigmaTiersMod extends Mod {

public EnigmaTiersMod(){
        Log.info("Loaded Enigma Tier constructor.");
}

@Override
public void loadContent(){
ETBlocks.load();   
}
}
