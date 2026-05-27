package com.philip.papp_jsongsonparsing;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button submitButton;
        RadioGroup radioGroup;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_window);

        // Logic Submit Button
        radioGroup = findViewById(R.id.idColorRadioGroup1);
        submitButton = findViewById(R.id.idSubmitButton);
        submitButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            // Nichts ausgewählt
            if (selectedId == -1) {
                Toast.makeText(this, "Bitte ein Modul wählen!", Toast.LENGTH_SHORT).show();
                return;
            }
            RadioButton clickedButton = findViewById(selectedId);
        });
    }
}