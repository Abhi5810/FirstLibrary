package com.app.firstlibrary;

import android.content.Context;
import android.widget.Toast;

public class FirstLibrary
{
    public static void showFirstLibraryToast(Context context, String message)
    {
        try
        {
            Toast.makeText(context,"Library Toast : "+message,Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String getFirstLibraryMessage(Context context)
    {
        return "Wow Congratulations! You get a value from FirstLibrary";
    }
}
