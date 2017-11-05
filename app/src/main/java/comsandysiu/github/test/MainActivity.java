package comsandysiu.github.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView infoList;
    private List<Infomation> mInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoList = (ListView)findViewById(R.id.infolist);
        LayoutInflater itemInflater = getLayoutInflater();
        initData();
        InfoListAdapter listAdapt = new InfoListAdapter(mInfo,itemInflater);
        infoList.setAdapter(listAdapt);
    }

    private void initData() {
        mInfo = new ArrayList<Infomation>();
        Infomation APM = new Infomation(R.drawable.ic_stop,"广州塔、海心沙、大剧院停运",
                "APM线","11-04");
        Infomation SC = new Infomation(R.drawable.ic_notification,"安检升级",
                "东湖等20个车站","10-15");
        Infomation Line1 = new Infomation(R.drawable.ic_delay,"列车延误",
                "一号线","10-12");
        mInfo.add(APM);
        mInfo.add(SC);
        mInfo.add(Line1);

        mInfo.add(new Infomation(R.drawable.ic_notification,"服务正常","全线网","02-29"));
    }
}
