package Unitconverter;
import javax.swing.*;
import java.awt.event.*;
public class Unitconverter {
    private JFrame frame;
    private JLabel inputLabel, outputLabel;
    private JTextField input;
    private JTextField output;
    private JComboBox<String> fromUnit;
    private JComboBox<String> toUnit;
    private JButton convertButton;
    protected void initComponents(){
        frame=new JFrame("Unit Converter");
        frame.setSize(400,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        inputLabel=new JLabel("Input: ");
        input=new JTextField(10);
        outputLabel=new JLabel("Output: ");
        output=new JTextField(10);
        output.setEditable(false);
        fromUnit=new JComboBox<String>(new String[]{"Meters","Feet","Inches","Centimeters"});
        toUnit=new JComboBox<String>(new String[]{"Meters","Feet","Inches","Centimeters"});
        convertButton=new JButton("Convert");

        inputLabel.setBounds(20,20,100,20);
        input.setBounds(150,20,100,20);
        fromUnit.setBounds(270,20,100,20);
        outputLabel.setBounds(20,50,100,20);
        output.setBounds(150,50,100,20);
        toUnit.setBounds(270,50,100,20);
        convertButton.setBounds(150,80,100,20);

        convertButton.addActionListener(new ConvertButtonListener());

        frame.add(inputLabel);
        frame.add(input);
        frame.add(fromUnit);
        frame.add(outputLabel);
        frame.add(output);
        frame.add(toUnit);
        frame.add(convertButton);

        frame.setVisible(true);
    }
    public Unitconverter(){
        initComponents();
    }
    public static void main(String [] args){
        new Unitconverter();
    }
    private class ConvertButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String fromUnitType=fromUnit.getSelectedItem().toString();
            String toUnitType=toUnit.getSelectedItem().toString();
            double inputValue=Double.parseDouble(input.getText());
            double outputValue=0.0;
            if(fromUnitType.equals("Meters")){
                if(toUnitType.equals("Meters")){
                    outputValue=Unitconverter.metersToMeters(inputValue);
                }
                else if(toUnitType.equals("Feet")){
                    outputValue=Unitconverter.metersToFeet(inputValue);
                }
                else if(toUnitType.equals("Inches")){
                    outputValue=Unitconverter.metersToInches(inputValue);
                }
                else if(toUnitType.equals("Centimeters")){
                    outputValue=Unitconverter.metersToCentimeters(inputValue);
                }
            }
            else  if(fromUnitType.equals("Feet")){
                if(toUnitType.equals("Meters")){
                    outputValue=Unitconverter.feetToMeters(inputValue);
                }
                else if(toUnitType.equals("Feet")){
                    outputValue=Unitconverter.feetToFeet(inputValue);
                }
                else if(toUnitType.equals("Inches")){
                    outputValue=Unitconverter.feetToInches(inputValue);
                }
                else if(toUnitType.equals("Centimeters")){
                    outputValue=Unitconverter.feetToCentimeters(inputValue);
                }
            }
            else if(fromUnitType.equals("Inches")){
                if(toUnitType.equals("Meters")){
                    outputValue=Unitconverter.inchesToMeters(inputValue);
                }
                else if(toUnitType.equals("Feet")){
                    outputValue=Unitconverter.inchesToFeet(inputValue);
                }
                else if(toUnitType.equals("Inches")){
                    outputValue=Unitconverter.inchesToInches(inputValue);
                }
                else if(toUnitType.equals("Centimeters")){
                    outputValue=Unitconverter.inchesToCentimeters(inputValue);
                }
            }
            else if(fromUnitType.equals("Centimeters")){
                if(toUnitType.equals("Meters")){
                    outputValue=Unitconverter.centimetersToMeters(inputValue);
                }
                else if(toUnitType.equals("Feet")){
                    outputValue=Unitconverter.centimetersToFeet(inputValue);
                }
                else if(toUnitType.equals("Inches")){
                    outputValue=Unitconverter.centimetersToInches(inputValue);
                }
                else if(toUnitType.equals("Centimeters")){
                    outputValue=Unitconverter.centimetersToCentimeters(inputValue);
                }
            }
            output.setText(""+outputValue);
        }
    }
    public static double metersToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double metersToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue*100;
        return outputValue;
    }
    public static double metersToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue*3.28084;
        return outputValue;
    }
    public static double metersToInches(double inputValue){
        double outputValue;
        outputValue=inputValue*3.28084*12;
        return outputValue;
    }
    public static double feetToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue/3.28084;
        return outputValue;
    }
    public static double feetToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue/3.28084*100;
        return outputValue;
    }
    public static double feetToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double feetToInches(double inputValue){
        double outputValue;
        outputValue=inputValue*12;
        return outputValue;
    }
    public static double inchesToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue/12/3.28084;
        return outputValue;
    }
    public static double inchesToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue/12/3.28084*100;
        return outputValue;
    }
    public static double inchesToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue/12;
        return outputValue;
    }
    public static double inchesToInches(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double centimetersToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue/100;
        return outputValue;
    }
    public static double centimetersToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double centimetersToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue/100*3.28084;
        return outputValue;
    }
    public static double centimetersToInches(double inputValue){
        double outputValue;
        outputValue=inputValue/100*3.28084*12;
        return outputValue;
    }
}
