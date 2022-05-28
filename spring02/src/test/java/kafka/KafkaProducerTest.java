package kafka; /**
 * @description:
 * @author: lll
 * @date: 2022-02-24 3:45 下午
 */

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.Test;

import java.util.Properties;

/**
 *@Author sqb
 *@Date 3:45 下午
 */
public class KafkaProducerTest {

    @Test
    public void test() {
        KafkaProducer<String,String> producer = createProducer();

        //指定topic,key,value
        ProducerRecord<String,String> record = new ProducerRecord<>("test1","newkey1","newvalue1");

        //异步发送
        producer.send(record);
        producer.close();

        System.out.println("发送完成");
    }

    public static KafkaProducer<String,String> createProducer() {
        Properties props = new Properties();

        //bootstrap.servers 必须设置
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.1.10:9092");

        // key.serializer   必须设置
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // value.serializer  必须设置
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //client.id
        props.put(ProducerConfig.CLIENT_ID_CONFIG, "client-0");

        //retries
        props.put(ProducerConfig.RETRIES_CONFIG, 3);

        //acks
        props.put(ProducerConfig.ACKS_CONFIG, "all");

        //max.in.flight.requests.per.connection
        props.put(ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, 1);

        //linger.ms
        props.put(ProducerConfig.LINGER_MS_CONFIG, 100);

        //batch.size
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 10240);

        //buffer.memory
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 10240);

        return new KafkaProducer<>(props);
    }
}
