
const int PIN_ECHO1 = 5; const int PIN_TRIG1 = 4; 
int son_g = 6;                 // Светодиод подключенный к вход/выходу 13
int son_5v = 3;
int temp_g = 7 ;
int temp_v = 9 ;
int temp_out = 8;
int buz_g = 10 ;
int buz_sig = 11; 
int cm1;
int duration;
#include <SoftwareSerial.h>
SoftwareSerial mySerial(3, 2); // RX, TX



void setup() { 
  pinMode(son_g, OUTPUT);      // устанавливает режим работы - выход
  pinMode(son_5v, OUTPUT);
  pinMode(buz_g, INPUT);


Serial.begin(9600);
pinMode(PIN_TRIG1, OUTPUT); pinMode(PIN_ECHO1, INPUT);
mySerial.begin(9600);
Serial.println("Enter AT commands:");
btSerial.begin(9600);


}

void loop() {
  
  
  digitalWrite(son_5v, HIGH);   // включает светодиод
  delay(1000);                  // ждет секунду
  digitalWrite(son_g, LOW);    // выключает светодиод
  delay(1000);                  // ждет секунду

  digitalWrite(PIN_TRIG1, LOW);
  delayMicroseconds(5); 
  digitalWrite(PIN_TRIG1, HIGH);
  delayMicroseconds(10); 
  digitalWrite(PIN_TRIG1, LOW);
  duration = pulseIn(PIN_ECHO1, HIGH);
  cm1 = (duration / 2) / 29.1;
  Serial.println(cm1);

  
 
if (cm1 <= 15 && cm1 >= 5) {
  tone(buz_sig, 10000); // айдиофайл в будущем
  delay(3000);
}
else if (cm1 >= 16 && cm1 <= 40) { 
  tone(buz_sig, 5000);
  delay(3000);
  }
else if (cm1 >= 41 && cm1 <= 120) { 
  tone(buz_sig, 1000);
  delay(3000);
  }
else {
  noTone(buz_sig);
  }
  
if (Serial.available() > 0) {  //если пришли данные
    incomingByte = Serial.read(); // считываем байт
    if(incomingByte == '0') 
    {
       digitalWrite(LED, LOW);  // если 1, то выключаем LED
       Serial.println("LED OFF. Press 1 to LED ON!");  // и выводим обратно сообщение
    }
    if(incomingByte == '1') {
       digitalWrite(LED, HIGH); // если 0, то включаем LED
       Serial.println("LED ON. Press 0 to LED OFF!");
    }
}
