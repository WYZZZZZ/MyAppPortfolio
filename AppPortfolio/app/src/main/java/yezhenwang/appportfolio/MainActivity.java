package yezhenwang.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void movies(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my movie app!", Toast.LENGTH_LONG);
        toast.show();
    }

    public void stock(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my stock app!", Toast.LENGTH_LONG);
        toast.show();
    }

    public void bigger(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my bigger app!", Toast.LENGTH_LONG);
        toast.show();
    }

    public void material(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my material app!", Toast.LENGTH_LONG);
        toast.show();
    }

    public void ubiquitous(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my ubiquitous app!", Toast.LENGTH_LONG);
        toast.show();
    }

    public void capstone(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my capstone app!", Toast.LENGTH_LONG);
        toast.show();
    }
}
