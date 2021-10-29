SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

drop table if exists lyw_user;
CREATE TABLE lyw_user
(
    id          bigint(64)                                                     NOT NULL COMMENT '主键',
    tenant_id   varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci   NULL DEFAULT '000000' COMMENT '租户ID',
    code        varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci   NULL DEFAULT NULL COMMENT '用户编号',
    account     varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci   NULL DEFAULT NULL COMMENT '账号',
    password    varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci   NULL DEFAULT NULL COMMENT '密码',
    name        varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci   NULL DEFAULT NULL COMMENT '昵称',
    real_name   varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci   NULL DEFAULT NULL COMMENT '真名',
    avatar      varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像',
    email       varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci   NULL DEFAULT NULL COMMENT '邮箱',
    phone       varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci   NULL DEFAULT NULL COMMENT '手机',
    birthday    datetime(0)                                                    NULL DEFAULT NULL COMMENT '生日',
    sex         smallint(6)                                                    NULL DEFAULT NULL COMMENT '性别',
    role_id     varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '角色id',
    dept_id     varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门id',
    post_id     varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '岗位id',
    create_user bigint(64)                                                     NULL DEFAULT NULL COMMENT '创建人',
    create_time datetime(0)                                                    NULL DEFAULT NULL COMMENT '创建时间',
    update_user bigint(64)                                                     NULL DEFAULT NULL COMMENT '修改人',
    update_time datetime(0)                                                    NULL DEFAULT NULL COMMENT '修改时间',
    status      int(2)                                                         NULL DEFAULT NULL COMMENT '状态',
    is_deleted  int(2)                                                         NULL DEFAULT 0 COMMENT '是否已删除',
    PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '用户表';

/**
  添加一个初始账户
 */
BEGIN;
INSERT INTO `lyw_user` VALUES (1123598821738675201, '000000', NULL, 'admin', '90b9aa7e25f80cf4f64e990b78a9fc5ebd6cecad', '管理员', '管理员', '', 'suxingshu@qq.com', '22233322', '2018-08-08 00:00:00', 1, '1123598816738675201', '1123598813738675201', '1123598817738675201', 1123598821738675201, '2018-08-08 00:00:00', 1123598821738675201, '2018-08-08 00:00:00', 1, 0);
COMMIT;

drop table if exists lyw_content;
create table lyw_content
(
    id          bigint(64) primary key                                      not null comment '主键',
    content     mediumtext null comment '内容',
    create_user bigint(64)                                                  NULL DEFAULT NULL COMMENT '创建人',
    create_time datetime(0)                                                 NULL DEFAULT NULL COMMENT '创建时间',
    update_user bigint(64)                                                  NULL DEFAULT NULL COMMENT '修改人',
    update_time datetime(0)                                                 NULL DEFAULT NULL COMMENT '修改时间',
    status      int(2)                                                      NULL DEFAULT NULL COMMENT '状态',
    is_deleted  int(2)                                                      NULL DEFAULT 0 COMMENT '是否已删除'
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT '剪切板内容表';

drop table if exists lyw_shear_plate_record;
create table lyw_shear_plate_record
(
    id          bigint(64) primary key                                       not null comment '主键',
    tenant_id   varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '000000' COMMENT '租户ID',
    user_id     bigint(64)                                                   not null comment '用户id',
    content_id  bigint(64)                                                   not null comment '内容id',
    create_user bigint(64)                                                   NULL DEFAULT NULL COMMENT '创建人',
    create_time datetime(0)                                                  NULL DEFAULT NULL COMMENT '创建时间',
    update_user bigint(64)                                                   NULL DEFAULT NULL COMMENT '修改人',
    update_time datetime(0)                                                  NULL DEFAULT NULL COMMENT '修改时间',
    status      int(2)                                                       NULL DEFAULT NULL COMMENT '状态',
    is_deleted  int(2)                                                       NULL DEFAULT 0 COMMENT '是否已删除',
    foreign key (user_id) references lyw_user (id),
    foreign key (content_id) references lyw_content(id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT '剪切板记录表';

SET FOREIGN_KEY_CHECKS = 1;