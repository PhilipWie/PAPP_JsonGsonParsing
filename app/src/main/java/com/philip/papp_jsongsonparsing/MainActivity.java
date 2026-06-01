package com.philip.papp_jsongsonparsing;

import android.os.Bundle;
import android.widget.*;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.philip.papp_jsongsonparsing.models.Adresse;
import com.philip.papp_jsongsonparsing.models.Kurs;
import com.philip.papp_jsongsonparsing.models.Person;
import com.philip.papp_jsongsonparsing.models.Student;
import com.philip.papp_jsongsonparsing.parser.GsonParser;

import java.io.InputStream;
import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button submitButton;
        RadioGroup radioGroup;
        TextView outputTextView;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_window);
        outputTextView = findViewById(R.id.idOutputField);
        radioGroup = findViewById(R.id.idColorRadioGroup1);
        // Radio Buttons On Check
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.idAdresseRadioButton) {
                outputTextView.setText(loadJsonFromAssets("adresse.json"));

            } else if (checkedId == R.id.idKursRadioButton) {
                outputTextView.setText(loadJsonFromAssets("kurs.json"));

            } else if (checkedId == R.id.idPersonRadioButton) {
                outputTextView.setText(loadJsonFromAssets("person.json"));

            } else if (checkedId == R.id.idStudentRadioButton) {
                outputTextView.setText(loadJsonFromAssets("student.json"));
            }
        });
        // Logic Submit Button
        submitButton = findViewById(R.id.idSubmitButton);
        submitButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId == -1) {
                Toast.makeText(this, "Bitte eine Checkbox wählen!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (selectedId == R.id.idAdresseRadioButton) {
                String jsonAdresse = loadJsonFromAssets("adresse.json");
                Adresse adresse = GsonParser.parseAdresse(jsonAdresse);
                outputTextView.setText(adresse.toString());

            } else if (selectedId == R.id.idKursRadioButton) {
                String jsonKurs = loadJsonFromAssets("kurs.json");
                Kurs kurs = GsonParser.parseKurs(jsonKurs);
                outputTextView.setText(kurs.toString());
            } else if (selectedId == R.id.idPersonRadioButton) {
                String jsonPerson = loadJsonFromAssets("person.json");
                Person person = GsonParser.parsePerson(jsonPerson);
                outputTextView.setText(person.toString());
            } else if (selectedId == R.id.idStudentRadioButton) {
                String jsonStudent = loadJsonFromAssets("student.json");
                Student student = GsonParser.parseStudent(jsonStudent);
                outputTextView.setText(student.toString());
            }
        });
    }
    private RadioButton getSelectedRadioButton(RadioGroup radioGroup){
            int selectedId = radioGroup.getCheckedRadioButtonId();
            // Nichts ausgewählt
            if (selectedId == -1) {
                Toast.makeText(this, "Bitte ein Modul wählen!", Toast.LENGTH_SHORT).show();
                return null;
            }
            return findViewById(selectedId);
        };

    private String loadJsonFromAssets(String filename){
        try {
            InputStream data = getAssets().open(filename);
            int size = data.available();
            byte[] buffer = new byte[size];
            data.read(buffer);
            data.close();
            return new String(buffer, "UTF-8");
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    };
}