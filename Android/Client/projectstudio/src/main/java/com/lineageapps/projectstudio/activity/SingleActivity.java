package com.lineageapps.projectstudio.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.lineageapps.projectstudio.R;
import com.lineageapps.projectstudio.cachedcontainers.BaseCachedContainer;
import com.lineageapps.projectstudio.cachedcontainers.TabCachedContainer;
import com.lineageapps.projectstudio.datasource.Constants;
import com.lineageapps.projectstudio.dto.Tab;
import com.lineageapps.projectstudio.factorypicker.LayoutPicker;

import java.util.List;


public class SingleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //retrieve tab data for the given tab
        String cachedKey;
        if(getIntent().hasExtra(Constants.TAB_ID)){
            cachedKey=getIntent().getExtras().getString(Constants.TAB_ID)+"";
        }else{
            cachedKey=Constants.PAGE_NOT_FOUND_TAB;
        }
        BaseCachedContainer<Tab> tabCache=new TabCachedContainer();
        Tab tabData=tabCache.getMostMatchingData(cachedKey);

        LayoutPicker picker=new LayoutPicker();
        int layout=picker.pickLayout(tabData.getLayoutType());
        setContentView(layout);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_single, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
