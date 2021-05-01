package com.github.krystalics.lsql.trees;

import lombok.Data;

import java.util.Optional;

/**
 * @author linjiabao001
 * @date 2021/4/8
 * @description
 */
public class TreeNode {
    @Data
    public static class Origin {
        Optional<Integer> line;
        Optional<Integer> startPosition;

        public Origin(Optional<Integer> line, Optional<Integer> starPosition) {
            this.line = line;
            this.startPosition = starPosition;
        }
    }
}
