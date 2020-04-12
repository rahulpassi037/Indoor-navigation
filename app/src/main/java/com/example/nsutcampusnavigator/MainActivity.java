package com.example.nsutcampusnavigator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST = 123;

//    protected boolean allPermissionsGranted(){
//        return ((ContextCompat.checkSelfPermission(this, Manifest.permission.BODY_SENSORS)
//                == PackageManager.PERMISSION_GRANTED) &&
//                (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//                        == PackageManager.PERMISSION_GRANTED) &&
//                (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
//                        == PackageManager.PERMISSION_GRANTED) &&
//                (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
//                        == PackageManager.PERMISSION_GRANTED));
//    }

    protected void checkAllPermissions(){
        ArrayList<String> permissions = new ArrayList<String>();
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.BODY_SENSORS)
                    != PackageManager.PERMISSION_GRANTED) {
                // Permission is not granted
                permissions.add(Manifest.permission.BODY_SENSORS);
            }
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED) {
                // Permission is not granted
                permissions.add(Manifest.permission.CAMERA);
            }
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {
                // Permission is not granted
                permissions.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
            }
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {
                // Permission is not granted
                permissions.add(Manifest.permission.READ_EXTERNAL_STORAGE);
            }
            String[] permission = new String[permissions.size()];
            for(int i=0;i<permissions.size();i++){
                permission[i] = permissions.get(i);
            }
            if(permissions.size() > 0)
            ActivityCompat.requestPermissions(this, permission,
                    MY_PERMISSIONS_REQUEST);
    }

//    protected void ShowerrorandExit(){
//          MainActivity.this.finish();
//          System.exit(0);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkAllPermissions();
        setContentView(R.layout.activity_main);
    }
}
