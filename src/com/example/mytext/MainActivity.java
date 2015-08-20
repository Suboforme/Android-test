package com.example.mytext;





import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView listview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		listview=(ListView) findViewById(R.id.listView1);
		List<TimeLineModel> list=new ArrayList<TimeLineModel>();
		int j=getResources().getIdentifier("ic_launcher", "drawable", getPackageName());
		for(int i=0;i<5;i++){
			TimeLineModel lineModel=new TimeLineModel(j, "nid"+i);
			list.add(lineModel);
		}
		MyAdapter adapter=new MyAdapter(getApplicationContext(), list);
		listview.setAdapter(adapter);
	}

}
