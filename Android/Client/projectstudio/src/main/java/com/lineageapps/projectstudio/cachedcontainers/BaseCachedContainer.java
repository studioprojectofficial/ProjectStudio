package com.lineageapps.projectstudio.cachedcontainers;

import java.util.List;

/**
 * Created by dinushka on 11/25/2015.
 */
public abstract class BaseCachedContainer<T>{

    public abstract List<T> getDataList(String cachedKey);
    public abstract T getMostMatchingData(String cachedKey);
}
