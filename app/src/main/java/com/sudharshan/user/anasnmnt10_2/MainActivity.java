package com.sudharshan.user.anasnmnt10_2;

import android.support.v4.app.*;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
//import is simply used by the compiler to let you name your classes by their unqualified name

public class MainActivity extends AppCompatActivity implements Frag1.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    @Override
    //creating the method for interaction between the layouts
    public void onFragmentInteraction(String link) {
        //All the operation that are made by the FragmentManager happens inside a “transaction” (for that Android fragment transaction)
        // like in a database operation.First, we can get the FragmentManger using the Activity method getFragmentManager().
        FragmentManager fragmentManager=getSupportFragmentManager();
        //begins the transaction
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        //A layout defines the visual structure for a user interface, such as the UI for an activity or app widget.
        Layout1 layout1; //Fragment 1
        Layout2 layout2; //Fragment 2
        Layout3 layout3; //Fragment 3
        Layout4 layout4; //Fragment 4

        switch (link){
            case "Layout1":
                //creating the layout object
                layout1 = new Layout1();
                fragmentTransaction.add(R.id.detailFragment, layout1);
                fragmentTransaction.commit();
                //When the break statement is encountered inside a loop, the loop is immediately terminated and the program control
                // resumes at the next statement following the loop. It can be used to terminate a case in the switch statement
                break;
            case "Layout2":
                layout2 = new Layout2();
                // Replace whatever is in the fragment_container view with this fragment,
                fragmentTransaction.replace(R.id.detailFragment, layout2);
                // Commit the transaction
                fragmentTransaction.commit();
                break;
            case "Layout3":
                layout3 = new Layout3();
                fragmentTransaction.replace(R.id.detailFragment, layout3);
                fragmentTransaction.commit();
                break;
            case "Layout4":
                layout4 = new Layout4();
                fragmentTransaction.replace(R.id.detailFragment, layout4);
                fragmentTransaction.commit();
                break;
        }

    }
}
