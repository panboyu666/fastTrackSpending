package tw.com.fasttrackspending;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日 kk:mm分");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Taipei"));
        String ss =sdf.format(new Date());
        Log.d("myStr", "today is " + ss);

    }
}