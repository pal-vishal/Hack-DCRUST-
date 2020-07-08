package com.example.hackdcrust.login.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.hackdcrust.R;
import com.example.hackdcrust.util.Constants;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;



public class PhoneNumberFragment extends Fragment {

    TextInputEditText textInputEditText;
    TextInputLayout textInputLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_phone_number, container, false);
        textInputLayout = view.findViewById(R.id.tilPhoneNumber);
        Button submit = view.findViewById(R.id.btnGetCode);
        submit.setOnClickListener(v -> {
            String phn_no = textInputLayout.getEditText().getText().toString();
            if (phn_no.length() != 10) {
                textInputLayout.setError("Valid number is required");
                textInputLayout.requestFocus();
            } else {
                Bundle bundle = new Bundle();
                bundle.putString(Constants.PHONE_NUMBER, phn_no);
                VerifyFragment verifyFragment = new VerifyFragment();
                verifyFragment.setArguments(bundle);
                FragmentTransaction fr = getActivity().getSupportFragmentManager().beginTransaction();
                fr.replace(R.id.container, verifyFragment);
                fr.addToBackStack(null).commit();
            }

        });
        return view;
    }
}