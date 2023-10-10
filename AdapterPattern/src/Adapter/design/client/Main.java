package Adapter.design.client;

import Adapter.design.imp.WeightMachineAdapter;
import Adapter.design.imp.WeightMachineAdapterImpl;
import AdapterDesign.com.example.WeightMachineForBabies;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
