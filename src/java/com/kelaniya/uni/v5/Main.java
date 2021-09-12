package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.input.Inputs;
import com.kelaniya.uni.v5.input.CommandlineInputs;
import com.kelaniya.uni.v5.operations.OperationFactory;
import com.kelaniya.uni.v5.operations.operation;
import com.kelaniya.uni.v5.repository.FileNumberRepository;
import com.kelaniya.uni.v5.repository.NumberRepository;
import com.kelaniya.uni.v5.ui.CmdLineUI;
import com.kelaniya.uni.v5.ui.UI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        Inputs inputs = new CommandlineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui= new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        app.execute();

    }

}
