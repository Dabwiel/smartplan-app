package br.com.gew.smartplan.activities;

import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

import br.com.gew.smartplan.R;
import br.com.gew.smartplan.helpers.Utils;


public class AddPlanejamentoActivity extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtDescricao;
    private Button insert;

    private EditText dataInicio;
    private EditText dataFinal;

    private Long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_planejamento);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Adicionar Planejamento");

        SharedPreferences sp = getSharedPreferences("UserPreferences", MODE_PRIVATE);
        id = sp.getLong("professor_id", 0);

        txtNome = findViewById(R.id.txt_nome_planejamento);
        txtDescricao = findViewById(R.id.txt_descricao_planejamento);

        insert = findViewById(R.id.insert_planejamento);
        //MODIFICAR
        insert.setOnClickListener(v -> {

        });

        SharedPreferences preferences = getSharedPreferences("UserPreferences", MODE_PRIVATE);
        this.id = preferences.getLong("professor_id", 0);

        dataInicio = findViewById(R.id.data_inicio);
        dataInicio.setOnFocusChangeListener((v, hasFocus) -> {
            if(hasFocus){
                final Calendar c = Calendar.getInstance();
                new DatePickerDialog(AddPlanejamentoActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        c.set(year, month, dayOfMonth);
                        dataInicio.setText(Utils.dateToString(c.getTime()));
                    }
                }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        dataFinal = findViewById(R.id.data_final);
        dataFinal.setOnFocusChangeListener((v, hasFocus) -> {
            if(hasFocus){
                final Calendar c = Calendar.getInstance();
                new DatePickerDialog(AddPlanejamentoActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        c.set(year, month, dayOfMonth);
                        dataFinal.setText(Utils.dateToString(c.getTime()));
                    }
                }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
