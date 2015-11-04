package org.nsu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView nameTextView = (TextView)findViewById(R.id.item2_name);
        TextView nickTextView = (TextView)findViewById(R.id.item2_nick);
        ImageView imageView = (ImageView)findViewById(R.id.item2_image);
        TextView deptTextView = (TextView)findViewById(R.id.item2_dept);
        String name=getIntent().getStringExtra("name");
        String nickname=getIntent().getStringExtra("nick");
        int id=getIntent().getIntExtra("image",0);
        String dept=getIntent().getStringExtra("dept");
       PersonItem personItem=new PersonItem(name,nickname,id,dept);

        nameTextView.setText(personItem.name);
        nickTextView.setText(personItem.nickName);
        imageView.setImageResource(personItem.imageResId);
        deptTextView.setText(personItem.department);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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
