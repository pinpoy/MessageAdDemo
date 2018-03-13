package demo.jesgoo.com.messageaddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.itsm.xkitsm.piwen.bean.Message;
import com.itsm.xkitsm.piwen.utils.OpenStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Message.ResultBean.DataBean dataBeanTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_open).setOnClickListener(this);
        //制造假数据
        dataBeanTest = new Message.ResultBean.DataBean();
        dataBeanTest.setAuthor_name("chinse");
        dataBeanTest.setDate("2019-09-08");
        dataBeanTest.setTitle("第四次世界大战开始啦，冲啊！！！！！！！！");

    }

    @Override
    public void onClick(View view) {
        //开启广告
        OpenStream.setTile("国内", "体育");
        //OpenStream.addDataItem(5, dataBeanTest); 添加广告条目
        OpenStream.preLoad(getSupportFragmentManager());
    }


    /**
     * 监听返回物理按键，返回fragment
     * @param keyCode
     * @param event
     * @return
     */
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK &&
//                getSupportFragmentManager().getBackStackEntryCount() > 0) {
//            // 返回上一个fragment
//            getSupportFragmentManager().popBackStack();
//            return true;
//        }
//        return super.onKeyDown(keyCode, event);
//    }

}
