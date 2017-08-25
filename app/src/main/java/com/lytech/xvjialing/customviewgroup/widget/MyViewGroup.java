package com.lytech.xvjialing.customviewgroup.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by xvjialing on 2017/8/25.
 */

public class MyViewGroup extends ViewGroup {
    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

//    使ViewGroup能够支持margin，直接使用系统的MarginLayoutParams
    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new MarginLayoutParams(getContext(),attrs);
    }

    /**
     * 计算所有childView的宽度与高度，然后根据childView的计算结果，设置自己的宽和高
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        /**
         * 获取此ViewGroup上级容器为其推荐的宽和高，以及计算模式
         */
        int widthMode=MeasureSpec.getMode(widthMeasureSpec);
        int heightMode=MeasureSpec.getMode(heightMeasureSpec);
        int sizeWidth=MeasureSpec.getSize(widthMeasureSpec);
        int sizeHeight=MeasureSpec.getSize(heightMeasureSpec);

        //计算出所有childrenView的宽和高
        measureChildren(widthMeasureSpec,heightMeasureSpec);

        /**
         * 记录如果是wrap_content是设置的宽和高
         */
        int width=0;
        int height=0;

        int cCount=getChildCount();

        int cWidth=0;
        int cHeight=0;
        MarginLayoutParams params=null;

        //用于计算左边两个childView的高度
        int lHeight=0;
        //用于计算右边两个childview的高度,最终高度取两者最大值
        int rHeight=0;

        //计算上边两个childView的宽度
        int tWidth=0;
        //计算下边两个childView的宽度,最终宽度取两者最大值
        int bWidth=0;








    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
