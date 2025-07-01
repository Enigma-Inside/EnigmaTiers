package EnigmaInside;

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
