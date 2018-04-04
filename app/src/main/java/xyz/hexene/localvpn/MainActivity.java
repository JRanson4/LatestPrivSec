/*package xyz.hexene.localvpn;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int SELECT_FILE_CODE = 0x05;
    public static final String PREFS_NAME = MainActivity.class.getName();
    public static final String HOSTS_URI = "HOST_URI";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_vpn);
        final Button selectHosts = findViewById(R.id.button_select_hosts);


        selectHosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //selectFile();
                Toast.makeText(getApplicationContext(), "HELLO FROM THE OTHER SIDE", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void selectFile() {

        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT); */
       // intent.setType("*/*");
        /*try {
            Field f = android.provider.DocumentsContract.class.getField("EXTRA_SHOW_ADVANCED");
            intent.putExtra(f.get(f.getName()).toString(), true);
        } catch (Exception e) {
            Log.e(TAG, "SET EXTRA_SHOW_ADVANCED", e);
        }

        try {
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            startActivityForResult(intent, SELECT_FILE_CODE);
        } catch (Exception e) {
            Toast.makeText(this, R.string.file_select_error, Toast.LENGTH_LONG).show();
            Log.e(TAG, "START SELECT_FILE_ACTIVE FAIL");
        }
*/
/*
    }

    private boolean checkHostUri() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String uri_path = settings.getString(HOSTS_URI, null);
        if (uri_path != null) {
            Uri uri = Uri.parse(uri_path);
            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);
                inputStream.close();
                return true;
            } catch (Exception e) {
                Log.e(TAG, "HOSTS FILE NOT FOUND", e);
            }
        }
        return false;
    }
}
*/