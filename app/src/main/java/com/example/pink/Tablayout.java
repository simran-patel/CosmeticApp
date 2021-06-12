//login tab fragment
package com.example.pink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tablayout extends Fragment {

    Context context;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);
        boolean attachToRoot;


        View email = root.findViewById(R.id.email);
        View pass = root.findViewById(R.id.pass);
        View forgetpass = root.findViewById(R.id.forget_pass);
        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext() , ForgetPassActivity.class);
                startActivity(intent);
            }
        });
        View login = root.findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext() , MainActivity.class);
                startActivity(intent);
            }
        });

        ((View) email).setTranslationX(800);
        ((View) pass).setTranslationX(800);
        ((View) forgetpass).setTranslationX(800);
        ((View) login).setTranslationX(800);

        float v =1;
        email.setAlpha(v);
        pass.setAlpha(v);
        forgetpass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }

}
