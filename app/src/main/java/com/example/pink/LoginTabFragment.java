package com.example.pink;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment implements LoginTabFragment1 {

    @Override
    public View onCreateView(LayoutInflater inflater, Bundle savedInstanceState) {
        ViewGroup container = null;
        boolean attachToRoot;
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        View email = root.findViewById(R.id.email);
        View pass = root.findViewById(R.id.pass);
        View forgetpass = root.findViewById(R.id.forget_pass);
        View login = root.findViewById(R.id.signin_btn);

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
