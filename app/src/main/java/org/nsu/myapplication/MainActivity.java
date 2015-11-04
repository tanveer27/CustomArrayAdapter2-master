package org.nsu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = new String[]{"Atiar", "Saadman","Jabin","Arabi","Naheena","Nafis","Salat","Saiful"};
        ListView listView = (ListView)findViewById(R.id.list);

        PersonItem atiar = new PersonItem("Atiar","Swajan",R.drawable.panda,"CSE");
        PersonItem jibne = new PersonItem("Kamal","Jibne",R.drawable.monkey,"BBA");
        PersonItem nafis = new PersonItem("Nafis","UI",R.drawable.cat,"Pharmacy");
        PersonItem nafiul = new PersonItem("Nafiul","Labib",R.drawable.frog,"Sleep");
        PersonItem shoilee = new PersonItem("Shoilee","Pecha",R.drawable.owl,"Food");
        PersonItem tanveer = new PersonItem("Tanveer","Faahd",R.drawable.pan,"Trouble");
        final ArrayList<PersonItem> personItems = new ArrayList<>();
        personItems.add(atiar);
        personItems.add(jibne);
        personItems.add(nafis);
        personItems.add(nafiul);
        personItems.add(shoilee);
        personItems.add(tanveer);

        PersonAdapter nameAdapter =
                new PersonAdapter(this, personItems);

        listView.setAdapter(nameAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                PersonItem personItem=personItems.get(i);
                intent.putExtra("name",personItem.name);
                intent.putExtra("dept",personItem.department);
                intent.putExtra("nick",personItem.nickName);
                intent.putExtra("image",personItem.imageResId);
                startActivity(intent);

            }
        });
    }
}
