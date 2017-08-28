package de.fila_lab.smartlightmanager;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.view.LayoutInflater;
import android.view.View;
import android.util.Log;
import android.view.ViewGroup;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Scan extends Fragment{
    private static final String TAG = "scanFragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.scan, container, false);
    }

   /* public void getFilesFromDir(File filesFromSD) {

        File listAllFiles[] = filesFromSD.listFiles();

        if (listAllFiles != null && listAllFiles.length > 0) {
            for (File currentFile : listAllFiles) {
                if (currentFile.isDirectory()) {
                    getFilesFromDir(currentFile);
                } else {
                    if (currentFile.getName().endsWith("")) {
                        // File absolute path
                        Log.i("File path", currentFile.getAbsolutePath());
                        // File Name
                        Log.i("File path", currentFile.getName());

                    }
                }
            }
        }
    }
*/
  /* private void loadFile(){
        try {
            FileInputStream fis = openFileInput('nodes.json');
            BufferedReader reader = new BufferedReader(new InputStreamReader(new DataInputStream(fis)));
            String line;
            while ((line = reader.readLine()) != null){
                Log.i(TAG, line);
            }
        } catch (Exception e){
            Log.e(TAG, "Unable to read the file");
        }
    }*/

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Scan");
        File downloadDir = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        Log.i(TAG, downloadDir.getName());
/*
        String path = Environment.getExternalStorageDirectory().toString()+"/Pictures";
        Log.d("Files", "Path: " + path);
        File directory = new File(path);
        File[] files = directory.listFiles();
        Log.d("Files", "Size: "+ files.length);
        for (int i = 0; i < files.length; i++)
        {
            Log.d("Files", "FileName:" + files[i].getName());
        }
//       getFilesFromDir(downloadDir);*/

    }
}
