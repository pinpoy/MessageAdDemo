package com.itsm.xkitsm.piwen.utils;

import android.support.v4.app.FragmentManager;

import com.itsm.xkitsm.piwen.bean.Message;
import com.itsm.xkitsm.piwen.fragment.MessageFragment;

import java.util.LinkedList;
import java.util.List;

/**
 * Desc
 * Created by xupeng on 2018/2/1.
 */

public class OpenStream {
    //类型,,top(头条，默认),shehui(社会),guonei(国内),guoji(国际),
    // yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)
    public static String TITLE_1 = "头条";
    public static String TITLE_2 = "社会";
    public static String TITLE_3 = "国内";

    public static List<String> title = new LinkedList();
    public static int position;
    public static Message.ResultBean.DataBean dataBean;
    public static FragmentManager fragmentManager;

    public static OpenStream newInstance() {
        return new OpenStream();
    }


//    private  void openMessFramage() {
//        ((T) mContext).getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.framelayout, MessageFragment.newInstance(""))
//                .commit();
//    }


//    public static void preLoad(MainActivity mainActivity) {
//        mainActivity.getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.framelayout, MessageFragment.newInstance(""))
//                .commit();
//    }


    public static void preLoad(FragmentManager ft) {
        fragmentManager = ft;
        ft.beginTransaction()
                .add(android.R.id.content, MessageFragment.newInstance(""))
                .addToBackStack(null)   //添加返回栈
                .commit();
    }

    /**
     * 设置标题
     *
     * @param title1
     */
    public static void setTile(String title1) {
//        TITLE_1 = title1;
        title.clear();
        title.add(title1);
    }

    public static void setTile(String title1, String title2) {
//        TITLE_1 = title1;
//        TITLE_2 = title2;
        title.clear();
        title.add(title1);
        title.add(title2);
    }

    public static void setTile(String title1, String title2, String title3) {
//        TITLE_1 = title1;
//        TITLE_2 = title2;
//        TITLE_3 = title3;
        title.clear();
        title.add(title1);
        title.add(title2);
        title.add(title3);
    }

    /**
     * 插入广告bean
     *
     * @param posi
     * @param data
     */
    public static void addDataItem(int posi, Message.ResultBean.DataBean data) {
        position = posi;
        dataBean = data;
    }
}
