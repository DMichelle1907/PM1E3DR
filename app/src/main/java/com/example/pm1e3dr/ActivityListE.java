package com.example.pm1e3dr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pm1e3dr.Models.Entrevista;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class ActivityListE extends AppCompatActivity {
    RecyclerView mRecycle;
    Adapter mAdapter;
    FirebaseFirestore mFirebasestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_e);
        mFirebasestore = FirebaseFirestore.getInstance();
        mRecycle = findViewById(R.id.RecyclerView);
        mRecycle.setLayoutManager(new LinearLayoutManager(this));
        Query query = mFirebasestore.collection("Entrevista");
        FirestoreRecyclerOptions<Entrevista> firestoreRecyclerOptions = new FirestoreRecyclerOptions.Builder<Entrevista>
                ().setQuery(query,Entrevista.class).build();
        mAdapter = new Adapter(firestoreRecyclerOptions, this, getSupportFragmentManager());
        mAdapter.notifyDataSetChanged();
        mRecycle.setAdapter(mAdapter);

    }

    @Override
    protected void onStart(){
        super.onStart();
        mAdapter.startListening();
    }

    @Override
    protected void onStop(){
        super.onStop();
        mAdapter.stopListening();
    }
}