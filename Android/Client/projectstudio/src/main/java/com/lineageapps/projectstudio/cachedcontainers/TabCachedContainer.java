package com.lineageapps.projectstudio.cachedcontainers;

import android.widget.RelativeLayout;

import com.lineageapps.projectstudio.dto.Tab;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dinushka on 11/25/2015.
 */
public class TabCachedContainer extends BaseCachedContainer<Tab>{



    @Override
    public List<Tab> getDataList(String cachedKey) {
        List<Tab> tabData=new ArrayList<>();

        return tabData;
    }


    @Override
    public Tab getMostMatchingData(String cachedKey) {
        return new Tab();
    }
}
