package com.learning.profuturo.en501863.controldatabase.backup;

import android.content.ContentValues;
import android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by EN501863 on 14/12/2017.
 */

public class RespaldoBaseDatos {

    public static void BD_backup(Context context) throws IOException {
        String DATABASE_NAME = "control_database";
        String                          timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

        final String inFileName = "/data / data / com.learning.profuturo.en501863.controldatabase / databases /" + DATABASE_NAME;

        File dbFile = new File(inFileName);
        FileInputStream fis = null;

        fis = new FileInputStream(dbFile);

        String directorio = "/TestControlDataBase";

        File d = new File(directorio);
        if (!d.exists()) {
            d.mkdir();
        }
        String outFileName = directorio + "/" + DATABASE_NAME + "_" + timeStamp;

        OutputStream output = new FileOutputStream(outFileName);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            output.write(buffer, 0, length);
        }

        output.flush();
        output.close();
        fis.close();

    }
}
