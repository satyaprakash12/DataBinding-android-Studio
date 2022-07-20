package meity.gov.in.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import meity.gov.in.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
    //activityMainBinding.setName("satya prakash");
        Model model=new Model("Hello, My Name is Satya Prakash");
        activityMainBinding.setModel(model);
    }

}