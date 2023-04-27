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
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm0 ,"PREFACE                                                        ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/PREFACE.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm1,"1. The subject matter of stylistics                             ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/stylistics1.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm2,"2. Stylistic classification of the English vocabulary          ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/stylistics2.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm3,"3. Phonetic expressive means and stylistic devices             ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/stylistics3.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"4. Lexical expressive means and stylistic devices              ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/stylistics4.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm5,"5. Lexical - syntаcticаl expressive means and stylistic devices","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/stylistics5.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm6,"6. Syntactical expressive means and stylistic devices          ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/stylistics6.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm7,"7. Functional styles                                           ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/stylistics7.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm8,"8. Text Interpretation                                         ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/stylistics8.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm9,"9. Text Interpretation                                         ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/stylistics9.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm10,"Appendix                                                       ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/Appendix.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm11,"References                                                     ","","https://github.com/asadbekakmedov2001/EnglishStylistics/raw/main/app/src/main/assets/References.docx"));

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