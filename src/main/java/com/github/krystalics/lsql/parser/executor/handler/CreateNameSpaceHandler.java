package com.github.krystalics.lsql.parser.executor.handler;

import com.github.krystalics.lsql.internal.Common;
import com.github.krystalics.lsql.internal.exceptions.ExistsException;
import com.github.krystalics.lsql.internal.sql.DDL;
import com.github.krystalics.lsql.internal.sql.SQL;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author linjiabao001
 * @date 2021/5/9
 * @description
 */
@Slf4j
public class CreateNameSpaceHandler extends AbstractSQLHandler {


    public CreateNameSpaceHandler(SQL sql) {
        super(sql);
    }

    @Override
    public void run() {
        DDL ddl = (DDL) sql;

        String path = Common.ROOT_PATH + ddl.getNamespace() ;
        Path metaInfoFilePath =Paths.get( path +File.separator+ Common.META_FILE_NAME);

        if (!Files.exists(Paths.get(path))) {
            try {
                Files.createDirectories(Paths.get(path));
                Files.createFile(metaInfoFilePath);
                log.info("create db {}",path);
                Files.write(metaInfoFilePath,ddl.toString().getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new ExistsException("namespace or table exists " + path);
        }
    }
}
