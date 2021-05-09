package com.github.krystalics.lsql.parser.executor;

import com.github.krystalics.lsql.internal.exceptions.NoSuchHandlerException;
import com.github.krystalics.lsql.parser.executor.handler.CreateNameSpaceHandler;
import com.github.krystalics.lsql.parser.executor.handler.SQLHandler;
import com.github.krystalics.lsql.internal.sql.SQL;
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
            .setNameFormat("execute-pool-%d").build();

    /**
     * common Thread Pool
     */
    private static final ExecutorService pool = new ThreadPoolExecutor(20, 200,
            20L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(1000), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());


    public static void execute(Runnable runnable) {
        pool.execute(runnable);
    }

    public static void submit(SQL sql) {
        SQLHandler handler=null;

        switch (sql.getType()) {
            case CREATE_DB:
                handler = new CreateNameSpaceHandler(sql);
                break;

            case CREATE_TABLE:

                break;
            default:
                throw new NoSuchHandlerException("、the type is "+ sql.getType());
        }

        execute(handler);

    }

    public static void shutdown() {
        //gracefully shutdown
        pool.shutdown();
    }
}
