const int outPin = 13;  //The pin we will write HIGH or LOW to read on the roboRIO

void setup() {
  pinMode(outPin, OUTPUT);  //Setting the outPin to OUTPUT mode
}

void loop() {
  digitalWrite(outPin, HIGH); //Write 1 / HIGH / true
  delay(1000);                //Wait 1 second
  digitalWrite(outPin, LOW);  //Write 0 / LOW/ false
  delay(1000);                //Wait 1 second
}
