package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityFracciones extends AppCompatActivity {

    EditText editText_ingresoFraccion;
    ArrayList<String> fracciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fracciones);

        Toast.makeText(this, "hola", Toast.LENGTH_LONG).show();
        editText_ingresoFraccion = findViewById(R.id.editText_fraccion);
    }

    public void IngresarFraccion(View view){
        fracciones = new ArrayList<>();
        String fraccion = editText_ingresoFraccion.getText().toString();
        if (ValidadorFraccion(fraccion)){
            fracciones.add(fraccion);
        }
    }

    public static boolean ValidadorFraccion(String fraccion){
        return fraccion.matches("\\d+(\\/)\\d+");
    }

    public static int[] QuiskSort(int[] arreglo, int primero, int ultimo){
        int i,j, pivote, auxiliar;
        i = primero;
        j = ultimo;
        pivote=arreglo[(primero+ultimo)/2];
        do {
            while (arreglo[i] < pivote){
                i++;
            }

            while (arreglo[j] > pivote){
                j--;
            }

            if(i<=j){
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        }while(i <= j);

        if(primero < j){
            QuiskSort(arreglo, primero, j);
        }
        if(i < ultimo){
            QuiskSort(arreglo, i, ultimo);
        }
        return arreglo;
    }


}