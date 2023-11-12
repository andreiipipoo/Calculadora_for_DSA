package com.example.calculator_for_dsa;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private TextView pantalla;
    private double firstNumber, secondNumber;
    private String operation;

    boolean isDegreesMode = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = findViewById(R.id.pantalla);

        // Set onClick listeners for number buttons
        setNumberButtonListeners();

        // Set onClick listeners for operation buttons
        setOperationButtonListeners();

        // Set onClick listeners for trigonometric buttons
        setTrigonometricButtonListeners();

        // Set onClick listeners for mode switch buttons
        setModeSwitchListeners();
    }

    // Method to handle number button clicks
    private void setNumberButtonListeners() {
        int[] numberButtonIds = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
        for (int numberButtonId : numberButtonIds) {
            Button button = findViewById(numberButtonId);
            button.setOnClickListener(view -> {
                String currentText = pantalla.getText().toString();
                String newText = currentText + button.getText().toString();
                pantalla.setText(newText);
            });
        }
    }

    // Method to handle operation button clicks
    private void setOperationButtonListeners() {
        int[] operationButtonIds = {R.id.btnadd, R.id.btnsubstract, R.id.btnmultiple, R.id.btndivision};
        for (int operationButtonId : operationButtonIds) {
            Button button = findViewById(operationButtonId);
            button.setOnClickListener(view -> {
                firstNumber = Double.parseDouble(pantalla.getText().toString());
                operation = button.getText().toString();
                pantalla.setText("");
            });
        }

        // Equals button click
        findViewById(R.id.btnequal).setOnClickListener(view -> {
            secondNumber = Double.parseDouble(pantalla.getText().toString());
            double result = performOperation(firstNumber, secondNumber, operation);
            pantalla.setText(String.valueOf(result));
        });

        // Clear button click
        findViewById(R.id.btnclear).setOnClickListener(view -> pantalla.setText(""));
    }

    // Method to handle trigonometric button clicks
    private void setTrigonometricButtonListeners() {
        findViewById(R.id.btnsen).setOnClickListener(view -> {
            double number = Double.parseDouble(pantalla.getText().toString());
            double result = Math.sin(number);
            pantalla.setText(String.valueOf(result));
        });

        findViewById(R.id.btncos).setOnClickListener(view -> {
            double number = Double.parseDouble(pantalla.getText().toString());
            double result = Math.cos(number);
            pantalla.setText(String.valueOf(result));
        });

        findViewById(R.id.btntan).setOnClickListener(view -> {
            double number = Double.parseDouble(pantalla.getText().toString());
            double result = Math.tan(number);
            pantalla.setText(String.valueOf(result));
        });
    }

    // Method to handle mode switch buttons
    private void setModeSwitchListeners() {
        Button degreesButton = findViewById(R.id.btndegrees);
        Button radiansButton = findViewById(R.id.btnradiant);

        degreesButton.setOnClickListener(view -> isDegreesMode=true);

        radiansButton.setOnClickListener(view -> isDegreesMode=false);
    }

    // Method to perform basic arithmetic operations
    private double performOperation(double firstNumber, double secondNumber, String operation) {
        switch (operation) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0) return 0; // Handle division by zero
                return firstNumber / secondNumber;
            default:
                return 0;
        }
    }
}
