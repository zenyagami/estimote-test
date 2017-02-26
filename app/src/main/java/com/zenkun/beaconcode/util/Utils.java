package com.zenkun.beaconcode.util;

import android.util.Log;

import com.zenkun.beaconcode.R;
import com.zenkun.beaconcode.model.ModelCoffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Zen zenyagami@gmail.com on 24/02/2017.
 */

public class Utils {
    //hardcoded for demo purpose
    public static final String[] title= new String[]{"Extra Espresso","Cafe Latte","Chocolate"};
    public static final int[] drawableResources= new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

    public static List<ModelCoffee> getRandomCoffeData()
    {
        Random random = new Random();
        //title and drawable resource should be the same size...
        int randomSize = title.length;
        List<ModelCoffee> list= new ArrayList<>();
        for (int i=0;i<6;i++)
        {
            ModelCoffee m = new ModelCoffee();
            int ran1 =random.nextInt(randomSize);
            int ran2 =random.nextInt(randomSize);
            m.subTitle = title[ran1];
            //Log.v("TAG",""+ran1);
            //Log.v("TAG",""+ran2);
            m.resourcePhoto = drawableResources[ran2];
            m.isStarred =i%2==0;
            list.add(m);
        }
        return list;
    }


}
