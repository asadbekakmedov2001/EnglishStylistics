package com.example.english.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.english.MainActivity3;
import com.example.english.R;
import com.example.english.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {

    private FragmentHomeBinding binding;

    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // ruyhatni eloni va sozlanmasi
        recyclerView = root.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);

        return root;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm1,"PREFACE                                                        ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm2,"1. The subject matter of stylistics                             ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm3,"2. Stylistic classification of the English vocabulary          ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"3. Phonetic expressive means and stylistic devices             ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"4. Lexical expressive means and stylistic devices              ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"5. Lexical - syntаcticаl expressive means and stylistic devices","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"6. Syntactical expressive means and stylistic devices          ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"7. Functional styles                                           ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"8. Text Interpretation                                         ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"9. Text Interpretation                                         ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"Appendix                                                       ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"References                                                     ","",""));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {


//
            startActivity(new Intent(getContext(), MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));


    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        modelRcyclers.clear();
//    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}