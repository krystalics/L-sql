package com.github.krystalics.lsql.parser.executor;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author linjiabao001
 * @date 2021/5/9
 * @description
 */
public class SQLExecutors {
    private static final ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
            .setNameFormat("diagnosis-pool-%d").build();

    /**
     * common Thread Pool
     *
     */
    private static final ExecutorService pool = new ThreadPoolExecutor(20, 200,
            20L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(10000), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());


    public static void execute(Runnable runnable){
        pool.execute(runnable);
    }

    public static void shutdown(){
        //gracefully shutdown
        pool.shutdown();
    }
}