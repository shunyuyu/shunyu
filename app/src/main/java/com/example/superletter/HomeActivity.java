package com.example.superletter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.superletter.databinding.ActivityHomeBinding;
import com.example.superletter.databinding.ActivityLoginBinding;
import com.example.superletter.databinding.ActivityRegisterBinding;

import java.util.ArrayList;

/**
 * @author xushunyu
 */
public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding mBinding;
    ArrayList<Fruit> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        fruitList();
        mBinding.listViewTest.setFastScrollEnabled(false);
        mBinding.listViewTest.setVerticalScrollBarEnabled(false);
        FruitAdapter fruitAdapter = new FruitAdapter(this, R.layout.fruit_item, list);
        mBinding.listViewTest.setAdapter(fruitAdapter);
        fullScreen(this);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }
    //------------------------
    /**
     * 通过设置全屏，设置状态栏透明
     *
     * @param activity
     */
    private void fullScreen(Activity activity) {
        {
            //5.x开始需要把颜色设置透明，否则导航栏会呈现系统默认的浅灰色
            Window window = activity.getWindow();
            View decorView = window.getDecorView();
            //两个 flag 要结合使用，表示让应用的主体内容占用系统状态栏的空间
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);

//            View decor = window.getDecorView();
//            int ui = decor.getSystemUiVisibility();
//            if (lightStatusBar) {
//                ui |=View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
//                //设置状态栏中字体的颜色为黑色
//            } else {
//                ui &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
//                //设置状态栏中字体颜色为白色
//            }
//            decor.setSystemUiVisibility(ui);
        }
    }

//    public static class StatusBarUtil {
//
//        /**
//         * 设置状态栏为透明
//         * @param activity
//         */
//        @TargetApi(19)
//        public static void setTranslucentStatus(Activity activity) {
//            {
//                Window window = activity.getWindow();
//                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//                window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//                window.setStatusBarColor(Color.TRANSPARENT);
//
//            }
//        }
//
//        public static void setStatusBarColor(Activity activity, int colorId) {
//            Window window = activity.getWindow();
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(activity.getResources().getColor(colorId));
//
//        }
//
//
//
//    public static void setStatusBarMode(Activity activity, boolean isTextDark, int colorId) {
//
//
//        //6.0以上，调用系统方法
//        Window window = activity.getWindow();
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
//    }
//        }
//
//
//
//
//
//
//    /**-------------------------
//    更改状态栏背景*/
//    public static void setStatusBarColor(Activity activity, int colorId) {
//        Window window = activity.getWindow();
//        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//        window.setStatusBarColor(activity.getResources().getColor(colorId));
//
//    }
/**
 * 数值
 * */
    public void fruitList(){
        list.add(new Fruit("大疆交流群",R.drawable.qunliao_10,"小王：[动态贴图]"));
        list.add(new Fruit("微信支付",R.drawable.weixinzhifu,"微信支付凭证"));
        list.add(new Fruit("白云表白墙",R.drawable.qunliao_10,"大白：今晚脱单啦！哈哈哈哈！"));
        list.add(new Fruit("打卡群",R.drawable.qunliao_1,"怪人叔叔：帮我打科三的卡 谢谢！"));
        list.add(new Fruit("白云工商技师学院新生群",R.drawable.qunliao_10,"宫本：王者有没有人一起来？"));
        list.add(new Fruit("晓哥",R.drawable.xiao,"今晚一起去吃饭不！"));
        list.add(new Fruit("抬棺",R.drawable.qunliao_10,"晓哥：你想被抬么？"));
        list.add(new Fruit("互砍互助群",R.drawable.qunliao_1,"龚老：拼多多帮我砍一刀"));
        list.add(new Fruit("20届信息工程系团总支",R.drawable.qunliao_1,"班助：还没有报名的赶紧报名！！！！！"));
        list.add(new Fruit("乐阳江",R.drawable.qunliao_1,"周星驰：今晚有什么好吃的推荐"));
        list.add(new Fruit("海陵大角湾交流群",R.drawable.qunliao_1,"群主：今晚大角湾有篝火表演 有空的都来"));
        list.add(new Fruit("微信运动",R.drawable.weixin,"[应用信息]"));
        list.add(new Fruit("今晚打晓哥",R.drawable.qunliao_1,"晓哥：听说你要打我？"));
        list.add(new Fruit("白云网郁",R.drawable.qunliao_1,"周杰伦：到点了！开始网抑云了"));
        list.add(new Fruit("航拍中国",R.drawable.qunliao_1,"今晚哪里约拍？"));
        list.add(new Fruit("白云表白墙",R.drawable.qunliao_10,"大白：今晚脱单啦！哈哈哈哈！"));
        list.add(new Fruit("打卡群",R.drawable.qunliao_1,"怪人叔叔：帮我打科三的卡 谢谢！"));
        list.add(new Fruit("白云工商技师学院新生群",R.drawable.qunliao_10,"宫本：王者有没有人一起来？"));
        list.add(new Fruit("晓哥",R.drawable.qunliao_1,"今晚一起去吃饭不！"));
        list.add(new Fruit("文件传输",R.drawable.wenjianchuanshu,"[图片]"));
        list.add(new Fruit("互砍互助群",R.drawable.qunliao_1,"龚老：拼多多帮我砍一刀"));
        list.add(new Fruit("乐阳江",R.drawable.qunliao_1,"周星驰：今晚有什么好吃的推荐"));
        list.add(new Fruit("海陵大角湾交流群",R.drawable.qunliao_1,"群主：今晚大角湾有篝火表演 有空的都来"));
        list.add(new Fruit("今晚打晓哥",R.drawable.qunliao_1,"晓哥：听说你要打我？"));
        list.add(new Fruit("白云网郁",R.drawable.qunliao_1,"周杰伦：到点了！开始网抑云了"));
        list.add(new Fruit("航拍中国",R.drawable.qunliao_1,"今晚哪里约拍？"));
    }
}