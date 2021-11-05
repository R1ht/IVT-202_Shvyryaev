package com.example.lab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {
    TextView txt1,txt2,txt3;
    Button btn1,btn2,btn3;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        txt1 = (TextView) getActivity().findViewById(R.id.textView);
        txt2 = (TextView) getActivity().findViewById(R.id.textView1);
        txt3 = (TextView) getActivity().findViewById(R.id.textView2);
        btn1 = (Button) getActivity().findViewById(R.id.button3);
        btn2 = (Button) getActivity().findViewById(R.id.button4);
        btn3 = (Button) getActivity().findViewById(R.id.button);

        View.OnClickListener oclBtn1 = v -> {
            // Меняем текст в TextView (tvOut)
            txt1.setText("Нажата кнопка 1");
        };
        btn1.setOnClickListener(oclBtn1);

        View.OnClickListener oclBtn2 = v -> {
            // Меняем текст в TextView (tvOut)
            txt2.setText("Нажата кнопка 2");
        };
        btn2.setOnClickListener(oclBtn2);

        View.OnClickListener oclBtn3 = v -> {
            // Меняем текст в TextView (tvOut)
            txt3.setText("Нажата кнопка 3");
        };
        btn3.setOnClickListener(oclBtn3);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}