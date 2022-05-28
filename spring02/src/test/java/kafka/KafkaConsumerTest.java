package kafka; /**
 * @description:
 * @author: lll
 * @date: 2022-02-24 3:47 下午
 */

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.junit.Test;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

/**
 *@Author sqb
 *@Date 3:47 下午
 */
public class KafkaConsumerTest {
    @Test
    public void test() {
        Properties props = new Properties();

        // 必须设置的属性
        props.put("bootstrap.servers", "192.168.1.10:9092");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("group.id", "group1");

        // 可选设置属性
        props.put("enable.auto.commit", "true");
        // 自动提交offset,每1s提交一次
        props.put("auto.commit.interval.ms", "1000");
        props.put("auto.offset.reset","earliest ");
        props.put("client.id", "zy_client_id");
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        // 订阅test1 topic
        consumer.subscribe(Collections.singletonList("test1"));

        while(true) {
            //  从服务器开始拉取数据
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            records.forEach(record -> {
                System.out.printf("topic = %s ,partition = %d,offset = %d, key = %s, value = %s%n", record.topic(), record.partition(),
                        record.offset(), record.key(), record.value());
            });
        }
    }
}
