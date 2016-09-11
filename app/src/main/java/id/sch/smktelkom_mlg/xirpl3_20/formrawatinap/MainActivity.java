package id.sch.smktelkom_mlg.xirpl3_20.formrawatinap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etPenyakit;
    Spinner spK, spNK;
    Button bOk;
    RadioButton rb1, rb2, rb3;
    TextView tvHasil;
    String[][] arNK = {{"Anggrek1", "Anggrek2", "Anggrek3", "Anggrek4", "Anggrek5"},
            {"Mawar1", "Mawar2", "Mawar3", "Mawar4", "Mawar5"},
            {"Cempaka1", "Cempaka2", "Cempaka3", "Cempaka4", "Cempaka5"}};
    ArrayList<String> listKota = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        etNama = (EditText) findViewById(R.id.nama);
        etPenyakit = (EditText) findViewById(R.id.penyakit);
        bOk = (Button) findViewById(R.id.button);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        spK = (Spinner) findViewById(R.id.spinnerKamar);
        spNK = (Spinner) findViewById(R.id.spinnerNamaKamar);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listKota);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spNK.setAdapter(adapter);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });


        spK.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                listKota.clear();
                listKota.addAll(Arrays.asList(arNK[position]));
                adapter.notifyDataSetChanged();
                spNK.setSelection(0);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void doClick() {
        //  String Nama = etNama.getText().toString();
        // String Penyakit = etPenyakit.getText().toString();
        //  String kamar = spK.getSelectedItem().toString();
        //  String nkamar =spNK.getSelectedItem().toString();
        //   String hasil = null;
        //    int Bayar;
        //    if (rb1.isChecked())
        //   {
        //       hasil=rb1.getText().toString();
        //      Bayar = 100000;
        //   }
        //   else if (rb2.isChecked())
        //   {
        //       hasil = rb2.getText().toString();
        //      Bayar = 200000;
        //    }
        //    else if (rb3.isChecked())
        //    {
        //       hasil = rb3.getText().toString();
        //      Bayar = 500000;
        //  }
        //  if (Nama.isEmpty())
        //  {
        //      etNama.setError("Nama Belum Diisi");
        //   }
        //    if (Penyakit.isEmpty())
        //   {
        //      etPenyakit.setError("Penyakit Belum Diisi");
        //  }
        // if (hasil == null)
        //   {
        //       tvHasil.setText("Anda Belum Menentukan Lamanya Inap");
        //   }

        // tvHasil.setText("******************RS Sehat Selalu******************"+"\n nama :"+Nama+"\n Anda Menderita Penyakit :"+Penyakit+"\n ");
    }



}

