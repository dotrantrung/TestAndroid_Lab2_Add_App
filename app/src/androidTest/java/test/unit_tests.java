package test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.*;


import com.example.trungdo.lab2_addition.MainActivity;
import com.example.trungdo.lab2_addition.R;

import org.w3c.dom.Text;

/**
 * Created by trungdo on 4/17/16.
 */
public class unit_tests extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public unit_tests(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        int a = 100;
        int b = 1200;

//        EditText first = (EditText) mainActivity.findViewById(R.id.editText1);
//        first.setText("" + a);
//        EditText second = (EditText) mainActivity.findViewById(R.id.editText2);
//        first.setText("" + b);
//
//        Button addButton = (Button) mainActivity.findViewById(R.id.button);
//        addButton.performClick();
//
//        TextView sumOf2Number = (TextView) mainActivity.findViewById(R.id.textView3);
//        int sum = Integer.parseInt(sumOf2Number.toString());
        assertEquals(1300,mainActivity.sum(a,b));
    }
}

