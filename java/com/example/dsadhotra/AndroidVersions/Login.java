package com.example.dsadhotra.AndroidVersions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class Login extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> av;
    String[] android_versions={"cupcake","donut","eclair","Froyo","GingerBread",
            "Honeycomb", "Ice Cream Sandwich", "Jelly Bean","Kitkat",
            "Lollipop","Marshmallow","Nutella"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        listView=(ListView) findViewById(R.id.listView);
       av=new ArrayAdapter<String>(this,android.R.layout.simple_selectable_list_item,android_versions);

        listView.setAdapter(av);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            Intent intent;
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        intent = new Intent(Login.this,cupcake.class);
                        break;
                    case 1:
                        intent = new Intent(Login.this,Donut.class);
                        break;
                    case 2:
                        intent = new Intent(Login.this,Eclair.class);
                        break;
                    case 3:
                        intent = new Intent(Login.this,Froyo.class);
                        break;
                    case 4:
                        intent = new Intent(Login.this,GingerBread.class);
                        break;
                    case 5:
                        intent = new Intent(Login.this,HoneyComb.class);
                        break;
                    case 6:
                        intent = new Intent(Login.this,IceCreamSandwich.class);
                        break;
                    case 7:
                        intent = new Intent(Login.this,JellyBean.class);
                        break;
                    case 8:
                        intent = new Intent(Login.this,Kitkat.class);
                        break;
                    case 9:
                        intent = new Intent(Login.this,Lollipop.class);
                        break;
                    case 10:
                        intent = new Intent(Login.this,Marshmallow.class);
                        break;
                    case 11:
                        intent = new Intent(Login.this,Nutella.class);
                        break;

                    //add more if you have more items in listview
                    //0 is the first item 1 second and so on...
                }
                startActivity(intent);
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " is selected ", Toast.LENGTH_SHORT).show();
            }
        });
        final EditText searchYourVersion = (EditText) findViewById(R.id.search);
        searchYourVersion.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Login.this.av.getFilter().filter(s);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Login.this.av.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
               // String text = searchYourVersion.getText().toString().toLowerCase(Locale.getDefault());
               // av.getFilter();

            }
        });

    }
}
