package com.example.myapplication;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorLong;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    SignInButton signIn;
    GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Privacy =  findViewById(R.id.Privacy);
        TextView have_Acc =  findViewById(R.id.Have_an_account);
        Coloring(Privacy , 0,41,56,59);
        Coloring(have_Acc , 0 , 17);
        }


    public void Coloring  (TextView t , int start , int end )
    {
        //note Start & end (Parameter)'ll use it as Substring Methode !!
        //Casting = Get the text to edit it :D
        String s =(String) t.getText();
        //Get ready ColorText to pass it to Setspan !!
        ForegroundColorSpan C = new ForegroundColorSpan(Color.GRAY );
        //Create Span o_0 !
        SpannableString Text = new SpannableString(s);
        Text.setSpan( C , start , end , Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        // Finally ---- Set new text :D
        t.setText(Text);
    }

    //Overloading only
    public void Coloring  (TextView t ,int start1 , int end1 , int start2 , int end2)
    {

        //Casting = Get the text to edit it :D
        String s =(String) t.getText();
        //Get ready ColorText to pass it to Setspan !!
        ForegroundColorSpan C = new ForegroundColorSpan(Color.GRAY );
        ForegroundColorSpan x = new ForegroundColorSpan(Color.GRAY );
        //Create Span o_0 !
        // Note :  in SetPan u Can't Pass Same Color twice -_- !!
        SpannableString Text = new SpannableString(s);
        Text.setSpan(C , start2 , end2 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        Text.setSpan( x , start1 , end1 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Finally ---- Set new text :D
        t.setText(Text);



    }

    public void click_Have_Acc(View view) {
        Intent intent = new Intent(this , Sign_in.class);
        startActivity(intent);

    }

    public void Sign_up_with_email(View view) {
        Intent intent = new Intent(this , Sign_with_Email.class);
        startActivity(intent);
    }
}
