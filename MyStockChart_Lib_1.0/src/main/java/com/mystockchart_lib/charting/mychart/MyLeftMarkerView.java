package com.mystockchart_lib.charting.mychart;

import android.content.Context;
import android.widget.TextView;

import com.mystockchart_lib.R;
import com.mystockchart_lib.charting.components.MarkerView;
import com.mystockchart_lib.charting.data.Entry;
import com.mystockchart_lib.charting.highlight.Highlight;

import java.text.DecimalFormat;


public class MyLeftMarkerView extends MarkerView {
    /**
     * Constructor. Sets up the MarkerView with a custom layout resource.
     *
     * @param context
     * @param layoutResource the layout resource to use for the MarkerView
     */
    private TextView markerTv;
    private float num;
    private  DecimalFormat mFormat;
    public MyLeftMarkerView(Context context, int layoutResource) {
        super(context, layoutResource);
        mFormat=new DecimalFormat("#0.00");
        markerTv = (TextView) findViewById(R.id.marker_tv);
        markerTv.setTextSize(10);
    }

    public void setData(float num){

        this.num=num;
    }
    @Override
    public void refreshContent(Entry e, Highlight highlight) {
        markerTv.setText(mFormat.format(num));
    }

    @Override
    public int getXOffset(float xpos) {
        return 0;
    }

    @Override
    public int getYOffset(float ypos) {
        return 0;
    }
}
