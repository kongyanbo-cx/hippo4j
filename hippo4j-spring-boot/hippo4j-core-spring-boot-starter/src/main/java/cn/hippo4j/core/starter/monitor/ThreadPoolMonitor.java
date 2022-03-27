package cn.hippo4j.core.starter.monitor;

/**
 * Thread-pool monitor.
 *
 * @author chen.ma
 * @date 2022/3/25 19:03
 */
public interface ThreadPoolMonitor {

    /**
     * Get type.
     *
     * @return
     */
    String getType();

    /**
     * Collect data.
     */
    void collect();

}