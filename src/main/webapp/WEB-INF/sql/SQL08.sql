USE spr1;

CREATE TABLE tbl_member (
	userid VARCHAR(50) PRIMARY KEY,
    userpw VARCHAR(100) NOT NULL,
    username VARCHAR(100) NOT NULL,
    regdate TIMESTAMP DEFAULT NOW(),
    updateDate TIMESTAMP DEFAULT NOW(),
    enabled TINYINT(1) DEFAULT 1
);