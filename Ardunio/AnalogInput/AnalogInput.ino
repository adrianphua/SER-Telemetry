/*
  Analog Input

  Demonstrates analog input by reading an analog sensor on analog pin 0 and
  turning on and off a light emitting diode(LED) connected to digital pin 13.
  The amount of time the LED will be on and off depends on the value obtained
  by analogRead().

  The circuit:
  - potentiometer
    center pin of the potentiometer to the analog input 0
    one side pin (either one) to ground
    the other side pin to +5V
  - LED
    anode (long leg) attached to digital output 13
    cathode (short leg) attached to ground

  - Note: because most Arduinos have a built-in LED attached to pin 13 on the
    board, the LED is optional.

  created by David Cuartielles
  modified 30 Aug 2011
  By Tom Igoe

  This example code is in the public domain.

  http://www.arduino.cc/en/Tutorial/AnalogInput
*/

#include <stdio.h>

int sensorAPin = A0;    // select the input pin for the potentiometer
int sensorBPin = A1;    // select the input pin for the potentiometer'
int sensorCPin = A2;    // select the input pin for the potentiometer
int sensorDPin = A3;    // select the input pin for the potentiometer
int sensorEPin = A4;    // select the input pin for the potentiometer
int sensorFPin = A5;    // select the input pin for the potentiometer
double sensorAValue = 0;  // variable to store the value coming from the sensor
double sensorBValue = 0;  // variable to store the value coming from the sensor
double sensorCValue = 0;  // variable to store the value coming from the sensor
double sensorDValue = 0;  // variable to store the value coming from the sensor
double sensorEValue = 0;  // variable to store the value coming from the sensor
double sensorFValue = 0;  // variable to store the value coming from the sensor


void setup() {
  Serial.begin(9600);
 
}

void loop() {
  // read the value from the sensor:
  sensorAValue = analogRead(sensorAPin)/1023.0;
  sensorBValue = analogRead(sensorBPin)/1023.0;
  sensorCValue = analogRead(sensorCPin)/1023.0;
  sensorDValue = analogRead(sensorDPin)/1023.0;
  sensorEValue = analogRead(sensorEPin)/1023.0;
  sensorFValue = analogRead(sensorFPin)/1023.0;
 Serial.print("Orange Wire A0 Pin 5 Charge Current Limit (0-5V):");
 Serial.println(sensorAValue * 5);

 Serial.print("White Wire A1 Pin 15 Amperage (0-5V):");
 Serial.println(sensorBValue * 5);

 Serial.print("White-Green Wire A2 Pin 16 Discharge Current Limit (0-5V):");
 Serial.println(sensorCValue * 5);

 Serial.print("Black Wire A3 Pin 4 State of Charge (0-5V):");
 Serial.println(sensorDValue * 5);
 //Serial.println(sensorEValue * 5);
 //Serial.println(sensorFValue * 5);
 delay(500);
 
}
