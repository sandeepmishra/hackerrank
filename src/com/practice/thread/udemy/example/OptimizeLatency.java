package com.practice.thread.udemy.example;

/**
 * Latency - the time to completion of a task.
 * Throughput - the amount of task completed in a given period.
 *
 * To reduce latency we should divide task into n task and ideal value of n should be number of cores present on the system
 * number of thread  == number of cores is optimal only if all threads are runnable and can run without interruption
 * (no IO/blocking calls/sleep etc )
 * Nothing else is running that consumes lot of CPU
 *
 * cost for parallelization and aggregation: breaking task into subtask, passing it to thread, time for thread to start, execution
 * and till last thread finishes, aggregating results
 *
 * for image coloring by thread it just recolors from given height and width the original image
 * it doesn't break it
 */


public class OptimizeLatency {

}
