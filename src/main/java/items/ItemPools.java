package items;

import java.util.ArrayList;

public class ItemPools {

    ArrayList<EdibleItem> edibleItemMushroomForestPool = new ArrayList<>();

    private void makeEdibleItemMushroomForestPool(){
        edibleItemMushroomForestPool.add(new HotDog());
        edibleItemMushroomForestPool.add(new SwattedSoup());
    }

    public ArrayList<EdibleItem> getEdibleItemMushroomForestPool(){
        makeEdibleItemMushroomForestPool();
        return edibleItemMushroomForestPool;
    }

}
