package com.example.petscare;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
// import java.util.List;
// import android.widget.ListView;
// import android.widget.EditText;
// import java.sql.Array;
// import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ToDo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ToDo<EditText, TaskList> extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ToDo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ToDo.
     */
    // TODO: Rename and change types and number of parameters
    public static ToDo newInstance(String param1, String param2) {
        ToDo fragment = new ToDo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

      //String InputTask = EditText;
      //String ListTaskView = ListView;
     // TaskList<String> Tasks = new TaskList();
      //String Adapter = new Adapter[];
      //TaskAdapter taskAdapter;
   // List<Task> tasks = new ArrayList<>();

   // List<Task> tasks = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_to_do, container, false);
    }
}