package cn.netdiscovery.core.watch.etcd;

import cn.netdiscovery.core.config.Configuration;
import com.safframework.tony.common.utils.Preconditions;
import io.etcd.jetcd.Client;
import lombok.extern.slf4j.Slf4j;


/**
 * Created by tony on 2019-06-09.
 */
@Slf4j
public class EtcdManager {

    private Client client;

    public EtcdManager() {

        this(Configuration.getConfig("spiderEngine.registry.etcd.etcdStr"));
    }

    public EtcdManager(String etcdStr) {

        if (Preconditions.isNotBlank(etcdStr)) {
            client = Client.builder().endpoints(etcdStr).build();
        }
    }

    public void process() {

//        CountDownLatch latch = new CountDownLatch(Integer.MAX_VALUE);
//        Watch.Watcher watcher = null;
//
//        try {
//            ByteSequence watchKey = ByteSequence.from("/netdiscovery/", StandardCharsets.UTF_8);
//            WatchOption watchOpts = WatchOption.newBuilder().withRevision(0).withPrefix(ByteSequence.from("/netdiscovery/".getBytes())).build();
//
//            watcher = client.getWatchClient().watch(watchKey, watchOpts, response -> {
//                        for (WatchEvent event : response.getEvents()) {
//                            log.info("type={}, key={}, value={}",
//                                    event.getEventType().toString(),
//                                    Optional.ofNullable(event.getKeyValue().getKey())
//                                            .map(bs -> bs.toString(StandardCharsets.UTF_8))
//                                            .orElse(""),
//                                    Optional.ofNullable(event.getKeyValue().getValue())
//                                            .map(bs -> bs.toString(StandardCharsets.UTF_8))
//                                            .orElse(""));
//                        }
//
//                        latch.countDown();
//                    }
//            );
//
//            latch.await();
//        } catch (Exception e) {
//            if (watcher != null) {
//                watcher.close();
//            }
//        }
    }

}