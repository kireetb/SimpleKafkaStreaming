import java.util.*;
import kafka.producer.*;
import kafka.javaapi.producer.Producer;
import kafka.utils.*;


import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;
import java.io.InputStreamReader;
import java.io.*;

public class DemoProducer {
    final static String TOPIC = "Demo";
      static Producer<String, String> producer;
    
// method for intializing ProducerConfig  with required properties
    public static void init() {
        Properties producerProperties = new Properties();
        producerProperties .put("metadata.broker.list", "nn02.itversity.com:6667");
        producerProperties .put("serializer.class", "kafka.serializer.StringEncoder");
        ProducerConfig producerConfig = new ProducerConfig(producerProperties );
        producer = new Producer<String, String>(producerConfig);
  }
 
    public static void send_messages() throws Exception{      
//create       BufferedReader instance to read the input from keyboard 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));               
    while (true){
        System.out.print("Enter message to send to kafka broker (Press 'T' to  terminate producer): ");
      String msg = null;
      msg = reader.readLine(); // Read message from console
      //Define topic name and message
      KeyedMessage<String, String> keyedMsg =
                   new KeyedMessage<String, String>(TOPIC, msg);
      producer.send(keyedMsg); // This publishes message on given topic
      if("T".equals(msg)){ break; }
      System.out.println("--> Message [" + msg + "] sent. To Consumer");
    }
    return;
  }
   
 
    public static void main(String[] argv) throws Exception{
    
 //initialize and establish the connection 
        DemoProducer .init();
//Send the messages 
        DemoProducer .send_messages();
//close the producer after sending 
        producer.close();
    }
}
